package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation07() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Là l'utilisateur peut jouer avec l'écran.
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
