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
fun ExplanationSkillItem() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_skill_title_1))
        ExplanationText(stringResource(R.string.explanation_skill_text_1))
        ExplanationText(stringResource(R.string.explanation_skill_text_2))
        ExplanationText(stringResource(R.string.explanation_skill_text_3))

        ExplanationTitle(stringResource(R.string.explanation_skill_title_2))
        ExplanationText(stringResource(R.string.explanation_skill_text_4))
        ExplanationText(stringResource(R.string.explanation_skill_text_5))
        Code(
            """@Composable
            |fun UnComposable(
            |    unNom: String,
            |    modifier: Modifier = Modifier
            |) {
            |   Text(
            |       text = unNom,
            |       modifier = modifier
            |   )
            |}
            """.trimMargin()
        )

        ExplanationTitle(stringResource(R.string.explanation_skill_title_3))
        ExplanationText(stringResource(R.string.explanation_skill_text_6))
        Code(
            """|R.drawable.skill
                |
                |Row / Column
            |fillMaxWidth / padding
            |verticalAlignment
            |horizontalArrangement
            |verticalArrangement
            """.trimMargin()
        )
    }
}

@Composable
fun ExplanationSkillIcon() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_skill_icon_title_1))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_1))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_2))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_3))
        Code(
            """@Composable
            |Icon(
            |   imageVector = Icons.Default.Star,
            |   // ...
            |)
            """.trimMargin()
        )
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_4))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_5))

        ExplanationTitle(stringResource(R.string.explanation_skill_icon_title_2))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_6))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_7))
        ExplanationText(stringResource(R.string.explanation_skill_icon_text_8))
    }
}

@Composable
fun ExplanationSkillsIntegration() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_1))
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_2))
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_3))
        ExplanationTitle(stringResource(R.string.explanation_skills_integration_title_1))
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_4))
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_5))
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_6))
        Code(
            """LazyColumn(...) {
            |   item { Text("Hello"") }
            |   item { Text("World!"") }
            |)
            """.trimMargin()
        )
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_7))
        ExplanationTitle(stringResource(R.string.explanation_skills_integration_title_2))
        ExplanationText(stringResource(R.string.explanation_skills_integration_text_8))
    }
}
