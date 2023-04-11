package com.example.recipe.data.repository;

import java.lang.System;

/**
 * Created by Shehab Elsarky.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/recipe/data/repository/RecipeRepositoryImp;", "Lcom/example/recipe/data/repository/RecipeRepository;", "recipeRemoteDataSource", "Lcom/example/recipe/data/source/RecipeRemoteDataSource;", "(Lcom/example/recipe/data/source/RecipeRemoteDataSource;)V", "getRecipe", "Lcom/example/recipe/domain/entity/recipe/remote/RecipeDto;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/example/recipe/domain/entity/recipe/response/RecipeSearchResponse;", "page", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recipe_debug"})
public final class RecipeRepositoryImp implements com.example.recipe.data.repository.RecipeRepository {
    private final com.example.recipe.data.source.RecipeRemoteDataSource recipeRemoteDataSource = null;
    
    @javax.inject.Inject()
    public RecipeRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.example.recipe.data.source.RecipeRemoteDataSource recipeRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object search(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRecipe(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.remote.RecipeDto> continuation) {
        return null;
    }
}