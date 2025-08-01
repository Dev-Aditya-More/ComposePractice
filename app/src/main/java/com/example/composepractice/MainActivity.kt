package com.example.composepractice

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import com.example.composepractice.ui.theme.ComposePracticeTheme
import com.google.firebase.messaging.FirebaseMessaging


@OptIn(ExperimentalMaterial3Api::class)

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

@OptIn(ExperimentalMaterial3Api::class)
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
//
//    val quotes = listOf(
//        "Believe you can and you're halfway there." to "- Theodore Roosevelt",
//        "Everything you can imagine is real." to "- Pablo Picasso",
//        "Do what you can, with what you have, where you are." to "- T. Roosevelt",
//        "What we think, we become." to "- Buddha"
//    )
//
//    var currentQuote by remember { mutableStateOf(quotes.random()) }
//    var lastQuote by remember { mutableStateOf(currentQuote) }
//
//    val alpha by animateFloatAsState(
//        targetValue = if (currentQuote != lastQuote) 0f else 1f,
//        animationSpec = tween(durationMillis = 400),
//        label = ""
//    )
//
//    // Update lastQuote after animation completes
//    LaunchedEffect(currentQuote) {
//        lastQuote = currentQuote
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Card(
//            modifier = Modifier
//                .padding(16.dp)
//                .width(300.dp),
//            elevation = CardDefaults.cardElevation(6.dp),
//            shape = RoundedCornerShape(12.dp),
//            colors = CardDefaults.cardColors(containerColor = Color(0xFFF1E9F9))
//        ) {
//            Column(modifier = Modifier.alpha(alpha)) {
//                Text(
//                    text = currentQuote.first,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 16.dp, vertical = 12.dp),
//                    style = TextStyle(
//                        fontSize = 16.sp,
//                        fontStyle = FontStyle.Italic,
//                        fontWeight = FontWeight.Medium,
//                        textAlign = TextAlign.Center
//                    )
//                )
//                Text(
//                    text = currentQuote.second,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 16.dp, vertical = 8.dp),
//                    fontSize = 12.sp,
//                    textAlign = TextAlign.End
//                )
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Button(
//            onClick = {
//                var next = quotes.random()
//                while (next == currentQuote) {
//                    next = quotes.random()
//                }
//                currentQuote = next
//            },
//            modifier = Modifier.clip(RoundedCornerShape(50))
//        ) {
//            Text(
//                text = "Next Quote",
//                fontWeight = FontWeight.Bold,
//                color = Color.White
//            )
//        }
//    }

    // TextFields, Buttons and showing snackbars

//    val snackbarHostState = remember { SnackbarHostState() }
//    val scope = rememberCoroutineScope()
//    var text by remember { mutableStateOf("") }
//
//    Scaffold(
//        snackbarHost = { SnackbarHost(snackbarHostState) }
//    ){ innerPadding ->
//
//        Column(
//            modifier = Modifier
//                .padding(innerPadding)
//                .padding(16.dp)
//                .fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            Text(
//                text = "Feedback form",
//                modifier = Modifier.padding(innerPadding),
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold
//            )
//
//            Spacer(modifier = Modifier.height(36.dp))
//
//            TextField(
//                value = text,
//                onValueChange = { text = it },
//                label = { Text("Enter your feedback!") },
//                modifier = Modifier.wrapContentWidth(),
//                maxLines = 1
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//            Button(
//                onClick = {
//                    scope.launch {
//                        if (text.isBlank()) {
//                            snackbarHostState.showSnackbar("Please enter some feedback!")
//                        }
//                        else {
//                            snackbarHostState.showSnackbar("Thanks for your feedback!")
//                        }
//                    }
//                },
//            ) {
//                Text("Submit")
//            }
//        }
//
//    }

    // effect handlers in compose

//    val seconds = 10
//
//    LaunchedEffect(seconds) {
//        delay(1000)
//        println("1 second passed, seconds left: $seconds")
//    }
//
//    Text("Time left: $seconds")


//    val snackbarHostState = remember { SnackbarHostState() }
//
//    Scaffold(
//
//        snackbarHost = { SnackbarHost(snackbarHostState) }
//
//    ) { innerPadding ->
//
//        val context = LocalContext.current
//        val scope = rememberCoroutineScope()
//
//
//        Box(
//            modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//
//            LaunchedEffect(Unit) {
//                Toast.makeText(context, "Welcome!", Toast.LENGTH_SHORT).show()
//            }
//
//            Button(
//                onClick = {
//                    scope.launch {
//                        snackbarHostState.showSnackbar("Welcome!")
//                    }
//                },
//                modifier.padding(innerPadding)
//            ) {
//                Text(
//                    "Click Me"
//                )
//            }
//
//        }
//    }

    // animation in compose

//    var expanded by remember {mutableStateOf(false)}
//    val size by animateDpAsState(
//        targetValue = if (expanded) 200.dp else 100.dp,
//        animationSpec = tween(durationMillis = 500, easing = FastOutSlowInEasing),
//        label = ""
//    )
//
//    Box(
//        modifier.fillMaxSize().background(Color.Black),
//        contentAlignment = Alignment.Center
//    ) {
//        Box(
//            modifier = Modifier
//                .size(size)
//                .background(Color.Blue)
//                .clickable { expanded = !expanded }
//        )
//    }

//    var visible by remember { mutableStateOf(false) }
//
//    Column {
//        Button(onClick = { visible = !visible }) {
//            Text("Toggle")
//        }
//
//        AnimatedVisibility(visible = visible) {
//            Text("Hello!", fontSize = 24.sp)
//        }
//    }

//    val infiniteTransition = rememberInfiniteTransition()
//
//    val alpha by infiniteTransition.animateFloat(
//        initialValue = 0.3f,
//        targetValue = 1f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 1000),
//            repeatMode = RepeatMode.Reverse
//        ),
//        label = ""
//    )
//
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .graphicsLayer { this.alpha = alpha }
//            .background(Color.Red)
//    )

//    var state by remember{mutableStateOf(false)}
//    val transition = updateTransition(targetState = state)
//
//    val color by transition.animateColor {
//        if(it) Color.Red else Color.Green
//    }
//
//    val size by transition.animateDp {
//        if(it) 100.dp else 200.dp
//    }
//
//    Box(
//        modifier = Modifier
//            .size(size)
//            .background(color)
//            .clickable { state = !state }
//    )

//    var liked by remember { mutableStateOf(false) }
//    var showPlusOne by remember { mutableStateOf(false) }
//
//    val transition = updateTransition(targetState = liked, label = "liked")
//
//    val color by transition.animateColor(label = "color") {
//        if (it) Color(0xFFEF3B53) else Color.Gray
//    }
//
//    val size by transition.animateDp(label = "size") {
//        if (it) 125.dp else 100.dp
//    }
//
//    val offsetY = remember { Animatable(0f) }
//    val alpha = remember { Animatable(0f) }
//
//    LaunchedEffect(showPlusOne) {
//        if (showPlusOne) {
//            offsetY.snapTo(0f)
//            alpha.snapTo(1f)
//
//            launch {
//                offsetY.animateTo(
//                    targetValue = -100f,
//                    animationSpec = tween(600)
//                )
//            }
//
//            launch {
//                alpha.animateTo(
//                    targetValue = 0f,
//                    animationSpec = tween(600)
//                )
//            }
//
//            delay(600)
//            showPlusOne = false
//        }
//    }
//
//    Box(
//        modifier = Modifier
//            .fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Box(
//            contentAlignment = Alignment.Center
//        ) {
//            if (showPlusOne) {
//                Text(
//                    text = "+1",
//                    fontSize = 34.sp,
//                    color = Color(0xFFEF3B53),
//                    modifier = Modifier
//                        .offset { IntOffset(0, offsetY.value.toInt()) }
//                        .alpha(alpha.value)
//                )
//            }
//
//            Icon(
//                imageVector = Icons.Default.Favorite,
//                contentDescription = "Like",
//                tint = color,
//                modifier = Modifier
//                    .size(size)
//                    .clickable {
//                        if (!liked) {
//                            liked = true
//                            showPlusOne = true
//                        } else {
//                            liked = false
//                        }
//                    }
//            )
//        }
//    }

    // circular progress bar

//    @Composable
//    fun ClickableAnimatedProgressBar() {
//        var progress by remember { mutableFloatStateOf(0.0f) }
//
//        // Animate whenever `progress` changes
//        val animatedProgress by animateFloatAsState(
//            targetValue = progress,
//            animationSpec = tween(800,easing = FastOutSlowInEasing),
//            label = "animatedProgress"
//        )
//
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            Box(contentAlignment = Alignment.Center, modifier = Modifier.size(150.dp)) {
//                Canvas(modifier = Modifier.size(150.dp)) {
//                    drawArc(
//                        color = Color.LightGray,
//                        startAngle = -90f,
//                        sweepAngle = 360f,
//                        useCenter = false,
//                        style = Stroke(10.dp.toPx(), cap = StrokeCap.Round)
//                    )
//                    drawArc(
//                        color = Color(0xFF3DDC84),
//                        startAngle = -90f,
//                        sweepAngle = animatedProgress * 360,
//                        useCenter = false,
//                        style = Stroke(10.dp.toPx(), cap = StrokeCap.Round)
//                    )
//                }
//
//                Text(
//                    text = "${(animatedProgress * 100).toInt()}%",
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 22.sp
//                )
//            }
//
//            Spacer(modifier = Modifier.height(32.dp))
//
//            Button(onClick = {
//                progress = listOf(0.2f, 0.4f, 0.6f, 0.75f, 1.0f).random()
//            }) {
//                Text("Click Me")
//            }
//        }
//    }
//
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        ClickableAnimatedProgressBar()
//    }

    // music knob draggable

//    @Composable
//    fun VolumeBars(
//        activeBars: Int,
//        barCount: Int = 12,
//        modifier: Modifier = Modifier
//    ) {
//        Canvas(modifier = modifier) {
//            val center = size.center
//            val radius = size.minDimension / 2.2f
//            val angleStep = 270f / barCount
//
//            for (i in 0 until barCount) {
//                val angleDeg = 135f + i * angleStep
//                val angleRad = Math.toRadians(angleDeg.toDouble())
//
//                val start = Offset(
//                    (center.x + cos(angleRad) * (radius - 20)).toFloat(),
//                    (center.y + sin(angleRad) * (radius - 20)).toFloat()
//                )
//
//                val end = Offset(
//                    (center.x + cos(angleRad) * radius).toFloat(),
//                    (center.y + sin(angleRad) * radius).toFloat()
//                )
//
//                val barColor = when {
//                    i < activeBars && i >= barCount - 6 -> {
//                        val fraction = (i - (barCount - 6)) / 6f
//                        lerp(Color(0xFF00FF00), Color.Red, fraction)
//                    }
//                    i < activeBars -> Color(0xFF00FF00)
//                    else -> Color.DarkGray
//                }
//
//                drawLine(
//                    color = barColor,
//                    start = start,
//                    end = end,
//                    strokeWidth = 6f,
//                    cap = StrokeCap.Round
//                )
//            }
//        }
//    }
//
//    @Composable
//    fun RotatableKnob(
//        modifier: Modifier = Modifier,
//        onAngleChanged: (Float) -> Unit
//    ) {
//        var rotationAngle by remember { mutableFloatStateOf(0f) }
//        var center by remember { mutableStateOf(Offset.Zero) }
//
//        Image(
//            painter = painterResource(id = R.drawable.knob),
//            contentDescription = "Music Knob",
//            modifier = modifier
//                .pointerInput(true) {
//                    detectDragGestures { change, _ ->
//                        val touchX = change.position.x
//                        val touchY = change.position.y
//                        val deltaX = touchX - center.x
//                        val deltaY = center.y - touchY // Inverted Y for correct rotation
//
//                        val angle = Math.toDegrees(atan2(deltaY, deltaX).toDouble()).toFloat()
//                        val fixedAngle = (angle + 360f) % 360f
//
//                        if (fixedAngle in 135f..405f) {
//                            val limited = (fixedAngle - 135f).coerceIn(0f, 270f)
//                            rotationAngle = limited
//                            onAngleChanged(limited)
//                        }
//                    }
//                }
//                .onGloballyPositioned {
//                    val coords = it.boundsInWindow()
//                    center = Offset(coords.width / 2f, coords.height / 2f)
//                }
//                .graphicsLayer {
//                    rotationZ = rotationAngle
//                },
//            contentScale = ContentScale.Fit
//        )
//    }
//
//    @Composable
//    fun MusicKnobWithBars() {
//        var angle by remember { mutableFloatStateOf(0f) }
//        val activeBars = (angle / 270f * 20).roundToInt().coerceIn(0, 20)
//
//        Box(
//            modifier = Modifier.size(380.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            VolumeBars(
//                activeBars = activeBars,
//                modifier = Modifier.fillMaxSize()
//            )
//
//            RotatableKnob(
//                modifier = Modifier.fillMaxSize(0.7f),
//                onAngleChanged = { angle = it }
//            )
//        }
//    }
//
//    Box(
//        modifier = Modifier.fillMaxSize().background(Color.Black),
//        contentAlignment = Alignment.Center
//    ) {
//        MusicKnobWithBars()
//    }

    // dropdown

//    var expanded by remember { mutableStateOf(false) }
//    val languages = listOf("Kotlin, Java, Python, Go, C++", "Swift, C")
//    var selectedLanguage by remember { mutableStateOf(languages[0]) }
//
//    Box(
//        modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        ExposedDropdownMenuBox(
//            expanded = expanded,
//            onExpandedChange = { expanded = !expanded }
//        ) {
//
//            TextField(
//                value = selectedLanguage,
//                onValueChange = {},
//                readOnly = true,
//                label = { Text("Choose Language") },
//                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
//                modifier = Modifier.menuAnchor()
//            )
//
//            DropdownMenu(
//                expanded = expanded,
//                onDismissRequest = { expanded = false }
//            ) {
//                languages.forEach { item ->
//                    DropdownMenuItem(
//                        text = { Text(item) },
//                        onClick = {
//                            selectedLanguage = item
//                            expanded = false
//                        }
//                    )
//                }
//            }
//        }
//    }

//    @Composable
//    fun TopAppBar(username: String){
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//
//        ) {
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier.padding(top = 8.dp)
//            ) {
//
//                Text(
//                    text = username,
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 23.sp
//                )
//                Icon(
//                    imageVector = Icons.Default.KeyboardArrowDown,
//                    contentDescription = "Notifications",
//                    modifier = Modifier.size(24.dp)
//                )
//                Canvas(
//                    modifier = Modifier.size(14.dp)
//                ) {
//                    drawCircle(
//                        color = Color.Red,
//                        radius = 10f
//                    )
//                }
//            }
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically,modifier = Modifier.padding(top = 8.dp)
//            ) {
//
//                Icon(
//                    painter = painterResource(R.drawable.threads),
//                    contentDescription = "Threads",
//                    modifier = Modifier
//                        .size(24.dp)
//                        .clip(RoundedCornerShape(15.dp)),
//                    tint = Color.Black
//                )
//                Box(
//                    modifier = Modifier
//                        .align(Alignment.Top)
//                        .offset(x = 0.dp, y = (-6).dp)
//                        .background(Color.Red, shape = CircleShape)
//                        .padding(horizontal = 5.dp, vertical = 2.dp),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(
//                        text = "9+",
//                        style = MaterialTheme.typography.labelSmall.copy(
//                            color = Color.White,
//                            fontSize = 10.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    )
//                }
//                Spacer(modifier = Modifier.width(19.dp))
//                Icon(
//                    painter = painterResource(R.drawable.more),
//                    contentDescription = "Post",
//                    modifier = Modifier.size(24.dp),
//                    tint = Color.Black
//                )
//                Box(
//                    modifier = Modifier
//                        .align(Alignment.Top),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Canvas(
//                        modifier = Modifier.size(2.dp)
//                    ) {
//                        drawCircle(
//                            color = Color.Red,
//                            radius = 12f
//                        )
//                    }
//
//                }
//                Spacer(modifier = Modifier.width(19.dp))
//                Icon(
//                    painter = painterResource(R.drawable.density_medium_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
//                    contentDescription = "Menu",
//                    modifier = Modifier.size(24.dp),
//                    tint = Color.Black
//                )
//            }
//        }
//    }
//
//    @Composable
//    fun StatItem(count: Int, label: String) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text = count.toString(), fontWeight = FontWeight.Bold)
//            Text(text = label)
//        }
//    }
//
//    @Composable
//    fun ProfileSection(
//        name: String,
//        bio: String,
//        posts: Int,
//        followers: Int,
//        following: Int
//    ) {
//
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//
//                Image(
//                    painter = painterResource(R.drawable.user),
//                    contentDescription = "Profile Image",
//                    modifier = Modifier
//                        .size(75.dp)
//                        .clip(CircleShape)
//
//                )
//                Spacer(modifier = Modifier.width(12.dp))
//
//                Column {
//                    Row(
//                        modifier = Modifier.fillMaxWidth().padding(start = 36.dp).padding(bottom = 8.dp)
//                    ) {
//
//                        Text(text = name, fontWeight = FontWeight.Bold, fontSize = 15.sp)
//
//                    }
//                    Spacer(modifier = Modifier.height(4.dp))
//                    // Stats
//                    Row(
//                        horizontalArrangement = Arrangement.spacedBy(35.dp),
//                        modifier = Modifier.fillMaxWidth().padding(start = 36.dp)
//                    ) {
//                        StatItem(count = posts, label = "posts")
//                        StatItem(count = followers, label = "followers")
//                        StatItem(count = following, label = "following")
//                    }
//                }
//
//            }
//            Spacer(modifier = Modifier.height(15.dp))
//
//            // Bio
//
//            Text(text = bio)
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Icon(
//                    painter = painterResource(R.drawable.link),
//                    contentDescription = "Edit Profile",
//                    tint = Color.Black,
//                    modifier = Modifier.size(15.dp)
//                )
//
//                Text(
//                    "x.com/@Adityaastwt and 2 more",
//                    color = Color.Black,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//
//            Spacer(modifier = Modifier.height(10.dp))
//
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Icon(
//                    painter = painterResource(R.drawable.threads),
//                    contentDescription = "Edit Profile",
//                    tint = Color.Black,
//                    modifier = Modifier.size(15.dp)
//                )
//
//                Text(
//                    "adityamore1875",
//                    color = Color.Black,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                // Edit Profile Button
//                OutlinedButton(
//                    onClick = { /* Your action */ },
//                    border = BorderStroke(1.dp, Color.LightGray.copy(0.6f)), // make border transparent
//                    colors = ButtonDefaults.outlinedButtonColors(
//                        containerColor = Color.LightGray.copy(0.6f), // or whatever background you want
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier
//                        .height(32.dp)
//                        .width(140.dp),
//                    shape = RoundedCornerShape(8.dp), // optional: custom shape
//                ) {
//                    Text("Edit Profile", fontSize = 12.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
//                }
//
//                Spacer(modifier = Modifier.width(5.dp))
//                OutlinedButton(
//                    onClick = { /* Your action */ },
//                    border = BorderStroke(1.dp, Color.LightGray.copy(0.6f)), // make border transparent
//                    colors = ButtonDefaults.outlinedButtonColors(
//                        containerColor = Color.LightGray.copy(0.6f), // or whatever background you want
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier
//                        .height(32.dp)
//                        .width(140.dp),
//                    shape = RoundedCornerShape(8.dp), // optional: custom shape
//                ) {
//                    Text("Share Profile", fontSize = 12.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
//                }
//
//                Spacer(modifier = Modifier.width(5.dp))
//
//                OutlinedButton(
//                    onClick = { /* Your action */ },
//                    border = BorderStroke(1.dp, Color.LightGray.copy(0.6f)), // make border transparent
//                    colors = ButtonDefaults.outlinedButtonColors(
//                        containerColor = Color.LightGray.copy(0.6f), // or whatever background you want
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier
//                        .height(32.dp),
//                    shape = RoundedCornerShape(8.dp),
//                ) {
//
//                    Icon(
//                        painter = painterResource(R.drawable.add),
//                        contentDescription = "Menu",
//                        modifier = Modifier.size(18.dp),
//                        tint = Color.Black
//                    )
//                }
//
//            }
//
//        }
//
//    }
//
//    @Composable
//    fun PostsGrid(
//        posts: List<String>,
//        modifier: Modifier = Modifier
//    ) {
//        LazyVerticalGrid(
//            columns = GridCells.Fixed(3),
//            modifier = modifier,
//            contentPadding = PaddingValues(1.dp),
//            verticalArrangement = Arrangement.spacedBy(1.dp),
//            horizontalArrangement = Arrangement.spacedBy(1.dp)
//        ) {
//            items(posts) { imageUrl ->
//                AsyncImage(
//                    model = imageUrl,
//                    contentDescription = "Post",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .aspectRatio(1f)
//                        .background(Color.LightGray)
//                )
//            }
//        }
//    }
//
//
//    data class StoryHighlight(
//        val imageUrl: String,
//        val label: String
//    )
//
//    @Composable
//    fun StoryHighlightRow(
//        highlights: List<StoryHighlight>,
//        modifier: Modifier = Modifier
//    ) {
//        LazyRow(
//            modifier = modifier.padding(horizontal = 16.dp),
//            horizontalArrangement = Arrangement.spacedBy(12.dp)
//        ) {
//            items(highlights) { highlight ->
//                Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                    AsyncImage(
//                        model = highlight.imageUrl,
//                        contentDescription = highlight.label,
//                        contentScale = ContentScale.Crop,
//                        modifier = Modifier
//                            .size(70.dp)
//                            .clip(CircleShape)
//                            .border(2.dp, Color.LightGray, CircleShape)
//                    )
//                    Spacer(modifier = Modifier.height(6.dp))
//                    Text(
//                        text = highlight.label,
//                        style = MaterialTheme.typography.bodySmall,
//                        maxLines = 1,
//                        overflow = TextOverflow.Ellipsis
//                    )
//                }
//            }
//        }
//    }
//
//
//    @Composable
//    fun InstagramProfileScreen() {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .consumeWindowInsets(WindowInsets.systemBars)
//                .verticalScroll(rememberScrollState())
//        ) {
//
//            TopAppBar(username = "adityamore1875")
//            Spacer(modifier = Modifier.height(16.dp))
//            ProfileSection(
//                "Aditya More",
//                "Chasing ideas, debugging life, and breathing fresh air when i remember to",
//                posts = 0,
//                followers = 202,
//                following = 1313
//            )
//            Spacer(modifier = Modifier.height(10.dp))
//
//            val dummyHighlights = listOf(
//                StoryHighlight("https://randomuser.me/api/portraits/men/5.jpg", "New"),
//                StoryHighlight("https://randomuser.me/api/portraits/women/1.jpg", "💛"),
//                StoryHighlight("https://randomuser.me/api/portraits/men/2.jpg", "🖤"),
//                StoryHighlight("https://randomuser.me/api/portraits/women/3.jpg", "🏏"),
//                StoryHighlight("https://randomuser.me/api/portraits/men/4.jpg", "🎶"),
//            )
//
//            StoryHighlightRow(highlights = dummyHighlights)
//
//            Spacer(modifier = Modifier.height(6.dp))
//
//            val dummyPosts = List(30) { index ->
//                "https://picsum.photos/300/300?random=$index"
//            }
//
//
//        }
//    }
//
//    InstagramProfileScreen()


    // Bottom navigation with fab insertion

//    @Composable
//    fun CustomBottomNavWithFab(
//        selectedIndex: Int,
//        onTabSelected: (Int) -> Unit,
//        onFabClick: () -> Unit
//    ) {
//        val items = listOf("Home", "Profile")
//
//        Box {
//            // Bottom Navigation Background + Items
//            Surface(
//                color = Color(0xFFF2EAFB),
//                tonalElevation = 4.dp,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(72.dp)
//                    .align(Alignment.BottomCenter),
//                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 32.dp),
//                    horizontalArrangement = Arrangement.SpaceEvenly,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    items.forEachIndexed { index, item ->
//                        if (index == 1) {
//                            // Spacer for FAB
//                            Spacer(modifier = Modifier.width(32.dp))
//                        }
//
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier.clickable { onTabSelected(index) }
//                        ) {
//                            val icon = when (item) {
//                                "Home" -> Icons.Default.Home
//                                "Profile" -> Icons.Default.Person
//                                else -> Icons.Default.Home
//                            }
//
//                            Icon(
//                                imageVector = icon,
//                                contentDescription = item,
//                                tint = if (index == selectedIndex) Color(0xFF6A1B9A) else Color.Gray
//                            )
//                            Text(
//                                text = item,
//                                fontSize = 12.sp,
//                                color = if (index == selectedIndex) Color(0xFF6A1B9A) else Color.Gray
//                            )
//                        }
//                    }
//                }
//            }
//
//            // FAB
//            FloatingActionButton(
//                onClick = onFabClick,
//                containerColor = Color(0xFF6A1B9A),
//                contentColor = Color.White,
//                shape = CircleShape,
//                modifier = Modifier
//                    .align(Alignment.BottomCenter)
//                    .offset(y = (-28).dp)
//            ) {
//                Icon(Icons.Default.Add, contentDescription = "Add")
//            }
//        }
//    }
//
//    var selectedTab by remember { mutableIntStateOf(0) }
//
//    Scaffold(
//        bottomBar = {
//            CustomBottomNavWithFab(
//                selectedIndex = selectedTab,
//                onTabSelected = { selectedTab = it },
//                onFabClick = { /* fab action */ }
//            )
//        }
//    ) { innerPadding ->
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//        ) {
//            // Your content goes here
//        }
//    }
}
