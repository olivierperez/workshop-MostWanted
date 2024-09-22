package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationTwoSides() {
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
            """Pour modéliser le recto et le verso de votre badge de cette
                    application, nous allons utiliser une <b>NavigationBar</b>.
                    Elle sera composée de 2 <b>NavigationBarItem</b> nommés
                    "BADGE" et "MISSIONS".
                """
        )
        ExplanationText(
            """Pour l'instant nous allons simplement simuler le changement
                    de face. Pour ce faire nous allons à nouveau utiliser une
                    variable qui va se souvenir quelle face est actuellement
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
