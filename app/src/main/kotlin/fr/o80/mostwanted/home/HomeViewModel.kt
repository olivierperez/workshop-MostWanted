package fr.o80.mostwanted.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.o80.mostwanted.domain.SaveSettingsUseCase
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.Settings
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val saveSettingsUseCase: SaveSettingsUseCase
) : ViewModel() {
    fun saveSettings(firstName: String, lastName: String, avatar: Avatar) {
        val settings = Settings(
            firstName,
            lastName,
            avatar.name
        )
        viewModelScope.launch {
            saveSettingsUseCase(settings)
        }
    }
}
