package com.google.firebase.quickstart.auth.abverticallist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumnDemo()
        }

    }
}

@Composable
fun  ScrollableColumnDemo()
{
    val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .verticalScroll(scrollState)) {
        for(i in 1..100) {
            Text(text = "User Name $i",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .padding(10.dp))
            Divider(color = Color.Black, thickness = 5.dp)
        }
        
    }
}