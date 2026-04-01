package com.angel.app

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview()
@Composable
fun ButtonExample(){
    Button(onClick={
        /* Acción que va a realizar este botton*/
    },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = MaterialTheme.colorScheme.primary,
        ),

        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
        modifier = Modifier.shadow(4.dp, shape = RoundedCornerShape(20.dp))
    ) {
        Icon(Icons.Default.Person, contentDescription = "Icon persona")
        Text(text = "click me")
    }
}