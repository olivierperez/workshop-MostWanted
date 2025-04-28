package fr.o80.mostwanted.solutions.solution07FinalMission

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar
import org.jetbrains.compose.resources.painterResource
import workshop_mostwanted_desktop.composeapp.generated.resources.Res
import workshop_mostwanted_desktop.composeapp.generated.resources.skill

@Composable
fun SolutionIdentity(
    firstName: String,
    lastName: String,
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
            Text(
                text = "Badge",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(4.dp)
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Profile(
                firstName = firstName,
                lastName = lastName,
                avatar = avatar
            )
            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    Skill(
                        "Compose",
                        "Expert",
                        isBest = true
                    )
                }
                item {
                    Skill(
                        "Creating bugs",
                        "Noob",
                        isBest = false
                    )
                }
            }
        }
    }
}

@Composable
private fun Profile(
    firstName: String,
    lastName: String,
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var rounded by remember { mutableStateOf(false) }
        val corner by animateIntAsState(if (rounded) 50 else 0)

        Image(
            painter = painterResource(avatar.drawable),
            contentDescription = "Most Wanted Avatar",
            modifier = Modifier
                .clip(RoundedCornerShape(corner))
                .clickable { rounded = !rounded }
        )
        Text(text = "$firstName $lastName")
    }
}

@Composable
private fun Skill(
    label: String,
    level: String,
    isBest: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(Res.drawable.skill),
                contentDescription = "Skill"
            )
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(label)
                Text(level)
            }
            if (isBest) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Star",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun SolutionIdentityPreview() {
    PreviewTheme {
        SolutionIdentity(
            firstName = "John",
            lastName = "Doe",
            avatar = Avatar.RED
        )
    }
}
