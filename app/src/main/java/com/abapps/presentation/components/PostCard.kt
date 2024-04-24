package com.abapps.presentation.components

import androidx.compose.runtime.Composable
import com.abapps.data.model.CatItem

@Composable
fun PostCard(
    cats: CatItem
) {
    ItemPostCard(cats = cats)
}