package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.spikedCircleBackground

@Composable
fun Solution04Preview(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Solution04UsePreview()
    }
}

@Composable
fun Solution04UsePreview(modifier: Modifier = Modifier) {
    Text(
        text = "Use @Preview\nto see\nyour result\nin the IDE",
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onPrimary,
        modifier = modifier
            .rotate(-15f)
            .spikedCircleBackground(MaterialTheme.colorScheme.primary)
    )
}

@Preview(device = Devices.PHONE)
@Composable
private fun Solution04PreviewPreview1() {
    PreviewTheme {
        Solution04Preview()
    }
}

@Preview(device = Devices.TABLET)
@Composable
private fun Solution04PreviewPreview2() {
    PreviewTheme {
        Solution04Preview()
    }
}

@Preview(showSystemUi = true)
@Composable
private fun Solution04PreviewPreview3() {
    PreviewTheme {
        Solution04Preview()
    }
}
