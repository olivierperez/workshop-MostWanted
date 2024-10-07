package fr.o80.mostwanted.internals

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

fun Modifier.spikedCircleBackground(
    color: Color,
    steps: Int = 60,
    spikeSize: Float = 1.2f
) = this.drawWithCache {
    val circlePath = Path().apply {
        moveTo(0f, 1f)
        for (i in 0 until steps) {
            val rad = (i * 360 / steps) * (2 * PI) / 360
            if (i % 2 == 0) {
                lineTo(
                    sin(rad.toFloat()),
                    cos(rad.toFloat())
                )
            } else {
                lineTo(
                    sin(rad.toFloat()) * spikeSize,
                    cos(rad.toFloat()) * spikeSize
                )
            }
        }
    }
    onDrawBehind {
        scale(size.maxDimension * .7f) {
            translate(
                left = size.width / 2,
                top = size.height / 2
            ) {
                drawPath(
                    path = circlePath,
                    color = color,
                )
            }
        }
    }
}
