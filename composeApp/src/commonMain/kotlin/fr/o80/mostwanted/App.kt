package fr.o80.mostwanted

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.internals.domain.model.Avatar
import fr.o80.mostwanted.solutions.solution07FinalMission.Solution07FinalMission
import fr.o80.mostwanted.theme.AppTheme

@Composable
internal fun App() = AppTheme {
    Solution07FinalMission(
        firstName = "Olivier",
        lastName = "Perez",
        avatar = Avatar.BLUE,
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
    )
}
