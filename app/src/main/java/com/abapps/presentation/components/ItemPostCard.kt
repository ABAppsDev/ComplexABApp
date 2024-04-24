package com.abapps.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.abapps.R
import com.abapps.data.model.CatItem

@Composable
fun ItemPostCard(
    cats: CatItem
) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .fillMaxSize(),
        elevation = CardDefaults.cardElevation(
            pressedElevation = 20.dp,
        )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp).also { Arrangement.Center },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UserPost(
                imageUser = R.drawable.ic_dome,
                nameUser = "Mostafa Mohamed",
                nickNameUser = "@mostafa_mohamed"
            )

            AsyncImage(
                modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                model = cats.url,
                contentDescription = "image large"
            )

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ImagePost(
                    image = painterResource(id = R.drawable.palestine),
                    contentDescription = "image small one"
                )
                ImagePost(
                    image = painterResource(id = R.drawable.palestine),
                    contentDescription = "image small two"
                )
                ImagePost(
                    image = painterResource(id = R.drawable.palestine),
                    contentDescription = "image small three"
                )
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Palestine has been free since 1988",
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
            UserInfoPost(
                date = cats.id,
                likeNumber = 5,
                saveNumber = 7,
                shareNumber = 10
            )
        }
    }
}