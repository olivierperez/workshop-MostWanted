package fr.o80.mostwanted.boss

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.boss.model.BossPage
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
internal fun BossNavBar(
    currentPage: BossPage,
    onPageClick: (BossPage) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier.fillMaxWidth(),
    ) {
        BossPage.entries.forEach { page ->
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
private fun BossNavBarPreview() {
    WorkshopMostWantedPreviewTheme {
        BossNavBar(
            currentPage = BossPage.MISSIONS,
            onPageClick = {}
        )
    }
}
