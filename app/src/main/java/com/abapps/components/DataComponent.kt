package com.abapps.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import com.abapps.R

@Composable
fun DataComponent(
    date: String,
    likeNumber: Int,
    saveNumber: Int,
    shareNumber: Int
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        TextComponent(
            text = date,
            fontSize = 13.sp,
            color = colorResource(id = R.color.orange)
        )
        NumberComponent(
            likeNumber = likeNumber,
            saveNumber = saveNumber,
            shareNumber = shareNumber
        )

    }

}