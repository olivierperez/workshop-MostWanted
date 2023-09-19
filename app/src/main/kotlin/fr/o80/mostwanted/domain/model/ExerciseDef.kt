package fr.o80.mostwanted.domain.model

import androidx.compose.runtime.Composable

data class ExerciseDef(
    val id: Int,
    val title: String,
    val explanation: String,
    val file: String,
    val result: @Composable () -> Unit,
    val solution: @Composable () -> Unit,
)
