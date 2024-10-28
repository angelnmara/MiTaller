package com.lamarrulla.mitallerkot

import androidx.compose.foundation.layout.Column
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
fun TabExample() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val titles = listOf("Home", "Profile", "Settings")

    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            titles.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index }
                )
            }
        }

        when (selectedTabIndex) {
            0 -> HomeContent()
            1 -> ProfileContent()
            2 -> SettingsContent()
        }
    }
}

@Composable
fun HomeContent() {
    Text("Home content")
}

@Composable
fun ProfileContent() {
    Text("Profile content")
}

@Composable
fun SettingsContent() {
    Text("Settings content")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TabExample()
}