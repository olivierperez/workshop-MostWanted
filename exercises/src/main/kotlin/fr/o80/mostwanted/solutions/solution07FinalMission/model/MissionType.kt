package fr.o80.mostwanted.solutions.solution07FinalMission.model

import androidx.compose.ui.graphics.vector.ImageVector
import fr.o80.mostwanted.icons.AccountCircle
import fr.o80.mostwanted.icons.Build
import fr.o80.mostwanted.icons.Info

enum class MissionType(
    val icon: ImageVector,
    val label: String
) {
    GATHER_INFORMATION(
        icon = Info,
        label = "Gather information"
    ),
    COMMUNICATION(
        icon = AccountCircle,
        label = "Gather information"
    ),
    DEVELOPMENT(
        icon = Build,
        label = "Gather information"
    ),
}
