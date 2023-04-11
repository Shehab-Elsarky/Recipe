package com.example.recipe.ui.activity

import com.example.recipe.R
import com.examples.core.ui.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Shehab Elsarky.
 */
@AndroidEntryPoint
class RecipeActivity : BaseActivity() {
    override var navGraphResourceId: Int = R.navigation.recipe_nav_graph
}