package fr.o80.mostwanted.data

import fr.o80.mostwanted.domain.model.ExerciseDef
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExercisesRepository @Inject constructor(
    private val exercisesDataStore: ExercisesDataStore
) {

    fun listAll(): List<ExerciseDef> = exercises

    fun listSeenSketchups(): List<Int> = exercisesDataStore.listSeenSketchups()

    fun addSketchupToSeenList(id: Int) {
        exercisesDataStore.addSketchupToSeenList(id)
    }
}
