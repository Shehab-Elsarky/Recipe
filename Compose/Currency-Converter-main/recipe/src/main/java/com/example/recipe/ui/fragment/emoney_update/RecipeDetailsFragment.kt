package com.example.recipe.ui.fragment.emoney_update

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.recipe.databinding.FragmentRecipeDetailsBinding
import com.examples.core.ui.fragment.BaseFragment
import com.examples.core.ui.fragment.BaseUiHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

/**
 * Created by Shehab Elsarky.
 */
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class RecipeDetailsFragment :
    BaseFragment<FragmentRecipeDetailsBinding, RecipeDetailsViewModel, BaseUiHelper>(
        FragmentRecipeDetailsBinding::inflate) {

    override val viewModel: RecipeDetailsViewModel by viewModels()

    @Inject
    override lateinit var fragmentHelper: BaseUiHelper

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}