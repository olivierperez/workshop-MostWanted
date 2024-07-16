package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation08() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Nous souhaitons maintenant intégrer une animation. Lors du 
                clic sur l'image, nous voulons aussi modifier la visibilité 
                du texte positionné en dessous.
                """
        )
        ExplanationText(
            """Pour faire une animation simplement, Compose met à disposition 
                des Composables, tels que AnimatedVisibility ou 
                AnimatedContent. Nous allons ici utiliser le premier.
                """
        )
        ExplanationText(
            """Pour l'utiliser, il vous suffit d'encapsuler le Composable que
                 vous souhaitez animer dans le contenu de 
                 l'<b>AnimatedVisibility</b>.
                """
        )
        ExplanationText(
            """Comme dans l'exercice précédent, nous allons initialiser une 
                seconde variable qui nous permettra de contenir l'état de 
                visibilité du Composable. Cette variable sera un booléen.
                """
        )
        Code("var activate by remember { mutableStateOf(false) }")
        ExplanationText(
            """Nous allons ensuite utiliser cette variable dans l'attribut 
                <b>visible</b> de notre AnimatedVisibility. Nous allons aussi
                 définir le comportement et l'apparence de notre animation. 
                 Voici un exemple d'animation :
        """)
        Code("AnimatedVisibility(\n" +
                "            visible = activate,\n" +
                "            label = \"Name visibility\",\n" +
                "            enter = fadeIn() + expandIn(expandFrom = Alignment.Center),\n" +
                "            exit = fadeOut() + shrinkOut(shrinkTowards = Alignment.Center),\n" +
                "        )")
        ExplanationText(
            """Nous souhaitons que l'animation du texte s'effectue avec 
                l'interactivité de l'image. Nous allons donc conditionner la 
                valeur de notre <b>corner</b> en fonction de la valeur de notre 
                variable <b>activate</b>.
        """)
        Code("val corner by animateIntAsState(\n" +
                "            targetValue = if (activate) 0 else 50,\n" +
                "            label = \"Image rounding\"\n" +
                "        )")
        ExplanationText(
            """Il nous reste maintenant à jouer sur notre variable pour gérer
                 la visibilité de notre écran. Nous allons modifier le 
                 contenu de notre <b>modifier</b> clickable pour qu'il change
                  l'état du booléen <b>activate</b> au clic sur l'image.
        """)
    }
}
