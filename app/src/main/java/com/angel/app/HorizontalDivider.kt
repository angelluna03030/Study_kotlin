package com.angel.app


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
* es para agregar una linea horizontal
* es parecido a el Spacer pero con una linea horizontal
* */
@Preview
@Composable
fun Horizontal_Divider(){
Text("hola mundo",
    style = MaterialTheme.typography.headlineMedium,)
    HorizontalDivider(
        modifier = Modifier.padding( vertical = 45.dp),
        thickness = 1.dp,
        color = MaterialTheme.colorScheme.primary
    )
    Text("hola mundo",
        style = MaterialTheme.typography.headlineMedium,)
}