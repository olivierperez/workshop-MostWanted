package fr.o80.mostwanted.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeRoute(
    goToExercises: () -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<HomeViewModel>()

    HomeScreen(
        goToExercises = goToExercises,
        saveSettings = viewModel::saveSettings,
        modifier = modifier
    )
}
