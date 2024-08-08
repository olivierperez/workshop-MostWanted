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
import fr.o80.mostwanted.exercises.Exercise01HelloWorld
import fr.o80.mostwanted.exercises.Exercise10to11TwoScreens
import fr.o80.mostwanted.exercises.ExerciseImage
import fr.o80.mostwanted.exercises.ExerciseMain
import fr.o80.mostwanted.exercises.ExerciseProfile
import fr.o80.mostwanted.exercises.ExerciseSkill
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
import fr.o80.mostwanted.solutions.Solution11AnimationNavigation
import fr.o80.mostwanted.internals.domain.model.Avatar as AvatarFromExercises

val exercises = listOf(
    ExerciseDef(id = 1,
        title = "Hello World!",
        explanation = { Explanation01() },
        file = "Exercise01HelloWorld.kt",
        result = { Exercise01HelloWorld() },
        solution = { Solution01HelloWorld() }),
    ExerciseDef(id = 2,
        title = "Scaffold 01",
        explanation = { Explanation02() },
        file = "ExerciseMain.kt",
        result = { ExerciseMain() },
        solution = { Solution0201Scaffold() }),
    ExerciseDef(id = 3,
        title = "Scaffold 02",
        explanation = { Explanation02() },
        file = "ExerciseMain.kt",
        result = { ExerciseMain() },
        solution = { Solution0202Scaffold() }),
    ExerciseDef(id = 4,
        title = "Scaffold 03",
        explanation = { Explanation02() },
        file = "ExerciseMain.kt",
        result = { ExerciseMain() },
        solution = { Solution0203Scaffold() }),
    ExerciseDef(id = 5,
        title = "Profile 01",
        explanation = { Explanation02() },
        file = "ExerciseProfile.kt",
        result = { ExerciseProfile() },
        solution = { settings ->
            Solution0301Profile(
                settings.firstName,
                settings.lastName
            )
        }),
    ExerciseDef(id = 6,
        title = "Profile 02",
        explanation = { Explanation03() },
        file = "ExerciseMain.kt",
        result = { ExerciseMain() },
        solution = { settings ->
            Solution0302Profile(
                settings.firstName,
                settings.lastName
            )
        }),
    ExerciseDef(id = 7,
        title = "Image 01",
        explanation = { Explanation05() },
        file = "ExerciseImage.kt",
        result = { ExerciseImage() },
        solution = { settings ->
            Solution0401Image(settings.avatar.toExercise())
        }),
    ExerciseDef(id = 8,
        title = "Image 02",
        explanation = { Explanation06() },
        file = "ExerciseImage.kt",
        result = { ExerciseImage() },
        solution = { settings ->
            Solution0402Image(settings.avatar.toExercise())
        }),
    ExerciseDef(id = 9,
        title = "Image 03",
        explanation = { Explanation07() },
        file = "ExerciseImage.kt",
        result = { ExerciseImage() },
        solution = { settings ->
            Solution0403Image(settings.avatar.toExercise())
        }),
    ExerciseDef(id = 10,
        title = "Image 04",
        explanation = { Explanation10() },
        file = "ExerciseMain.kt",
        result = { ExerciseMain() },
        solution = { settings ->
            Solution0404Image(
                settings.firstName,
                settings.lastName,
                settings.avatar.toExercise()
            )
        }),
    ExerciseDef(id = 11,
        title = "Skill 01",
        explanation = { Explanation10() },
        file = "ExerciseSkill.kt",
        result = { ExerciseSkill() },
        solution = { Solution0501Skill() }),
    ExerciseDef(id = 12,
        title = "Skill 01",
        explanation = { Explanation10() },
        file = "ExerciseSkill.kt",
        result = { ExerciseSkill() },
        solution = { Solution0502Skill() }),
    ExerciseDef(id = 13,
        title = "Skill 01",
        explanation = { Explanation10() },
        file = "ExerciseMain.kt",
        result = { ExerciseMain() },
        solution = { settings ->
            Solution0503Skill(
                settings.firstName,
                settings.lastName,
                settings.avatar.toExercise()
            )
        }),
    ExerciseDef(id = 11,
        title = "Animation navigation",
        explanation = { Explanation11() },
        file = "Exercise10to11TwoScreens.kt",
        result = { Exercise10to11TwoScreens() },
        solution = { Solution11AnimationNavigation() }),
)

