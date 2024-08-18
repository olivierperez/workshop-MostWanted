package fr.o80.mostwanted.boss.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.ui.graphics.vector.ImageVector

internal enum class BossPage(
    val title: String,
    val icon: ImageVector
) {
    BADGE("BADGE", Icons.Default.AccountCircle),
    MISSIONS("MISSIONS", Icons.AutoMirrored.Default.List)
}
