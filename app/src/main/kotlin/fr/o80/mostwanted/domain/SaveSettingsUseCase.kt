package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.PreferencesRepository
import fr.o80.mostwanted.domain.model.Settings
import javax.inject.Inject

class SaveSettingsUseCase  @Inject constructor(
    private val preferencesRepository: PreferencesRepository
) {
    suspend operator fun invoke(settings: Settings) = preferencesRepository
        .saveSettings(settings = settings)
}