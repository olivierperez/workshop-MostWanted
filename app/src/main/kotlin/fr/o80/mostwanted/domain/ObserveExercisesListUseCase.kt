package fr.o80.mostwanted.domain

import fr.o80.mostwanted.data.ExercisesRepository
import fr.o80.mostwanted.data.PreferencesRepository
import fr.o80.mostwanted.data.intro
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.domain.model.Settings
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

typealias Chapter = Pair<String, List<ExerciseDef>>

class ObserveExercisesListUseCase @Inject constructor(
    private val exercisesRepository: ExercisesRepository,
    private val preferencesRepository: PreferencesRepository
) {
    operator fun invoke(): Flow<List<Chapter>> = flow {

        val settings = preferencesRepository.getSettings()
        if (settings.isExaminer) {
            emit(getIntroChapter() + exercisesRepository.listAll())
        } else {
            emit(exercisesRepository.listAll())
        }
    }

    private fun getIntroChapter(): Chapter = Pair("Examinateurs", listOf(intro))
}

private operator fun Chapter.plus(remaining: List<Chapter>): List<Chapter> = buildList {
    add(this@plus)
    addAll(remaining)
}

private val Settings?.isExaminer: Boolean
    get() {
        if (this == null) return false

        val fullName = "$firstName $lastName"
        return fullName.equals("audrey gentili", true) ||
            fullName.equals("olivier perez", true)
    }
