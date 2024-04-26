package com.abapps.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun ImageMoviesWithoutBlur(
    image: Int,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    click: () -> Unit
) {

    Card(
        modifier = modifier, onClick = click
    ) {
        Image(
            modifier = modifier,
            painter = painterResource(id = image),
            contentDescription = "image movie",
            contentScale = contentScale
        )
    }
}