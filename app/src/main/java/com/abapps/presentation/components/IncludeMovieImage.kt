package com.abapps.presentation.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.abapps.R
import com.abapps.presentation.home.screens.MovieHomeScreen

@Composable
fun IncludeMovieImage(
    image: Int, time: String
) {
    val context = LocalContext.current
    Box {
        ImageMoviesWithoutBlur(
            image = image, modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
        ) {
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val navigator = LocalNavigator.currentOrThrow
            ImageMoviesWithoutBlur(
                image = R.drawable.close, modifier = Modifier.size(30.dp)
            ) {
                navigator.push(MovieHomeScreen)
            }
            Text(
                text = time,
                fontSize = 13.sp,
                color = Color.White
            )
        }
        ImageMoviesWithoutBlur(
            image = R.drawable.play, modifier = Modifier
                .size(40.dp)
                .align(Alignment.Center)
        ) {
            Toast.makeText(context, "click image play", Toast.LENGTH_SHORT).show()
        }
    }
}