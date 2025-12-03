package fr.o80.mostwanted.data

import android.content.Context
import androidx.core.content.edit
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

private const val KEY_SEEN = "seen"

class ExercisesDataStore @Inject constructor(
    @param:ApplicationContext
    private val context: Context
) {

    private val sharedPref = context.getSharedPreferences("exercises.prefs", Context.MODE_PRIVATE)

    fun listSeenSketchups(): List<Int> {
        return sharedPref.getString(KEY_SEEN, null)
            ?.split(",")
            ?.map { it.toInt() }
            ?: emptyList()
    }

    fun addSketchupToSeenList(id: Int) {
        val seen = sharedPref.getString(KEY_SEEN, null)
        sharedPref.edit {
            if (seen.isNullOrBlank()) {
                putString(KEY_SEEN, id.toString())
            } else {
                putString(KEY_SEEN, "$seen,$id")
            }
            commit()
        }
    }
}
