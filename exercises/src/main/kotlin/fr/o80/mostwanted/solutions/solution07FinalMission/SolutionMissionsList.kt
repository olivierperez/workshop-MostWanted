package fr.o80.mostwanted.solutions.solution07FinalMission

import Mission
import MissionState
import MissionType
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.internals.PreviewTheme

private val missions = listOf(
    Mission(
        title = "Configurer Android Studio",
        type = MissionType.GATHER_INFORMATION,
        state = MissionState.COMPLETED
    ),
    Mission(
        title = "Apprendre les bases de Jetpack Compose",
        type = MissionType.GATHER_INFORMATION,
        state = MissionState.COMPLETED
    ),
    Mission(
        title = "Finir l'atelier",
        type = MissionType.GATHER_INFORMATION,
        state = MissionState.ONGOING
    ),
    Mission(
        title = "Envoyer une photo de mon badge sur les réseaux sociaux",
        type = MissionType.COMMUNICATION,
        state = MissionState.TODO
    ),
    Mission(
        title = "Créer ma propre application mobile",
        type = MissionType.DEVELOPMENT,
        state = MissionState.TODO
    ),
    Mission(
        title = "Déployer mon application sur les stores",
        type = MissionType.DEVELOPMENT,
        state = MissionState.TODO
    )
)

@Composable
internal fun SolutionMissionsList(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(8.dp)
    ) {
        itemsIndexed(missions) { index, mission ->
            SecretMission(
                index = index,
                mission = mission
            )
        }
    }
}

@Composable
fun SecretMission(
    index: Int,
    mission: Mission,
    modifier: Modifier = Modifier
) {
    var visible by remember { mutableStateOf(false) }
    AnimatedContent(
        modifier = modifier
            .height(80.dp)
            .clickable { visible = !visible },
        targetState = visible,
        transitionSpec = { fadeIn() togetherWith fadeOut() },
        label = "mission-visibility"
    ) { revealMission ->
        Card {
            if (revealMission) {
                RevealedMission(
                    mission = mission,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                HiddenMission(
                    number = index + 1,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun RevealedMission(
    mission: Mission,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
                .padding(8.dp)
                .semantics(mergeDescendants = true) { },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = mission.type.icon,
            contentDescription = mission.type.label
        )
        Text(
            text = mission.title,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = mission.state.icon,
            contentDescription = mission.state.label
        )
    }
}

@Composable
fun HiddenMission(
    number: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
                .padding(8.dp)
                .semantics(mergeDescendants = true) { },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight,
            contentDescription = "Keyboard arrow right"
        )
        Text(
            text = "Mission Secrète #$number",
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Preview
@Composable
private fun HiddenMissionPreview() {
    PreviewTheme {
        HiddenMission(13)
    }
}

@Preview
@Composable
private fun RevealedMissionPreview() {
    PreviewTheme {
        RevealedMission(
            Mission(
                "Example",
                MissionType.GATHER_INFORMATION,
                MissionState.COMPLETED
            )
        )
    }
}

@Preview
@Composable
private fun MissionsPreview() {
    PreviewTheme {
        SolutionMissionsList()
    }
}
