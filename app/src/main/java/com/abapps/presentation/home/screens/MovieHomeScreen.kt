package com.abapps.presentation.home.screens

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import com.abapps.presentation.home.pages.MovieHome

object MovieHomeScreen: Screen {
    private fun readResolve(): Any = MovieHomeScreen

    @Composable
    override fun Content() {
        MovieHome()
    }
}