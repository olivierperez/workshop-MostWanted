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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.o80.mostwanted.component.atom.toAnnotatedString
import fr.o80.mostwanted.data.explanation.Explanation01
import fr.o80.mostwanted.data.explanation.Explanation02
import fr.o80.mostwanted.data.explanation.Explanation03
import fr.o80.mostwanted.data.explanation.Explanation05
import fr.o80.mostwanted.data.explanation.Explanation06
import fr.o80.mostwanted.data.explanation.Explanation07
import fr.o80.mostwanted.data.explanation.Explanation10
import fr.o80.mostwanted.data.explanation.Explanation11
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.exercises.CIABadge
import fr.o80.mostwanted.exercises.CIAIdentity
import fr.o80.mostwanted.exercises.CIAImage
import fr.o80.mostwanted.exercises.CIAProfile
import fr.o80.mostwanted.exercises.CIASkill
import fr.o80.mostwanted.exercises.ExerciseHelloWorld
import fr.o80.mostwanted.exercises.ExerciseNavigation
import fr.o80.mostwanted.solutions.Solution01HelloWorld
import fr.o80.mostwanted.solutions.Solution0201Scaffold
import fr.o80.mostwanted.solutions.Solution0202Scaffold
import fr.o80.mostwanted.solutions.Solution0203Scaffold
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
import fr.o80.mostwanted.internals.domain.model.Avatar as AvatarFromExercises

val exercises = listOf(
    ExerciseDef(
        id = 1,
        title = "Hello World!",
        explanation = { Explanation01() },
        file = "ExerciseHelloWorld.kt",
        result = { ExerciseHelloWorld() },
        solution = { Solution01HelloWorld() }
    ),
    ExerciseDef(
        id = 2,
        title = "Badge Layout",
        explanation = { Explanation02() },
        file = "CIAIdentity.kt",
        result = { CIAIdentity() },
        solution = { Solution0201Scaffold() }
    ),
    ExerciseDef(
        id = 3,
        title = "Badge Content",
        explanation = { Explanation02() },
        file = "CIAIdentity.kt",
        result = { CIAIdentity() },
        solution = { Solution0202Scaffold() }
    ),
    ExerciseDef(
        id = 4,
        title = "Styling",
        explanation = { Explanation02() },
        file = "CIAIdentity.kt",
        result = { CIAIdentity() },
        solution = { Solution0203Scaffold() }
    ),
    ExerciseDef(
        id = 5,
        title = "Profile Layout",
        explanation = { Explanation02() },
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
        title = "Add Profile to Identity",
        explanation = { Explanation03() },
        file = "CIAIdentity.kt",
        result = { CIAIdentity() },
        solution = { settings ->
            Solution0302Profile(
                settings.firstName,
                settings.lastName
            )
        }
    ),
    ExerciseDef(
        id = 7,
        title = "Avatar Image",
        explanation = { Explanation05() },
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
        title = "Avatar Clip",
        explanation = { Explanation06() },
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
        title = "Interactive Avatar",
        explanation = { Explanation07() },
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
        title = "Add Avatar to Identity",
        explanation = { Explanation10() },
        file = "CIAIdentity.kt",
        result = { CIAIdentity() },
        solution = { settings ->
            Solution0404Image(
                settings.firstName,
                settings.lastName,
                settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 11,
        title = "Agent Skill",
        explanation = { Explanation10() },
        file = "CIASkill.kt",
        result = { CIASkill() },
        solution = { Solution0501Skill() }
    ),
    ExerciseDef(
        id = 12,
        title = "Best Skill",
        explanation = { Explanation10() },
        file = "CIASkill.kt",
        result = { CIASkill() },
        solution = { Solution0502Skill() }
    ),
    ExerciseDef(
        id = 13,
        title = "Add Skill to Identity",
        explanation = { Explanation10() },
        file = "CIAIdentity.kt",
        result = { CIAIdentity() },
        solution = { settings ->
            Solution0503Skill(
                settings.firstName,
                settings.lastName,
                settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 14,
        title = "Navigation Bar",
        explanation = { Explanation11() },
        file = "ExerciseNavigation.kt",
        result = { ExerciseNavigation() },
        solution = { Solution0601NavigationBar() }
    ),
    ExerciseDef(
        id = 15,
        title = "Two sided Badge",
        explanation = { Explanation11() },
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
        modifier = Modifier.padding(12.dp),
        color = Color.Blue,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
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
