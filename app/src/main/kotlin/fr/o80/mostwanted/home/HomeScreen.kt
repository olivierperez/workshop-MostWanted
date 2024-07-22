package fr.o80.mostwanted.home

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun HomeScreen(
    saveSettings: (String, String, Avatar) -> Unit,
    modifier: Modifier = Modifier
) {
    var firstName by rememberSaveable { mutableStateOf("") }
    var lastName by rememberSaveable { mutableStateOf("") }
    var avatar by rememberSaveable { mutableStateOf(Avatar.RED) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
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
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Sentences,
                imeAction = ImeAction.Next
            )
        )
        TextField(
            value = lastName,
            onValueChange = { value -> lastName = value },
            label = { Text(text = "Nom") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Sentences,
                imeAction = ImeAction.Done
            )
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
            onClick = { saveSettings(firstName, lastName, avatar) },
            enabled = firstName != "" && lastName != "",
        ) {
            Text(text = "Valider")
        }
    }
}

@Composable
fun AvatarSelection(
    avatar: Avatar,
    onRedAvatarClick: () -> Unit,
    onBlueAvatarClick: () -> Unit,
    onOrangeAvatarClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val redAvatarSize by animateDpAsState(
        label = "RedAvatarSize",
        targetValue = if (avatar == Avatar.RED) 120.dp else 84.dp
    )
    val blueAvatarSize by animateDpAsState(
        label = "BlueAvatarSize",
        targetValue = if (avatar == Avatar.BLUE) 120.dp else 84.dp
    )
    val orangeAvatarSize by animateDpAsState(
        label = "OrangeAvatarSize",
        targetValue = if (avatar == Avatar.ORANGE) 120.dp else 84.dp
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.height(120.dp)
    ) {
        Image(
            painter = painterResource(Avatar.RED.drawable),
            contentDescription = "avatar_red",
            modifier = Modifier
                .size(redAvatarSize)
                .clickable { onRedAvatarClick() }
        )
        Image(
            painter = painterResource(Avatar.BLUE.drawable),
            contentDescription = "avatar_blue",
            modifier = Modifier
                .size(blueAvatarSize)
                .clickable { onBlueAvatarClick() }
        )
        Image(
            painter = painterResource(Avatar.ORANGE.drawable),
            contentDescription = "avatar_orange",
            modifier = Modifier
                .size(orangeAvatarSize)
                .clickable { onOrangeAvatarClick() }
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    PreviewTheme {
        HomeScreen(
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
