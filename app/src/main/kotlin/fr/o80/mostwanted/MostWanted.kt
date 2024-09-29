package fr.o80.mostwanted

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import fr.o80.mostwanted.detail.DetailPage
import fr.o80.mostwanted.detail.ExerciseDetailRoute
import fr.o80.mostwanted.exercises.ExercisesListRoute
import fr.o80.mostwanted.home.HomeRoute

const val PARAM_EXERCISE = "exerciseId"
const val PARAM_PAGE = "page"

private const val ROUTE_HOME = "home"
private const val ROUTE_EXERCISES = "exercises-list"
private const val ROUTE_LOADING = "loading"
private const val ROUTE_DETAIL =
    "exercises-detail/{$PARAM_EXERCISE}/{$PARAM_PAGE}"

@Composable
fun MostWanted() {
    val navController = rememberNavController()
    val viewModel = hiltViewModel<NavigationViewModel>()
    val startPage by viewModel.startPage.collectAsStateWithLifecycle()

    NavHost(
        navController = navController,
        startDestination = when (startPage) {
            StartPage.HOME -> ROUTE_HOME
            StartPage.EXERCISES -> ROUTE_EXERCISES
            null -> ROUTE_LOADING
        }
    ) {
        composable(ROUTE_LOADING) {
            // Empty
        }
        composable(route = ROUTE_HOME) {
            HomeRoute(
                goToExercises = {
                    navController.navigate(ROUTE_EXERCISES)
                },
                modifier = Modifier.fillMaxSize()
            )
        }
        composable(route = ROUTE_EXERCISES) {
            ExercisesListRoute(
                goToExplanation = { exerciseId ->
                    navController.navigateToDetail(
                        exerciseId,
                        DetailPage.Instruction
                    )
                },
                goToResult = { exerciseId ->
                    navController.navigateToDetail(
                        exerciseId,
                        DetailPage.Result
                    )
                },
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
                goToExercisesList = {
                    navController.navigate(ROUTE_EXERCISES)
                },
                goToNextExercise = { exerciseId ->
                    navController.navigateToDetail(
                        exerciseId,
                        DetailPage.Instruction
                    )
                },
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

