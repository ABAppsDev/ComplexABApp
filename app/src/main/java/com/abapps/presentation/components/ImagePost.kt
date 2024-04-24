package com.abapps.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp


@Composable
fun ImagePost(
    image: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier
) {

    Image(
        painter = image,
        contentDescription = contentDescription,
        modifier = modifier
    )
}