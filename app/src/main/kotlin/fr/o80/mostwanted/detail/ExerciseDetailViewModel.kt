package fr.o80.mostwanted.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.o80.mostwanted.PARAM_EXERCISE
import fr.o80.mostwanted.domain.GetExerciseByIdUseCase
import fr.o80.mostwanted.domain.model.ExerciseDef
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class ExerciseDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    getExerciseById: GetExerciseByIdUseCase
) : ViewModel() {

    private val exerciseId: Int = savedStateHandle[PARAM_EXERCISE]
        ?: error("Cannot show detail without an exercise id")

    private val _state = flowOf(
        getExerciseById(exerciseId)
            ?.let { ExerciseDetailUiState.Loaded(it) }
            ?: ExerciseDetailUiState.Error
    )
    val state = _state.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ExerciseDetailUiState.Loading
    )
}

sealed interface ExerciseDetailUiState {
    object Loading : ExerciseDetailUiState
    object Error : ExerciseDetailUiState
    data class Loaded(
        val exerciseDef: ExerciseDef
    ) : ExerciseDetailUiState
}
