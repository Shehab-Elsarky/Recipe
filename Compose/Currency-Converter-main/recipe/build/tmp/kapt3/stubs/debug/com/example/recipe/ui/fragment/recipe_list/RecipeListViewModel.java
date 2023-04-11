package com.example.recipe.ui.fragment.recipe_list;

import java.lang.System;

/**
 * Created by Shehab Elsarky.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f\u00a8\u0006$"}, d2 = {"Lcom/example/recipe/ui/fragment/recipe_list/RecipeListViewModel;", "Lcom/examples/core/ui/view_model/BaseViewModel;", "recipeListUseCase", "Lcom/example/recipe/domain/usecase/RecipeListUseCase;", "(Lcom/example/recipe/domain/usecase/RecipeListUseCase;)V", "PAGE_SIZE", "", "getPAGE_SIZE", "()I", "isShowDialogState", "Landroidx/compose/runtime/MutableState;", "", "()Landroidx/compose/runtime/MutableState;", "page", "getPage", "recipeListScrollPosition", "getRecipeListScrollPosition", "setRecipeListScrollPosition", "(I)V", "recipes", "", "Lcom/example/recipe/domain/entity/recipe/local/Recipe;", "getRecipes", "searchQuery", "", "getSearchQuery", "appendRecipes", "", "getRecipeList", "query", "Lcom/example/recipe/domain/entity/recipe/query/SearchQuery;", "incrementPage", "nextPage", "onChangeRecipeScrollPosition", "position", "onQueryChanged", "recipe_debug"})
public final class RecipeListViewModel extends com.examples.core.ui.view_model.BaseViewModel {
    private final com.example.recipe.domain.usecase.RecipeListUseCase recipeListUseCase = null;
    private final int PAGE_SIZE = 30;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Integer> page = null;
    private int recipeListScrollPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.example.recipe.domain.entity.recipe.local.Recipe>> recipes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isShowDialogState = null;
    
    @javax.inject.Inject()
    public RecipeListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.recipe.domain.usecase.RecipeListUseCase recipeListUseCase) {
        super();
    }
    
    public final int getPAGE_SIZE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getPage() {
        return null;
    }
    
    public final int getRecipeListScrollPosition() {
        return 0;
    }
    
    public final void setRecipeListScrollPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getSearchQuery() {
        return null;
    }
    
    public final void onQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.example.recipe.domain.entity.recipe.local.Recipe>> getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isShowDialogState() {
        return null;
    }
    
    public final void getRecipeList(@org.jetbrains.annotations.NotNull()
    com.example.recipe.domain.entity.recipe.query.SearchQuery query) {
    }
    
    public final void nextPage() {
    }
    
    /**
     * Append new recipes to the current list of recipes
     */
    private final void appendRecipes(java.util.List<com.example.recipe.domain.entity.recipe.local.Recipe> recipes) {
    }
    
    private final void incrementPage() {
    }
    
    public final void onChangeRecipeScrollPosition(int position) {
    }
}