package fr.o80.mostwanted.component.solution

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun S02Layout() {
    Row {
        Text(
            text = "Prénom"
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Text(
            text = "Nom"
        )
    }
}
