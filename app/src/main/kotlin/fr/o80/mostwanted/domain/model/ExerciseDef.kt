package fr.o80.mostwanted.domain.model

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable

data class ExerciseDef(
    val id: Int,
    @StringRes val title: Int,
    val file: String,
    val explanation: @Composable () -> Unit,
    val result: @Composable () -> Unit,
    val solution: @Composable (Settings) -> Unit,
)
