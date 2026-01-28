package fr.o80.mostwanted.data.explanation

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import fr.o80.mostwanted.R
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationScaffoldBadgeLayout() {
    ExplanationTitle(stringResource(R.string.explanation_scaffold_title_1))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_1))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_2))
    ExplanationTitle(stringResource(R.string.explanation_scaffold_title_2))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_3))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_4))
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
           |}""".trimMargin()
    )
    ExplanationTitle(stringResource(R.string.explanation_scaffold_title_3))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_5))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_6))
    ExplanationTitle(stringResource(R.string.explanation_scaffold_title_4))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_7))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_8))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_9))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_10))
    ExplanationText(stringResource(R.string.explanation_scaffold_text_11))
    Code(
        """|Scaffold(
                   |    ...
                   |) { paddingValues ->
                   |    Text(
                   |        modifier = Modifier.padding(paddingValues),
                   |        text = "Hello World!"
                   |    )
                   |}""".trimMargin()
    )
    ExplanationText(stringResource(R.string.explanation_scaffold_text_12))
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
                    <b>paddingValues</b>, mais à la <b>Box</b>.
                """
    )
    Code(
        """|Scaffold(
           |    ...
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
    ExplanationTitle(stringResource(R.string.explanation_scaffold_styling_title_2))
    ExplanationText(stringResource(R.string.explanation_scaffold_styling_text_4))
    ExplanationText(stringResource(R.string.explanation_scaffold_styling_text_5))
    Code(
        """Modifier.padding(4.dp)"""
    )
    ExplanationText(stringResource(R.string.explanation_scaffold_styling_text_6))
}
