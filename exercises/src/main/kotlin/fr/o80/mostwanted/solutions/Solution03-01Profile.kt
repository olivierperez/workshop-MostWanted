package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution0301Profile(
    firstName: String,
    lastName: String
) {
    Profile(
        firstName = firstName,
        lastName = lastName
    )
}

@Composable
private fun Profile(
    firstName: String,
    lastName: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Image")
        Text(text = "$firstName $lastName")
    }
}

@Preview
@Composable
private fun Solution0301ProfilePreview() {
    PreviewTheme {
        Solution0301Profile(
            firstName = "John",
            lastName = "Doe"
        )
    }
}
