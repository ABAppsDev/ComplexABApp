package com.abapps.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ImageMoviesInsideCard(
    imageBlur: Int,
    image: Int,
    click: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        ImageMoviesWithBlur(imageBlur = imageBlur)
        ImageMoviesWithoutBlur(
            image = image,
            modifier = Modifier
                .size(350.dp),
            click = click,
            contentScale = ContentScale.FillBounds
        )
    }
}