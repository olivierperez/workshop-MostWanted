package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationNavigationBar() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Deux écrans")
        ExplanationText(
            """Nous arrivons aux derniers exercices de cet atelier. Bravo 
                    d'être arrivé·e jusqu'ici, vous êtes presque prêt·e à aller 
                    sur le terrain !
                """
        )
        ExplanationText(
            """Avant de passer à l'exercice final, vous allez préparer le verso
                    de votre badge en installant un système de navigation pour aller
                    d'une face de votre badge à l'autre.
                """
        )
        ExplanationTitle("NavigationBar")
        ExplanationText(
            """Pour modéliser le recto et le verso de votre badge, nous 
                allons utiliser une <b>NavigationBar</b>. Elle sera composée 
                de 2 <b>NavigationBarItem</b> nommés "BADGE" et "MISSIONS".
                """
        )
        ExplanationText(
            """Installez cette NavigationBar dans la "bottomBar" d'un Scaffold.
                C'est généralement dans cette "bottomBar" qu'on retrouve les éléments
                de navigation.
                """
        )
        ExplanationTitle("Page courante")
        Code("""var currentPage by rememberSaveable { mutableIntStateOf(0) }""")
        ExplanationText(
            """Utilisez cette variable pour savoir quel <b>NavigationBarItem</b>
                    est actuellement sélectionné.
            """
        )
        ExplanationText(
            """Pensez également à mettre à jour cette variable lorsque l'un des
                    <b>NavigationBarItem</b> est cliqué.
            """
        )
        ExplanationTitle("D'une face à l'autre")
        ExplanationText(
            """Pour l'instant, nous allons simplement simuler le changement
                    de face.
                """
        )
        ExplanationText(
            """Pour ce faire, utilisez la variable <b>currentPage</b>
                    dans un Text présent dans le contenu du Scaffold.
                """
        )
    }
}

@Composable
fun ExplanationTwoSides() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Recto")
        ExplanationText(
            """Réutilisez l'exercice précédent pour poser la structure de votre badge.
            """
        )
        ExplanationText(
            """Puis remplacez le text simulant les pages par une condition.
                Si <b>currentPage</b> vaut 0, alors affichez le Composable <b>CIAIdentity</b>.
                S'il vaut 1, alors affichez un text "Liste des missions".
            """
        )

        ExplanationTitle("Transition")
        ExplanationText(
            """Pour terminer, nous aimerions rendre la transition entre les 
                deux écrans plus fluide. Encapsulez la condition ci-dessus dans
                un <b>AnimatedContent</b>&nbsp;:
            """
        )
        Code(
            "AnimatedContent(\n" +
                    "            targetState = currentPage,\n" +
                    "            label = \"Main-page\",\n" +
                    "            modifier = Modifier\n" +
                    "                .fillMaxSize()\n" +
                    "                .padding(paddingValues),\n" +
                    "            transitionSpec = {\n" +
                    "                fadeIn(animationSpec = tween(220, delayMillis = 90))\n" +
                    "                    .togetherWith(fadeOut(tween(90)))\n" +
                    "            }\n" +
                    "        ) { page ->\n" +
                    "            // ...\n" +
                    "        }"
        )
        ExplanationText(
            """Félicitations agent, vous êtes maintenant un·e expert·e de 
                <b>Jetpack Compose</b>&nbsp;!
            """
        )
    }
}
