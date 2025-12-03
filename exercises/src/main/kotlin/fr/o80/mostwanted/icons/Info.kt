package fr.o80.mostwanted.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Info: ImageVector
    get() {
        if (_Info != null) return _Info!!
        
        _Info = ImageVector.Builder(
            name = "Info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(480f, 360f)
                moveToRelative(0f, 520f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                reflectiveQuadToRelative(-93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                reflectiveQuadToRelative(-227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                reflectiveQuadToRelative(93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                moveToRelative(0f, -320f)
            }
        }.build()
        
        return _Info!!
    }

private var _Info: ImageVector? = null

