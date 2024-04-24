package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abapps.data.model.CatItem
import com.abapps.presentation.screens.home.viewmodel.CatHomeViewModel

@Composable
fun HomeComponent(catHomeViewModel: CatHomeViewModel) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        catHomeViewModel.listCats.value.data?.let {
            items(it) { cats ->
                PostCard(cats = cats)
            }
        }
    }
}