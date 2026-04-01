package com.angel.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
* El box Acomoda a su hijo de apiladamente o sea uno encima del otro
*para Acomodarlo se utiliza la propiedad Alignment
*
* */
@Preview
@Composable
fun Box_Example(){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = "imagen de fondo",
            modifier = Modifier.size(0.dp)
                .align(alignment = Alignment.Center),
            contentScale = ContentScale.Crop,
        )
        Text(
            text = "Hola mundo",
            modifier = Modifier.size(200.dp),
            style = TextStyle(
                fontStyle = FontStyle.Normal,
                color = MaterialTheme.colorScheme.primary
            )
        )
       Button(
           onClick = { /*TODO*/ },
           modifier = Modifier
               .align(Alignment.BottomCenter)
               .padding(8.dp),
           shape = RoundedCornerShape(8.dp),
           colors = ButtonDefaults.buttonColors(
               containerColor = MaterialTheme.colorScheme.primary,
               contentColor = MaterialTheme.colorScheme.onPrimary
           )
       ) {
           Text("Precione")
       }
    }
}