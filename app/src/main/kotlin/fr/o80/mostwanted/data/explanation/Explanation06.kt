package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation06() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """En se basant sur le code que vous avez développé lors de 
                l'exercice précédent, nous allons essayer d'améliorer le 
                rendu visuel de notre image.
                """
        )
        ExplanationText(
            """Nous aimerions par exemple la rendre ronde. Pour cela, rien de
                 plus simple. Il vous suffit d'ajouter un <b>clip</b> sur 
                 l'image pour modifier sa forme.
                """
        )
        ExplanationText(
            """Vous pouvez donc ajouter un <b>modifier</b> à votre image en 
                lui attribuant un clip de type <b>CircleShape</b>
                """
        )
        ExplanationText(
            """Comme vous pouvez le constater, vous pouvez attribuer ce 
                comportement à un modifier. Vous pouvez donc arrondir les bords
                 de n'importe quel Composable !
                """
        )
    }
}
