package com.example.jetpackcomposeneko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(modifier = Modifier.fillMaxSize()) {
                itemsIndexed(
                    listOf(
                        "OBJECT1",
                        "OBJECT2",
                        "OBJECT3",
                        "OBJECT4",
                        "OBJECT5",
                        "OBJECT6",
                        "OBJECT7",
                        12345,
                        6789,
                        0
                    )
                ) { index, item ->
                    Text(
                        text = item.toString(), fontSize = 25.sp, modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

