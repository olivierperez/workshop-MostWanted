import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
internal fun Header(
    modifier: Modifier = Modifier
) {
    Text(
        text = "CIA",
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview
@Composable
private fun HeaderPreview() {
    PreviewTheme {
        Header()
    }
}
