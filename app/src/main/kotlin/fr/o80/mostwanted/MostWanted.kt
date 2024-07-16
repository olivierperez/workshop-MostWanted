package fr.o80.mostwanted

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import fr.o80.mostwanted.detail.ExerciseDetailRoute
import fr.o80.mostwanted.detail.component.page.DetailPage
import fr.o80.mostwanted.exercises.ExercisesListRoute
import fr.o80.mostwanted.explanation.ExplanationRoute

const val PARAM_EXERCISE = "exerciseId"
const val PARAM_PAGE = "page"

private const val ROUTE_EXERCISES = "exercises-list"
private const val ROUTE_EXPLANATION = "exercises-explanation/{$PARAM_EXERCISE}"
private const val ROUTE_DETAIL = "exercises-detail/{$PARAM_EXERCISE}/{$PARAM_PAGE}"

@androidx.compose.runtime.Composable
fun MostWanted() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ROUTE_EXERCISES
    ) {
        composable(route = ROUTE_EXERCISES) {
            ExercisesListRoute(
                goToExplanation = { exerciseId ->
                    navController.navigate(
                        ROUTE_EXPLANATION.replace(
                            "{$PARAM_EXERCISE}",
                            exerciseId.toString()
                        )
                    )
                },
                goToResult = { exerciseId ->
                    navController.navigateToDetail(exerciseId, DetailPage.Result)
                },
                modifier = Modifier.fillMaxSize()
            )
        }
        composable(
            route = ROUTE_EXPLANATION,
            arguments = listOf(
                navArgument(PARAM_EXERCISE) { type = NavType.IntType }
            )
        ) {
            ExplanationRoute(
                goToSketchup = { exerciseId ->
                    navController.navigateToDetail(exerciseId, DetailPage.Sketchup) {
                        popUpTo(ROUTE_EXPLANATION) { inclusive = true }
                    }
                },
                goBack = { navController.navigateUp() },
                modifier = Modifier.fillMaxSize()
            )
        }
        composable(
            route = ROUTE_DETAIL,
            arguments = listOf(
                navArgument(PARAM_EXERCISE) { type = NavType.IntType }
            )
        ) {
            ExerciseDetailRoute(
                goBack = { navController.navigateUp() },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

private fun NavHostController.navigateToDetail(
    exerciseId: Int,
    page: DetailPage,
    builder: NavOptionsBuilder.() -> Unit = {}
) {
    navigate(
        ROUTE_DETAIL.replace(
            "{$PARAM_EXERCISE}",
            exerciseId.toString()
        ).replace(
            "{$PARAM_PAGE}",
            page.name
        ),
        builder
    )
}

