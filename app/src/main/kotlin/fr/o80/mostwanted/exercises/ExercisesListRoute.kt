package fr.o80.mostwanted.exercises

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun ExercisesListRoute(
    onExerciseSelect: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<ExercisesListViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(viewModel) {
        viewModel.event.collect { event ->
            when (event) {
                ExercisesListEvent.None -> Unit
                is ExercisesListEvent.OpenExercise -> onExerciseSelect(event.id)
            }
            viewModel.onEventHandled()
        }
    }

    ExercisesListScreen(
        exerciseDefs = state.exerciseDefs,
        onExerciseSelect = viewModel::onExerciseSelect,
        modifier = modifier
    )
}
