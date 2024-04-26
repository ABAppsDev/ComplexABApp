package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun HomePageComponent() {

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ButtonsOfHomePage()
        MovieCard()
    }
}
