package fr.o80.mostwanted.detail.component.template

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.detail.component.organism.ResultFrame
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun ExerciseSketchup(
    exerciseDef: ExerciseDef,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ResultFrame(
            modifier = Modifier.padding(16.dp)
        ) {
            exerciseDef.solution()
        }
    }
}

@Preview
@Composable
private fun ExerciseSketchupPreview() {
    WorkshopMostWantedPreviewTheme {
        ExerciseSketchup(
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
                result = {},
                solution = {
                    Text(
                        text = "Solution",
                        style = MaterialTheme.typography.displayMedium,
                        modifier = Modifier.rotate(-30f)
                    )
                }
            ),
            modifier = Modifier.fillMaxSize()
        )
    }
}
