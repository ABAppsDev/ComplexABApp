package com.abapps.presentation.screens

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import com.abapps.presentation.screens.home.HomePost

object HomeScreen: Screen {


    @Composable
    override fun Content() {
        HomePost()
    }
}