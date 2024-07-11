package fr.o80.mostwanted.component.solution

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun S01HelloWorld() {
    Text(
        text = "Hello World!"
    )
}

@Preview
@Composable
private fun S01HelloWorldPreview() {
    WorkshopMostWantedPreviewTheme {
        S01HelloWorld()
    }
}
