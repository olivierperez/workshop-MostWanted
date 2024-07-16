package fr.o80.mostwanted.solution

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun S01HelloWorld() {
    Text(
        text = "Hello World!"
    )
}

@Preview
@Composable
private fun S01HelloWorldPreview() {
    PreviewTheme {
        S01HelloWorld()
    }
}
