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
import fr.o80.mostwanted.component.solution.S03Screen
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.exercise.E01HelloWorld
import fr.o80.mostwanted.exercise.E02Layout
import fr.o80.mostwanted.exercise.E03Screen

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
                        pouvez ajouter une valeur à l'argument 
                        <b>horizontalArrangement</b> du Composable Row, comme
                        ceci&nbsp;:
                """
                )
                Code("horizontalArrangement = Arrangement.spacedBy(4.dp)")
                ExplanationText(
                    """Cet argument permet de définir un espace de 4 dp entre
                        chaque Composable présent dans la Row.
                """
                )
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
        title = "Créer un écran structuré",
        explanation = {
            ExplanationText(
                """Nous allons maintenant créer un écran structuré dans 
                    lequel intégrer nos Composables. On peut facilement imaginer
                    un écran composé d'une <b>topBar</b>, d'une <b>bottomBar</b>
                    et d'un contenu central.
                """
            )
            ExplanationText(
                """En Jetpack Compose, il est possible de créer cette 
                    structure grâce au Composable <b>Scaffold</b>. Le but ici
                    est de l'utiliser pour afficher le titre <i>Wanted People</i>,
                    et pour préciser <i>Dead or alive</i> en bas de page.
                """
            )
            ExplanationText(
                """Pour afficher un titre centré nous allons ici utiliser
                    le Composable <b>CenterAlignedTopAppBar</b>&nbsp;:
                """
            )
            Code(
                """|CenterAlignedTopAppBar(
                   |    title = {
                   |        Text(text = "Wanted People")
                   |    }
                   |)""".trimMargin()
            )
            ExplanationText(
                """Nous allons ensuite nous occuper du contenu de cet écran. 
                     Nous souhaitons avoir un <b>Text</b> supplémentaire, 
                     placé en dessous des deux autres précédemment créés. Pour
                     ce faire, nous allons intégrer au contenu du Scaffold le 
                     Composable <b>Column</b> permettant, tout comme Row, 
                     d'organiser les éléments entre eux.
                """
            )
            Code(
                """|Column {
                   |    Text(
                   |        text = ...
                   |    )
                   |    Text(
                   |        text = ...
                   |    )
                   |}""".trimMargin()
            )
            ExplanationText(
                """Après avoir implémenté ce code et lancé l'app, quelque 
                    chose cloche... Si vous ne voyez pas de contenu, c'est 
                    normal&nbsp;! Le Composable Scaffold <b>n'oblige pas son contenu à 
                    se dessiner après la topBar</b>, votre contenu s'affiche donc 
                    <b>sous la topBar</b>. Pour gérer ce cas, le Scaffold met à notre disposition 
                    des PaddingValues pour nous conseiller une zone dans laquelle présenter le contenu.
                    Ce PaddingValues est à utiliser en tant que <b>.padding(...)</b>
                    du contenu du Scaffold.
                """
            )
            Code(
                """|Scaffold(
                   |    ...
                   |) { paddingValues ->
                   |    Column(
                   |        modifier = Modifier
                   |            .padding(paddingValues)
                   |    ) { ... }
                   |}""".trimMargin()
            )
            ExplanationText(
                """Pour terminer la composition de cet écran, jouez avec
                    les paramètres du Composable <b>Column</b> pour centrer
                    verticalement et horizontalement.
                    Puis ajoutez le modifier <b>fillMaxSize</b> à la Column
                    pour lui indiquer de prendre toute la place disponible.
                """
            )
            ExplanationText(
                """Chaque Composable possède un argument <b>modifier</b>, 
                    auquel nous allons passé des modificateurs pour 
                    changer le comportement ou l'apparence de l'élément 
                    associé. Ce paramètre vient s'ajouter aux paramètres 
                    spécifiques proposés par chaque Composable.
                """
            )
            ExplanationText(
                """Vous pouvez maintenant admirer votre travail !"""
            )
        },
        file = "E03Screen.kt",
        result = { E03Screen() },
        solution = { S03Screen() }
    ),
    ExerciseDef(
        id = 3,
        title = "Et si on facilitait le développement...",
        explanation = {},
        file = "",
        result = {},
        solution = {}
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
            .padding(vertical = 4.dp),
        style = MaterialTheme.typography.bodyMedium
    )
}
