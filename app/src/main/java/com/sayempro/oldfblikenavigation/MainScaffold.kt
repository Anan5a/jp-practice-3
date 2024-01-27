package com.sayempro.oldfblikenavigation

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import kotlinx.coroutines.CoroutineScope


sealed class Destinations(val path: String) {
    object Home : Destinations("home")
    object Notification : Destinations("notifications")
    object Menu : Destinations("menu")
    object Details : Destinations("detail/{contentID}") {
        fun createRoute(itemId: Int) = "detail/$itemId"
    }


}


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MainScaffold(
    navController: NavHostController,
    coroutineScope: CoroutineScope,
    context: Context
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed, confirmStateChange = {
        if (it == DrawerValue.Closed) navController.popBackStack()
        true
    })

    ModalNavigationDrawer(
        drawerContent = {
            NavigationDrawerContent()
        }, drawerState = drawerState
    ) {
        Scaffold(bottomBar = {
            NavBottomBar(
                navController = navController,
                coroutineScope = coroutineScope,
                drawerState = drawerState
            )
        }) { paddingValues ->
            val stdModifier = Modifier.padding(paddingValues)
            NavHost(navController = navController, startDestination = Destinations.Home.path) {
                //content
                composable(Destinations.Home.path) {
                    HomeScreen(stdModifier, navController)
                }
                composable(Destinations.Notification.path) {
                    NotificationScreen(stdModifier)
                }
                composable(Destinations.Details.path,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "https://example.com/detail/{contentID}" },
                        navDeepLink { uriPattern = "http://example.com/detail/{contentID}" },
                    )
                ) {
                    val itemId = it.arguments?.getString("contentID")
                    if (itemId == null) {
                        Toast.makeText(context, "The item not found!", Toast.LENGTH_LONG).show()
                    } else {
                        ItemDetail(itemId = itemId.toInt(), modifier = stdModifier)
                    }
                }

                composable(Destinations.Menu.path) {

                }
            }
        }
    }


}