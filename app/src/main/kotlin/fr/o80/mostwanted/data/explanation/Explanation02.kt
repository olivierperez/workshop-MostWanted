package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun Explanation02() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Mise en page")
        ExplanationText(
            """Maintenant que vous avez réussi à intégrer votre 
                        premier Composable, vous allez découvrir comment 
                        organiser plusieurs éléments grâce aux 
                        <b>Composables de mise en page</b>.
                """
        )
        ExplanationText(
            """Le but est ici d'obtenir <b>une ligne</b> constituée de 
                        deux Composables Text, votre prénom et 
                        votre nom.
                """
        )
        ExplanationTitle("Row")
        ExplanationText(
            """Pour ce faire, il vous suffit de créer deux 
                        Composables Text et de les insérer dans un 
                        Composable <b>Row</b>&nbsp;:
                """
        )
        Code("Row {...}")
        ExplanationText(
            """Afin d'obtenir un espace entre les deux Text, vous 
                        pouvez ajouter une valeur à l'argument 
                        <b>horizontalArrangement</b> du Composable Row, comme
                        ceci&nbsp;:
                """
        )
        Code("horizontalArrangement = Arrangement.spacedBy(4.dp)")
        ExplanationText(
            """Cet argument permet de définir un espace de 4 dp entre
                        chaque Composable présent dans la Row.
                """
        )
        ExplanationText(
            """<i>Veillez à importer les librairies nécessaires</i>
                """
        )
    }
}
