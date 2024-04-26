package com.abapps.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ButtonsDetailOfHomePage(
    text: String,
    color: Color,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    border: BorderStroke? = null,
    click: () -> Unit
) {

    Button(onClick = click, colors = colors, border = border) {
        Text(text = text, fontSize = 17.sp, color = color)
    }

}