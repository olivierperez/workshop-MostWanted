package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution0404Image(
    firstName: String,
    lastName: String,
    avatar: Avatar
) {
    Scaffold(
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
                lastName = lastName,
                avatar = avatar
            )
        }
    }
}

@Composable
private fun Profile(
    firstName: String,
    lastName: String,
    avatar: Avatar
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var corner by remember { mutableIntStateOf(0) }

        Image(
            painter = painterResource(avatar.drawable),
            contentDescription = "Most Wanted Avatar",
            modifier = Modifier
                .clip(RoundedCornerShape(corner))
                .clickable { corner = 50 - corner }
        )
        Text(text = "$firstName $lastName")
    }
}

@Preview
@Composable
private fun Solution0404ImagePreview() {
    PreviewTheme {
        Solution0404Image(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED
        )
    }
}
