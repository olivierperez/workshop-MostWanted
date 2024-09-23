package fr.o80.mostwanted.solutions

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.internals.domain.model.Avatar

@Composable
fun Solution0401Image(
    avatar: Avatar,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier,
        painter = painterResource(avatar.drawable),
        contentDescription = "Avatar",
    )
}

@Preview
@Composable
private fun Solution0401ImagePreview() {
    PreviewTheme {
        Solution0401Image(
            avatar = Avatar.RED
        )
    }
}
