package com.angel.app

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
@Composable
fun Saludo (text: String){
   Text(text = text,
       modifier = Modifier.fillMaxSize().padding(3.3.dp))
}



@Preview(
    "vistea previa del saludo ",
    showBackground = true,
    backgroundColor = 0xd1d1d1,
    widthDp = 220,
    heightDp = 100
)
@Composable
fun Saludoto(){
    Saludo(
        text = "camilo",


    )
}

