package fr.o80.mostwanted.solutions

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution01HelloWorld() {
    Text(text = "Hello World!")
}

@Preview
@Composable
private fun Solution01HelloWorldPreview() {
    PreviewTheme {
        Solution01HelloWorld()
    }
}
