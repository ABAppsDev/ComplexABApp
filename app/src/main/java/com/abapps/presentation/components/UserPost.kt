package com.abapps.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserPost(
    imageUser: Int,
    nameUser: String,
    nickNameUser: String
) {
    Box {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                ImageUser(
                    image = painterResource(imageUser),
                    contentDescription = "image user",
                    contentScale = ContentScale.Crop
                )
                Column {
                    TextComponent(
                        text = nameUser,
                        fontSize = 15.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold
                    )

                    TextComponent(
                        text = nickNameUser,
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                }
            }
            ButtonFollow(
                click = { },
                elevation = ButtonDefaults.buttonElevation(focusedElevation = 10.dp),
                border = BorderStroke(width = 1.dp, color = Color.Black),
                color = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color.White
                )
            ) {
                TextComponent(
                    text = "Follow",
                    fontSize = 15.sp,
                    color = Color.Black
                )
            }
        }
    }
}