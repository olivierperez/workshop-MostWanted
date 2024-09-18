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
                    vous pouvez les utiliser en fournissant un "painter resource" au composable
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
            """En nous basant sur le code que vous avez produit lors de
                l'exercice précédent, nous allons essayer d'améliorer le
                rendu visuel de votre avatar.
                """
        )
        ExplanationText(
            """Appliquez un Modifier <b>clip</b> au composable de l'avatar
                    pour modifier sa forme. Un clip <b>CircleShape</b> permettra
                    d'arrondir l'avatar.
                """
        )
        Code("""Modifier.clip(CircleShape)""")
        ExplanationText(
            """Note&nbsp;: <i>Vous pouvez vous en douter, vous pouvez appliquer ce
                    comportement à n'importe quel Modifier ce qui implique que vous pouvez
                    arrondir les bords de n'importe quel Composable&nbsp;!</i>
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
            """L'interaction de base sur mobile est le tap, elle est connue sous
                    le nom de "click" dans Jetpack Compose. Vous la trouverez sous plusieurs
                    déclinaisons comme "onClick" ou "clickable".
                """
        )
        ExplanationText(
            """Pour rendre votre badge interactif, reprenez le code précédemment écrit.
                """
        )
        ExplanationTitle("Gestion d'une variable")
        ExplanationText(
            """Ici, nous voulons faire varier la taille des 4 coins de notre 
                image. Nous allons créer une variable qui se souviendra de cette taille.
                """
        )
        ExplanationText(
            """Dans le contexte de Jetpack Compose, les variables sont encapsulées
                    dans des <b>remember</b>, voyez-les un peu comme de la memoisation.
                    Nous allons également demander à cette variable d'avoir un impact
                    sur ce qu'on présente à l'écran, pour ce faire nous devons la déclarer
                    comme un "mutable state".
                """
        )
        Code("var corner by remember { mutableIntStateOf(0) }")
        ExplanationText(
            """<i>La variable <b>corner</b> est ici initialisée à 0
                et peut-être amennée à changer.</i>
                """
        )
        ExplanationTitle("Modification du clip")
        ExplanationText(
            """Voyez-vous comment faire varier la forme du clip en vous
                basant sur une autre forme que CircleShape ?
                """
        )
        ExplanationText(
            """Vous n'avez pas trouvé ? Que pensez-vous de <b>RoundedCornerShape</b>&nbsp;?"""
        )
        ExplanationText(
            """Si vous observez votre travail, l'image est maintenant 
                redevenue carrée. Pour qu'elle obtienne une forme ronde, il 
                faut que notre variable <b>corner</b> soit égale à 50.
                """
        )
        ExplanationTitle("Clickable")
        ExplanationText(
            """Cherchez dans la doc le Modifier qui vous permettra de définir
                un comportement pour réagir à un clic sur l'image.
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

@Composable
fun ExplanationAvatarIntegration() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Votre avatar est prêt à être intégré à votre badge. Remplacez simplement
                    l'ancien texte "image" par le composable <b>CIAImage()</b> que
                    vous venez de coder.
                """
        )
    }
}
