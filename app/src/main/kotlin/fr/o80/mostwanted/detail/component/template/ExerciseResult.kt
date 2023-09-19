package fr.o80.mostwanted.detail.component.template

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.component.Explanation
import fr.o80.mostwanted.detail.component.organism.ResultFrame
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun ExerciseResult(
    exerciseDef: ExerciseDef,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
    ) {
        ResultFrame {
            exerciseDef.result()
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = MaterialTheme.shapes.large
                )
                .padding(16.dp)
        ) {
            Text(
                text = "Fichier de travail",
                style = MaterialTheme.typography.labelMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
            )
            Text(
                text = exerciseDef.file,
                style = MaterialTheme.typography.bodyMedium.copy(fontFamily = FontFamily.Monospace),
                textAlign = TextAlign.Center,
                modifier = Modifier
            )
        }
        Explanation(
            html = exerciseDef.explanation
        )
    }
}

@Preview
@Composable
fun ExerciseResultPreview() {
    WorkshopMostWantedPreviewTheme {
        ExerciseResult(
            exerciseDef = ExerciseDef(
                id = 0,
                title = "Première étape",
                explanation = "À la CIA comme partout on commence toujours par un HelloWorld! " +
                    "Avec Jetpack Compose tout est \"Composable\", pour créer votre premier Composable " +
                    "rendez-vous dans le fichier indiqué.",
                file = "SimpleText.kt",
                result = {
                    Text(
                        text = "Demo",
                        style = MaterialTheme.typography.displayMedium,
                        modifier = Modifier.rotate(-30f)
                    )
                },
                solution = {}
            ),
            modifier = Modifier.fillMaxSize()
        )
    }
}
