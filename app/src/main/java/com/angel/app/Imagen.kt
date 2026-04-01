package com.angel.app

// Importa la versión correcta para Compose
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview
@Composable
fun Imagen_test(){

    Image(
        painter = painterResource(id = R.drawable.imagen),
        contentDescription = "mi imagen",
        modifier = Modifier.size(200.dp)
    )
}