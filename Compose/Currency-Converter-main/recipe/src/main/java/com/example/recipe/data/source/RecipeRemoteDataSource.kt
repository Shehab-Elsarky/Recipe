package com.example.recipe.data.source

import com.example.recipe.domain.entity.recipe.remote.RecipeDto
import com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse


/**
 * Created by Shehab Elsarky.
 */
interface RecipeRemoteDataSource {

    suspend fun search(
       page: Int,
       query: String
    ): RecipeSearchResponse

    suspend fun getRecipe(
        id: Int
    ): RecipeDto
}