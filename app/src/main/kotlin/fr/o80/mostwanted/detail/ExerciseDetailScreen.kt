package fr.o80.mostwanted.detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.detail.component.page.ExerciseDetailLoaded
import fr.o80.mostwanted.detail.component.page.ExerciseDetailLoading

@Composable
fun ExerciseDetailScreen(
    state: ExerciseDetailUiState,
    modifier: Modifier = Modifier
) {

    when(state) {
        ExerciseDetailUiState.Loading -> ExerciseDetailLoading(modifier)
        is ExerciseDetailUiState.Loaded -> ExerciseDetailLoaded(
            state.exerciseDef,
            modifier
        )
        ExerciseDetailUiState.Error -> TODO()
    }

}
