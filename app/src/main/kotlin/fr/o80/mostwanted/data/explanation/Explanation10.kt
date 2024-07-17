package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation10() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Nous arrivons aux derniers exercices de cet atelier. Bravo 
                d'être arrivé·e jusqu'ici, vous êtes presque prêt·e à aller 
                sur le terrain !
                """
        )
        ExplanationText(
            """Pour cette dernière mission, vous allez créer deux écrans, 
                ainsi qu'un système de navigation pour naviguer de l'un à 
                l'autre.
                """
        )
        ExplanationText(
            """Pour ce faire, vous pouvez mettre en place un <b>Scaffold</b> 
                vu dans l'exercice 3, puis utiliser sa propriété 
                <b>bottomBar</b> pour créer la navigation. Vous pouvez 
                utiliser le Composable <b>NavigationBar</b> et les éléments 
                <b>NavigationBarItem</b>.
                """
        )
        Code("NavigationBar {\n" +
                "                NavigationBarItem()\n" +
                "}")
        ExplanationText(
            """Vous pouvez créer une variable à la racine de la fonction de 
                l'exercice pour vous permettre de stocker la page sur 
                laquelle nous sommes. Cette variable est un entier. Vous 
                pourrez l'utiliser dans vos <b>NavigationBarItem</b> :
            """
        )
        Code("selected = currentPage == 0,\n" +
                "onClick = { currentPage = 0 },")
        ExplanationText(
            """Le contenu de chaque écran sera conditionné par la valeur de 
                la variable <b>currentPage</b>. Pour cela, vous pouvez 
                utiliser une <b>Box</b> en lui passant le <b>paddingValues</b>
                 du Scaffold puis utiliser l'expression <b>when</b> pour 
                 afficher son contenu :
            """
        )
        Code("when (currentPage) {\n" +
                "                0 -> Home()\n" +
                "                1 -> Info()\n" +
                "            }")
        ExplanationText(
            """Il vous reste maintenant à créer le contenu des deux écrans 
                dans les deux nouveaux Composables <b>Home()</b> et <b>Info()</b>.
            """
        )
    }
}
