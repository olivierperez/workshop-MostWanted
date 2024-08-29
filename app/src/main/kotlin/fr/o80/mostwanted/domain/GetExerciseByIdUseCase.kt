package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.ExercisesRepository
import fr.o80.mostwanted.domain.model.ExerciseDef
import javax.inject.Inject

class GetExerciseByIdUseCase @Inject constructor(
    private val exercisesRepository: ExercisesRepository
) {
    operator fun invoke(id: Int): ExerciseDef? {
        return exercisesRepository.listAll()
            .flatMap { (_, exercises) -> exercises }
            .firstOrNull { it.id == id }
    }
}
