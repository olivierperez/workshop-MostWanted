package fr.o80.mostwanted.solutions.solution07FinalMission

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
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