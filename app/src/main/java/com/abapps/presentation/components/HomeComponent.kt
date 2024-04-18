package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abapps.presentation.model.PostModel

@Composable
fun HomeComponent(postList: List<PostModel>) {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        items(items = postList) { post ->
            PostCard(
                imagePostLarge = post.imagePostLarge,
                imagePostSmallOne = post.imagePostSmallOne,
                imagePostSmallTwo = post.imagePostSmallTwo,
                imagePostSmallThree = post.imagePostSmallThree,
                textPost = post.textPost,
                imageUser = post.imageUser,
                nameUser = post.nameUser,
                nickNameUser = post.nickNameUser,
                data = post.data,
                likeNumber = post.likeNumber,
                saveNumber = post.saveNumber,
                shareNumber = post.shareNumber
            )
        }
    }
}