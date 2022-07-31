package com.example.jetpackcomposeneko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.jetpackcomposeneko.ui.theme.GrayBackground
import com.example.jetpackcomposeneko.ui.theme.MyRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(modifier = Modifier
                .fillMaxWidth()
                .background(GrayBackground)) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image1, "Kurt"),
                        ItemRowModel(R.drawable.image2, "Minor Threat"),
                        ItemRowModel(R.drawable.image3, "Death"),
                        ItemRowModel(R.drawable.image4, "Metallica"),
                        ItemRowModel(R.drawable.image2, "Minor Threat"),
                        ItemRowModel(R.drawable.image1, "Kurt"),
                        ItemRowModel(R.drawable.image3, "Death"),
                        ItemRowModel(R.drawable.image4, "Metallica")
                    )
                ) { index, item ->
                    MyRow(itemRowModel = item)
                }
            }
        }
    }
}

