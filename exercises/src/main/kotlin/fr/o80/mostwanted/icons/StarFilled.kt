package fr.o80.mostwanted.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarFilled: ImageVector
    get() {
        if (_StarFilled != null) return _StarFilled!!
        
        _StarFilled = ImageVector.Builder(
            name = "StarFilled",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(7.22303f, 0.665992f)
                curveTo(7.32551f, 0.419604f, 7.67454f, 0.419604f, 7.77702f, 0.665992f)
                lineTo(9.41343f, 4.60039f)
                curveTo(9.45663f, 4.70426f, 9.55432f, 4.77523f, 9.66645f, 4.78422f)
                lineTo(13.914f, 5.12475f)
                curveTo(14.18f, 5.14607f, 14.2878f, 5.47802f, 14.0852f, 5.65162f)
                lineTo(10.849f, 8.42374f)
                curveTo(10.7636f, 8.49692f, 10.7263f, 8.61176f, 10.7524f, 8.72118f)
                lineTo(11.7411f, 12.866f)
                curveTo(11.803f, 13.1256f, 11.5206f, 13.3308f, 11.2929f, 13.1917f)
                lineTo(7.6564f, 10.9705f)
                curveTo(7.5604f, 10.9119f, 7.43965f, 10.9119f, 7.34365f, 10.9705f)
                lineTo(3.70718f, 13.1917f)
                curveTo(3.47945f, 13.3308f, 3.19708f, 13.1256f, 3.25899f, 12.866f)
                lineTo(4.24769f, 8.72118f)
                curveTo(4.2738f, 8.61176f, 4.23648f, 8.49692f, 4.15105f, 8.42374f)
                lineTo(0.914889f, 5.65162f)
                curveTo(0.712228f, 5.47802f, 0.820086f, 5.14607f, 1.08608f, 5.12475f)
                lineTo(5.3336f, 4.78422f)
                curveTo(5.44573f, 4.77523f, 5.54342f, 4.70426f, 5.58662f, 4.60039f)
                lineTo(7.22303f, 0.665992f)
                close()
            }
        }.build()
        
        return _StarFilled!!
    }

private var _StarFilled: ImageVector? = null

