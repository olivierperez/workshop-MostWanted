package fr.o80.mostwanted.internals.domain.model

import org.jetbrains.compose.resources.DrawableResource
import workshop_mostwanted_desktop.composeapp.generated.resources.Res
import workshop_mostwanted_desktop.composeapp.generated.resources.avatar_blue
import workshop_mostwanted_desktop.composeapp.generated.resources.avatar_orange
import workshop_mostwanted_desktop.composeapp.generated.resources.avatar_red

enum class Avatar(val drawable: DrawableResource) {
    RED(drawable = Res.drawable.avatar_red),
    BLUE(drawable = Res.drawable.avatar_blue),
    ORANGE(drawable = Res.drawable.avatar_orange)
}
