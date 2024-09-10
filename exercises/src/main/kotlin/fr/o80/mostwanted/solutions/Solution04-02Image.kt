package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution0402Image(
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier.clip(CircleShape),
        painter = painterResource(avatar.drawable),
        contentDescription = "Avatar"
    )
}

@Preview
@Composable
private fun Solution0402ImagePreview() {
    PreviewTheme {
        Solution0402Image(
            avatar = Avatar.RED
        )
    }
}
