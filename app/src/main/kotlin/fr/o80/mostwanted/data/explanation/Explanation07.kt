package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation07() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Nous allons maintenant rendre notre écran <b>interactif</b> et 
                obtenir le comportement présent sur la maquette  ! Pour cela,
                 reprenez le code précédemment écrit.
                """
        )
        ExplanationText(
            """Chaque modifier présente un attribut <b>clickable</b> qui 
                permet de transmettre un comportement au clic sur le 
                Composable associé.
                """
        )
        ExplanationText(
            """Nous voulons ici faire varier la taille des 4 coins de notre 
                image. Pour ce faire, nous allons créer une variable dans le 
                contenu de notre Composable. C'est celle-ci qui contiendra la taille 
                souhaitée.
                """
        )
        ExplanationText(
            """Nous souhaitons que la valeur de notre variable soit 
                persistante malgré la potentielle recomposition de notre 
                écran. Nous allons donc la créer à l'aide d'un <b>remember</b>. 
                Cette variable sera aussi modifiée afin de faire varier la 
                forme de l'image. Il faut donc l'assigner avec un 
                <b>mutableStateOf</b>.
                """
        )
        Code("var corner by remember { mutableIntStateOf(0) }")
        ExplanationText(
            """La variable <b>corner</b> est ici initialisée à 0.
                """
        )
        ExplanationText(
            """Nous allons maintenant modifier le modifier <b>clip</b> que 
                nous avons écrit dans l'exercice précédent pour lui attribuer
                 la valeur de notre variable.
                """
        )
        Code(".clip(RoundedCornerShape(corner))")
        ExplanationText(
            """Si vous observez votre travail, l'image est maintenant 
                redevenue carrée. Pour qu'elle obtienne une forme ronde, il 
                faut que notre variable <b>corner</b> soit égale à 50.
                """
        )
        ExplanationText(
            """C'est ici que nous allons utiliser notre attribut 
                <b>clickable</b>. Lors d'un clic, nous allons modifier la 
                valeur de notre variable pour jouer sur la forme de l'image.
                """
        )
        Code(".clickable { corner = 50 - corner }")
        ExplanationText(
            """Vous pouvez maintenant observer l'image interactive depuis
                 votre rendu !
                """
        )
    }
}
