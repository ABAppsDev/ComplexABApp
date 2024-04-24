package com.abapps.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ImageUser(
    image: Painter,
    contentDescription: String,
    contentScale: ContentScale,
    modifier: Modifier = Modifier
        .size(60.dp)
        .clip(CircleShape)
        .border(width = 1.dp, color = Color.White, shape = CircleShape)
) {
    Image(
        painter = image,
        contentDescription = contentDescription,
        contentScale = contentScale
    )
}