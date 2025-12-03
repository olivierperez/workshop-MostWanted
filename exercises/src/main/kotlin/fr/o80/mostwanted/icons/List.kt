package fr.o80.mostwanted.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuList: ImageVector
    get() {
        if (_List != null) return _List!!
        
        _List = ImageVector.Builder(
            name = "List",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 320f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(160f, 280f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(200f, 320f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(160f, 360f)
                moveToRelative(0f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 480f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(200f, 480f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(160f, 520f)
                moveToRelative(0f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 640f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(160f, 600f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(200f, 640f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(160f, 680f)
            }
        }.build()
        
        return _List!!
    }

private var _List: ImageVector? = null

