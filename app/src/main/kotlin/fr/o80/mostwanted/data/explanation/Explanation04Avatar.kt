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
fun ExplanationAvatarSimple() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_avatar_title_1))
        ExplanationText(stringResource(R.string.explanation_avatar_text_1))
        ExplanationText(stringResource(R.string.explanation_avatar_text_2))
        ExplanationTitle(stringResource(R.string.explanation_avatar_title_2))
        ExplanationText(stringResource(R.string.explanation_avatar_text_3))
        Code(
            """|Image(
               |    painter = painterResource(R.drawable.avatar_blue),
               |    contentDescription = "Avatar",
               |    // ...
               |)""".trimMargin()
        )
        ExplanationText(stringResource(R.string.explanation_avatar_text_4))
        ExplanationText(stringResource(R.string.explanation_avatar_text_5))
    }
}

@Composable
fun ExplanationAvatarClipped() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_avatar_clipped_title_1))
        ExplanationText(stringResource(R.string.explanation_avatar_clipped_text_1))
        ExplanationText(stringResource(R.string.explanation_avatar_clipped_text_2))
        Code("""Modifier.clip(CircleShape)""")
        ExplanationText(stringResource(R.string.explanation_avatar_clipped_text_3))
    }
}

@Composable
fun ExplanationInteractiveAvatar() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_avatar_interactive_title_1))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_1))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_2))
        ExplanationTitle(stringResource(R.string.explanation_avatar_interactive_title_2))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_3))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_4))
        Code("var corner by remember { mutableIntStateOf(0) }")
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_5))
        ExplanationTitle(stringResource(R.string.explanation_avatar_interactive_title_3))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_6))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_7))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_8))
        ExplanationTitle(stringResource(R.string.explanation_avatar_interactive_title_4))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_9))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_10))
        ExplanationText(stringResource(R.string.explanation_avatar_interactive_text_11))
    }
}

@Composable
fun ExplanationAvatarIntegration() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(stringResource(R.string.explanation_avatar_integration_text_1))
    }
}
