package fr.o80.mostwanted.data

import android.text.Html
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.component.atom.toAnnotatedString
import fr.o80.mostwanted.component.solution.S01HelloWorld
import fr.o80.mostwanted.component.solution.S02Layout
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.exercise.E01HelloWorld
import fr.o80.mostwanted.exercise.E02Layout

val exercises = listOf(
    ExerciseDef(
        id = 0,
        title = "Première étape",
        explanation = {
            Column(
                Modifier.fillMaxSize()
            ) {
                ExplanationText(
                    """C'est votre premier jour à la CIA, une nouvelle aventure commence ici.
                        Au fur et à mesure de cet atelier vous allez rencontrer des outils que
                        Jetpack Compose met à notre disposition pour réaliser les plus belles
                        applications en Kotlin.
                """
                )
                ExplanationText(
                    """Avec Jetpack Compose <b>tout est "Composable</b>" et un Composable
                        est <b>une fonction Kotlin</b> qui porte l'annotation @Composable.
                        On peut le rendre configurable à l'aide de paramètres qu'on passe à lors de l'appel
                        à cette fonction.
                """
                )
                ExplanationText(
                    """Un des Composables les plus simples fournits par Jetpack Compose est
                        le <b>Text</b>. Pour commencer votre initiation, quoi de mieux que de faire
                        un magnifique Hello World ? Rendez-vous dans le fichier indiqué et ajoutez-y
                        le code suivant&nbsp;:
                """
                )
                Code("Text(\"Hello World!\")")
            }
        },
        file = "E01HelloWorld.kt",
        result = { E01HelloWorld() },
        solution = { S01HelloWorld() }
    ),
    ExerciseDef(
        id = 1,
        title = "Jouer sur la mise en page",
        explanation = {
            Column(
                Modifier.fillMaxSize()
            ) {
                ExplanationText(
                    """Maintenant que vous avez réussi à intégrer votre 
                        premier Composable, vous allez découvrir comment 
                        organiser plusieurs éléments grâce aux 
                        <b>Composables de mise en page</b>.
                """
                )
                ExplanationText(
                    """Le but est ici d'obtenir <b>une ligne</b> constituée de 
                        deux Composables Text, votre prénom et 
                        votre nom.
                """
                )
                ExplanationText(
                    """Pour ce faire, il vous suffit de créer deux 
                        Composables Text et de les insérer dans un 
                        Composable <b>Row</b>&nbsp;:
                """
                )
                Code("Row {...}")
                ExplanationText(
                    """Afin d'obtenir un espace entre les deux Text, vous 
                        pouvez ajouter un troisième Composable, <b>Spacer</b>, 
                        chargé de créer un espace entre deux éléments.
                """
                )
                Code("Spacer()")
                ExplanationText(
                    """Chaque Composable possède un argument <b>modifier</b>, 
                        auquel nous allons passé des modificateurs pour 
                        changer le comportement ou l'apparence de l'élément 
                        associé. Nous souhaitons définir la taille du 
                        Composable <b>Spacer</b> avec une largeur de 4 dp
                        . Nous allons donc attribuer le modificateur 
                        suivant au Spacer&nbsp;:
                """
                )
                Code("modifier = Modifier.width(4.dp)")
                ExplanationText(
                    """<i>Veillez à importer les librairies nécessaires</i>
                """
                )
            }
        },
        file = "E02Layout.kt",
        result = { E02Layout() },
        solution = { S02Layout() }
    ),
    ExerciseDef(
        id = 2,
        title = "Le fameux",
        explanation = {},
        file = "Fichier_3.kt",
        result = {},
        solution = { Text(text = "Maquette non-implémentée !") }
    ),
    ExerciseDef(
        id = 3,
        title = "Jamais 304",
        explanation = {},
        file = "Fichier_4.kt",
        result = {},
        solution = { Text(text = "Maquette non-implémentée !") }
    ),
)

@Composable
fun ExplanationText(text: String) {
    Text(
        text = Html
            .fromHtml(
                text.replace("\\s+".toRegex(), " "),
                Html.FROM_HTML_MODE_COMPACT
            )
            .toAnnotatedString(),
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun Code(code: String) {
    Text(
        text = code,
        modifier = Modifier
            .drawBehind {
                drawLine(
                    color = Color.Gray,
                    start = Offset(0f, 0f),
                    end = Offset(0f, size.height),
                    strokeWidth = 4f
                )
            }
            .padding(start = 8.dp)
            .padding(vertical = 4.dp)
        ,
        style = MaterialTheme.typography.bodyMedium
    )
}
