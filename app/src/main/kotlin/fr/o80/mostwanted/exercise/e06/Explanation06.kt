package fr.o80.mostwanted.exercise.e06

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation06() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Là c'est pour introduire le sepia qui sera utilisé dans l'exercice suivant.x
                """
        )
        ExplanationText(
            """Todo
                     <b>Composables de mise en page</b>.
                """
        )
        Code("Text(\"Hello World!\")")
    }
}
