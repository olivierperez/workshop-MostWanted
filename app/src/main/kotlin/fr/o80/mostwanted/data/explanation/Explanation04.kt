package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun Explanation04() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Preview")
        ExplanationText(
            """Vous savez maintenant créer un écran avec plusieurs 
                Composables à l'intérieur !
                """
        )
        ExplanationText(
            """Comme vous l'avez peut-être remarqué, voir les modifications 
                de votre code immédiatement dans votre application n'est pas 
                évident...
                 Vous devez relancer l'application et cela peut prendre du 
                 temps...
                """
        )
        ExplanationText(
            """Mais Compose est là pour améliorer votre expérience de 
                développeur ! En effet, il apporte un système de 
                <b>Preview</b> directement accessible depuis votre IDE afin 
                de prévisualiser vos Composables de manière dynamique.
                """
        )
        ExplanationTitle("Mise en place")
        ExplanationText(
            """Pour cela, il vous suffit de créer une nouvelle méthode 
                annotée d'un <b>@Preview</b>, puis d'appeler le Composable 
                que vous souhaitez visualiser à l'intérieur&nbsp;:
                """
        )
        Code(
            "@Preview\n" +
                "@Composable\n" +
                "private fun Preview() {\n" +
                "   Composable()\n" +
                "}"
        )
        ExplanationText(
            """Récupérez un Composable développé lors d'un exercice précédent
                 puis amusez-vous à l'afficher au sein de quelques Preview, en 
                 jouant sur les paramètres proposés par l'annotation 
                 <b>@Preview</b>.
                """
        )
        ExplanationText(
            """<i>À noter&nbsp;: Il est préférable de rendre votre fonction privée, 
                car 
                elle sera accessible seulement au sein de ce fichier.</i>
                """
        )
        ExplanationText(
            """<i>Jetpack Compose intègre aussi désormais un système de 
                <b>Hot-Reload</b> sur votre application, à la manière de 
                Flutter.</i>
                """
        )
    }
}
