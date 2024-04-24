package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abapps.R

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
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .fillMaxSize(),
        elevation = CardDefaults.cardElevation(
            pressedElevation = 20.dp,
        )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp).also { Arrangement.Center },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UserPost(
                imageUser = imageUser,
                nameUser = nameUser,
                nickNameUser = nickNameUser
            )
            ImagePost(
                image = painterResource(id = imagePostLarge),
                contentDescription = "image large",
                modifier = Modifier.fillMaxWidth().height(250.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ImagePost(
                    image = painterResource(id = imagePostSmallOne),
                    contentDescription = "image small one"
                )
                ImagePost(
                    image = painterResource(id = imagePostSmallTwo),
                    contentDescription = "image small two"
                )
                ImagePost(
                    image = painterResource(id = imagePostSmallThree),
                    contentDescription = "image small three"
                )
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = textPost,
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
            UserInfoPost(
                date = data,
                likeNumber = likeNumber,
                saveNumber = saveNumber,
                shareNumber = shareNumber
            )
        }
    }
}