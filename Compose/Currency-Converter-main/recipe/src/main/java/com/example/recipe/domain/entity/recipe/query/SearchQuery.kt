package com.example.recipe.domain.entity.recipe.query

/**
 * See Recipe example: https://food2fork.ca/
 */
data class SearchQuery(
    val page: Int = 1,
    val query: String = ""
)