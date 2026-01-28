package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import fr.o80.mostwanted.R
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationHelloWorld() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_hello_world_title_1))
        ExplanationText(stringResource(R.string.explanation_hello_world_text_1))
        ExplanationTitle(stringResource(R.string.explanation_hello_world_title_2))
        ExplanationText(stringResource(R.string.explanation_hello_world_text_2))
        ExplanationTitle(stringResource(R.string.explanation_hello_world_title_3))
        ExplanationText(stringResource(R.string.explanation_hello_world_text_3))
        Code("Text(\"Hello World!\")")
    }
}

@Composable
fun ExplanationPreview() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_preview_title_1))
        ExplanationText(stringResource(R.string.explanation_preview_text_1))
        ExplanationText(stringResource(R.string.explanation_preview_text_2))
        ExplanationText(stringResource(R.string.explanation_preview_text_3))
        Code(
            """@Preview
            |@Composable
            |private fun HelloWorldPreview() {
            |   ExerciseHelloWorld()
            |}
        """.trimMargin()
        )
        ExplanationTitle(stringResource(R.string.explanation_preview_title_2))
        ExplanationText(stringResource(R.string.explanation_preview_text_4))
        ExplanationTitle(stringResource(R.string.explanation_preview_title_3))
        ExplanationText(stringResource(R.string.explanation_preview_text_5))
        ExplanationText(stringResource(R.string.explanation_preview_text_6))
    }
}
