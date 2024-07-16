package fr.o80.mostwanted.exercises

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseCard(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        onClick = onClick
    ) {
        Box(Modifier.padding(16.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview
@Composable
fun ExerciseCardPreview() {
    WorkshopMostWantedTheme {
        ExerciseCard(
            title = "Best preview ever",
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}
