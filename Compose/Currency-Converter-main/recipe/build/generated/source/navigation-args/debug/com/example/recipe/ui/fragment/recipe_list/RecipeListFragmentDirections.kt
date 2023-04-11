package com.example.recipe.ui.fragment.recipe_list

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.recipe.R

class RecipeListFragmentDirections private constructor() {
    companion object {
        fun actionCurrencyListFragmentToCurrencyConverterFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_CurrencyListFragment_to_currencyConverterFragment)
    }
}
