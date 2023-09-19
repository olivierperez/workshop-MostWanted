package fr.o80.mostwanted

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import fr.o80.mostwanted.detail.ExerciseDetailRoute
import fr.o80.mostwanted.exercises.ExercisesListRoute
import fr.o80.mostwanted.explanation.ExplanationRoute

const val PARAM_EXERCISE = "exerciseId"

private const val ROUTE_EXERCISES = "exercises-list"
private const val ROUTE_EXPLANATION = "exercises-explanation/{$PARAM_EXERCISE}"
private const val ROUTE_DETAIL = "exercises-detail/{$PARAM_EXERCISE}"

@androidx.compose.runtime.Composable
fun MostWanted() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ROUTE_EXERCISES
    ) {
        composable(route = ROUTE_EXERCISES) {
            ExercisesListRoute(
                onExerciseSelect = { exerciseId ->
                    navController.navigate(
                        ROUTE_EXPLANATION.replace(
                            "{$PARAM_EXERCISE}",
                            exerciseId.toString()
                        )
                    )
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
                    navController.navigate(
                        ROUTE_DETAIL.replace(
                            "{$PARAM_EXERCISE}",
                            exerciseId.toString()
                        )
                    ) {
                        popUpTo(ROUTE_EXPLANATION) { inclusive = true }
                    }
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
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

