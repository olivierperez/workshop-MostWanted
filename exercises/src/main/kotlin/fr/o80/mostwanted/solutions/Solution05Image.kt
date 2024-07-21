package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution05Image(
    modifier: Modifier = Modifier,
    firstName: String,
    lastName: String,
    avatar: Avatar
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(avatar.drawable),
            contentDescription = "Avatar",
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
private fun Solution05ImagePreview() {
    PreviewTheme {
        Solution05Image(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED
        )
    }
}
