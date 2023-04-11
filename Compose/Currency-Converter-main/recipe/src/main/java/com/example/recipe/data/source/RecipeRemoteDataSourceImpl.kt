package com.example.recipe.data.source

import com.example.recipe.data.restful.RecipeApi
import com.example.recipe.domain.entity.recipe.remote.RecipeDto
import com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse
import javax.inject.Inject

/**
 * Created by Shehab Elsarky.
 */
class RecipeRemoteDataSourceImpl @Inject constructor(
    private val recipeApi: RecipeApi
) : RecipeRemoteDataSource {
    override suspend fun search(page: Int, query: String): RecipeSearchResponse {
        return recipeApi.search(page = page, query = query)
    }

    override suspend fun getRecipe(id: Int): RecipeDto {
        return recipeApi.getRecipe(id = id)
    }

}
