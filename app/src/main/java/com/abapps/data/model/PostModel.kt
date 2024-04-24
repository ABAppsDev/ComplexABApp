package com.abapps.data.model

data class PostModel(
    val imagePostLarge: Int,
    val imagePostSmallOne: Int,
    val imagePostSmallTwo: Int,
    val imagePostSmallThree: Int,
    val textPost: String,
//    val userModel: List<UserModel>
    val imageUser: Int,
    val nameUser: String,
    val nickNameUser: String,
    val data: String,
    val likeNumber: Int,
    val saveNumber: Int,
    val shareNumber: Int
)
