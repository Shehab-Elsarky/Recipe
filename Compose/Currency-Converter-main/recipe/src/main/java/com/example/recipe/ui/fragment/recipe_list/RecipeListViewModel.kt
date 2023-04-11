package com.example.recipe.ui.fragment.recipe_list

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewModelScope
import com.example.recipe.domain.entity.recipe.local.Recipe
import com.example.recipe.domain.entity.recipe.query.SearchQuery
import com.example.recipe.domain.usecase.RecipeListUseCase
import com.examples.core.ui.view_model.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Shehab Elsarky.
 */
@ExperimentalCoroutinesApi
@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val recipeListUseCase: RecipeListUseCase
) : BaseViewModel() {

    val PAGE_SIZE = 30

    val page = mutableStateOf(1)
    var recipeListScrollPosition = 0


    val searchQuery = mutableStateOf("")
    fun onQueryChanged(query: String) {
        this.searchQuery.value = query
    }

    val recipes: MutableState<List<Recipe>> = mutableStateOf(ArrayList())
    val isShowDialogState = mutableStateOf(false)


    fun getRecipeList(query: SearchQuery) {
        callApi(recipes) {
            recipeListUseCase.execute(query) {
                onComplete {
                    if (page.value > 1)
                        appendRecipes(it)
                    else
                        recipes.value = it
                }
                isLoading(::setLoading)
                onError(::setErrorReason)
            }
        }
    }

    fun nextPage() {
        viewModelScope.launch {
            // prevent duplicate event due to recompose happening to quickly
            if ((recipeListScrollPosition + 1) >= (page.value * PAGE_SIZE)) {
                incrementPage()

                // just to show pagination, api is fast
                delay(1000)

                if (page.value > 1) {
                    getRecipeList(
                        SearchQuery(
                            page = page.value,
                            query = ""
                        )
                    )
                }
            }
        }
    }

    /**
     * Append new recipes to the current list of recipes
     */
    private fun appendRecipes(recipes: List<Recipe>) {
        val current = ArrayList(this.recipes.value)
        current.addAll(recipes)
        this.recipes.value = current
    }

    private fun incrementPage() {
        page.value = page.value + 1
    }

    fun onChangeRecipeScrollPosition(position: Int) {
        recipeListScrollPosition = position
    }
}