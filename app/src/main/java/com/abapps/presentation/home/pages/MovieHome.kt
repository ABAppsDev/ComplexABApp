package com.abapps.presentation.home.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abapps.presentation.components.HomePageComponent

@Composable
fun MovieHome() {
    MovieContentHome()
}

@Composable
fun MovieContentHome() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        HomePageComponent()
    }
}
