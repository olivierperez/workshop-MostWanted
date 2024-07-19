package fr.o80.mostwanted.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun HomeScreen(
    goToExercises: () -> Unit,
    saveSettings: (String, String, Avatar) -> Unit,
    modifier: Modifier = Modifier
) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var avatar by remember { mutableStateOf(Avatar.RED) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment
            .CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "Bienvenue à la CIA",
            style = MaterialTheme.typography.headlineMedium
        )
        TextField(
            value = firstName,
            onValueChange = { value -> firstName = value },
            label = { Text(text = "Prénom") },
            singleLine = true
        )
        TextField(
            value = lastName,
            onValueChange = { value -> lastName = value },
            label = { Text(text = "Nom") },
            singleLine = true
        )
        Text(
            text = "Choisissez votre avatar",
            style = MaterialTheme.typography.bodyLarge
        )
        AvatarSelection(
            avatar = avatar,
            onRedAvatarClick = { avatar = Avatar.RED },
            onBlueAvatarClick = { avatar = Avatar.BLUE },
            onOrangeAvatarClick = { avatar = Avatar.ORANGE }
        )
        Button(
            onClick = {
            goToExercises()
            saveSettings(firstName, lastName, avatar)
        },
            enabled = firstName != "" && lastName != "",
        ) {
            Text(text = "Valider")
        }
    }
}

@Composable
fun AvatarSelection(
    modifier: Modifier = Modifier,
    avatar: Avatar,
    onRedAvatarClick: () -> Unit,
    onBlueAvatarClick: () -> Unit,
    onOrangeAvatarClick: () -> Unit
    ) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(Avatar.RED.drawable),
            contentDescription = "avatar_red",
            modifier = modifier
                .size(if (avatar == Avatar.RED) 120.dp else 84.dp)
                .clickable { onRedAvatarClick() }
        )
        Image(
            painter = painterResource(Avatar.BLUE.drawable),
            contentDescription = "avatar_blue",
            modifier = modifier
                .size(if (avatar == Avatar.BLUE) 120.dp else 84.dp)
                .clickable { onBlueAvatarClick() }
        )
        Image(
            painter = painterResource(Avatar.ORANGE.drawable),
            contentDescription = "avatar_orange",
            modifier = modifier
                .size(if (avatar == Avatar.ORANGE) 120.dp else 84.dp)
                .clickable { onOrangeAvatarClick() }
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    PreviewTheme {
        HomeScreen(
            goToExercises = {},
            saveSettings = { _, _, _ -> }
        )
    }
}

@Preview
@Composable
fun AvatarSelectionPreview() {
    PreviewTheme {
        AvatarSelection(
            avatar = Avatar.RED,
            onRedAvatarClick = {},
            onBlueAvatarClick = {},
            onOrangeAvatarClick = {}
        )
    }
}
