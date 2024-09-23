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
            """Bon... à part la création d'applications en Compose, vous avez
                 peut-être d'autres compétences, non&nbsp;? Pourquoi ne pas 
                 les afficher fièrement sur votre badge&nbsp;? On va leur 
                 trouver un peu de place sous votre profil.
                """
        )
        ExplanationText(
            """Commençons par concevoir un Composable <b>CIASkill</b> capable d'afficher
                    une compétence donnée. Puis, si ce Composable est 
                    paramétrable, on pourra le réutiliser pour afficher la 
                    palette complète de vos talents.
                """
        )
        ExplanationText(
            """Pour le mettre un peu en exergue, utilisez le Composable <b>Card</b>
                    du design system Material. Comme son nom l'indique, il 
                    affiche son contenu sous forme de carte, un peu comme si
                    vous l'aviez posé sur l'écran.
                """
        )

        ExplanationTitle("Paramètres")
        ExplanationText(
            """Utilisez vos enseignements précédents pour construire le reste de
                    <b>CIASkill</b>. La petite nouveauté sera l'utilisation de paramètres
                    passés au Composable pour le rendre configurable.
                """
        )
        ExplanationText(
            """Voici un exemple de composable paramétrable&nbsp;:
                """
        )
        Code(
            """@Composable
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
        Code(
            """Row / Column
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
            """Il est l'heure de découvrir un autre composable qui dessine une
                    image, plus particulièrement une icône. La différence ici
                     est qu'une icône pourrait être vue comme une forme 
                     plutôt qu'un dessin. Le composable <b>Icon</b> ressemble beaucoup à
                    <b>Image</b> et vous propose une méthode simple pour 
                    appliquer une teinte.
                """
        )
        ExplanationText(
            """Petite astuce, Material vous propose un lot d'icônes parmi
                    lesquelles vous trouverez sûrement votre bonheur&nbsp;:
                    <b>Icons.Default.Star</b>.
                """
        )
        Code(
            """@Composable
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
            """Note&nbsp;: <i>N'hésitez pas à utiliser l'auto-complétion lorsque
                 vous parcourez les Icons de Material.</i>
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
            """Il existe plusieurs façons d'adresser ce besoin, ici nous allons
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

@Composable
fun ExplanationSkillsIntegration() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Il est temps d'ajouter vos compétences à votre badge. On pourrait
                    leur faire un peu de place sous votre prénom et nom.
                """
        )
        ExplanationText(
            """La Column était faite pour afficher des Composables les uns
                    en dessous des autres, vous pourriez penser que c'est le 
                    Compsable à utiliser ici.
                """
        )
        ExplanationText(
            """Que nenni&nbsp;! Chaque exercice est l'occasion de découvrir une nouveauté.
                """
        )
        ExplanationTitle("LazyColumn")
        ExplanationText(
            """La <b>LazyColumn</b> est un Composable qu'on est souvent amené
                    à utiliser pour afficher une grande liste d'éléments, 
                    qui demanderait à l'utilisateur de défiler pour en 
                    parcourir l'intégralité.
                """
        )
        ExplanationText(
            """Cela consommerait trop de ressources de calculer les centaines
                 d'éléments que l'utilisateur ne verra pas avant de défiler. 
                 Les téléphones n'étant pas faits pour gérer autant 
                 d'informations, la LazyColumn ne calcule que les éléments 
                 présents à l'écran et retarde le calcul des suivants.
                """
        )
        ExplanationText(
            """Une petite différence à savoir à l'utilisation, on ne donne pas
                    directement les Composables à une LazyColumn. On lui donne des
                    <b>item { ... }</b> à l'intérieur desquels on va définir nos
                    Composables.
                """
        )
        Code(
            """LazyColumn(...) {
            |   item { Text("Hello"") }
            |   item { Text("World!"") }
            |)
            """.trimMargin()
        )
        ExplanationText(
            """Note&nbsp;: <i>La <b>LazyColumn</b> pratique également le 
                recyclage de Composable en réutilisant ceux disparus d'un 
                côté pour afficher ceux qui apparaissent de l'autre.</i>
                """
        )
        ExplanationTitle("Intégration")
        ExplanationText(
            """Ajoutez 2 compétences à votre badge en utilisant une <b>LazyColumn</b>.
                """
        )
    }
}
