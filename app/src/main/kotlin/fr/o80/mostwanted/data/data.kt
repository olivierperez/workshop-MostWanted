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
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.exercises.E01HelloWorld
import fr.o80.mostwanted.exercises.E02Layout
import fr.o80.mostwanted.exercises.E03Screen
import fr.o80.mostwanted.exercises.E04Preview
import fr.o80.mostwanted.exercises.E05to08Image
import fr.o80.mostwanted.exercises.E10to11TwoScreens
import fr.o80.mostwanted.solutions.S03Screen
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

val exercises = listOf(
    ExerciseDef(
        id = 1,
        title = "Première étape",
        explanation = { Explanation01() },
        file = "E01HelloWorld.kt",
        result = { E01HelloWorld() },
        solution = { Solution01HelloWorld() }
    ),
    ExerciseDef(
        id = 2,
        title = "Jouer sur la mise en page",
        explanation = { Explanation02() },
        file = "E02Layout.kt",
        result = { E02Layout() },
        solution = { Solution02Layout() }
    ),
    ExerciseDef(
        id = 3,
        title = "Créer un écran structuré",
        explanation = { Explanation03() },
        file = "E03Screen.kt",
        result = { E03Screen() },
        solution = { S03Screen() }
    ),
    ExerciseDef(
        id = 4,
        title = "Le système de Preview",
        explanation = { Explanation04() },
        file = "E04Preview.kt",
        result = { E04Preview() },
        solution = { Solution04Preview() }
    ),
    ExerciseDef(
        id = 5,
        title = "Gestion des images",
        explanation = { Explanation05() },
        file = "E05to08Image.kt",
        result = { E05to08Image() },
        solution = { Solution05Image() }
    ),
    ExerciseDef(
        id = 6,
        title = "Clip image",
        explanation = { Explanation06() },
        file = "E05to08Image.kt",
        result = { E05to08Image() },
        solution = { Solution06ClipCircle() }
    ),
    ExerciseDef(
        id = 7,
        title = "Interaction utilisateur",
        explanation = { Explanation07() },
        file = "E05to08Image.kt",
        result = { E05to08Image() },
        solution = { Solution07Interactive() }
    ),
    ExerciseDef(
        id = 8,
        title = "Animation",
        explanation = { Explanation08() },
        file = "E05to08Image.kt",
        result = { E05to08Image() },
        solution = { Solution08Animation() }
    ),
    ExerciseDef(
        id = 9,
        title = "Preview",
        explanation = { Explanation09() },
        file = "S09Image.kt",
        result = { Solution09UsePreview() },
        solution = { Solution09Complex() }
    ),
    ExerciseDef(
        id = 10,
        title = "Two screens",
        explanation = { Explanation10() },
        file = "E10to11TwoScreens.kt",
        result = { E10to11TwoScreens() },
        solution = { Solution10TwoScreens() }
    ),
    ExerciseDef(
        id = 11,
        title = "Animation navigation",
        explanation = { Explanation11() },
        file = "E10to11TwoScreens.kt",
        result = { E10to11TwoScreens() },
        solution = { Solution11AnimationNavigation() }
    ),
)

@Composable
fun ExplanationText(text: String) {
    Text(
        text = Html
            .fromHtml(
                text.replace("\\s+".toRegex(), " "),
                Html.FROM_HTML_MODE_COMPACT
            )
            .toAnnotatedString(),
        modifier = Modifier.padding(vertical = 8.dp)
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
                    strokeWidth = 4f
                )
            }
            .padding(start = 8.dp)
            .padding(vertical = 4.dp),
        style = MaterialTheme.typography.bodyMedium
    )
}
