package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationMissionsList() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Félicitation !")
        ExplanationText(
            """Vous faites maintenant partie de la
                    <b>Compose Intelligence Agency</b>, tout le monde reconnaît
                    votre talent sans limite.
                """
        )
        ExplanationText(
            """Vos collègues vous admirent, et ce n'est que le début.
                    Il est temps de dresser la liste de vos missions, celles
                    accomplies et celles à venir.
                """
        )
        ExplanationText(
            """Utilisez toutes vos connaissances pour mettre en place
                    cette liste au verso de votre badge.
                """
        )
        ExplanationText(
            """Vous êtes une grande personne maintenant.
                """
        )
        ExplanationTitle("Bon courage \uD83D\uDCAA")
    }
}
