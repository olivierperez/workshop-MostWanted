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
            """Pour l'instant, nous allons simplement simuler le changement
                    de face. Pour ce faire, nous allons à nouveau utiliser une
                    variable qui va se souvenir de la face actuellement
                    affichée à l'écran.
                """
        )
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
    }
}


@Composable
fun ExplanationTwoSides() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Transition")
        ExplanationText(
            """Pour terminer, nous aimerions rendre la transition entre les 
                deux écrans plus fluide. Reprenez le code créé lors de 
                l'exercice précédent et ajoutez-y un <b>AnimatedContent</b>&nbsp;:
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
                    "        ) {}"
        )
        ExplanationText(
            """Félicitations agent, vous êtes maintenant un·e expert·e du 
                <b>Jetpack Compose</b> !
            """
        )
    }
}

