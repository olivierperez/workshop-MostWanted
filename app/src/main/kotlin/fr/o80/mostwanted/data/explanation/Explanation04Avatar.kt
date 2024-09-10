package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationAvatarSimple() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Image")
        ExplanationText(
            """Vous ne pouvez pas vous trimbaler dans les couloir avec le mot
                    "Image" sur votre badge, ça n'a aucun sens&nbsp;!
                    """
        )
        ExplanationText(
            """Remplacez donc ce texte par le composable <b>Image</b>.
                    Il vous permettra de rendre votre badge plus visuel, plus pertinent.
                    Mais n'affichez pas votre photo, à la CIA nous utilisons
                    des avatars pour flouter notre identité.
                    """
        )
        ExplanationTitle("Accès aux ressources")
        ExplanationText(
            """Les images font parties des resources nommées "drawables" en Jetpack Compose,
                    vous pouvez les utiliser en fournissant un "painter resources" au composable
                    <b>Image</b>. Choisissez la bonne image parmis avatar_blue, avatar_orange
                    et avatar_red.
                    """
        )
        Code(
            """|Image(
               |    painter = painterResource(R.drawable.avatar_blue),
               |    // ...
               |)""".trimMargin()
        )
        ExplanationText(
            """L'accessibilité est un sujet important pour Jetpack Compose,
                    lorsque vous utilisez une image il faut proposer une alternative
                    textuelle via le paramètre "contentDescription".
                """
        )
        ExplanationText(
            """Note&nbsp;: <i>Ce Composable permet d'afficher une image de type PNG, JPEG, 
                    WEBP, mais aussi des images vectorielles au format AVD (Android Vector Drawable)
                    inspiré du SVG.</i>
                    """
        )
    }
}

@Composable
fun ExplanationAvatarClipped() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Clip d'une image")
        ExplanationText(
            """En se basant sur le code que vous avez développé lors de 
                l'exercice précédent, nous allons essayer d'améliorer le 
                rendu visuel de notre image.
                """
        )
        ExplanationText(
            """Nous aimerions par exemple la rendre ronde. Pour cela, rien de
                 plus simple. Il vous suffit d'ajouter un <b>clip</b> sur 
                 l'image pour modifier sa forme.
                """
        )
        ExplanationText(
            """Vous pouvez donc ajouter un <b>modifier</b> à votre image en 
                lui attribuant un clip de type <b>CircleShape</b>
                """
        )
        ExplanationText(
            """Comme vous pouvez le constater, vous pouvez attribuer ce 
                comportement à un modifier. Vous pouvez donc arrondir les bords
                 de n'importe quel Composable !
                """
        )
    }
}

@Composable
fun ExplanationInteractiveAvatar() {
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
