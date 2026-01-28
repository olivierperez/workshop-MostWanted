package fr.o80.mostwanted.data

import android.text.Html
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.R
import fr.o80.mostwanted.component.atom.toAnnotatedString
import fr.o80.mostwanted.data.explanation.ExplanationAvatarClipped
import fr.o80.mostwanted.data.explanation.ExplanationAvatarIntegration
import fr.o80.mostwanted.data.explanation.ExplanationAvatarSimple
import fr.o80.mostwanted.data.explanation.ExplanationHelloWorld
import fr.o80.mostwanted.data.explanation.ExplanationInteractiveAvatar
import fr.o80.mostwanted.data.explanation.ExplanationIntro
import fr.o80.mostwanted.data.explanation.ExplanationMissionsList
import fr.o80.mostwanted.data.explanation.ExplanationNavigationBar
import fr.o80.mostwanted.data.explanation.ExplanationPreview
import fr.o80.mostwanted.data.explanation.ExplanationProfileColumn
import fr.o80.mostwanted.data.explanation.ExplanationProfileIntegration
import fr.o80.mostwanted.data.explanation.ExplanationScaffoldBadgeLayout
import fr.o80.mostwanted.data.explanation.ExplanationScaffoldStyling
import fr.o80.mostwanted.data.explanation.ExplanationSkillIcon
import fr.o80.mostwanted.data.explanation.ExplanationSkillItem
import fr.o80.mostwanted.data.explanation.ExplanationSkillsIntegration
import fr.o80.mostwanted.data.explanation.ExplanationTwoSides
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.domain.Chapter
import fr.o80.mostwanted.exercises.CIABadge
import fr.o80.mostwanted.exercises.CIAIdentity
import fr.o80.mostwanted.exercises.CIAImage
import fr.o80.mostwanted.exercises.CIAProfile
import fr.o80.mostwanted.exercises.CIASkill
import fr.o80.mostwanted.exercises.ExerciseHelloWorld
import fr.o80.mostwanted.exercises.ExerciseIntro
import fr.o80.mostwanted.exercises.ExerciseNavigation
import fr.o80.mostwanted.internals.UsePreviewInIDE
import fr.o80.mostwanted.solutions.Solution01HelloWorld
import fr.o80.mostwanted.solutions.Solution0201Scaffold
import fr.o80.mostwanted.solutions.Solution0202Scaffold
import fr.o80.mostwanted.solutions.Solution0301Profile
import fr.o80.mostwanted.solutions.Solution0302Profile
import fr.o80.mostwanted.solutions.Solution0401Image
import fr.o80.mostwanted.solutions.Solution0402Image
import fr.o80.mostwanted.solutions.Solution0403Image
import fr.o80.mostwanted.solutions.Solution0404Image
import fr.o80.mostwanted.solutions.Solution0501Skill
import fr.o80.mostwanted.solutions.Solution0502Skill
import fr.o80.mostwanted.solutions.Solution0503Skill
import fr.o80.mostwanted.solutions.Solution0601NavigationBar
import fr.o80.mostwanted.solutions.Solution0602NavigationBar
import fr.o80.mostwanted.solutions.SolutionIntro
import fr.o80.mostwanted.solutions.solution07FinalMission.Solution07FinalMission
import fr.o80.mostwanted.internals.domain.model.Avatar as AvatarFromExercises

val intro = ExerciseDef(
    id = -1,
    title = R.string.exercise_intro_title,
    explanation = { ExplanationIntro() },
    file = "ExerciseIntro.kt",
    result = { ExerciseIntro() },
    solution = { SolutionIntro() }
)

