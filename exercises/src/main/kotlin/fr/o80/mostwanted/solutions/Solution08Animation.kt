package fr.o80.mostwanted.solutions

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.o80.mostwanted.exercises.R
import fr.o80.mostwanted.internals.PreviewTheme

@Composable
fun Solution08Animation(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var activate by remember { mutableStateOf(false) }
        val corner by animateIntAsState(
            targetValue = if (activate) 0 else 50,
            label = "Image rounding"
        )

        ClickMyPictureText(
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Image(
            painter = painterResource(R.drawable.avatar),
            contentDescription = "Most Wanted Avatar",
            modifier = Modifier
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(corner))
                .clickable { activate = !activate }
        )
        AnimatedVisibility(
            visible = activate,
            label = "Name visibility",
            enter = fadeIn() + expandIn(expandFrom = Alignment.Center),
            exit = fadeOut() + shrinkOut(shrinkTowards = Alignment.Center),
        ) {
            PersonName("Olivier", "Gnu", "PEREZ")
        }
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

@Composable
private fun ClickMyPictureText(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Icon(Icons.Default.KeyboardArrowDown, contentDescription = null)
        Text(text = "Click my picture")
        Icon(Icons.Default.KeyboardArrowDown, contentDescription = null)
    }
}

@Preview
@Composable
private fun Solution08AnimationPreview() {
    PreviewTheme {
        Solution07Interactive()
    }
}
