package fr.o80.mostwanted.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import fr.o80.mostwanted.domain.model.Avatar
import fr.o80.mostwanted.domain.model.Settings
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import javax.inject.Inject

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "preferences")

class PreferencesRepository @Inject constructor(
    @ApplicationContext
    private val context: Context
) {
    private companion object {
        val FIRST_NAME = stringPreferencesKey("firstName")
        val LAST_NAME = stringPreferencesKey("lastName")
        val AVATAR = stringPreferencesKey("avatar")
    }

    suspend fun getSettings(): Settings? = context.dataStore.data
        .map { preferences ->
            if (preferences[FIRST_NAME] != null && preferences[LAST_NAME] !=
                null && preferences[AVATAR] != null) {
                Settings(
                    preferences[FIRST_NAME]!!,
                    preferences[LAST_NAME]!!,
                    Avatar.valueOf(preferences[AVATAR]!!)
                )
            } else {
                null
            }
        }.firstOrNull()

    suspend fun saveSettings(settings: Settings) {
        context.dataStore.edit { preferences ->
            preferences[FIRST_NAME] = settings.firstName
            preferences[LAST_NAME] = settings.lastName
            preferences[AVATAR] = settings.avatar.name
        }
    }
}
