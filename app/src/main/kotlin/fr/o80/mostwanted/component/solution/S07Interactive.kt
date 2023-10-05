package fr.o80.mostwanted.component.solution

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.R
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun S07Interactive(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        var applySepia by remember { mutableStateOf(true) }

        Image(
            painter = painterResource(R.drawable.avatar),
            contentDescription = "Most Wanted Avatar",
            modifier = Modifier
                .clip(CircleShape)
                .drawWithContent {
                    drawContent()
                    if (applySepia) {
                        drawRect(
                            color = Color(0xFF79613C),
                            blendMode = BlendMode.Color
                        )
                    }
                }
                .clickable { applySepia = !applySepia }
        )
        PersonName("Olivier", "GCC", "PEREZ")
    }
}

@Composable
private fun PersonName(
    firstName: String,
    middleName: String,
    lastName: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = firstName)
        Text(text = middleName)
        Text(text = lastName)
    }
}

@Preview
@Composable
private fun S07InteractivePreview() {
    WorkshopMostWantedPreviewTheme {
        S07Interactive()
    }
}
