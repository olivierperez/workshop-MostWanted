package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText

@Composable
fun Explanation03() {
    Column(
        Modifier.fillMaxSize()
    ) {
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
                    auquel nous allons passer des modificateurs pour 
                    changer le comportement ou l'apparence de l'élément 
                    associé. Ce paramètre vient s'ajouter aux paramètres 
                    spécifiques proposés par chaque Composable.
                """
        )
        ExplanationText(
            """Vous pouvez maintenant admirer votre travail !"""
        )
    }
}
