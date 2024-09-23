package fr.o80.mostwanted.data.explanation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.o80.mostwanted.data.Code
import fr.o80.mostwanted.data.ExplanationText
import fr.o80.mostwanted.data.ExplanationTitle

@Composable
fun ExplanationHelloWorld() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationTitle("Bienvenue")
        ExplanationText(
            """C'est votre premier jour à la CIA, une nouvelle aventure commence ici.
                        Au fur et à mesure de cet atelier vous allez rencontrer des outils que
                        Jetpack Compose met à notre disposition pour réaliser les plus belles
                        applications en Kotlin.
                """
        )
        ExplanationTitle("Jetpack Compose")
        ExplanationText(
            """Avec Jetpack Compose <b>tout est "Composable</b>" et un Composable
                        est <b>une fonction Kotlin</b> qui porte l'annotation @Composable.
                        On peut le rendre configurable à l'aide de paramètres qu'on passe lors de l'appel
                        à cette fonction.
                """
        )
        ExplanationTitle("Premier Hello World")
        ExplanationText(
            """Un des Composables les plus simples fournis par Jetpack Compose est
                        le <b>Text</b>. Pour commencer votre initiation, quoi de mieux que de faire
                        un magnifique Hello World&nbsp;? Rendez-vous dans le fichier indiqué et ajoutez-y
                        le code suivant&nbsp;:
                """
        )
        Code("Text(\"Hello World!\")")
    }
}

@Composable
fun ExplanationPreview() {
    Column(
        Modifier.fillMaxSize()
    ) {
        ExplanationText(
            """Vous l'avez peut-être remarqué, voir les modifications de votre
                    code immédiatement dans votre application n'est pas évident...
                    Vous devez relancer l'application et cela peut prendre du temps...
                """
        )
        ExplanationText(
            """La plupart du temps nous vous conseillons de d'abord développer
                    vos Composables sans sortir de l'IDE, en utilisant ce qu'on appelle
                    une <b>Preview</b>. Cela vous permettra de voir le rendu du
                    Composable seul avant de l'intégrer à un écran.
                """
        )
        ExplanationText(
            """Pour ce faire, en dessous du Composable <b>ExerciseHelloWorld</b>,
                    créez un Composable nommé ExerciseHelloWorld<b>Preview</b> et
                    annotez-le <b>@Preview</b>. Vous pouvez même le rendre <b>private</b>
                    car il n'a pas vocation à exister en dehors de ce fichier.
                """
        )
        Code("""@Preview
            |@Composable
            |private fun HelloWorldPreview() {
            |   ExerciseHelloWorld()
            |}
        """.trimMargin())
        ExplanationText(
            """Pour la suite des exercices, prenez l'habitude de créer
                vos <b>Preview</b>.
                """
        )

        ExplanationTitle("Live update")
        ExplanationText(
            """Il existe un autre mécanisme appelé <b>Live Update</b>, il permet
                    de voir en live les modifications directement dans l'application
                    tout en modifiant vos Composables.
                """
        )
        ExplanationText(
            """Bien que cet outil s'annonce prometteur il a quelques limites,
                    le Live Update ne détecte pas toutes les modifications.
                    Pour cet atelier, et pour éviter de vous embrouiller,
                    nous n'allons pas l'utiliser.
                """
        )
    }
}
