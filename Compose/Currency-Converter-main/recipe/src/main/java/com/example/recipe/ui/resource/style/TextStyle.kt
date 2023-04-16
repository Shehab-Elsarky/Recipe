package com.example.recipe.ui.resource.style

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


val mainTitle = TextStyle(
    fontFamily = QuickSand,
    fontWeight = FontWeight.W600,
    fontSize = 30.sp,
    textAlign = TextAlign.Center
)

val textTitle = TextStyle(
    fontFamily = QuickSand,
    fontWeight = FontWeight.W500,
    fontSize = 26.sp,
    textAlign = TextAlign.Center
)

fun dropdownText(color: Color) = TextStyle(
    fontFamily = QuickSand,
    fontWeight = FontWeight.W400,
    fontSize = 18.sp,
    textAlign = TextAlign.Center,
    color = color
)

