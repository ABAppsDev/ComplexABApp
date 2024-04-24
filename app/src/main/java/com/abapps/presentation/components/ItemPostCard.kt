package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemPostCard(
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
    CardComponent(
        modifier = Modifier
            .padding(vertical = 5.dp, horizontal = 5.dp)
            .fillMaxSize(),
        elevation = CardDefaults.cardElevation(
            pressedElevation = 20.dp,
        )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            UserPost(
                imageUser = imageUser,
                nameUser = nameUser,
                nickNameUser = nickNameUser
            )
            ImagePost(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                image = painterResource(id = imagePostLarge),
                contentDescription = "image large"
            )

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ImagePost(
                    image = painterResource(id = imagePostSmallOne),
                    contentDescription = "image large"
                )
                ImagePost(
                    image = painterResource(id = imagePostSmallTwo),
                    contentDescription = "image large"
                )
                ImagePost(
                    image = painterResource(id = imagePostSmallThree),
                    contentDescription = "image large"
                )
            }
            TextComponent(
                text = textPost,
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
            DataComponent(
                date = data,
                likeNumber = likeNumber,
                saveNumber = saveNumber,
                shareNumber = shareNumber
            )
        }
    }
}