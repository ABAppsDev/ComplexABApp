package com.abapps.presentation.details.screens

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import com.abapps.data.datasource.model.MovieItem
import com.abapps.presentation.details.pages.MovieDetailPage

data class MovieDetailScreen(
    val item: MovieItem
): Screen {

    @Composable
    override fun Content() {
        MovieDetailPage(item)
    }
}