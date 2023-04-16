package com.example.recipe.ui.resource.style

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.recipe.ui.resource.color.Blue500

fun button(color: Color) = TextStyle(
    fontFamily = QuickSand,
    fontWeight = FontWeight.W400,
    fontSize = 18.sp,
    textAlign = TextAlign.Center,
    color = color,
    background = Blue500
)