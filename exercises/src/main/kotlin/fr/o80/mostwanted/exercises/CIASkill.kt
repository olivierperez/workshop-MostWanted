package fr.o80.mostwanted.exercises

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun CIASkill(
    label: String,
    level: String,
    /// Ce paramètre est utile pour le 2nd exercice de ce chapitre
    isBest: Boolean,
    modifier: Modifier = Modifier
) {

}

@Preview
@Composable
private fun CIASkillPreview() {
    PreviewTheme {
        CIASkill(
            label = "",
            level = "",
            isBest = false
        )
    }
}
