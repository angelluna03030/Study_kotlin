package com.angel.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//** es como la columna, pero el lazy column es más potente
//** solo se muestra o renderiza los elemnetos visibles en la pantalla
// lazy de forma perresosa

@Preview
@Composable
fun Lazy_Column(){
val itemList =List(100){"elemeto N $it" }
    LazyColumn(
        modifier = Modifier.fillMaxSize().
        padding(16.dp)
    ){
        items(itemList){item->
            Text(text = item)
            Divider()
        }
    }
}