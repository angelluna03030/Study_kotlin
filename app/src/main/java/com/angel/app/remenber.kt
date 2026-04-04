package com.angel.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
* el remember es una propiedad que hace que el valor persista en un recomposicion
*es lago asi para guarda valor y no sea pierda información entre composiciones
* es la forma para gestionar un estado persistente en una UI
*
* */
@Preview
@Composable
fun Remember_example(){
    var count by remember {
mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
 Text(
     text = "Contadro: $count",
     style = MaterialTheme.typography.bodySmall
 )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Button(
            onClick = {
                count++
            }
        ) {
            Text(text = "Incrementar")

        }
    }
}