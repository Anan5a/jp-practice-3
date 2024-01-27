package com.sayempro.oldfblikenavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    modifier: Modifier,
    navController: NavController
) {
    val desserts = remember {
        mutableStateOf(Dessert.getAllDesserts())
    }
    val fruits = remember {
        mutableStateOf(Fruit.getAllFruits())
    }
    val pageSize = 5
    var currentPage = 0

    LazyColumn(
        modifier = modifier.background(Color(0x9E9E9191))
    ) {
        val dessertSize = desserts.value.size
        while (dessertSize > currentPage * pageSize) {

            val from = currentPage * pageSize
            var to = (currentPage + 1) * pageSize
            if (to > dessertSize) to = dessertSize
            val nextDesserts = desserts.value.subList(from, to)

            items(nextDesserts) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .background(Color.White)
                    .clickable { navController.navigate(Destinations.Details.createRoute(it.id)) }) {
                    Text(
                        text = it.title,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(4.dp),
                        fontSize = 18.sp
                    )
                    Text(
                        text = it.desc,
                        modifier = Modifier.padding(4.dp),
                        fontSize = 14.sp,
                        lineHeight = 14.sp,
                        softWrap = true
                    )
                    Image(
                        painter = painterResource(id = it.resId),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth
                    )
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(3.dp)
                    ) {
                        Column(modifier = Modifier.padding(2.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.clickable {
                                    navController.navigate(
                                        Destinations.Details.createRoute(
                                            it.id
                                        )
                                    )
                                }) {
                                Icon(imageVector = Icons.Default.ThumbUp, contentDescription = null)
                                Text(text = "Like", modifier = Modifier.padding(4.dp))

                            }
                        }
                        Column(modifier = Modifier.padding(2.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.clickable {
                                    navController.navigate(
                                        Destinations.Details.createRoute(
                                            it.id
                                        )
                                    )
                                }) {
                                Icon(imageVector = Icons.Default.Send, contentDescription = null)
                                Text(text = "Comment", modifier = Modifier.padding(4.dp))

                            }
                        }
                        Column(modifier = Modifier.padding(2.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.clickable {
                                    navController.navigate(
                                        Destinations.Details.createRoute(
                                            it.id
                                        )
                                    )
                                }) {
                                Icon(imageVector = Icons.Default.Share, contentDescription = null)
                                Text(text = "Share", modifier = Modifier.padding(4.dp))

                            }
                        }
                    }

                }
            }
            val fruitsFrom = currentPage * pageSize
            var fruitsTo = (currentPage + 1) * pageSize
            if (fruits.value.size < fruitsTo) fruitsTo = fruits.value.size
            val nextFruits = fruits.value.subList(fruitsFrom, fruitsTo)

            item {
                LazyRow(
                    modifier = Modifier
                        .padding(8.dp)
                        .height(250.dp)
                ) {
                    items(nextFruits) {
                        Box(modifier = Modifier
                            .fillMaxHeight()
                            .width(150.dp)
                            .padding(4.dp)
                            .clip(
                                RoundedCornerShape(16.dp)
                            )
                            .clickable {
                                navController.navigate(
                                    Destinations.Details.createRoute(
                                        it.id
                                    )
                                )
                            }) {
                            Image(
                                painter = painterResource(id = it.resId),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillHeight
                            )
                            Text(
                                text = it.name,
                                modifier = Modifier
                                    .padding(4.dp)
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(Color(0xFF353232))
                                    .padding(4.dp),
                                color = Color.White
                            )
                        }
                    }
                }
            }

            currentPage++
        }
    }


}