val exercises: List<Chapter> = listOf(
    R.string.chapter_before_you_start to listOf(
        ExerciseDef(
            id = 1,
            title = R.string.exercise_hello_world_title,
            explanation = { ExplanationHelloWorld() },
            file = "ExerciseHelloWorld.kt",
            result = { ExerciseHelloWorld() },
            solution = { Solution01HelloWorld() }
        ),
        ExerciseDef(
            id = 2,
            title = R.string.exercise_live_preview_title,
            explanation = { ExplanationPreview() },
            file = "ExerciseHelloWorld.kt",
            result = { UsePreviewInIDE() },
            solution = { UsePreviewInIDE() }
        )
    ),
    R.string.chapter_set_the_scene to listOf(
        ExerciseDef(
            id = 3,
            title = R.string.exercise_layout_title,
            explanation = { ExplanationScaffoldBadgeLayout() },
            file = "CIAIdentity.kt",
            result = { CIAIdentity() },
            solution = { Solution0201Scaffold() }
        ),
        ExerciseDef(
            id = 4,
            title = R.string.exercise_styling_title,
            explanation = { ExplanationScaffoldStyling() },
            file = "CIAIdentity.kt",
            result = { CIAIdentity() },
            solution = { Solution0202Scaffold() }
        )
    ),
    R.string.chapter_profile to listOf(
        ExerciseDef(
            id = 5,
            title = R.string.exercise_layout_title,
            explanation = { ExplanationProfileColumn() },
            file = "CIAProfile.kt",
            result = { CIAProfile() },
            solution = { settings ->
                Solution0301Profile(
                    settings.firstName,
                    settings.lastName
                )
            }
        ),
        ExerciseDef(
            id = 6,
            title = R.string.exercise_profile_integration_title,
            explanation = { ExplanationProfileIntegration() },
            file = "CIAIdentity.kt",
            result = { CIAIdentity() },
            solution = { settings ->
                Solution0302Profile(
                    settings.firstName,
                    settings.lastName
                )
            }
        )
    ),
    R.string.chapter_avatar to listOf(
        ExerciseDef(
            id = 7,
            title = R.string.exercise_avatar_title,
            explanation = { ExplanationAvatarSimple() },
            file = "CIAImage.kt",
            result = { CIAImage() },
            solution = { settings ->
                Solution0401Image(
                    settings.avatar.toExercise()
                )
            }
        ),
        ExerciseDef(
            id = 8,
            title = R.string.exercise_avatar_clipping_title,
            explanation = { ExplanationAvatarClipped() },
            file = "CIAImage.kt",
            result = { CIAImage() },
            solution = { settings ->
                Solution0402Image(
                    settings.avatar.toExercise()
                )
            }
        ),
        ExerciseDef(
            id = 9,
            title = R.string.exercise_user_interaction_title,
            explanation = { ExplanationInteractiveAvatar() },
            file = "CIAImage.kt",
            result = { CIAImage() },
            solution = { settings ->
                Solution0403Image(
                    settings.avatar.toExercise()
                )
            }
        ),
        ExerciseDef(
            id = 10,
            title = R.string.exercise_avatar_integration_title,
            explanation = { ExplanationAvatarIntegration() },
            file = "CIAProfile.kt",
            result = { CIAIdentity() },
            solution = { settings ->
                Solution0404Image(
                    settings.firstName,
                    settings.lastName,
                    settings.avatar.toExercise()
                )
            }
        )
    ),
    R.string.chapter_skills to listOf(
        ExerciseDef(
            id = 11,
            title = R.string.exercise_layout_title,
            explanation = { ExplanationSkillItem() },
            file = "CIASkill.kt",
            result = {
                CIASkill(
                    label = "Special Agent",
                    level = "Expert",
                    isBest = false
                )
            },
            solution = { Solution0501Skill() }
        ),
        ExerciseDef(
            id = 12,
            title = R.string.exercise_main_skill_title,
            explanation = { ExplanationSkillIcon() },
            file = "CIASkill.kt",
            result = {
                CIASkill(
                    label = "Special Agent",
                    level = "Expert",
                    isBest = true
                )
            },
            solution = { Solution0502Skill() }
        ),
        ExerciseDef(
            id = 13,
            title = R.string.exercise_skills_integration_title,
            explanation = { ExplanationSkillsIntegration() },
            file = "CIAIdentity.kt",
            result = { CIAIdentity() },
            solution = { settings ->
                Solution0503Skill(
                    settings.firstName,
                    settings.lastName,
                    settings.avatar.toExercise()
                )
            }
        )
    ),
    R.string.chapter_back_side to listOf(
        ExerciseDef(
            id = 14,
            title = R.string.exercise_navigation_bar_title,
            explanation = { ExplanationNavigationBar() },
            file = "ExerciseNavigation.kt",
            result = { ExerciseNavigation() },
            solution = { Solution0601NavigationBar() }
        ),
        ExerciseDef(
            id = 15,
            title = R.string.exercise_front_back_title,
            explanation = { ExplanationTwoSides() },
            file = "CIABadge.kt",
            result = { CIABadge() },
            solution = { settings ->
                Solution0602NavigationBar(
                    settings.firstName,
                    settings.lastName,
                    settings.avatar.toExercise()
                )
            }
        ),
        ExerciseDef(
            id = 16,
            title = R.string.exercise_final_mission_title,
            explanation = { ExplanationMissionsList() },
            file = "CIABadge.kt",
            result = { CIABadge() },
            solution = { settings ->
                Solution07FinalMission(
                    settings.firstName,
                    settings.lastName,
                    settings.avatar.toExercise()
                )
            }
        )
    ),
)

private fun Avatar.toExercise(): AvatarFromExercises = when (this) {
    Avatar.RED -> AvatarFromExercises.RED
    Avatar.BLUE -> AvatarFromExercises.BLUE
    Avatar.ORANGE -> AvatarFromExercises.ORANGE
}

@Composable
fun ExplanationTitle(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(top = 16.dp),
        color = MaterialTheme.colorScheme.primary,
        style = MaterialTheme.typography.titleMedium
    )
}

@Composable
fun ExplanationText(text: String) {
    Text(
        text = Html.fromHtml(
            text.replace("\\s+".toRegex(), " "), Html.FROM_HTML_MODE_COMPACT
        ).toAnnotatedString(), modifier = Modifier.padding(vertical = 4.dp)
    )
}

@Composable
fun Code(code: String) {
    Text(text = code,
        modifier = Modifier
            .drawBehind {
                drawLine(
                    color = Color.Gray,
                    start = Offset(0f, 0f),
                    end = Offset(0f, size.height),
                    strokeWidth = 8f
                )
            }
            .padding(start = 8.dp)
            .padding(vertical = 4.dp),
        style = MaterialTheme.typography.bodyMedium)
}
