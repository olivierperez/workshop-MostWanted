package fr.o80.mostwanted.solutions.solution07FinalMission

import Header
import NavBar
import Page
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution07FinalMission(
    firstName: String,
    lastName: String,
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    var currentPage by rememberSaveable { mutableStateOf(Page.IDENTITY) }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            Header()
        },
        bottomBar = {
            NavBar(
                currentPage = currentPage,
                onPageClick = { pageClicked -> currentPage = pageClicked }
            )
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
                Page.IDENTITY -> SolutionIdentity(firstName, lastName, avatar)
                Page.MISSIONS -> SolutionMissionsList()
            }
        }
    }
}

@Preview
@Composable
private fun Solution07FinalMissionPreview() {
    PreviewTheme {
        Solution07FinalMission(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED,
            modifier = Modifier.fillMaxSize()
        )
    }
}
