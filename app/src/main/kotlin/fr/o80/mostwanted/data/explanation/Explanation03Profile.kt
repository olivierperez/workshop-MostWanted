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
fun ExplanationProfileColumn() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_profile_title_1))
        ExplanationText(stringResource(R.string.explanation_profile_text_1))
        ExplanationText(stringResource(R.string.explanation_profile_text_2))
        Code("""|Column {
                |    // ...
                |}""".trimMargin())
        ExplanationText(stringResource(R.string.explanation_profile_text_3))
        ExplanationText(stringResource(R.string.explanation_profile_text_4))
        ExplanationTitle(stringResource(R.string.explanation_profile_title_2))
        ExplanationText(stringResource(R.string.explanation_profile_text_5))
        Code("horizontalAlignment = Alignment.CenterHorizontally")
        ExplanationText(stringResource(R.string.explanation_profile_text_6))
        Code("verticalArrangement = Arrangement.spacedBy(4.dp)")
        ExplanationText(stringResource(R.string.explanation_profile_text_7))
    }
}

@Composable
fun ExplanationProfileIntegration() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(stringResource(R.string.explanation_profile_integration_text_1))
        Code("""|Box(
                |    modifier = Modifier
                |        .fillMaxSize()
                |        .padding(paddingValues),
                |    contentAlignment = Alignment.Center
                |) {
                |    // ici
                |}""".trimMargin())
    }
}
