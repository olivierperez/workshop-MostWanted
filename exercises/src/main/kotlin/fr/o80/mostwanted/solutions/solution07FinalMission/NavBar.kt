import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.internals.PreviewTheme
import fr.o80.mostwanted.solutions.solution07FinalMission.model.Page

@Composable
internal fun NavBar(
    currentPage: Page,
    onPageClick: (Page) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier.fillMaxWidth(),
    ) {
        Page.entries.forEach { page ->
            NavigationBarItem(
                selected = page == currentPage,
                onClick = { onPageClick(page) },
                icon = { Icon(page.icon, contentDescription = null) },
                label = { Text(page.title) }
            )
        }
    }
}

@Preview
@Composable
private fun NavBarPreview() {
    PreviewTheme {
        NavBar(
            currentPage = Page.MISSIONS,
            onPageClick = {}
        )
    }
}
