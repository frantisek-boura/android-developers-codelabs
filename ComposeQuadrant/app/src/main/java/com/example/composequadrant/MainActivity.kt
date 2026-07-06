package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = modifier
                .weight(0.5f, true)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .background(colorResource(R.color.color_top_left))
                    .padding(16.dp)
                    .fillMaxHeight()
                    .weight(0.5f)
            ) {
                Text(
                    text = stringResource(R.string.top_left_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.
                        padding(bottom = 16.dp)
                )
                Text (
                    text = stringResource(R.string.top_left_desc),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .background(colorResource(R.color.color_top_right))
                    .padding(16.dp)
                    .fillMaxHeight()
                    .weight(0.5f)
            ) {
                Text(
                    text = stringResource(R.string.top_right_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.
                    padding(bottom = 16.dp)
                )
                Text (
                    text = stringResource(R.string.top_right_desc),
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(
            modifier = modifier
                .weight(0.5f, true)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .background(colorResource(R.color.color_bottom_left))
                    .padding(16.dp)
                    .fillMaxHeight()
                    .weight(0.5f)
            ) {
                Text(
                    text = stringResource(R.string.bottom_left_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.
                    padding(bottom = 16.dp)
                )
                Text (
                    text = stringResource(R.string.bottom_left_desc),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .background(colorResource(R.color.color_bottom_right))
                    .padding(16.dp)
                    .fillMaxHeight()
                    .weight(0.5f)
            ) {
                Text(
                    text = stringResource(R.string.bottom_right_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.
                    padding(bottom = 16.dp)
                )
                Text (
                    text = stringResource(R.string.bottom_right_desc),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}