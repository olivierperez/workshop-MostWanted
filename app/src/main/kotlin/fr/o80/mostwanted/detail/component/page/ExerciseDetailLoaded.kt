package fr.o80.mostwanted.detail.component.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.detail.DetailPage
import fr.o80.mostwanted.detail.component.template.ExerciseInstruction
import fr.o80.mostwanted.detail.DetailPage
import fr.o80.mostwanted.detail.component.template.ExerciseResult
import fr.o80.mostwanted.detail.component.template.ExerciseSketchup
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.domain.model.Settings
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme
import kotlinx.coroutines.launch

@Composable
fun ExerciseDetailLoaded(
    exerciseDef: ExerciseDef,
    page: DetailPage,
    settings: Settings,
    goBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState(
        initialPage = page.index,
        initialPageOffsetFraction = 0f,
        pageCount = { DetailPage.entries.size }
    )

    Column(
        modifier = modifier
    ) {
        TopAppBar(
            title = {
                Text(
                    text = exerciseDef.title,
                    style = MaterialTheme.typography.headlineSmall
                )
            },
            navigationIcon = {
                IconButton(onClick = goBack) {
                    Icon(
                        Icons.AutoMirrored.Default.KeyboardArrowLeft,
                        contentDescription = "Back"
                    )
                }
            }
        )
        TabRow(selectedTabIndex = pagerState.currentPage) {
            DetailPage.entries.forEach { page ->
                Tab(
                    selected = pagerState.currentPage == page.index,
                    onClick = {
                        scope.launch { pagerState.animateScrollToPage(page.index) }
                    },
                    text = { Text(page.label) }
                )
            }
        }
        HorizontalPager(state = pagerState) { page ->
            when (page) {
                DetailPage.Instruction.index -> ExerciseInstruction(
                    exerciseDef = exerciseDef,
                    modifier = Modifier.fillMaxSize()
                )

                DetailPage.Result.index -> ExerciseInstruction(
                    exerciseDef = exerciseDef,
                    modifier = Modifier.fillMaxSize()
                )

                DetailPage.Sketchup.index -> ExerciseSketchup(
                    exerciseDef = exerciseDef,
                    settings = settings,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Preview
@Composable
fun ExerciseDetailLoadedPreview() {
    WorkshopMostWantedPreviewTheme {
        ExerciseDetailLoaded(
            exerciseDef = ExerciseDef(
                id = 0,
                title = "Première étape",
                explanation = {
                    ExplanationText(
                        "À la CIA comme partout on commence toujours par un HelloWorld! " +
                                "Avec Jetpack Compose tout est \"Composable\", pour créer votre premier Composable " +
                                "rendez-vous dans le fichier indiqué."
                    )
                },
                file = "SimpleText.kt",
                result = {
                    Text(
                        text = "Demo",
                        style = MaterialTheme.typography.displayMedium,
                        modifier = Modifier.rotate(-30f)
                    )
                },
                solution = {}
            ),
            page = DetailPage.Result,
            settings = Settings("John", "Doe", Avatar.RED),
            goBack = {},
            modifier = Modifier.fillMaxSize()
        )
    }
}
