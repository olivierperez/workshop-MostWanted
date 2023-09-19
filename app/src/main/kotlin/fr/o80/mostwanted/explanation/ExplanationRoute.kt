package fr.o80.mostwanted.explanation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun ExplanationRoute(
    goToSketchup: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<ExplanationViewModel>()
    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(viewModel) {
        viewModel.event.collect { event ->
            when (event) {
                ExplanationEvent.None -> Unit
                is ExplanationEvent.OpenSketchup -> goToSketchup(event.id)
            }
            viewModel.onEventHandled()
        }
    }

    ExplanationScreen(
        state = state,
        goToSketchup = viewModel::goToSketchup,
        modifier = modifier
    )
}
