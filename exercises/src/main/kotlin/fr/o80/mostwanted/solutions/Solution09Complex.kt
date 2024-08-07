package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar
import fr.o80.mostwanted.internals.spikedCircleBackground

@Composable
fun Solution09Complex(
    firstName: String,
    lastName: String,
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.height(64.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(avatar.drawable),
            contentDescription = "Avatar"
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            PersonName(firstName, lastName)
            Text("Special Agent")
        }
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = "Check",
            modifier = Modifier.padding(16.dp)
        )
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

@Composable
fun Solution09UsePreview(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Use @Preview\nto see\nyour result\nin the IDE",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .rotate(-15f)
                .spikedCircleBackground(MaterialTheme.colorScheme.primary)
        )
    }
}

@Preview
@Composable
private fun S09ComplexPreview() {
    PreviewTheme {
        Solution09Complex(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED
        )
    }
}

@Preview
@Composable
private fun S09UsePreviewPreview() {
    PreviewTheme {
        Solution09UsePreview(Modifier.size(256.dp))
    }
}