/*val exercises = listOf(
    ExerciseDef(
        id = 1,
        title = "\uD83D\uDE80 Mission n°1",
        explanation = { Explanation01() },
        file = "Exercise01HelloWorld.kt",
        result = { Exercise01HelloWorld() },
        solution = { Solution01HelloWorld() }
    ),
    ExerciseDef(
        id = 2,
        title = "\uD83E\uDEAA Mission n°2",
        explanation = { Explanation02() },
        file = "Exercise02Layout.kt",
        result = { Exercise02Layout() },
        solution = { settings -> Solution02Layout(settings.firstName, settings.lastName) }
    ),
    ExerciseDef(
        id = 3,
        title = "\uD83C\uDFD7\uFE0F Mission n°3",
        explanation = { Explanation03() },
        file = "Exercise03Screen.kt",
        result = { Exercise03Screen() },
        solution = { settings -> Solution03Screen(settings.firstName, settings.lastName) }
    ),
    ExerciseDef(
        id = 4,
        title = "\uD83D\uDD0E Mission n°4",
        explanation = { Explanation04() },
        file = "Exercise04Preview.kt",
        result = { Exercise04Preview() },
        solution = { Solution04Preview() }
    ),
    ExerciseDef(
        id = 5,
        title = "\uD83D\uDDBC\uFE0F Mission n°5",
        explanation = { Explanation05() },
        file = "Exercise05to08Image.kt",
        result = { Exercise05to08Image() },
        solution = { settings ->
            Solution05Image(
                firstName = settings.firstName,
                lastName = settings.lastName,
                avatar = settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 6,
        title = "✂\uFE0F Mission n°6",
        explanation = { Explanation06() },
        file = "Exercise05to08Image.kt",
        result = { Exercise05to08Image() },
        solution = { settings ->
            Solution06ClipCircle(
                firstName = settings.firstName,
                lastName = settings.lastName,
                avatar = settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 7,
        title = "\uD83D\uDC46 Mission n°7",
        explanation = { Explanation07() },
        file = "Exercise05to08Image.kt",
        result = { Exercise05to08Image() },
        solution = { settings ->
            Solution07Interactive(
                firstName = settings.firstName,
                lastName = settings.lastName,
                avatar = settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 8,
        title = "\uD83C\uDF17 Mission n°8",
        explanation = { Explanation08() },
        file = "Exercise05to08Image.kt",
        result = { Exercise05to08Image() },
        solution = { settings ->
            Solution08Animation(
                firstName = settings.firstName,
                lastName = settings.lastName,
                avatar = settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 9,
        title = "\uD83E\uDE82 Mission n°9",
        explanation = { Explanation09() },
        file = "Exercise09Image.kt",
        result = { Solution09UsePreview() },
        solution = { settings ->
            Solution09Complex(
                firstName = settings.firstName,
                lastName = settings.lastName,
                avatar = settings.avatar.toExercise()
            )
        }
    ),
    ExerciseDef(
        id = 10,
        title = "\uD83D\uDDFA\uFE0F Mission n°10",
        explanation = { Explanation10() },
        file = "Exercise10to11TwoScreens.kt",
        result = { Exercise10to11TwoScreens() },
        solution = { Solution10TwoScreens() }
    ),
    ExerciseDef(
        id = 11,
        title = "\uD83C\uDFC1 Mission n°11",
        explanation = { Explanation11() },
        file = "Exercise10to11TwoScreens.kt",
        result = { Exercise10to11TwoScreens() },
        solution = { Solution11AnimationNavigation() }
    ),
)*/

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
