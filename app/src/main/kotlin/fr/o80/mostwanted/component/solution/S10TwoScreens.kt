package fr.o80.mostwanted.component.solution

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun S10TwoScreens(modifier: Modifier = Modifier) {
    var currentPage by rememberSaveable { mutableIntStateOf(0) }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = { currentPage = 0 },
                    icon = { Icon(Icons.Default.Home, contentDescription = "") },
                    label = { Text(text = "Home") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = { currentPage = 1 },
                    icon = { Icon(Icons.Default.Info, contentDescription = "") },
                    label = { Text(text = "Info") }
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
                0 -> Home()
                1 -> Info()
            }
        }
    }
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        text = "This is Home page",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Composable
fun Info(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        text = "Information",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview
@Composable
private fun S10TwoScreensPreview() {
    WorkshopMostWantedPreviewTheme {
        S10TwoScreens()
    }
}
