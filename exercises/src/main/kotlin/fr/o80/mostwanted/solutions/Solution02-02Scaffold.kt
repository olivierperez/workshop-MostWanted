package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution0202Scaffold() {
    Scaffold(
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Hello World!")
        }
    }
}

@Preview
@Composable
private fun Solution0202ScaffoldPreview() {
    PreviewTheme {
        Solution0202Scaffold()
    }
}
