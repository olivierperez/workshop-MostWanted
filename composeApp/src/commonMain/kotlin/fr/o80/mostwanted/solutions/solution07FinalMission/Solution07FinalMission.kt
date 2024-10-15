package fr.o80.mostwanted.solutions.solution07FinalMission

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun Solution07FinalMission(
    firstName: String,
    lastName: String,
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    var currentPage by rememberSaveable { mutableStateOf(Page.IDENTITY) }
    NavigationSuiteScaffold(
        modifier = modifier,
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
        when (currentPage) {
            Page.IDENTITY -> SolutionIdentity(firstName, lastName, avatar)
            Page.MISSIONS -> SolutionMissionsList()
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
