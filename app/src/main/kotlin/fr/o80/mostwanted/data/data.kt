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
import fr.o80.mostwanted.data.explanation.Explanation04
import fr.o80.mostwanted.data.explanation.Explanation05
import fr.o80.mostwanted.data.explanation.Explanation06
import fr.o80.mostwanted.data.explanation.Explanation07
import fr.o80.mostwanted.data.explanation.Explanation08
import fr.o80.mostwanted.data.explanation.Explanation09
import fr.o80.mostwanted.data.explanation.Explanation10
import fr.o80.mostwanted.data.explanation.Explanation11
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.exercises.Exercise01HelloWorld
import fr.o80.mostwanted.exercises.Exercise02Layout
import fr.o80.mostwanted.exercises.Exercise03Screen
import fr.o80.mostwanted.exercises.Exercise04Preview
import fr.o80.mostwanted.exercises.Exercise05to08Image
import fr.o80.mostwanted.exercises.Exercise10to11TwoScreens
import fr.o80.mostwanted.solutions.Solution03Screen
import fr.o80.mostwanted.solutions.Solution01HelloWorld
import fr.o80.mostwanted.solutions.Solution02Layout
import fr.o80.mostwanted.solutions.Solution04Preview
import fr.o80.mostwanted.solutions.Solution05Image
import fr.o80.mostwanted.solutions.Solution06ClipCircle
import fr.o80.mostwanted.solutions.Solution07Interactive
import fr.o80.mostwanted.solutions.Solution08Animation
import fr.o80.mostwanted.solutions.Solution09Complex
import fr.o80.mostwanted.solutions.Solution09UsePreview
import fr.o80.mostwanted.solutions.Solution10TwoScreens
import fr.o80.mostwanted.solutions.Solution11AnimationNavigation
import fr.o80.mostwanted.internals.domain.model.Avatar as AvatarFromExercises

val exercises = listOf(
    ExerciseDef(
        id = 1,
        title = "Mission n°1",
        explanation = { Explanation01() },
        file = "Exercise01HelloWorld.kt",
        result = { Exercise01HelloWorld() },
        solution = { Solution01HelloWorld() }
    ),
    ExerciseDef(
        id = 2,
        title = "Mission n°2",
        explanation = { Explanation02() },
        file = "Exercise02Layout.kt",
        result = { Exercise02Layout() },
        solution = { settings -> Solution02Layout(settings.firstName, settings.lastName) }
    ),
    ExerciseDef(
        id = 3,
        title = "Mission n°3",
        explanation = { Explanation03() },
        file = "Exercise03Screen.kt",
        result = { Exercise03Screen() },
        solution = { settings -> Solution03Screen(settings.firstName, settings.lastName) }
    ),
    ExerciseDef(
        id = 4,
        title = "Mission n°4",
        explanation = { Explanation04() },
        file = "Exercise04Preview.kt",
        result = { Exercise04Preview() },
        solution = { Solution04Preview() }
    ),
    ExerciseDef(
        id = 5,
        title = "Mission n°5",
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
        title = "Mission n°6",
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
        title = "Mission n°7",
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
        title = "Mission n°8",
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
        title = "Mission n°9",
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
        title = "Mission n°10",
        explanation = { Explanation10() },
        file = "Exercise10to11TwoScreens.kt",
        result = { Exercise10to11TwoScreens() },
        solution = { Solution10TwoScreens() }
    ),
    ExerciseDef(
        id = 11,
        title = "Mission n°11",
        explanation = { Explanation11() },
        file = "Exercise10to11TwoScreens.kt",
        result = { Exercise10to11TwoScreens() },
        solution = { Solution11AnimationNavigation() }
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
        text = Html
            .fromHtml(
                text.replace("\\s+".toRegex(), " "),
                Html.FROM_HTML_MODE_COMPACT
            )
            .toAnnotatedString(),
        modifier = Modifier.padding(vertical = 4.dp)
    )
}

@Composable
fun Code(code: String) {
    Text(
        text = code,
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
        style = MaterialTheme.typography.bodyMedium
    )
}
