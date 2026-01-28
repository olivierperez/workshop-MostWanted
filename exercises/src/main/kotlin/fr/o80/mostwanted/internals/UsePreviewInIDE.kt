package fr.o80.mostwanted.internals

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.exercises.R

@Composable
fun UsePreviewInIDE() {
    Text(
        text = stringResource(id = R.string.exercises_use_preview_in_ide),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onPrimary,
        modifier = Modifier
            .rotate(-15f)
            .spikedCircleBackground(MaterialTheme.colorScheme.primary)
    )
}

@Preview
@Composable
private fun UsePreviewInIDEPreview() {
    PreviewTheme {
        UsePreviewInIDE()
    }
}
