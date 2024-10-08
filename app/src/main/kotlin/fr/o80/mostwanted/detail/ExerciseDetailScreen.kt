package fr.o80.mostwanted.detail

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.detail.component.page.ExerciseDetailLoaded
import fr.o80.mostwanted.detail.component.page.ExerciseDetailLoading

@Composable
fun ExerciseDetailScreen(
    state: ExerciseDetailUiState,
    goToExercisesList: () -> Unit,
    goToNextExercise: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler { goToExercisesList() }

    when (state) {
        ExerciseDetailUiState.Loading -> ExerciseDetailLoading(
            modifier = modifier
        )

        is ExerciseDetailUiState.Loaded -> ExerciseDetailLoaded(
            exerciseDef = state.exerciseDef,
            page = state.page,
            settings = state.settings,
            goToExercisesList = goToExercisesList,
            goToNextExercise = goToNextExercise,
            modifier = modifier
        )

        ExerciseDetailUiState.Error -> Unit
    }

}
