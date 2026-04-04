package com.angel.app

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview
@Composable
fun Card (){
    ElevatedCard(
       modifier = Modifier.height(230.dp).
        width(230.dp).
           border(1.dp, MaterialTheme.colorScheme.primary),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),

    ){

        Text("hola mundo",
            modifier = Modifier.height(230.dp).width(230.dp).
        border(100.dp, MaterialTheme.colorScheme.primary))
    }
}