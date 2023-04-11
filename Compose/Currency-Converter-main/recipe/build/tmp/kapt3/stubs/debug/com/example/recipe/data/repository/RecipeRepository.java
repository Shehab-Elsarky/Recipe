package com.example.recipe.data.repository;

import java.lang.System;

/**
 * Created by Shehab Elsarky.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/recipe/data/repository/RecipeRepository;", "", "getRecipe", "Lcom/example/recipe/domain/entity/recipe/remote/RecipeDto;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/example/recipe/domain/entity/recipe/response/RecipeSearchResponse;", "page", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recipe_debug"})
public abstract interface RecipeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object search(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecipe(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.remote.RecipeDto> continuation);
}