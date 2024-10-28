package com.lamarrulla.mitallerkot

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TabRowWithIconsExample() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf(
        TabItem(title = "Home", icon = Icons.Filled.Home),
        TabItem(title = "Favorites", icon = Icons.Filled.Favorite),
        TabItem(title = "Settings", icon = Icons.Filled.Settings)
    )

    Column {
        when (selectedTabIndex) {
            0 -> HomeContent()
            1 -> FavoritesContent()
            2 -> SettingsContent()
        }
        HorizontalDivider()
        TabRow(selectedTabIndex = selectedTabIndex) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    icon = { Icon(imageVector = tab.icon, contentDescription = tab.title) },
                    text = { Text(tab.title) }
                )
            }
        }
    }
}

data class TabItem(val title: String, val icon: androidx.compose.ui.graphics.vector.ImageVector)

/*@Composable
fun HomeContent() {
    Text("Home content")
}*/

@Composable
fun FavoritesContent() {
    Text("Favorites content")
}

/*@Composable
fun SettingsContent() {
    Text("Settings content")
}*/

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMenu() {
    TabRowWithIconsExample()
}

