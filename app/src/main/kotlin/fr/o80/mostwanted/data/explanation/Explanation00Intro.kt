package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import fr.o80.mostwanted.R
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationIntro() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(stringResource(R.string.explanation_intro_text_1))
        ExplanationTitle(stringResource(R.string.explanation_intro_title_1))
        ExplanationText(stringResource(R.string.explanation_intro_text_2))
    }
}
