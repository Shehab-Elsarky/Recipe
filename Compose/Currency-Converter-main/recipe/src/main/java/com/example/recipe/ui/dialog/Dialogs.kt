package com.example.recipe.ui.dialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.recipe.ui.fragment.recipe_list.RecipeListViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Composable
fun ShowRowButtonAlertDialog(viewModel: RecipeListViewModel) {
    val isShowDialog = viewModel.isShowDialogState.value
    if (isShowDialog) {
        AlertDialog(
            onDismissRequest = {
                // Dismiss the dialog when the user clicks outside the dialog or on the back button.
                // If you want to disable that functionality, simply leave this block empty.
                viewModel.isShowDialogState.value = false
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        // perform the confirm action and
                        // close the dialog
                        viewModel.isShowDialogState.value = false
                    }
                ) {
                    Text(text = "Confirm")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        // close the dialog
                        viewModel.isShowDialogState.value = false
                    }
                ) {
                    Text(text = "Dismiss")
                }
            },
            title = {
                Text(text = "Title")
            },
            text = {
                Text(text = "Description")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            shape = RoundedCornerShape(5.dp),
            backgroundColor = Color.White
        )
    }
}

@ExperimentalCoroutinesApi
@Composable
fun ShowColumnButtonAlertDialog(viewModel: RecipeListViewModel) {
    val isShowDialog = viewModel.isShowDialogState.value
    if (isShowDialog) {
        AlertDialog(
            onDismissRequest = {
                // Dismiss the dialog when the user clicks outside the dialog or on the back button.
                // If you want to disable that functionality, simply leave this block empty.
                viewModel.isShowDialogState.value = false
            },
            buttons = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // confirm button
                    Button(
                        onClick = {
                            viewModel.isShowDialogState.value = false
                        }
                    ) {
                        Text(text = "Confirm")
                    }

                    // dismiss button
                    Button(
                        onClick = {
                            viewModel.isShowDialogState.value = false
                        }
                    ) {
                        Text(text = "Dismiss")
                    }
                }
            },
            title = {
                Text(text = "Title")
            },
            text = {
                Text(text = "Description")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
            shape = RoundedCornerShape(5.dp),
            backgroundColor = Color.White
        )
    }
}

@ExperimentalCoroutinesApi
@Composable
fun ShowCustomDialog(viewModel: RecipeListViewModel) {
    val isShowDialog = viewModel.isShowDialogState.value
    if (isShowDialog) {
        Dialog(onDismissRequest = {
            viewModel.isShowDialogState.value = false
        }) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                shape = RoundedCornerShape(size = 10.dp)
            ) {
                Column(modifier = Modifier.padding(all = 16.dp)) {
                    Text(text = "Your Dialog UI Here")
                }
            }
        }
    }
}

@ExperimentalCoroutinesApi
@Composable
fun ShowCustomDialogWithProperties(viewModel: RecipeListViewModel) {
    val isShowDialog = viewModel.isShowDialogState.value
    if (isShowDialog) {
        Dialog(
            onDismissRequest = {
                viewModel.isShowDialogState.value = false
            },
            properties = DialogProperties(
                dismissOnClickOutside = false
            )
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                shape = RoundedCornerShape(size = 10.dp)
            ) {
                Column(modifier = Modifier.padding(all = 16.dp)) {
                    Text(text = "You cannot close me by clicking outside")
                }
            }
        }
    }
}