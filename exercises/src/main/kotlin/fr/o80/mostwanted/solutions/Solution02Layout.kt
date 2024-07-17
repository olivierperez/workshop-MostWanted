package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution02Layout() {
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        Text(
            text = "Prénom"
        )
        Text(
            text = "Nom"
        )
    }
}

@Preview
@Composable
private fun Solution02LayoutPreview() {
    PreviewTheme {
        Solution02Layout()
    }
}
