package com.abapps.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageMoviesWithBlur(
    imageBlur: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .padding(start = 4.dp, end = 4.dp, bottom = 16.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            contentColor = Color.White,
            containerColor = Color.White
        )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .blur(radius = 16.dp),
            painter = painterResource(id = imageBlur),
            contentDescription = "image movie",
            contentScale = ContentScale.Crop
        )
    }
}