package com.example.jetpackcomposeneko.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeneko.ItemRowModel

@Composable
fun MyRow(item: ItemRowModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .background(
                Color.White
            )
    ) {
        Image(
            painter = painterResource(id = item.imageId),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(125.dp)
                .padding(8.dp)
                .clip(
                    CircleShape
                )
        )
        Column(Modifier.padding(8.dp)) {
            Text(text = item.name)
            Text(
                modifier = Modifier
                    .clickable { isExpanded = !isExpanded }
                    .padding(8.dp),
                maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                text = item.textSong
            )
        }
    }
}