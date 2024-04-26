package com.abapps.presentation.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abapps.R

@Composable
fun ButtonsOfHomePage() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, bottom = 24.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        val context = LocalContext.current
        ButtonsDetailOfHomePage(
            text = "Now Streaming",
            color = colorResource(id = R.color.white),
            colors = ButtonDefaults.buttonColors(
                contentColor = colorResource(id = R.color.black),
                containerColor = colorResource(id = R.color.orange)
            ),
            border = BorderStroke(1.dp, colorResource(id = R.color.white))
        ) {
            Toast.makeText(context, "Now", Toast.LENGTH_SHORT).show()
        }
        ButtonsDetailOfHomePage(
            text = "Coming Soon",
            color = colorResource(id = R.color.black),
            colors = ButtonDefaults.buttonColors(
                contentColor = colorResource(id = R.color.white),
                containerColor = colorResource(id = R.color.white)
            ),
            border = BorderStroke(1.dp, colorResource(id = R.color.white))
        ) {
            Toast.makeText(context, "Soon", Toast.LENGTH_SHORT).show()
        }
    }

}