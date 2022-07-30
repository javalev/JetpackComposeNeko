package com.example.jetpackcomposeneko

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem("Kurt Cobain1", "RockStar")
                ListItem("Kurt Cobain2", "RockStar")
                ListItem("Kurt Cobain3", "RockStar")
                ListItem("Kurt Cobain4", "RockStar")
                ListItem("Kurt Cobain5", "RockStar")
                ListItem("Kurt Cobain6", "RockStar")
                ListItem("Kurt Cobain7", "RockStar")
                ListItem("Kurt Cobain8", "RockStar")
                ListItem("Kurt Cobain9", "RockStar")
                ListItem("Kurt Cobain10", "RockStar")
                ListItem("Kurt Cobain11", "RockStar")
            }
        }
    }

    @Composable
    private fun ListItem(name: String, profession: String) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .offset(10.dp, 10.dp)
                .clickable { Log.d("mytag", "click card + $name") }
                .pointerInput(Unit) {
                    detectHorizontalDragGestures { change, dragAmount ->
                        Log.d(
                            "mytag",
                            "click card + $dragAmount"
                        )
                    }
                },
            shape = RoundedCornerShape(15.dp),

            elevation = 5.dp
        ) {
            Box() {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.kurt),
                        contentDescription = "photo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                    )
                    Column() {
                        Text(text = name)
                        Text(text = profession)
                    }
                }
            }
        }
    }
}

