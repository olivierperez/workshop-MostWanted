package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation10() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Tw Screens
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
