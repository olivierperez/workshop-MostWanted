package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.PreferencesRepository
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.Settings
import javax.inject.Inject

class SaveSettingsUseCase @Inject constructor(
    private val preferencesRepository: PreferencesRepository
) {
    suspend operator fun invoke(firstName: String, lastName: String, avatar: Avatar) =
        preferencesRepository
            .saveSettings(
                settings = Settings(
                    firstName = firstName.trim(),
                    lastName = lastName.trim(),
                    avatar = avatar
                )
            )
}
