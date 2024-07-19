package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.exercises.R
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution06ClipCircle(
    firstName: String,
    lastName: String,
    avatar: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(Avatar.valueOf(avatar).drawable),
            contentDescription = "Avatar",
            modifier = modifier.clip(CircleShape)
        )
        PersonName(firstName, lastName)
    }
}

@Composable
private fun PersonName(
    firstName: String,
    lastName: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = firstName)
        Text(text = lastName)
    }
}

@Preview
@Composable
private fun Solution06ClipCirclePreview() {
    PreviewTheme {
        Solution06ClipCircle(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED.name
        )
    }
}
