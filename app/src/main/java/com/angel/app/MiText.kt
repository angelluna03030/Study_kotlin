package com.angel.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import  androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
@Composable
fun MiComponents(
    text: String,
    fontSize: TextUnit = 20.sp,
    fontWeight: FontWeight = FontWeight.Thin,
    fontFamily: FontFamily = FontFamily.Serif,
    color: Color = MaterialTheme.colorScheme.primary
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        color = color
    )
}