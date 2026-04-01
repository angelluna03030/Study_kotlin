package com.angel.app

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.test.espresso.base.Default
@Preview
@Composable
fun Icons(){
   Icon(
       imageVector = Icons.Default.Person,
       contentDescription = "Icon persona",

   )
}