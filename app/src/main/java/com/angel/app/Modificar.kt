package com.angel.app


import androidx.compose.runtime.Composable

import androidx.compose.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Preview
@Composable
fun PruevaComposible() {

    var valor by remember { mutableStateOf(true) }

    val color = if (valor) Color.White else Color.Red

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            "hola mundo cruel",
            fontSize = 25.sp,
            modifier = Modifier
                .clickable {
                    valor = !valor
                }
                .padding(16.dp)
                .background(color)
                .border(2.dp, Color.Red)
                .padding(16.dp)
        )
    }
}