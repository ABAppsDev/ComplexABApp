package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abapps.R

@Composable
fun NumberInfoPost(
    likeNumber: Int,
    saveNumber: Int,
    shareNumber: Int
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(3.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ImagePost(
            image = painterResource(id = R.drawable.ic_favorite),
            contentDescription = "image favorite"
        )
        Text(
            text = likeNumber.toString(),
            fontSize = 11.sp,
            color = Color.Black
        )
        ImagePost(
            image = painterResource(id = R.drawable.ic_save),
            contentDescription = "image save"
        )
        Text(
            text = saveNumber.toString(),
            fontSize = 11.sp,
            color = Color.Black
        )
        ImagePost(
            image = painterResource(id = R.drawable.ic_share),
            contentDescription = "image share"
        )
        Text(
            text = shareNumber.toString(),
            fontSize = 11.sp,
            color = Color.Black
        )
    }

}