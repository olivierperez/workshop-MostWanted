package fr.o80.mostwanted.solutions.solution07FinalMission

import Page
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
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
    val layoutType = navigationLayoutType()
    NavigationSuiteScaffold(
        modifier = modifier,
        layoutType = layoutType,
        navigationSuiteItems = {
            Page.entries.forEach { page ->
                item(
                    icon = {
                        Icon(
                            page.icon,
                            contentDescription = null
                        )
                    },
                    label = { Text(page.title) },
                    selected = page == currentPage,
                    onClick = { currentPage = page }
                )
            }
        },
    ) {
        AnimatedContent(
            targetState = currentPage,
            transitionSpec = contentTransitionSpec(layoutType)
        ) {
            when (it) {
                Page.IDENTITY -> SolutionIdentity(firstName, lastName, avatar)
                Page.MISSIONS -> SolutionMissionsList()
            }
        }
    }
}

@Composable
private fun navigationLayoutType(): NavigationSuiteType =
    NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(currentWindowAdaptiveInfo())

@Composable
private fun contentTransitionSpec(layoutType: NavigationSuiteType): AnimatedContentTransitionScope<Page>.() -> ContentTransform =
    remember(layoutType) {
        {
            val fadeIn = fadeIn(animationSpec = tween(220, delayMillis = 90))
            val fadeOut = fadeOut(animationSpec = tween(90))
            val slideInFromLeft = slideInHorizontally { -it / 10 }
            val slideInFromBottom = slideInVertically { it / 10 }

            val enterTransition = if (layoutType == NavigationSuiteType.NavigationRail) fadeIn + slideInFromLeft else fadeIn + slideInFromBottom
            val exitTransition = fadeOut

            enterTransition.togetherWith(exitTransition)
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
