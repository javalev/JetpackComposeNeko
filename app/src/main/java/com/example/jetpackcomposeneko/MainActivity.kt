package com.example.jetpackcomposeneko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.jetpackcomposeneko.ui.theme.GrayBackground
import com.example.jetpackcomposeneko.ui.theme.MyRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(GrayBackground)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(
                            R.drawable.image1, "Kurt", "Load up on guns and bring your friends\n" +
                                    "It's fun to lose and to pretend\n" +
                                    "She's over bored and self assured\n" +
                                    "Oh no, I know a dirty word\n" +
                                    "\n" +
                                    "Hello, hello, hello, how low? [3x]\n" +
                                    "Hello, hello, hello!\n" +
                                    "\n" +
                                    "With the lights out, it's less dangerous\n" +
                                    "Here we are now, entertain us\n" +
                                    "I feel stupid and contagious\n" +
                                    "Here we are now, entertain us\n" +
                                    "A mulatto\n" +
                                    "An albino\n" +
                                    "A mosquito\n" +
                                    "My libido\n" +
                                    "Yay! [3x]\n" +
                                    "\n" +
                                    "I'm worse at what I do best\n" +
                                    "And for this gift I feel blessed\n" +
                                    "Our little group has always been\n" +
                                    "And always will until the end\n" +
                                    "\n" +
                                    "Hello, hello, hello, how low? [3x]\n" +
                                    "Hello, hello, hello!\n" +
                                    "\n" +
                                    "With the lights out, it's less dangerous\n" +
                                    "Here we are now, entertain us\n" +
                                    "I feel stupid and contagious\n" +
                                    "Here we are now, entertain us\n" +
                                    "A mulatto\n" +
                                    "An albino\n" +
                                    "A mosquito\n" +
                                    "My Libido\n" +
                                    "Yay! [3x]\n" +
                                    "\n" +
                                    "And I forget just why I taste\n" +
                                    "Oh yeah, I guess it makes me smile\n" +
                                    "I found it hard, it's hard to find\n" +
                                    "Oh well, whatever, never mind\n" +
                                    "\n" +
                                    "Hello, hello, hello, how low? [3x]\n" +
                                    "Hello, hello, hello!\n" +
                                    "\n" +
                                    "With the lights out, it's less dangerous\n" +
                                    "Here we are now, entertain us\n" +
                                    "I feel stupid and contagious\n" +
                                    "Here we are now, entertain us\n" +
                                    "A mulatto\n" +
                                    "An albino\n" +
                                    "A mosquito\n" +
                                    "My libido\n" +
                                    "\n" +
                                    "A denial !! [9x]\n" +
                                    "\n"
                        ),
                        ItemRowModel(R.drawable.image2, "Minor Threat", "Maybe it was no one's fault. I know it wasn't mine. But now that you've\n" +
                                "moved along. I guess I'm next in line. I thought we had the same ideas. But\n" +
                                "you, you proved me wrong. I've been played the fool before. But never for\n" +
                                "quite so long.\n" +
                                "(Chorus)\n" +
                                "Betray.\n" +
                                "So what now? Do we shake hands, and go on our separate ways? Or do I open my\n" +
                                "mind, and follow you into the haze? No, I'll see you tomrrow. Same channel,\n" +
                                "same time, same place. I'm not going anywhere. 'Cause I quit your fucking\n" +
                                "race.\n" +
                                "(Chorus)\n" +
                                "Goddamit, we were supposed to stay young. And now it's over, it's finished,\n" +
                                "it's done. Normal expectations, they were on the run. But now it's over,\n" +
                                "it's finished, it's done."),
                        ItemRowModel(R.drawable.image3, "Death", "test"),
                        ItemRowModel(R.drawable.image4, "Metallica", "test"),
                        ItemRowModel(R.drawable.image2, "Minor Threat", "test"),
                        ItemRowModel(R.drawable.image1, "Kurt", "test"),
                        ItemRowModel(R.drawable.image3, "Death", "test"),
                        ItemRowModel(R.drawable.image4, "Metallica", "test")
                    )
                ) { index, item ->
                    MyRow(item = item)
                }
            }
        }
    }
}

