package com.abapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.abapps.navigation.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ABAppsTheme {
                Navigator(screen = HomeScreen)
//            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//    ABAppsTheme {
        Navigator(screen = HomeScreen)
//    }
}