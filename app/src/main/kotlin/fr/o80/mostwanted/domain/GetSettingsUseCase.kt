package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.PreferencesRepository
import fr.o80.mostwanted.domain.model.Settings
import javax.inject.Inject

class GetSettingsUseCase  @Inject constructor(
    private val preferencesRepository: PreferencesRepository
) {
    suspend operator fun invoke() : Settings? = preferencesRepository.getSettings()
}