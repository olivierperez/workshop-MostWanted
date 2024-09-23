package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationProfileColumn() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Mise en page")
        ExplanationText(
            """Mais qui êtes-vous&nbsp;? Cette information devrait être présente
                        sur votre badge. Disons qu'il serait bien vu d'avoir une photo
                        ainsi que votre prénom et nom.
                """
        )
        ExplanationText(
            """Plus simple que le Scaffold, nous allons utiliser ici la <b>Column</b>.
                        Sans grande surprise, ce composable affiche ses 
                        enfants en colonne, les uns sous les autres.
                """
        )
        Code("""|Column {
                |    // ...
                |}""".trimMargin())
        ExplanationText(
            """Pour commencer, n'affichez pas une image mais simplement
                        le mot "Image".
                """
        )
        ExplanationText(
            """Sur une premier ligne, affichez donc le mot "Image"
                        puis, sur une seconde, affichez votre prénom et votre 
                        nom.
                """
        )
        ExplanationTitle("Alignement")
        ExplanationText(
            """Comme toujours, par défaut les composables vont chercher à s'aligner à gauche.
                        Pour les aligner au centre, la <b>Column</b> propose un paramètre
                        <b>horizontalAlignment</b>.
                """
        )
        Code("horizontalAlignment = Alignment.CenterHorizontally")
        ExplanationText(
            """Pour jouer sur leur positionnement vertical, la Column propose un autre
                        paramètre&nbsp;: <b>verticalArrangement</b>. Ici nous voulons simplement
                        laisser un peu d'espace entre chacun de ses enfants, 4dp devraient
                        être suffisants.
                """
        )
        Code("verticalArrangement = Arrangement.spacedBy(4.dp)")
        ExplanationText(
            """Note&nbsp;:<i>La Row propose les paramètres inverses :
                        verticalAlignment et horizontalArrangement.</i>
                """
        )
    }
}

@Composable
fun ExplanationProfileIntegration() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Votre profil est prêt à être intégré à votre badge. Remplacez simplement
                        l'ancien "Hello World!" par le composable <b>CIAProfile()</b> que
                        vous venez de coder.
                """
        )
        Code("""|Box(
                |    modifier = Modifier
                |        .fillMaxSize()
                |        .padding(paddingValues),
                |    contentAlignment = Alignment.Center
                |) {
                |    // ici
                |}""".trimMargin())
    }
}
