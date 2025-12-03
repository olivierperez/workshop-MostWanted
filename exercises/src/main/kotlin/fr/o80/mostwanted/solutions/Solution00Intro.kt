package fr.o80.mostwanted.solutions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.icons.StarFilled
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun SolutionIntro(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        StarIcon()
        Text(
            text = "Introduction à Compose",
            style = MaterialTheme.typography.displaySmall,
            textAlign = TextAlign.Center
        )
        StarIcon()
    }
}

@Composable
private fun StarIcon(modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier,
        imageVector = StarFilled,
        contentDescription = null
    )
}

@Preview
@Composable
private fun SolutionIntroPreview() {
    PreviewTheme {
        SolutionIntro(Modifier.fillMaxSize())
    }
}
