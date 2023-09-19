package fr.o80.mostwanted.component

import android.text.Html
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import fr.o80.mostwanted.component.atom.toAnnotatedString

@Composable
fun Explanation(
    html: String,
    modifier: Modifier = Modifier
) {
    if (LocalInspectionMode.current) {
        Text(text = html, modifier = modifier)
        return
    }
    Text(
        text = Html
            .fromHtml(html, Html.FROM_HTML_MODE_COMPACT)
            .toAnnotatedString(),
        modifier = modifier
    )
}
