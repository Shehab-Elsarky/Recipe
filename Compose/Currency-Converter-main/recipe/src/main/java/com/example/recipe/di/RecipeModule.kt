package com.example.recipe.di

import com.example.recipe.data.repository.RecipeRepository
import com.example.recipe.data.repository.RecipeRepositoryImp
import com.example.recipe.data.source.RecipeRemoteDataSource
import com.example.recipe.data.source.RecipeRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Created by Shehab Elsarky.
 */
@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RecipeModule {
    @Binds
    abstract fun bindEMoneyRepository(
        eMoneyRepositoryImp: RecipeRepositoryImp
    ): RecipeRepository

    @Binds
    abstract fun bindEMoneyRemoteDataSource(
        eMoneyRemoteDataSourceImpl: RecipeRemoteDataSourceImpl
    ): RecipeRemoteDataSource
}