package fr.o80.mostwanted.solutions.solution07FinalMission.model

import androidx.compose.ui.graphics.vector.ImageVector
import fr.o80.mostwanted.icons.AccountCircle
import fr.o80.mostwanted.icons.MenuList

internal enum class Page(
    val title: String,
    val icon: ImageVector
) {
    IDENTITY("BADGE", AccountCircle),
    MISSIONS("MISSIONS", MenuList)
}
