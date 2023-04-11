package com.example.recipe.di;

import java.lang.System;

/**
 * Created by Shehab Elsarky.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/recipe/di/RecipeModule;", "", "()V", "bindEMoneyRemoteDataSource", "Lcom/example/recipe/data/source/RecipeRemoteDataSource;", "eMoneyRemoteDataSourceImpl", "Lcom/example/recipe/data/source/RecipeRemoteDataSourceImpl;", "bindEMoneyRepository", "Lcom/example/recipe/data/repository/RecipeRepository;", "eMoneyRepositoryImp", "Lcom/example/recipe/data/repository/RecipeRepositoryImp;", "recipe_debug"})
@dagger.Module()
public abstract class RecipeModule {
    
    public RecipeModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.recipe.data.repository.RecipeRepository bindEMoneyRepository(@org.jetbrains.annotations.NotNull()
    com.example.recipe.data.repository.RecipeRepositoryImp eMoneyRepositoryImp);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.recipe.data.source.RecipeRemoteDataSource bindEMoneyRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.recipe.data.source.RecipeRemoteDataSourceImpl eMoneyRemoteDataSourceImpl);
}