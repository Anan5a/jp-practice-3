package com.sayempro.oldfblikenavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun NavBottomBar(
    navController: NavController, coroutineScope: CoroutineScope, drawerState: DrawerState
) {
    NavigationBar {
        val navControllerBackStackEntry = navController.currentBackStackEntryAsState()
        val currentDest = navControllerBackStackEntry.value?.destination

        NavigationBarItem(selected = currentDest?.route == Destinations.Home.path, onClick = {
            navController.popBackStack()
            navController.navigate(Destinations.Home.path) {
                launchSingleTop = true
            }
        }, icon = {
            Icon(
                imageVector = Icons.Default.Home, contentDescription = null
            )
        }, label = { Text(text = Destinations.Home.path) })
        NavigationBarItem(selected = currentDest?.route == Destinations.Notification.path,
            onClick = {
                navController.navigate(Destinations.Notification.path) {
                    launchSingleTop = true
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Notifications, contentDescription = null
                )
            },
            label = { Text(text = Destinations.Notification.path) })
        NavigationBarItem(selected = currentDest?.route == Destinations.Menu.path, onClick = {
            coroutineScope.launch {
//                navController.navigate(Destinations.Menu.path) {
//                    launchSingleTop = true
//                }
                if (drawerState.isClosed) drawerState.open()
            }
        }, icon = {
            Icon(
                imageVector = Icons.Default.Menu, contentDescription = null
            )
        }, label = { Text(text = Destinations.Menu.path) })
    }
}