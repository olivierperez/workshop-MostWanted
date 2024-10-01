package fr.o80.mostwanted.detail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun ExerciseDetailRoute(
    goToExercisesList: () -> Unit,
    goToNextExercise: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<ExerciseDetailViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()

    ExerciseDetailScreen(
        state = state,
        goToExercisesList = goToExercisesList,
        goToNextExercise = goToNextExercise,
        modifier = modifier
    )
}
