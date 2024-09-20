import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.ui.graphics.vector.ImageVector

internal enum class Page(
    val title: String,
    val icon: ImageVector
) {
    IDENTITY("BADGE", Icons.Default.AccountCircle),
    MISSIONS("MISSIONS", Icons.AutoMirrored.Default.List)
}
