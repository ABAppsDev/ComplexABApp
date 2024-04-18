package com.abapps.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CardComponent(
    modifier: Modifier,
    elevation: CardElevation,
    color: CardColors = CardDefaults.cardColors(),
    content: @Composable ColumnScope.() -> Unit
) {

    Card(
        modifier = modifier,
        elevation = elevation,
        colors = color,
        content = {
            Column(content = content)
        }
    )


}