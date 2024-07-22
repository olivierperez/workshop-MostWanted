package fr.o80.mostwanted.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.o80.mostwanted.domain.SaveSettingsUseCase
import fr.o80.mostwanted.domain.model.Avatar
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val saveSettingsUseCase: SaveSettingsUseCase
) : ViewModel() {

    private val _event = MutableStateFlow(HomeEvent.NONE)
    val event = _event.asStateFlow()

    fun saveSettings(firstName: String, lastName: String, avatar: Avatar) {
        viewModelScope.launch {
            saveSettingsUseCase(firstName, lastName, avatar)
            _event.update { HomeEvent.GO_TO_EXERCISES }
        }
    }
}

enum class HomeEvent {
    NONE,
    GO_TO_EXERCISES
}
