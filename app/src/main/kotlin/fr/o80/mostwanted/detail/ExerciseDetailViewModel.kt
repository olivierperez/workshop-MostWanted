package fr.o80.mostwanted.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.o80.mostwanted.PARAM_EXERCISE
import fr.o80.mostwanted.PARAM_PAGE
import fr.o80.mostwanted.detail.component.page.DetailPage
import fr.o80.mostwanted.domain.GetExerciseByIdUseCase
import fr.o80.mostwanted.domain.MarkSketchupAsSeenUseCase
import fr.o80.mostwanted.domain.model.ExerciseDef
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class ExerciseDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    getExerciseById: GetExerciseByIdUseCase,
    markSketchupAsSeen: MarkSketchupAsSeenUseCase
) : ViewModel() {

    private val exerciseId: Int = savedStateHandle[PARAM_EXERCISE]
        ?: error("Cannot show detail without an exercise id")

    private val page: DetailPage = savedStateHandle.get<String>(PARAM_PAGE)
        ?.let { DetailPage.valueOf(it) }
        ?: DetailPage.Result

    private val _state = flowOf(
        getExerciseById(exerciseId)
            ?.let { exerciseDef -> ExerciseDetailUiState.Loaded(exerciseDef, page) }
            ?: ExerciseDetailUiState.Error
    )
    val state = _state.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ExerciseDetailUiState.Loading
    )

    init {
        markSketchupAsSeen(exerciseId)
    }
}

sealed interface ExerciseDetailUiState {
    object Loading : ExerciseDetailUiState
    object Error : ExerciseDetailUiState
    data class Loaded(
        val exerciseDef: ExerciseDef,
        val page: DetailPage
    ) : ExerciseDetailUiState
}
