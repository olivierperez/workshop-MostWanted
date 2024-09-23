package fr.o80.mostwanted.data.explanation

import androidx.compose.runtime.Composable
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationScaffoldBadgeLayout() {
    ExplanationTitle("Scaffold")
    ExplanationText(
        """Nous allons maintenant créer un écran structuré dans 
                    lequel intégrer nos Composables. On peut facilement imaginer
                    un écran composé d'une <b>topBar</b>, d'une <b>bottomBar</b>
                    et d'un contenu central.
                """
    )
    ExplanationText(
        """En Jetpack Compose, il est possible de créer cette 
                    structure grâce au Composable <b>Scaffold</b>.
                """
    )
    Code(
        """|Scaffold(
                   |    ...
                   |) {
                   |    Text("Hello World!")
                   |}""".trimMargin()
    )
    ExplanationText(
        """Android Studio devrait vous alerter d'un oubli,
                    passez à la suite.
                """
    )
    ExplanationTitle("Modifier")
    ExplanationText(
        """Le Scaffold de Material ne vous oblige pas à afficher le contenu à la
                    suite de la TopBar, cela peut-être utile si vous souhaitez avoir
                    un contenu qui pourra scroller sous cette TopBar par exemple.
                    Le Scaffold vous met donc à disposition des valeurs pour pouvoir dessiner
                    le contenu entre la TopBar et la BottomBar, et est en train de vous alerter
                    que vous n'avez encore pas pris en compte ces valeurs.
                """
    )
    ExplanationText(
        """Pour positionner le contenu, nous allons utiliser son argument <b>modifier</b>,
                    Chaque Composable en possède un, auquel nous allons passer des modificateurs
                    pour changer l'apparence ou le comportement de l'élément.
                    Ce paramètre générique vient s'ajouter aux paramètres spécifiques
                    proposés par chaque Composable.
                """
    )
    ExplanationText(
        """Utilisez le paramètre <b>paddingValues</b> que le Scaffold fournit,
                    et passez le au Modifier du contenu. Cela a pour effet 
                    d'ajouter des marges au dessus et en dessous du contenu 
                    pour ne pas déborder sous la TopBar ni sous la BottomBar plus tard.
        """
    )
    Code(
        """|Scaffold(
                   |    ...
                   |) { paddingValues ->
                   |    Text(
                   |        modifier = Modifier.padding(paddingValues)
                   |        // ...
                   |    )
                   |}""".trimMargin()
    )
    ExplanationText(
        """L'alerte va disparaître, vous pouvez passer à la suite.
        """
    )
}

@Composable
fun ExplanationScaffoldBadgeContent() {
    ExplanationTitle("TopBar")
    ExplanationText(
        """Pour afficher un titre centré, nous pouvons utiliser
                    le Composable <b>CenterAlignedTopAppBar</b>.
                """
    )
    ExplanationText(
        """Ajoutez-le dans le paramètre <b>topBar = { ... }</b>
                    du Scaffold&nbsp;:
                """
    )
    Code(
        """|Scaffold(
           |    topBar = {
           |        CenterAlignedTopAppBar(
           |            title = {
           |                Text(text = "CIA")
           |            }
           |        )
           |    }
           |) {
           |    ...
           |}""".trimMargin()
    )
    ExplanationTitle("BottomBar")
    ExplanationText(
        """De même, utilisez le champ <b>bottomBar = { ... }</b>
                    pour afficher un simple texte "Badge" en bas de la page.
                """
    )
    ExplanationText(
        """Vous l'avez déjà fait plusieurs fois, vous devriez vous en sortir&nbsp;!
                """
    )
}

@Composable
fun ExplanationScaffoldStyling() {
    ExplanationTitle("Centrer le contenu")
    ExplanationText(
        """Le contenu vient se loger en haut à gauche de l'écran, c'est son 
            comportement par défaut. Sans contre-indication, il va se 
            positionner à cet endroit en occupant le moins de place possible.
                """
    )
    ExplanationText(
        """Pour le centrer, nous allons l'encapsuler dans une <b>Box</b> que
            nous allons étirer pour occuper toute la place à laquelle elle a
            accès (souvenez-vous des marges proposées par le Scaffold), puis
            nous demanderons à la <b>Box</b> de centrer son contenu.
                """
    )
    ExplanationText(
        """Attention, maintenant que le Text n'est pas <b>l'enfant direct</b>
                    du Scaffold, ce n'est plus à lui de récupérer les 
                    <b>paddingValues</b> mais à la <b>Box</b>.
                """
    )
    Code(
        """|Scaffold(
           |    topBar = { ... },
           |    bottomBar = { ... }
           |) { paddingValues ->
           |    Box(
           |        modifier = Modifier
           |            .fillMaxSize()
           |            .padding(paddingValues),
           |        contentAlignment = Alignment.Center
           |    ) {
           |        Text(text = "Hello World!")
           |    }
           |}
        """.trimMargin()
    )
    ExplanationTitle("Apparence du texte")
    ExplanationText(
        """Passons au texte de la BottomBar, il ne mérite pas d'être si visible.
                    Utilisez son champ "style" pour définir son apparence.
                    Material vous propose un lot de "typography" pour donner un peu
                    de sens à nos textes, utilisez <b>MaterialTheme.typography.labelMedium</b>.
                """
    )
    ExplanationText(
        """Une fois le style défini, ajoutez un peu de marge autour,
                    4dp (density-independent pixels) devraient suffire&nbsp:
                """
    )
    Code(
        """Modifier.padding(4.dp)"""
    )
    ExplanationText(
        """Note&nbsp;: <i>Le Scaffold est souvent utilisé pour poser la structure
                        des écrans mais plus rarement pour mettre en page leurs
                        contenus.</i>
                """
    )
}
