package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.icons.AccountCircle
import fr.o80.mostwanted.icons.MenuList
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution0601NavigationBar(
    modifier: Modifier = Modifier
) {
    var currentPage by rememberSaveable { mutableIntStateOf(0) }
    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = modifier.fillMaxWidth()
            ) {
                NavigationBarItem(
                    selected = currentPage == 0,
                    onClick = { currentPage = 0 },
                    icon = {
                        Icon(
                            AccountCircle,
                            contentDescription = null
                        )
                    },
                    label = { Text(text = "BADGE") }
                )
                NavigationBarItem(
                    selected = currentPage == 1,
                    onClick = { currentPage = 1 },
                    icon = {
                        Icon(
                            MenuList,
                            contentDescription = null
                        )
                    },
                    label = { Text(text = "MISSIONS") }
                )
            }
        }
    ) { paddingValues ->
        Text(
            text = "Page $currentPage",
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Preview
@Composable
private fun Solution0601NavigationBarPreview() {
    PreviewTheme {
        Solution0601NavigationBar()
    }
}
