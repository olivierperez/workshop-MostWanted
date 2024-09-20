package fr.o80.mostwanted.solutions

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.AccountCircle
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
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution0602NavigationBar(
    firstName: String,
    lastName: String,
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    var currentPage by rememberSaveable { mutableIntStateOf(0) }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = currentPage == 0,
                    onClick = { currentPage = 0 },
                    icon = {
                        Icon(
                            Icons.Default.AccountCircle,
                            contentDescription = "Account circle"
                        )
                    },
                    label = { Text(text = "BADGE") }
                )
                NavigationBarItem(
                    selected = currentPage == 1,
                    onClick = { currentPage = 1 },
                    icon = {
                        Icon(
                            Icons.AutoMirrored.Default.List,
                            contentDescription = "List"
                        )
                    },
                    label = { Text(text = "MISSIONS") }
                )
            }
        }
    ) { paddingValues ->
        AnimatedContent(
            targetState = currentPage,
            label = "Main-page",
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            transitionSpec = {
                fadeIn(animationSpec = tween(220, delayMillis = 90))
                    .togetherWith(fadeOut(tween(90)))
            }
        ) { page ->
            when (page) {
                0 -> Solution0503Skill(firstName, lastName, avatar)
                1 -> Text("Liste des missions")
            }
        }
    }
}

@Preview
@Composable
private fun Solution0602NavigationBarPreview() {
    PreviewTheme {
        Solution0602NavigationBar(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED,
            modifier = Modifier.fillMaxSize()
        )
    }
}
