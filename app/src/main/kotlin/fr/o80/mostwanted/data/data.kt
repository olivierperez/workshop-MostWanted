package fr.o80.mostwanted.data

import androidx.compose.material3.Text
import fr.o80.mostwanted.component.solution.S01HelloWorld
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.exercise.E01HelloWorld

val exercises = listOf(
    ExerciseDef(
        id = 0,
        title = "Première étape",
        explanation = "À la CIA comme partout on commence toujours par un HelloWorld! " +
            "Avec Jetpack Compose tout est \"Composable\", pour créer votre premier Composable " +
            "<code>rendez-vous</code> dans le fichier indiqué." +
            "<br/><br/><b>Text(\"Hello World!\")</b><br/><br/>" +
            "fera l'affaire.",
        file = "E01HelloWorld.kt",
        result = { E01HelloWorld() },
        solution = { S01HelloWorld() }
    ),
    ExerciseDef(
        id = 1,
        title = "Deuxième truc à faire",
        explanation = "",
        file = "Fichier_2.kt",
        result = {},
        solution = { Text(text = "Maquette non-implémentée !") }
    ),
    ExerciseDef(
        id = 2,
        title = "Le fameux",
        explanation = "",
        file = "Fichier_3.kt",
        result = {},
        solution = { Text(text = "Maquette non-implémentée !") }
    ),
    ExerciseDef(
        id = 3,
        title = "Jamais 304",
        explanation = "",
        file = "Fichier_4.kt",
        result = {},
        solution = { Text(text = "Maquette non-implémentée !") }
    ),
)
