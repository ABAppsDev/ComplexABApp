package com.abapps.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.abapps.R
import com.abapps.data.datasource.model.MovieItem
import com.abapps.presentation.details.screens.MovieDetailScreen
import com.abapps.presentation.utils.Constants

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ItemMovieCard() {
    val items = Constants.listOfMovies
//    val pageState = rememberPagerState {
//        (items.size)
//    }
//    HorizontalPager(state = rememberPagerState {
//
//    }) {
//
//    }
    HorizontalPager(
        state = rememberPagerState {
            (items.size)
        }
//        ,
//        userScrollEnabled = true
//        ,
//        beyondBoundsPageCount = 2
    ) { page ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val navigator = LocalNavigator.currentOrThrow
            ImageMoviesInsideCard(imageBlur = items[page].image, image = items[page].image) {
                navigator.push(
                    MovieDetailScreen(
                        item = MovieItem(
                            items[page].id, items[page].image, items[page].name, items[page].time, items[page].description
                        )
                    )
                )
            }
            Text(
                text = items[page].time,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)
            )
            Text(
                text = items[page].name,
                fontSize = 17.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.black)
            )
        }
    }
}