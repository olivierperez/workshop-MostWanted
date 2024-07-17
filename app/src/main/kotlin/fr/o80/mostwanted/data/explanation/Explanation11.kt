package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation11() {
    Column(
        Modifier.fillMaxSize()
    ) {

        ExplanationText(
            """Pour terminer, nous aimerions rendre la transition entre les 
                deux écrans plus fluide. Reprenez le code créé lors de 
                l'exercice précédent et ajoutez-y un <b>AnimatedContent</b> :
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
            """Félicitations, vous êtes maintenant un·e expert·e du 
                <b>Renseignement Jetpack Compose</b> !
            """
        )
    }
}
