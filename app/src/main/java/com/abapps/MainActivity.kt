package com.abapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.Navigator
import com.abapps.presentation.home.screens.MovieHomeScreen
import com.abapps.ui.theme.ABAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ABAppsTheme {
                Navigator(screen = MovieHomeScreen)
            }
        }
    }
}