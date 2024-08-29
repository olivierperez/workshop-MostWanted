package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.ExercisesRepository
import fr.o80.mostwanted.domain.model.ExerciseDef
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class ObserveExercisesListUseCase @Inject constructor(
    private val exercisesRepository: ExercisesRepository
) {
    operator fun invoke(): Flow<List<Pair<String, List<ExerciseDef>>>> = flowOf(
        exercisesRepository.listAll()
    )
}
