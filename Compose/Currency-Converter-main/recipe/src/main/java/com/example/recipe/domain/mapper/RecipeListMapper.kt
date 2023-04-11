package com.example.recipe.domain.mapper

import com.example.recipe.domain.entity.recipe.local.Recipe
import com.example.recipe.domain.entity.recipe.remote.RecipeDto
import com.examples.core.domain.usecase.base.ModelMapper
import javax.inject.Inject

/**
 * Created by Shehab Elsarky.
 */
class RecipeListMapper @Inject constructor() :
    ModelMapper<List<RecipeDto>, List<Recipe>> {

    override fun convert(from: List<RecipeDto>?): List<Recipe> {
        return from?.map { model ->
            Recipe(
                id = model.pk ?: 0,
                title = model.title ?: "",
                featuredImage = model.featuredImage ?: "",
                rating = model.rating ?: 0,
                publisher = model.publisher ?: "",
                sourceUrl = model.sourceUrl ?: "",
                description = model.description ?: "",
                cookingInstructions = model.cookingInstructions ?: "",
                ingredients = model.ingredients.orEmpty(),
                dateAdded = model.dateAdded ?: "",
                dateUpdated = model.dateUpdated ?: "",
            )
        } ?: emptyList()
    }
}