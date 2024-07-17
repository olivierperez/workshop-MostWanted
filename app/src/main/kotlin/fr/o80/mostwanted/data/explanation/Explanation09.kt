package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation09() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Vous êtes maintenant capable de créer un écran complexe 
                interactif, félicitations ! Essayez maintenant de reproduire 
                le contenu de la maquette, pour voir le résultat de votre 
                code, utilisez les Preview.
                """
        )
        ExplanationText(
            """<i>Pour ajouter une icône, vous pouvez utiliser le Composable 
                Icon, et donner l'icône que vous souhaitez à 
                l'attribut imageVector. Nous aurons ici besoin de l'icône 
                Icons.Default.Check.</i>
                """
        )
    }
}
