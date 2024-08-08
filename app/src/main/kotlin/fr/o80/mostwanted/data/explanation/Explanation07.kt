package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun Explanation07() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Interaction utilisateur")
        ExplanationText(
            """Nous allons maintenant rendre notre écran <b>interactif</b> et 
                obtenir le comportement présent sur la maquette  ! Pour cela,
                 reprenez le code précédemment écrit.
                """
        )
        ExplanationTitle("Gestion d'une variable")
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
        ExplanationTitle("Modification du clip")
        ExplanationText(
            """Voyez-vous comment faire varier la forme du clip en vous
                basant sur une autre forme que CircleShape ?
                """
        )
        ExplanationText(
            """Vous n'avez pas trouvé ? Que pensez-vous de RoundedCornerShape ?"""
        )
        ExplanationText(
            """Si vous observez votre travail, l'image est maintenant 
                redevenue carrée. Pour qu'elle obtienne une forme ronde, il 
                faut que notre variable <b>corner</b> soit égale à 50.
                """
        )
        ExplanationTitle("Clickable")
        ExplanationText(
            """Chaque modifier présente un attribut <b>clickable</b> qui 
                permet de transmettre un comportement au clic sur le 
                Composable associé.
                """
        )
        ExplanationText(
            """Essayez donc de modifier la valeur de notre
                 variable pour jouer sur la forme de l'image.
                """
        )
        ExplanationText(
            """Vous pouvez maintenant observer l'image interactive depuis
                 votre rendu !
                """
        )
    }
}
