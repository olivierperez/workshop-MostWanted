package fr.o80.mostwanted.exercises

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.component.ExerciseCard
import fr.o80.mostwanted.component.ScreenTitle
import fr.o80.mostwanted.data.exercises
import fr.o80.mostwanted.domain.model.ExerciseDef
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toPersistentList

@Composable
fun ExercisesListScreen(
    exerciseDefs: ImmutableList<ExerciseDef>,
    onExerciseSelect: (ExerciseDef) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            ScreenTitle(
                title = "Most\nWanted",
                modifier = Modifier.fillMaxWidth()
            )
        }
        items(exerciseDefs) { exercise ->
            ExerciseCard(
                title = exercise.title,
                onClick = { onExerciseSelect(exercise) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun ExercisesListScreenPreview() {
    WorkshopMostWantedPreviewTheme {
        ExercisesListScreen(
            exerciseDefs = exercises.toPersistentList(),
            onExerciseSelect = {}
        )
    }
}
