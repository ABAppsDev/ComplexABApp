package com.abapps.presentation.details.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abapps.data.datasource.model.MovieItem
import com.abapps.presentation.components.MovieDetailPageComponent

@Composable
fun MovieDetailPage(item: MovieItem) {
    MovieDetailContentPage(item)
}

@Composable
fun MovieDetailContentPage(item: MovieItem) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        MovieDetailPageComponent(item)
    }
}
