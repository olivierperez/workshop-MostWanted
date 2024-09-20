package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationSkillItem() {
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

@Composable
fun ExplanationSkillIcon() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Mise en avant")
        ExplanationText(
            """Vous avez sûrement une compétence particulière, ce petit truc qui
                    vous différencie de vos collègues. Ça vous dirait de la mettre en
                    avant sur votre badge ? Quelque chose comme une petite étoile sur
                    la droite de la <b>Card</b> de compétence.
                """
        )
        ExplanationText(
            """Il est l'heure de découvrir un autre composable qui déssine une
                    image, qui dessine plus particulièrement une icône. La différence
                    ici est qu'une icône pourrait être vue comme une forme plutôt que
                    comme un dessin. Le composable <b>Icon</b> ressemble beaucoup à
                    <b>Image</b> et vous propose une méthode simple pour appliquer
                    une teinte.
                """
        )
        ExplanationText(
            """Petite astuce, Material vous propos un lot d'icônes permis
                    lesquels vous trouverez sûrement votre bonheur&nbsp;:
                    <b>Icons.Default.Star</b>.
                """
        )
        Code("""@Composable
            |Icon(
            |   imageVector = Icons.Default.Star,
            |   // ...
            |)
            """.trimMargin()
        )
        ExplanationText(
            """Vous pouvez conditionner l'affichage de ce composable en fonction
                du paramètre <b>isBest</b> passé au composable <b>CIASkill</b>.
                """
        )
        ExplanationText(
            """Note&nbsp;: <i>N'hésitez à utiliser l'auto-completion lorsque vous
                parcourez les icons de Material.</i>
            """
        )

        ExplanationTitle("Étirer un élément")
        ExplanationText(
            """Vous avez peut-être remarqué que l'icône n'est pas automatiquement
                    plaquée à droite de la <b>Row</b>. Encore une fois, par défaut,
                    les composables cherchent à se positionner le plus à gauche possible.
            """
        )
        ExplanationText(
            """Il existe plusieurs façon d'adresser ce besoin, ici nous allons
                    demander aux textes de s'étirer à l'horizontal.
            """
        )
        ExplanationText(
            """Dès qu'un composable se trouve dans une <b>Row</b>, vous pouvez lui
                    appliquer un Modifier <b>.weight(1f)</b> puis lui demander de prendre
                    un maximum de place sans marcher sur ses voisins.
            """
        )
    }
}
