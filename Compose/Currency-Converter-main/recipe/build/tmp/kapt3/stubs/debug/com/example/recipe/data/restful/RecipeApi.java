package com.example.recipe.data.restful;

import java.lang.System;

/**
 * Created by Shehab ELsarky.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/recipe/data/restful/RecipeApi;", "", "getRecipe", "Lcom/example/recipe/domain/entity/recipe/remote/RecipeDto;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/example/recipe/domain/entity/recipe/response/RecipeSearchResponse;", "page", "query", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recipe_debug"})
public abstract interface RecipeApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://food2fork.ca/api/recipe/search")
    public abstract java.lang.Object search(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://food2fork.ca/api/recipe/get")
    public abstract java.lang.Object getRecipe(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipe.domain.entity.recipe.remote.RecipeDto> continuation);
}