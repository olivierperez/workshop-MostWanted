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
fun ExplanationNavigationBar() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_navigation_title_1))
        ExplanationText(stringResource(R.string.explanation_navigation_text_1))
        ExplanationText(stringResource(R.string.explanation_navigation_text_2))
        ExplanationTitle(stringResource(R.string.explanation_navigation_title_2))
        ExplanationText(stringResource(R.string.explanation_navigation_text_3))
        ExplanationText(stringResource(R.string.explanation_navigation_text_4))
        ExplanationTitle(stringResource(R.string.explanation_navigation_title_3))
        Code("""var currentPage by rememberSaveable { mutableIntStateOf(0) }""")
        ExplanationText(stringResource(R.string.explanation_navigation_text_5))
        ExplanationText(stringResource(R.string.explanation_navigation_text_6))
        ExplanationTitle(stringResource(R.string.explanation_navigation_title_4))
        ExplanationText(stringResource(R.string.explanation_navigation_text_7))
        ExplanationText(stringResource(R.string.explanation_navigation_text_8))
    }
}

@Composable
fun ExplanationTwoSides() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle(stringResource(R.string.explanation_two_sides_title_1))
        ExplanationText(stringResource(R.string.explanation_two_sides_text_1))
        ExplanationText(stringResource(R.string.explanation_two_sides_text_2))

        ExplanationTitle(stringResource(R.string.explanation_two_sides_title_2))
        ExplanationText(stringResource(R.string.explanation_two_sides_text_3))
        Code(
            "AnimatedContent(\n" +
                    "            targetState = currentPage,\n" +
                    "            label = \"Main-page\",\n" +
                    "            modifier = Modifier\n" +
                    "                .fillMaxSize()\n" +
                    "                .padding(paddingValues),\n" +
                    "            transitionSpec = {\n" +
                    "                fadeIn(animationSpec = tween(220, delayMillis = 90))\n" +
                    "                    .togetherWith(fadeOut(tween(90)))\n" +
                    "            }\n" +
                    "        ) { page ->\n" +
                    "            // ...\n" +
                    "        }"
        )
        ExplanationText(stringResource(R.string.explanation_two_sides_text_4))
    }
}
