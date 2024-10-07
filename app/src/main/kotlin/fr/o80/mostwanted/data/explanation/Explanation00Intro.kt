package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationIntro() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Ceci n'est pas l'atelier, cet exercice est à destination des examinateurs.
                """
        )
        ExplanationTitle("Intro")
        ExplanationText(
            """En compilant et en lançant l'application vous aurez accès aux intitulés des
                    exercices. Vous pourrez voir la <b>Maquette attendue</b> et le
                    <b>Résultat de l'exercice</b>, résultat que vous allez vous-même construire
                    au fur et à mesure de l'atelier.
                """
        )
    }
}
