package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution0403Image(
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    var corner by remember { mutableIntStateOf(0) }

    Image(
        modifier = modifier
            .clip(RoundedCornerShape(corner))
            .clickable { corner = 50 - corner },
        painter = painterResource(avatar.drawable),
        contentDescription = "Avatar"
    )
}

@Preview
@Composable
private fun Solution0403ImagePreview() {
    PreviewTheme {
        Solution0403Image(
            avatar = Avatar.RED
        )
    }
}
