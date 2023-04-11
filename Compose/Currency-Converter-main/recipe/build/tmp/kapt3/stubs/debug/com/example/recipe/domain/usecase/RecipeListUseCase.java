package com.example.recipe.domain.usecase;

import java.lang.System;

/**
 * Created by Shehab Elsarky.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/recipe/domain/usecase/RecipeListUseCase;", "Lcom/examples/core/domain/usecase/base/RemoteUseCase;", "Lcom/example/recipe/domain/entity/recipe/query/SearchQuery;", "Lcom/example/recipe/domain/entity/recipe/response/RecipeSearchResponse;", "", "Lcom/example/recipe/domain/entity/recipe/local/Recipe;", "errorUtil", "Lcom/examples/core/data/mapper/CloudErrorMapper;", "recipeRepository", "Lcom/example/recipe/data/repository/RecipeRepository;", "mapper", "Lcom/example/recipe/domain/mapper/RecipeListMapper;", "(Lcom/examples/core/data/mapper/CloudErrorMapper;Lcom/example/recipe/data/repository/RecipeRepository;Lcom/example/recipe/domain/mapper/RecipeListMapper;)V", "convert", "dto", "(Lcom/example/recipe/domain/entity/recipe/response/RecipeSearchResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeOnBackground", "parameters", "(Lcom/example/recipe/domain/entity/recipe/query/SearchQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recipe_debug"})
public final class RecipeListUseCase extends com.examples.core.domain.usecase.base.RemoteUseCase<com.example.recipe.domain.entity.recipe.query.SearchQuery, com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse, java.util.List<? extends com.example.recipe.domain.entity.recipe.local.Recipe>> {
    private final com.example.recipe.data.repository.RecipeRepository recipeRepository = null;
    private final com.example.recipe.domain.mapper.RecipeListMapper mapper = null;
    
    @javax.inject.Inject()
    public RecipeListUseCase(@org.jetbrains.annotations.NotNull()
    com.examples.core.data.mapper.CloudErrorMapper errorUtil, @org.jetbrains.annotations.NotNull()
    com.example.recipe.data.repository.RecipeRepository recipeRepository, @org.jetbrains.annotations.NotNull()
    com.example.recipe.domain.mapper.RecipeListMapper mapper) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object executeOnBackground(@org.jetbrains.annotations.NotNull()
    com.example.recipe.domain.entity.recipe.query.SearchQuery parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object convert(@org.jetbrains.annotations.NotNull()
    com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse dto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.recipe.domain.entity.recipe.local.Recipe>> continuation) {
        return null;
    }
}