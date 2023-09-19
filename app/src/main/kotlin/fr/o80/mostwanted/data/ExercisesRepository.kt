package fr.o80.mostwanted.data

import fr.o80.mostwanted.domain.model.ExerciseDef
import javax.inject.Inject

class ExercisesRepository @Inject constructor() {
    fun listAll(): List<ExerciseDef> = exercises
}
