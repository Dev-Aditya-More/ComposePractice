package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme
import androidx.compose.ui.graphics.graphicsLayer
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.asComposeRenderEffect
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeTheme {

                App()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun App(modifier: Modifier = Modifier) {

    // rows, columns and sizing in compose

//    Box(
//        modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Column(
//            modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text("This is a column")
//
//            Row(
//                modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceEvenly
//            ) {
//
//                Text("item1")
//                Text("item2")
//            }
//        }
//    }
//    Row(modifier = Modifier.fillMaxWidth()) {
//        Box(
//            Modifier
//                .weight(1f)
//                .height(50.dp)
//                .background(Color.Red)
//        )
//        Box(
//            Modifier
//                .weight(2f)
//                .height(50.dp)
//                .background(Color.Green)
//        )
//    }
//    Box(
//        modifier = Modifier
//            .wrapContentSize()
//            .background(Color.Blue)
//    ) {
//        Text("Hello")
//    }

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        Text("Header", modifier = Modifier.align(Alignment.CenterHorizontally))
//
//        Row(modifier = Modifier.fillMaxWidth()) {
//            Text(
//                "Left",
//                modifier = Modifier
//                    .weight(1f)
//                    .background(Color.Cyan)
//            )
//            Text(
//                "Right",
//                modifier = Modifier
//                    .weight(1f)
//                    .background(Color.Magenta)
//            )
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Button(
//            onClick = {},
//            modifier = Modifier.align(Alignment.End)
//        ) {
//            Text("Click Me")
//        }
//    }

//    Row {
//        Box(Modifier.weight(1f).height(50.dp).background(Color.Green))
//        Box(Modifier.weight(1f).height(50.dp).background(Color.Yellow))
//    }


//    Box(
//        modifier = Modifier
//            .fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.user),
//                contentDescription = "User profile",
//                modifier = Modifier
//                    .size(100.dp)
//                    .clip(CircleShape)
//            )
//
//            Spacer(modifier = Modifier.width(16.dp))
//
//            Column(
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(
//                    "Aditya More",
//                    color = Color.Black,
//                    fontSize = 26.sp
//                )
//                Text(
//                    "Online",
//                    color = Color.Green,
//                    fontSize = 15.sp
//                )
//            }
//        }
//    }

    // modifiers and Image cards

//    Card(
//        modifier = Modifier
//            .padding(16.dp)
//            .size(180.dp),
//        elevation = CardDefaults.cardElevation(8.dp),
//        shape = RoundedCornerShape(16.dp)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.sample_image),
//            contentDescription = "Card Image",
//            contentScale = ContentScale.Crop
//        )
//    }

//    Card(
//        modifier = Modifier
//            .padding(12.dp)
//            .width(200.dp)
//            .clickable {
//
//            },
//        elevation = CardDefaults.cardElevation(6.dp),
//        shape = RoundedCornerShape(12.dp)
//    ) {
//        Box {
//            Image(
//                painter = painterResource(id = R.drawable.sample_image),
//                contentDescription = "Scenic view",
//                modifier = Modifier
//                    .height(150.dp)
//                    .fillMaxWidth(),
//                contentScale = ContentScale.Crop
//            )
//            Text(
//                text = "Italy",
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .background(Color.Transparent)
//                    .padding(8.dp),
//                color = Color.White
//            )
//        }
//    }


//    Card(
//        modifier = Modifier
//            .padding(16.dp)
//            .width(200.dp)
//            .clickable { },
//        elevation = CardDefaults.cardElevation(6.dp),
//        shape = RoundedCornerShape(12.dp)
//    ) {
//        Box {
//            // Full background image
//            Image(
//                painter = painterResource(id = R.drawable.user2),
//                contentDescription = "Scenic view",
//                modifier = Modifier
//                    .height(180.dp)
//                    .fillMaxWidth(),
//                contentScale = ContentScale.Crop
//            )
//
//            // Blurred background behind the text
//            Box(
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .padding(8.dp)
//                    .graphicsLayer {
//                        renderEffect = RenderEffect
//                            .createBlurEffect(20f, 20f, Shader.TileMode.CLAMP)
//                            .asComposeRenderEffect()
//                    }
//                    .background(Color.White.copy(alpha = 0.1f)) // subtle glass effect
//                    .clip(RoundedCornerShape(8.dp))
//                    .matchParentSize() // Ensures blur background size matches content
//            )
//
//            // Actual readable text on top
//            Column(
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .padding(16.dp)
//            ) {
//                Text(
//                    text = "Sophie Watson",
//                    color = Color.White,
//                    fontWeight = FontWeight.Bold
//                )
//                Text(
//                    text = "Software Engineer.",
//                    color = Color.White.copy(alpha = 0.9f),
//                    fontSize = 10.sp
//                )
//            }
//        }
//    }

    // Text styling and state management

    val quotes = listOf(
        "Believe you can and you're halfway there." to "- Theodore Roosevelt",
        "Everything you can imagine is real." to "- Pablo Picasso",
        "Do what you can, with what you have, where you are." to "- T. Roosevelt",
        "What we think, we become." to "- Buddha"
    )

    var currentQuote by remember { mutableStateOf(quotes.random()) }
    var lastQuote by remember { mutableStateOf(currentQuote) }

    val alpha by animateFloatAsState(
        targetValue = if (currentQuote != lastQuote) 0f else 1f,
        animationSpec = tween(durationMillis = 400),
        label = ""
    )

    // Update lastQuote after animation completes
    LaunchedEffect(currentQuote) {
        lastQuote = currentQuote
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .width(300.dp),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF1E9F9))
        ) {
            Column(modifier = Modifier.alpha(alpha)) {
                Text(
                    text = currentQuote.first,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Center
                    )
                )
                Text(
                    text = currentQuote.second,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    fontSize = 12.sp,
                    textAlign = TextAlign.End
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                var next = quotes.random()
                while (next == currentQuote) {
                    next = quotes.random()
                }
                currentQuote = next
            },
            modifier = Modifier.clip(RoundedCornerShape(50))
        ) {
            Text(
                text = "Next Quote",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }

}