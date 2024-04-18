package com.abapps.components

import androidx.compose.runtime.Composable

@Composable
fun PostCard(
    imagePostLarge: Int,
    imagePostSmallOne: Int,
    imagePostSmallTwo: Int,
    imagePostSmallThree: Int,
    textPost: String,
    imageUser: Int,
    nameUser: String,
    nickNameUser: String,
    data: String,
    likeNumber: Int,
    saveNumber: Int,
    shareNumber: Int
) {
    ItemPostCard(
        imagePostLarge = imagePostLarge,
        imagePostSmallOne = imagePostSmallOne,
        imagePostSmallTwo = imagePostSmallTwo,
        imagePostSmallThree = imagePostSmallThree,
        textPost = textPost,
        imageUser = imageUser,
        nameUser = nameUser,
        nickNameUser = nickNameUser,
        data = data,
        likeNumber = likeNumber,
        saveNumber = saveNumber,
        shareNumber = shareNumber
    )
}