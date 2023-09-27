package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.ExercisesRepository
import javax.inject.Inject

class MarkSketchupAsSeenUseCase @Inject constructor(
    private val exercisesRepository: ExercisesRepository
) {
    operator fun invoke(id: Int) {
        exercisesRepository.addSketchupToSeenList(id)
    }
}
