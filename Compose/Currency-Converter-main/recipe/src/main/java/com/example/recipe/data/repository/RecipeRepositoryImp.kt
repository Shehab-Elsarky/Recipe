package com.example.recipe.data.repository

import com.example.recipe.data.source.RecipeRemoteDataSource
import com.example.recipe.domain.entity.recipe.remote.RecipeDto
import com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse
import javax.inject.Inject

/**
 * Created by Shehab Elsarky.
 */
class RecipeRepositoryImp @Inject constructor(
    private val recipeRemoteDataSource: RecipeRemoteDataSource
) : RecipeRepository {
    override suspend fun search(page: Int, query: String): RecipeSearchResponse {
        return recipeRemoteDataSource.search(page = page, query = query)
    }

    override suspend fun getRecipe(id: Int): RecipeDto {
        return recipeRemoteDataSource.getRecipe(id = id)
    }


}
