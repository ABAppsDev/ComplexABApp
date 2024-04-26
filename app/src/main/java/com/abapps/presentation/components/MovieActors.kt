package com.abapps.presentation.components

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abapps.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieActors(
    name: String,
    image: Int,
    description: String,
    modifier: Modifier = Modifier
) {
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    val context = LocalContext.current


    AnimatedVisibility(visible = sheetState.isVisible) {
        ModalBottomSheet(
            onDismissRequest = {
                scope.launch {
                    sheetState.hide()
                }
            },
            sheetState = sheetState,
            containerColor = Color.White, modifier = modifier,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = name,
                    modifier = Modifier.padding(all = 20.dp),
                    fontSize = 23.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(count = 30) {
                        Image(
                            painter = painterResource(id = image),
                            contentDescription = "image actors",
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(40.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Text(
                    text = description,
                    modifier = Modifier.padding(all = 20.dp),
                    fontSize = 20.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Button(
                    onClick = {
                        Toast.makeText(context, "Button inside bottom sheet", Toast.LENGTH_SHORT)
                            .show()
                    }, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, contentColor = Color.Black
                    )
                ) {
                    Text(text = "Booking", fontSize = 17.sp, color = Color.White)
                }
            }
        }
    }
    Image(
        painter = painterResource(id = R.drawable.actsor),
        contentDescription = "image actors",
        modifier = Modifier
            .clip(CircleShape)
            .size(40.dp)
            .clickable {
                scope.launch {
                    sheetState.show()
                }
            },
        contentScale = ContentScale.Crop
    )
}
