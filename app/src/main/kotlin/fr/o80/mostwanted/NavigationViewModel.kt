package fr.o80.mostwanted

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.o80.mostwanted.domain.GetSettingsUseCase
import fr.o80.mostwanted.domain.model.Settings
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NavigationViewModel @Inject constructor(
    private val getSettingsUseCase: GetSettingsUseCase
) : ViewModel() {

    private val _settings = MutableStateFlow<Settings?>(null)

    val settings = _settings.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = null
    )

    init {
        viewModelScope.launch {
            val settings = getSettingsUseCase()
            _settings.update {
                settings
            }
        }
    }
}
