package com.angel.app

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*es para agregar un espacido entre los elementos*/

@Composable
fun Spacer_previ(){
    Spacer(
        modifier = Modifier.height(16.dp)
    )
}