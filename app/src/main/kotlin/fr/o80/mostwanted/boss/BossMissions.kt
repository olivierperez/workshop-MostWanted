package fr.o80.mostwanted.boss

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.gestures.awaitEachGesture
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.boss.model.BossMissionState
import fr.o80.mostwanted.boss.model.BossMissionType
import fr.o80.mostwanted.boss.model.Mission
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

private val missions = listOf(
    Mission(
        title = "Configurer Android Studio",
        type = BossMissionType.GATHER_INFORMATION,
        state = BossMissionState.COMPLETED
    ),
    Mission(
        title = "Apprendre les bases de Jetpack Compose",
        type = BossMissionType.GATHER_INFORMATION,
        state = BossMissionState.COMPLETED
    ),
    Mission(
        title = "Finir l'atelier",
        type = BossMissionType.GATHER_INFORMATION,
        state = BossMissionState.ONGOING
    ),
    Mission(
        title = "Envoyer une photo de mon badge sur les réseaux sociaux",
        type = BossMissionType.COMMUNICATION,
        state = BossMissionState.TODO
    ),
    Mission(
        title = "Créer ma propre application mobile",
        type = BossMissionType.DEVELOPMENT,
        state = BossMissionState.TODO
    )
)

@Composable
internal fun BossMissions(
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
            .pointerInput(mission) {
                awaitEachGesture {
                    while (true) {
                        val event = awaitPointerEvent()
                        event.changes.forEach {
                            visible = it.pressed
                            it.consume()
                        }
                    }

                }
            },
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
            contentDescription = null
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
    WorkshopMostWantedPreviewTheme {
        HiddenMission(13)
    }
}

@Preview
@Composable
private fun RevealedMissionPreview() {
    WorkshopMostWantedPreviewTheme {
        RevealedMission(
            Mission(
                "Example",
                BossMissionType.GATHER_INFORMATION,
                BossMissionState.COMPLETED
            )
        )
    }
}

@Preview
@Composable
private fun BossMissionsPreview() {
    WorkshopMostWantedPreviewTheme {
        BossMissions()
    }
}
