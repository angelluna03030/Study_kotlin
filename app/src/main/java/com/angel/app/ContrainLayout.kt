package com.angel.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.xr.scenecore.Material
@Preview
@Composable
fun Contrain_Layout() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Creamos las referencias para los elementos
        val (imagen, name, descripcion, button) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = "mi imagen",
            modifier = Modifier
                .size(100.dp)
                .constrainAs(imagen) { // Corregido el nombre a 'constrainAs'
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )
        Text(
            text = "marco",
            style = Material.typography.headlineLarge,
            modifier = Modifier.constrainAs(name){
                top.linkTo(parent.top)
                start.linkTo(parent.start, margin = 16.dp)

            }
        )
    }
}