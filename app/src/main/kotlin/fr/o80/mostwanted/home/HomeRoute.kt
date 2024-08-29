package fr.o80.mostwanted.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeRoute(
    goToExercises: () -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<HomeViewModel>()

    LaunchedEffect(viewModel) {
        viewModel.event.collect { event ->
            when (event) {
                HomeEvent.NONE -> Unit
                HomeEvent.GO_TO_EXERCISES -> goToExercises()
            }
        }
    }

    HomeScreen(
        saveSettings = viewModel::saveSettings,
        modifier = modifier
    )
}
