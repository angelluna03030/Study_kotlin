package com.angel.app
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.I
import androidx.compose.ui.tooling.preview.Preview
/*
* organizas a sus elementos hijos en fila
* */

@Preview
@Composable
fun Row_Example(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ){
 Imagen_test()
        MiComponents("Hola mundo")
        Imagen_test()
    }
}