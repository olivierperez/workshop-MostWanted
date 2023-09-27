package fr.o80.mostwanted.detail.component.page

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.component.ScreenTitle
import fr.o80.mostwanted.detail.component.template.ExerciseResult
import fr.o80.mostwanted.detail.component.template.ExerciseSketchup
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExerciseDetailLoaded(
    exerciseDef: ExerciseDef,
    page: DetailPage,
    modifier: Modifier = Modifier
) {
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState(
        initialPage = page.index,
        initialPageOffsetFraction = 0f,
        pageCount = { 2 }
    )

    Column(
        modifier = modifier
    ) {
        ScreenTitle(
            title = exerciseDef.title
        )
        TabRow(selectedTabIndex = pagerState.currentPage) {
            Tab(
                selected = pagerState.currentPage == 0,
                onClick = { scope.launch { pagerState.animateScrollToPage(0) } },
                text = { Text("Exercise") }
            )
            Tab(
                selected = pagerState.currentPage == 1,
                onClick = { scope.launch { pagerState.animateScrollToPage(1) } },
                text = { Text("Maquette") }
            )
        }
        HorizontalPager(state = pagerState) { page ->
            when (page) {
                0 -> ExerciseResult(exerciseDef = exerciseDef, modifier = Modifier.fillMaxSize())
                1 -> ExerciseSketchup(exerciseDef = exerciseDef, modifier = Modifier.fillMaxSize())
            }
        }
    }
}

enum class DetailPage(val index: Int) {
    Result(0),
    Sketchup(1)
}

@Preview
@Composable
fun ExerciseDetailLoadedPreview() {
    WorkshopMostWantedPreviewTheme {
        ExerciseDetailLoaded(
            exerciseDef = ExerciseDef(
                id = 0,
                title = "Première étape",
                explanation = "À la CIA comme partout on commence toujours par un HelloWorld! " +
                    "Avec Jetpack Compose tout est \"Composable\", pour créer votre premier Composable " +
                    "rendez-vous dans le fichier indiqué.",
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
            modifier = Modifier.fillMaxSize()
        )
    }
}
