package fr.o80.mostwanted.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.o80.mostwanted.PARAM_EXERCISE
import fr.o80.mostwanted.PARAM_PAGE
import fr.o80.mostwanted.domain.GetExerciseByIdUseCase
import fr.o80.mostwanted.domain.GetSettingsUseCase
import fr.o80.mostwanted.domain.MarkSketchupAsSeenUseCase
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.domain.model.Settings
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExerciseDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    getExerciseById: GetExerciseByIdUseCase,
    markSketchupAsSeen: MarkSketchupAsSeenUseCase,
    private val getSettingsUseCase: GetSettingsUseCase
) : ViewModel() {

    private val exerciseId: Int = savedStateHandle[PARAM_EXERCISE]
        ?: error("Cannot show detail without an exercise id")

    private val page: DetailPage = savedStateHandle.get<String>(PARAM_PAGE)
        ?.let { DetailPage.valueOf(it) }
        ?: DetailPage.Result

    private val _state =
        MutableStateFlow<ExerciseDetailUiState>(ExerciseDetailUiState.Loading)

    val state = _state.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ExerciseDetailUiState.Loading
    )

    init {
        markSketchupAsSeen(exerciseId)
        viewModelScope.launch {
            val settings = getSettingsUseCase()
            val exerciseDef = getExerciseById(exerciseId)

            if (settings != null && exerciseDef != null) {
                _state.update {
                    ExerciseDetailUiState.Loaded(
                        exerciseDef,
                        page,
                        settings
                    )
                }
            } else {
                _state.update {
                    ExerciseDetailUiState.Error
                }
            }
        }
    }
}

sealed interface ExerciseDetailUiState {
    data object Loading : ExerciseDetailUiState
    data object Error : ExerciseDetailUiState
    data class Loaded(
        val exerciseDef: ExerciseDef,
        val page: DetailPage,
        val settings: Settings
    ) : ExerciseDetailUiState
}

enum class DetailPage(
    val label: String,
    val index: Int
) {
    Sketchup("Maquette", 0),
    Result("Rendu", 1),
    Instruction("Fiche mission", 2),
}
