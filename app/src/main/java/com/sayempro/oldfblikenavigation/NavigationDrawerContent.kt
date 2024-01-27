package com.sayempro.oldfblikenavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.catalin.fblikeapp.data.Shortcut

@Composable
fun NavigationDrawerContent() {
    val person = Person.getPerson()
    val personIcon = painterResource(id = person.resId)
    val randomItems = getRandomItems(7)
    val shortCuts = Shortcut.getShortcuts()

    ModalDrawerSheet(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .background(Color(0xFF6F6969))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .clickable { }
                .background(Color(0xE0FFF7F7))) {
            Image(
                painter = personIcon,
                contentDescription = null,
                modifier = Modifier
                    .width(50.dp)
                    .clip(CircleShape)
            )
            Text(
                text = person.name, fontWeight = FontWeight.Bold, modifier = Modifier.padding(4.dp)
            )
        }
        Text(text = "Your shortcuts", modifier = Modifier.padding(8.dp))

        LazyRow {
            items(randomItems) {
                var title: String = ""
                var resID = 0
                var shape: Shape = RoundedCornerShape(8.dp)

                when (it::class) {
                    Dessert::class -> {
                        title = (it as Dessert).title
                        resID = it.resId
                    }

                    Fruit::class -> {
                        title = (it as Fruit).name
                        resID = it.resId
                    }

                    Person::class -> {
                        title = (it as Person).name
                        resID = it.resId
                        shape = CircleShape
                    }
                }
                Column(modifier = Modifier
                    .padding(4.dp)
                    .width(60.dp)
                    .clickable { }) {
                    Image(
                        painter = painterResource(resID),
                        contentDescription = null,
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp)
                            .clip(shape),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = title, overflow = TextOverflow.Ellipsis, maxLines = 1)
                }
            }
        }
        Text(text = "All shortcuts", modifier = Modifier.padding(8.dp))

        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(shortCuts) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(8.dp)
                        .height(80.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xE0FFF7F7))
                        .clickable { }) {
                    Icon(
                        painter = painterResource(id = it.resId),
                        contentDescription = null,
                        tint = it.tint,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.TopStart)
                    )
                    Text(
                        text = it.title,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.BottomStart)
                    )
                }
            }
        }
    }
}