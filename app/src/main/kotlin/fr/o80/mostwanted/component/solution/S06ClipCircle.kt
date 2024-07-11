package fr.o80.mostwanted.component.solution

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.R
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun S06ClipCircle(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.avatar),
            contentDescription = "Most Wanted Avatar",
            modifier = Modifier
                .clip(CircleShape)
        )
        PersonName("Olivier", "Gnu", "PEREZ")
    }
}

@Composable
private fun PersonName(
    firstName: String,
    middleName: String,
    lastName: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = firstName)
        Text(text = middleName)
        Text(text = lastName)
    }
}

@Preview
@Composable
private fun S06ClipCirclePreview() {
    WorkshopMostWantedPreviewTheme {
        S06ClipCircle()
    }
}
