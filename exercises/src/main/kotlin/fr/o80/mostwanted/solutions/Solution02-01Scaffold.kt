package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution0201Scaffold(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "CIA")
                }
            )
        },
        bottomBar = {
            Text(text = "Badge")
        }
    ) { paddingValues ->
        Text(
            modifier = Modifier.padding(paddingValues),
            text = "Hello World!"
        )
    }
}

@Preview
@Composable
private fun Solution0202ScaffoldPreview() {
    PreviewTheme {
        Solution0201Scaffold()
    }
}
