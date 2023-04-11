package com.example.recipe.domain.entity.recipe.response

import com.example.recipe.domain.entity.recipe.remote.RecipeDto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(

    @SerializedName("count")
    @Expose
    var count: Int,

    @SerializedName("results")
    @Expose
    var recipes: List<RecipeDto>
)