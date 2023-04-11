package com.example.recipe.ui.fragment.recipe_list

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipe.R
import com.example.recipe.domain.entity.recipe.local.Recipe
import com.example.recipe.domain.entity.recipe.local.getAllFoodCategories
import com.example.recipe.domain.entity.recipe.query.SearchQuery
import com.examples.core.utils.loadPicture
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalComposeUiApi
@ExperimentalCoroutinesApi
@Composable
fun SearchView(viewModel: RecipeListViewModel) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = Color.White,
        elevation = 8.dp
    ) {
        val keyboardController = LocalSoftwareKeyboardController.current

        Row(modifier = Modifier.fillMaxWidth()) {
            TextField(
                value = viewModel.searchQuery.value,
                onValueChange = { viewModel.onQueryChanged(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color.Transparent),

                enabled = true,
                readOnly = false,
                textStyle = TextStyle(color = MaterialTheme.colors.onSurface),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search Icon",
                        modifier = Modifier
                    )
                },
                label = { Text(text = "Search") },
                placeholder = { Text(text = "") },
                visualTransformation = VisualTransformation.None,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done,
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        viewModel.getRecipeList(
                            SearchQuery(
                                page = 1,
                                query = viewModel.searchQuery.value
                            )
                        )
                        keyboardController?.hide()
                    }
                ),
                maxLines = 1
            )
        }
    }
}

@Composable
fun FoodCategoryChip(
    category: String,
    onExecuteSearch: (String) -> Unit,
){
    Surface(
        modifier = Modifier.padding(end = 8.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colors.primary
    ) {
        Row(modifier = Modifier
            .clickable(
                onClick = {
                    onExecuteSearch(category)
                }
            )
        ) {
            Text(
                text = category,
                style = MaterialTheme.typography.body2,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@ExperimentalCoroutinesApi
@Composable
fun FoodCategoryChipList(
    viewModel: RecipeListViewModel
){
    val scrollState = rememberScrollState()
    Row(
        modifier = Modifier
            .padding(start = 8.dp, bottom = 8.dp)
            .horizontalScroll(scrollState)
    ) {
        getAllFoodCategories().forEach(){
            FoodCategoryChip(
                category = it.value,
                onExecuteSearch = {
                    viewModel.onQueryChanged(it)
                    viewModel.getRecipeList(SearchQuery(query = it))
                },
            )
        }
    }
}



@ExperimentalCoroutinesApi
@Composable
fun RecipeCard(
    recipe: Recipe = Recipe(),
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier
            .padding(
                bottom = 6.dp,
                top = 6.dp,
            )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 8.dp,
    ) {
        Column {
            recipe.featuredImage.let { url ->
                val image = loadPicture(url = url, defaultImage = R.drawable.empty_plate).value
                image?.let {
                    Image(
                        bitmap = it.asImageBitmap(),
                        contentDescription = stringResource(R.string.empty_state_img_desc),
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(225.dp),
                        contentScale = ContentScale.Crop,
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = recipe.title,
                    modifier = Modifier
                        .fillMaxWidth(0.85f)
                        .wrapContentWidth(Alignment.Start),
                    style = MaterialTheme.typography.h5
                )

                Text(
                    text = recipe.rating.toString(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End)
                        .align(Alignment.CenterVertically),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}

@ExperimentalCoroutinesApi
@Composable
fun RecipeList(
    viewModel: RecipeListViewModel,
    onClick: () -> Unit
) {
    val recipeList = viewModel.recipes.value
    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(10.dp)
    ) {
        itemsIndexed(
            items = recipeList, itemContent =
            { index, recipe ->
                viewModel.onChangeRecipeScrollPosition(index)
                if((index + 1) >= (viewModel.page.value * viewModel.PAGE_SIZE)){
                    viewModel.nextPage()
                }
                RecipeCard(recipe = recipe, onClick = { onClick.invoke() })
            })
    }
}



