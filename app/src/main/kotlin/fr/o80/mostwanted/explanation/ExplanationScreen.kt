package fr.o80.mostwanted.explanation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.explanation.component.page.ExplanationLoaded
import fr.o80.mostwanted.explanation.component.page.Loading

@Composable
fun ExplanationScreen(
    state: ExplanationUiState,
    goToSketchup: () -> Unit,
    modifier: Modifier = Modifier
) {
    when (state) {
        is ExplanationUiState.Loaded -> ExplanationLoaded(
            exerciseDef = state.exerciseDef,
            goToSketchup = goToSketchup,
            modifier = modifier
        )

        ExplanationUiState.Loading -> Loading(
            modifier = modifier
        )

        ExplanationUiState.Error -> TODO()
    }

}
