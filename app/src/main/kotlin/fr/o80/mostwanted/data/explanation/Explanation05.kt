package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation05() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Là c'est pour apprendre à faire appel aux ressources pour afficher une image.
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
