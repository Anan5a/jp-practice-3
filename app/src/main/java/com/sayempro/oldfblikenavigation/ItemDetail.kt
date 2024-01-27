package com.sayempro.oldfblikenavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemDetail(
    itemId: Int, modifier: Modifier
) {
    var item = getItem(itemId)
    var dessert: Dessert? = null
    var fruit: Fruit? = null

    if (item is Dessert) dessert = item
    else if (item is Fruit) fruit = item

    val painter = (dessert?.resId ?: fruit?.resId)?.let { painterResource(id = it) }
    val title = (dessert?.title ?: fruit?.name)
    val desc = (dessert?.desc ?: fruit?.desc)
    val origin = (dessert?.origin ?: fruit?.origin)

    Column(modifier = modifier) {
        painter?.let {
            Image(
                painter = it,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
        title?.let {
            Text(
                text = it,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier.padding(8.dp)
            )
        }

        origin?.let {
            Text(
                text = it,
//                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.padding(8.dp),
//                textAlign = TextAlign.Justify
            )
        }
        desc?.let {
            Text(
                text = it,
//                fontWeight = FontWeight.Bold,
//                fontSize = 12.sp,
                modifier = Modifier.padding(8.dp), textAlign = TextAlign.Justify
            )
        }
    }
}