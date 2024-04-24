package com.abapps.presentation.details.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.abapps.data.datasource.model.MovieItem
import com.abapps.presentation.components.MovieDetailPageComponent

@Composable
fun MovieDetailPage(item: MovieItem) {
    MovieDetailContentPage(item)
}

@Composable
fun MovieDetailContentPage(item: MovieItem) {
    MovieDetailPageComponent()

    Text(
        text = item.id.toString(),
        fontSize = 30.sp,
        modifier = Modifier.fillMaxSize()
    )

}
