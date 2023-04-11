package com.example.recipe.data.restful

import com.example.recipe.domain.entity.recipe.remote.RecipeDto
import com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse
import com.examples.core.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * Created by Shehab ELsarky.
 */
interface RecipeApi {

    @GET(BuildConfig.baseUrl+ Config.SEARCH)
    suspend fun search(
        @Query("page") page: Int,
        @Query("query") query: String
    ): RecipeSearchResponse

    @GET(BuildConfig.baseUrl + Config.RECIPE_LIST)
    suspend fun getRecipe(
        @Query("id") id: Int
    ): RecipeDto
}