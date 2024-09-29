package fr.o80.mostwanted.detail.component.template

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.detail.component.organism.ResultFrame
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun ExerciseResult(
    exerciseDef: ExerciseDef,
    modifier: Modifier = Modifier
) {
    ResultFrame {
        exerciseDef.result()
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
                explanation = {
                    ExplanationText(
                        "À la CIA comme partout on commence toujours par un HelloWorld! " +
                                "Avec Jetpack Compose tout est \"Composable\", pour créer votre premier Composable " +
                                "rendez-vous dans le fichier indiqué."
                    )
                },
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
