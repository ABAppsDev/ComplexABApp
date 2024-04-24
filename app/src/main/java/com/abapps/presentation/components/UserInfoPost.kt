package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import com.abapps.R

@Composable
fun UserInfoPost(
    date: String,
    likeNumber: Int,
    saveNumber: Int,
    shareNumber: Int
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = date,
            fontSize = 13.sp,
            color = colorResource(id = R.color.orange)
        )
        NumberInfoPost(
            likeNumber = likeNumber,
            saveNumber = saveNumber,
            shareNumber = shareNumber
        )

    }

}