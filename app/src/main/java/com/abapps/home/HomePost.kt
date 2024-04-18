package com.abapps.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abapps.components.HomeComponent
import com.abapps.other.ConstantLists

@Composable
fun HomePost() {
    HomePostContent()
}

@Composable
fun HomePostContent() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
    ) {
        HomeComponent(
            postList = ConstantLists.post
        )
    }

}
