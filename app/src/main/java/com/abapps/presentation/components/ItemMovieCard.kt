package com.abapps.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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


    fun listOfMovies() = mutableListOf(
        MovieItem(1, R.drawable.ic_person, "Mostafa Mohamed", "1998"),
        MovieItem(1, R.drawable.ic_person, "Mostafa Mohamed", "1998"),
        MovieItem(1, R.drawable.ic_person, "Mostafa Mohamed", "1998"),
        MovieItem(1, R.drawable.ic_person, "Mostafa Mohamed", "1998"),
        MovieItem(1, R.drawable.ic_person, "Mostafa Mohamed", "1998")
    )


    val items = Constants.listOfMovies
//    val pagerState = rememberPagerState()

    HorizontalPager(
        pageCount = items.size
//        ,
//        state = pagerState,
    ) { page ->
        Column(
//            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//            Card(
//                elevation = CardDefaults.cardElevation(pressedElevation = 20.dp, hoveredElevation = 20.dp)
//            ) {
//
//            }
            val navigator = LocalNavigator.currentOrThrow
            Image(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        navigator.push(
                            MovieDetailScreen(
                                item = MovieItem(
                                    items[page].id,
                                    items[page].image,
                                    items[page].name,
                                    items[page].time
                                )
                            )
                        )
                    },
                painter = painterResource(id = items[page].image),
                contentDescription = "image movie"
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