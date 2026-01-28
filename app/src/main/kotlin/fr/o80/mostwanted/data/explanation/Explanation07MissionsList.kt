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
fun ExplanationMissionsList() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_missions_title_1))
        ExplanationText(stringResource(R.string.explanation_missions_text_1))
        ExplanationText(stringResource(R.string.explanation_missions_text_2))
        ExplanationText(stringResource(R.string.explanation_missions_text_3))
        ExplanationText(stringResource(R.string.explanation_missions_text_4))
        ExplanationTitle(stringResource(R.string.explanation_missions_title_2))
    }
}
