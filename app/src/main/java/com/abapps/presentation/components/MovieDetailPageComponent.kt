package com.abapps.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abapps.data.datasource.model.MovieItem

@Composable
fun MovieDetailPageComponent(item: MovieItem) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IncludeMovieImage(image = item.image, time = item.time)
        AnimatedVisibility(visible = true) {
            MovieActors(
                name = item.name,
                image = item.image,
                description = item.description,
                modifier = Modifier.fillMaxWidth().height(350.dp)
            )
        }
    }
}