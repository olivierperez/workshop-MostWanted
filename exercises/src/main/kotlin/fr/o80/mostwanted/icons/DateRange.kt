package fr.o80.mostwanted.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DateRange: ImageVector
    get() {
        if (_DateRange != null) return _DateRange!!
        
        _DateRange = ImageVector.Builder(
            name = "Date_range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 520f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(320f, 480f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(360f, 520f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(320f, 560f)
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 520f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(480f, 480f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(520f, 520f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(640f, 480f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(680f, 520f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(640f, 560f)
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _DateRange!!
    }

private var _DateRange: ImageVector? = null

