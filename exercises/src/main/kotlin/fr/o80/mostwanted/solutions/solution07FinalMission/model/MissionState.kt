package fr.o80.mostwanted.solutions.solution07FinalMission.model

import androidx.compose.ui.graphics.vector.ImageVector
import fr.o80.mostwanted.icons.Build
import fr.o80.mostwanted.icons.DateRange
import fr.o80.mostwanted.icons.Done

enum class MissionState(
    val label: String,
    val icon: ImageVector
) {
    COMPLETED("Completed", Done),
    ONGOING("Ongoing", Build),
    TODO("To do", DateRange)
}
