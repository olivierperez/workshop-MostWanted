package fr.o80.mostwanted.exercises

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.o80.mostwanted.domain.HasSeenSketchupUseCase
import fr.o80.mostwanted.domain.ObserveExercisesListUseCase
import fr.o80.mostwanted.domain.model.ExerciseDef
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ExercisesListViewModel @Inject constructor(
    observeExercisesList: ObserveExercisesListUseCase,
    private val hasSeenSketchup: HasSeenSketchupUseCase
) : ViewModel() {

    private val _event = MutableStateFlow<ExercisesListEvent>(ExercisesListEvent.None)
    val event = _event.asStateFlow()

    private val _state = observeExercisesList()
        .map { ExercisesListUiState(it.toImmutableList()) }

    val state: StateFlow<ExercisesListUiState> = _state.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ExercisesListUiState.start()
    )

    fun onExerciseSelect(exerciseDef: ExerciseDef) {
        if (hasSeenSketchup(exerciseDef.id)) {
            _event.update { ExercisesListEvent.OpenResult(exerciseDef.id) }
        } else {
            _event.update { ExercisesListEvent.OpenExplanation(exerciseDef.id) }
        }
    }

    fun onEventHandled() {
        _event.update { ExercisesListEvent.None }
    }
}

sealed interface ExercisesListEvent {
    object None : ExercisesListEvent
    class OpenExplanation(val id: Int) : ExercisesListEvent
    class OpenResult(val id: Int) : ExercisesListEvent
}

data class ExercisesListUiState(
    val exerciseDefs: ImmutableList<ExerciseDef>
) {
    companion object {
        fun start(): ExercisesListUiState {
            return ExercisesListUiState(
                exerciseDefs = persistentListOf()
            )
        }
    }
}
