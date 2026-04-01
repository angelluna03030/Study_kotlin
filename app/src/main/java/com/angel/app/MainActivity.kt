package com.angel.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.angel.app.ui.theme.AppTheme
import coil.compose.AsyncImage
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        Greeting(name = "Android")
                        Mibuton()
                        Miapp()
                        Mitexto(
                            "hola pero"
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}
@Composable
fun Mibuton(){
    Button(onClick =  {}) {
        Text(text = "Mi primer botton en kotlin")
    }
}
@Composable
fun Mitexto(text : String){
    Column(
        modifier = Modifier.fillMaxSize().padding(26.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "$text", style = MaterialTheme.typography.headlineLarge)
    }
}
@Composable
fun Miapp(){
    val estilar_texto =  MaterialTheme.typography.headlineMedium.copy(
        fontFamily = FontFamily.Monospace,
        fontSize = 55.sp,
        fontWeight = FontWeight.Thin
    )
    val Color = MaterialTheme.colorScheme.primary
    Box(
        contentAlignment  = Alignment.Center
    ){
        Column (
            verticalArrangement = Arrangement.Center,
        ) {
            Text("mi app")
            Text("mi app")
            Text("mi app", color= Color,
                style =estilar_texto )
            MiComponents(
                "hola mundo",
                color = MaterialTheme.colorScheme.tertiary


            )
        }
    }

}
