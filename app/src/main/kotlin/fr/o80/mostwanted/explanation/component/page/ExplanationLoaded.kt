package fr.o80.mostwanted.explanation.component.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.explanation.component.organism.Sketchup
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun ExplanationLoaded(
    exerciseDef: ExerciseDef,
    goToSketchup: () -> Unit,
    goBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TopAppBar(
            title = {
                Text(
                    text = exerciseDef.title,
                    style = MaterialTheme.typography.headlineSmall
                )
            },
            navigationIcon = {
                IconButton(onClick = goBack) {
                    Icon(Icons.AutoMirrored.Default.KeyboardArrowLeft, contentDescription = "Backs")
                }
            }
        )

        exerciseDef.explanation()
        Sketchup(
            file = exerciseDef.file,
            goToSketchup = goToSketchup,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun LoadedPreview() {
    WorkshopMostWantedPreviewTheme {
        ExplanationLoaded(
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
                solution = {}
            ),
            goToSketchup = {},
            goBack = {},
            modifier = Modifier.fillMaxSize()
        )
    }
}
