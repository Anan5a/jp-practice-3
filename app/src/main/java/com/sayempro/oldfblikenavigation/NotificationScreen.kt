package com.sayempro.oldfblikenavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun NotificationScreen(
     modifier: Modifier
) {
    val people = remember {
        mutableStateOf(Person.getPeople())
    }
    LazyColumn(modifier = modifier) {
        items(people.value) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 3.dp)
                    .background(Color(0xFF899CD3))
                    .clip(RoundedCornerShape(bottomEnd = 4.dp, bottomStart = 4.dp))
                    .clickable { },

                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = it.resId),
                    contentDescription = null,
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .padding(4.dp)
                        .clip(
                            CircleShape
                        )
                )
                Text(
                    text = "${it.name} ${it.text}",
                    modifier = Modifier.padding(4.dp),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}