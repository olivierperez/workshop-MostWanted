package fr.o80.mostwanted.explanation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.o80.mostwanted.PARAM_EXERCISE
import fr.o80.mostwanted.domain.GetExerciseByIdUseCase
import fr.o80.mostwanted.domain.model.ExerciseDef
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ExplanationViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    getExerciseById: GetExerciseByIdUseCase
) : ViewModel() {

    private val exerciseId: Int = savedStateHandle[PARAM_EXERCISE]
        ?: error("Cannot show explanation without an exercise id")

    private val _event = MutableStateFlow<ExplanationEvent>(ExplanationEvent.None)
    val event = _event.asStateFlow()

    private val _state = flowOf(
        getExerciseById(exerciseId)
            ?.let { ExplanationUiState.Loaded(it) }
            ?: ExplanationUiState.Error
    )
    val state = _state.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ExplanationUiState.Loading
    )

    fun goToSketchup() {
        _event.update { ExplanationEvent.OpenSketchup(exerciseId) }
    }

    fun onEventHandled() {
        _event.update { ExplanationEvent.None }
    }
}

sealed interface ExplanationEvent {
    object None : ExplanationEvent
    class OpenSketchup(val id: Int) : ExplanationEvent
}

sealed interface ExplanationUiState {
    object Loading : ExplanationUiState
    object Error : ExplanationUiState
    data class Loaded(
        val exerciseDef: ExerciseDef
    ) : ExplanationUiState
}
