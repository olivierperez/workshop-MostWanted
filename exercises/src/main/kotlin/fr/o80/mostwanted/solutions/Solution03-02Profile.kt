package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution0302Profile(
    firstName: String,
    lastName: String,
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
            Text(
                text = "Badge",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(4.dp)
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Profile(
                firstName = firstName,
                lastName = lastName
            )
        }
    }
}

@Composable
private fun Profile(
    firstName: String,
    lastName: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Image")
        Text(text = "$firstName $lastName")
    }
}

@Preview
@Composable
private fun Solution0302ProfilePreview() {
    PreviewTheme {
        Solution0302Profile(
            firstName = "John",
            lastName = "Doe"
        )
    }
}
