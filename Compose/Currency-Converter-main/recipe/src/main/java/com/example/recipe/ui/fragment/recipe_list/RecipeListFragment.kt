package com.example.recipe.ui.fragment.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.recipe.R
import com.example.recipe.databinding.FragmentRecipeListBinding
import com.example.recipe.domain.entity.recipe.query.SearchQuery
import com.example.recipe.ui.dialog.ShowRowButtonAlertDialog
import com.example.recipe.ui.resource.theme.AppTheme
import com.examples.core.ui.fragment.BaseFragment
import com.examples.core.ui.fragment.BaseUiHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Created by Shehab Elsarky.
 */
@ExperimentalComposeUiApi
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class RecipeListFragment :
    BaseFragment<FragmentRecipeListBinding, RecipeListViewModel, BaseUiHelper>(
        FragmentRecipeListBinding::inflate
    ) {

    override val viewModel: RecipeListViewModel by viewModels()
    override lateinit var fragmentHelper: BaseUiHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        view?.findViewById<ComposeView>(R.id.composeView)?.apply {
            setViewCompositionStrategy(
                ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner)
            )
            setContent {
                AppTheme(
                    darkTheme = viewModel.isDark.value
                ) {
                    RecipeListScreen()
                }
            }
        }
        return view
        /* return ComposeView(requireContext()).apply {
             setViewCompositionStrategy(
                 ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner)
             )
             setContent { RecipeListScreen() }
         }*/
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showActivityToolbar()
        setActivityToolbarTitle("Recipe List")
        viewModel.getRecipeList(
            SearchQuery(
                page = 1,
                query = "Chicken"
            )
        )
    }

    @ExperimentalComposeUiApi
    @ExperimentalCoroutinesApi
    @Composable
    fun RecipeListScreen() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = MaterialTheme.colors.surface)
        ) {
            ShowRowButtonAlertDialog(viewModel)
            SearchView(viewModel)
            DarkThemeSwitch(viewModel)
            FoodCategoryChipList(viewModel)
            RecipeList(viewModel, onClick = { onRecipeItemClicked() })
        }
    }

    private fun onRecipeItemClicked() {
        viewModel.isShowDialogState.value = true
//        navigateToCurrencyConverterFragment()
    }

    private fun navigateToCurrencyConverterFragment() =
        findNavController().navigate(
            RecipeListFragmentDirections.actionCurrencyListFragmentToCurrencyConverterFragment()
        )

    companion object {
        const val TOKEN = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48"
    }

}