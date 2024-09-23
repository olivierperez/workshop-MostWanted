package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution0201Scaffold() {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
        ) {
            Text(text = "Hello World!")
        }
    }
}

@Preview
@Composable
private fun Solution0201ScaffoldPreview() {
    PreviewTheme {
        Solution0201Scaffold()
    }
}
