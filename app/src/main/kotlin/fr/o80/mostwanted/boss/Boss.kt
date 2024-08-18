package fr.o80.mostwanted.boss

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.o80.mostwanted.boss.model.BossPage
import fr.o80.mostwanted.ui.theme.WorkshopMostWantedPreviewTheme

@Composable
fun Boss(
    modifier: Modifier = Modifier
) {
    var currentPage by rememberSaveable { mutableStateOf(BossPage.BADGE) }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            BossHeader()
        },
        bottomBar = {
            BossNavBar(
                currentPage = currentPage,
                onPageClick = { pageClicked -> currentPage = pageClicked }
            )
        }
    ) { paddingValues ->
        BossMissions(
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Preview
@Composable
private fun BossPreview() {
    WorkshopMostWantedPreviewTheme {
        Boss()
    }
}
