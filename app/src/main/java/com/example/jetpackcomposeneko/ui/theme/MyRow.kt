package com.example.jetpackcomposeneko.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeneko.ItemRowModel

@Composable
fun MyRow(itemRowModel: ItemRowModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(4.dp)
            .background(
                Color.White
            )
    ) {
        Image(
            painter = painterResource(id = itemRowModel.imageId),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(4.dp)
                .clip(
                    CircleShape
                )
        )
        Text(text = itemRowModel.name)
        Text(
            text = "Press\nSee FULL Info!!",
            Modifier.clickable { Log.d("MyLog", "CLick ${itemRowModel.name}") })
    }
}