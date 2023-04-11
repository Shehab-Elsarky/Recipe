package com.example.recipe.domain.usecase

import com.example.recipe.data.repository.RecipeRepository
import com.example.recipe.domain.entity.recipe.local.Recipe
import com.example.recipe.domain.entity.recipe.query.SearchQuery
import com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse
import com.example.recipe.domain.mapper.RecipeListMapper
import com.examples.core.data.mapper.CloudErrorMapper
import com.examples.core.domain.usecase.base.RemoteUseCase
import javax.inject.Inject

/**
 * Created by Shehab Elsarky.
 */
class RecipeListUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val recipeRepository: RecipeRepository,
    private val mapper: RecipeListMapper
) : RemoteUseCase<SearchQuery, RecipeSearchResponse, List<Recipe>>(
    errorUtil
) {
    public override suspend fun executeOnBackground(parameters: SearchQuery): RecipeSearchResponse {
        return recipeRepository.search(
            page = parameters.page,
            query = parameters.query
        )
    }

    public override suspend fun convert(dto: RecipeSearchResponse): List<Recipe> {
        return mapper.convert(dto.recipes)
    }
}