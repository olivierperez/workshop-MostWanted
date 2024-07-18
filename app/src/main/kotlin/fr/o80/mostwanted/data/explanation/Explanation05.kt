package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation05() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Nous allons maintenant nous pencher sur un Composable 
                particulier, <b>Image</b>. Il nous permet de rendre notre 
                application plus visuelle en affichant une ressource image.
                """
        )
        ExplanationText(
            """Ce Composable permet d'afficher une image de type PNG, JPEG, 
                WEBP, mais aussi une ressource issue de votre application.
                """
        )
        ExplanationText(
            """Pour afficher une image, il suffit de donner sa 
                source à la propriété <b>painter</b> de notre Composable, 
                comme ceci :
                """
        )
        Code(
            "Image(\n" +
                "            painter = painterResource(\"source de l'image\")" +
                ",\n" +
                "        )" +
                ""
        )
        ExplanationText(
            """Essayez maintenant d'afficher l'avatar présent dans les 
                ressources de l'application, dont la source est <b>R.drawable.avatar<b/>.
                """
        )
        ExplanationText(
            """Grâce aux exercices précédents, vous êtes maintenant capable 
                de créer un écran complexe. Essayez donc de reproduire la 
                maquette !"""
        )
    }
}
