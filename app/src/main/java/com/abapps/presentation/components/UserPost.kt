package com.abapps.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserPost(
    imageUser: Int, nameUser: String, nickNameUser: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImageUser(
                image = painterResource(imageUser),
                contentDescription = "image user",
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = nameUser,
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = nickNameUser, fontSize = 13.sp, color = Color.Black
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            elevation = ButtonDefaults.buttonElevation(focusedElevation = 10.dp),
            border = BorderStroke(width = 1.dp, color = Color.Black),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White, containerColor = Color.White
            )
        ) {
            Text(
                text = "Follow", fontSize = 15.sp, color = Color.Black
            )
        }
    }
}