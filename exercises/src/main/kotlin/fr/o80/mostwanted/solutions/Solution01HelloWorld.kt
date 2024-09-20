package fr.o80.mostwanted.solutions

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution01HelloWorld(
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = "Hello World!"
    )
}

@Preview
@Composable
private fun Solution01HelloWorldPreview() {
    PreviewTheme {
        Solution01HelloWorld()
    }
}
