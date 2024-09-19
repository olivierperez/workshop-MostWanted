package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationSkills() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Skills")
        ExplanationText(
            """Bon... à part la création d'applications en Compose, vous avez sûrement
                    d'autres compétences, non&nbsp;? Pourquoi ne pas les afficher fièrement
                    sur votre badge&nbsp;? On va leur trouver un peu de place sous votre profil.
                """
        )
        ExplanationText(
            """Commençons par concevoir un Composable <b>CIASkill</b> capable d'afficher
                    une compétence donnée. Puis si ce Composable est paramètrable on pourra le
                    réutiliser pour afficher la palette complète de vos talents.
                """
        )
        ExplanationText(
            """Pour le mettre un peu en exergue, utilisez le Composable <b>Card</b>
                    du design system Material, comme son nom l'indique il affiche son contenu
                    sous forme d'une carte. Un peu comme si vous l'aviez posé sur l'écran.
                """
        )

        ExplanationTitle("Paramètres")
        ExplanationText(
            """Puis utilisez vos enseignements précédents pour construire le reste de
                    <b>CIASkill</b>. La petite nouveauté sera l'utilisation de paramètres
                    passés au Composable pour le rendre configurable.
                """
        )
        ExplanationText(
            """Voici un exemple de composable paramètrable&nbsp;:
                """
        )
        Code("""@Composable
            |fun UnComposable(
            |    unNom: String,
            |    modifier: Modifier = Modifier
            |) {
            |   Text(
            |       text = unNom,
            |       modifier = modifier
            |   )
            |}
            """.trimMargin()
        )

        ExplanationTitle("Indices")
        ExplanationText(
            """Voici quelques mots-clés qui peuvent vous aider&nbsp;:
                """
        )
        Code("""Row / Column
            |fillMaxWidth / padding
            |verticalAlignment
            |horizontalArrangement
            |verticalArrangement
            """.trimMargin()
        )
    }
}
