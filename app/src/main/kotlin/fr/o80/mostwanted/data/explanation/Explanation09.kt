package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun Explanation09() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Tout depuis l'IDE !")
        ExplanationText(
            """Vous êtes maintenant capable de créer un écran complexe 
                interactif, félicitations ! Essayez maintenant de reproduire 
                le contenu de la maquette. Pour voir le résultat de votre 
                code, utilisez les Preview.
                """
        )
        ExplanationText(
            """<i>Nous aurons ici besoin de l'icône Icons.Default.Check.</i>
                """
        )
    }
}
