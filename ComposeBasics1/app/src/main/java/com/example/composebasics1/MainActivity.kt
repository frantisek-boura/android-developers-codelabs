package com.example.composebasics1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics1.ui.theme.ComposeBasics1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasics1Theme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun TopImage(modifier: Modifier = Modifier) {
    val image: Painter = painterResource(R.drawable.bg_compose_background)

    Image(
        contentDescription = null,
        painter = image,
    )
}

@Composable
fun Heading(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun Paragraph(text: String, vertPadding: Dp, horPadding: Dp) {
    Text(
        text = text,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(
            start = horPadding,
            end = horPadding,
            top = vertPadding,
            bottom = vertPadding
        )
    )
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        TopImage()
        Heading(
            text = stringResource(R.string.article_heading)
        )
        Paragraph(
            text = stringResource(R.string.article_paragraph_1),
            vertPadding = 0.dp,
            horPadding = 16.dp
        )
        Paragraph(
            text = stringResource(R.string.article_paragraph_2),
            vertPadding = 16.dp,
            horPadding = 16.dp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeBasics1Theme {
        Article()
    }
}