package fr.o80.mostwanted.boss.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector

enum class BossMissionType(
    val icon: ImageVector,
    val label: String
) {
    GATHER_INFORMATION(
        icon = Icons.Default.Info,
        label = "Gather information"
    ),
    COMMUNICATION(
        icon = Icons.Default.AccountCircle,
        label = "Gather information"
    ),
    DEVELOPMENT(
        icon = Icons.Default.Build,
        label = "Gather information"
    ),
}
