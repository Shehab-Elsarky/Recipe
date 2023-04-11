package com.example.recipe.domain.entity.recipe.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/recipe/domain/entity/recipe/response/RecipeSearchResponse;", "", "count", "", "recipes", "", "Lcom/example/recipe/domain/entity/recipe/remote/RecipeDto;", "(ILjava/util/List;)V", "getCount", "()I", "setCount", "(I)V", "getRecipes", "()Ljava/util/List;", "setRecipes", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "recipe_debug"})
public final class RecipeSearchResponse {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "count")
    private int count;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.example.recipe.domain.entity.recipe.remote.RecipeDto> recipes;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.recipe.domain.entity.recipe.response.RecipeSearchResponse copy(int count, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.recipe.domain.entity.recipe.remote.RecipeDto> recipes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RecipeSearchResponse(int count, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.recipe.domain.entity.recipe.remote.RecipeDto> recipes) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.recipe.domain.entity.recipe.remote.RecipeDto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.recipe.domain.entity.recipe.remote.RecipeDto> getRecipes() {
        return null;
    }
    
    public final void setRecipes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.recipe.domain.entity.recipe.remote.RecipeDto> p0) {
    }
}