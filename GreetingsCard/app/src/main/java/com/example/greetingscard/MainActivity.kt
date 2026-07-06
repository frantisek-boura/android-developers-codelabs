package com.example.greetingscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingscard.ui.theme.GreetingsCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingsCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "František",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/*
Vsechny funkce s @Composable anotaci mohou byt pouzity pouze v ramci dalsich composable funkci
jako je napr. setContent

Composable funkce je zakladnim stavebnim blokem pro sestavovani Compose aplikaci
Nic nevraci, jmena funkci zacinaji velkym pismenem
 */

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Surface slouzi pro stylizovani komponentu
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi, my name is $name!",
            // Modifier slouzi k upravovani layoutu, focusu, atd...
            modifier = modifier.padding(24.dp)
        )
    }
}

/*
anotace @Preview lze pouzit na @Composable komponenty za ucelem vytvoreni preview celeho
komponentu bez nutnosti rebuildu cele aplikace
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingsCardTheme {
        Greeting("František")
    }
}