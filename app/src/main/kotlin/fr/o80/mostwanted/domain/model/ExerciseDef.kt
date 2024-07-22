package fr.o80.mostwanted.domain.model

import androidx.compose.runtime.Composable

data class ExerciseDef(
    val id: Int,
    val title: String,
    val file: String,
    val explanation: @Composable () -> Unit,
    val result: @Composable () -> Unit,
    val solution: @Composable (Settings) -> Unit,
)
