package fr.o80.mostwanted.component.solution

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun S02Layout() {
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        Text(
            text = "Prénom"
        )
        Text(
            text = "Nom"
        )
    }
}
