package com.abapps.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent(
    text: String,
    fontSize: TextUnit,
    color: Color,
    fontWeight: FontWeight? = null,
    textAlign: TextAlign? = null,
    modifier: Modifier = Modifier
) {

    Text(
        text = text,
        fontSize = fontSize,
        color = color,
        fontWeight = fontWeight,
        textAlign = textAlign,
        modifier = modifier
    )

}