package fr.o80.mostwanted.boss.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.ui.graphics.vector.ImageVector

enum class BossMissionState(
    val label: String,
    val icon: ImageVector
) {
    COMPLETED("Completed", Icons.Filled.Done),
    ONGOING("Ongoing", Icons.Filled.Build),
    TODO("To do", Icons.Filled.DateRange)
}
