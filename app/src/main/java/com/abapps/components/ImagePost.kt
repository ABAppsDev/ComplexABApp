package com.abapps.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp


@Composable
fun ImagePost(
    modifier: Modifier = Modifier,
    image: Painter,
    contentDescription: String
) {

    Image(
        modifier = modifier.clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp, bottomEnd = 15.dp, bottomStart = 15.dp)),
        painter = image,
        contentDescription = contentDescription
    )
}