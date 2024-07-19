package fr.o80.mostwanted.domain.model

import fr.o80.mostwanted.R

data class Settings(
    val firstName: String,
    val lastName: String,
    val avatar: String
)

enum class Avatar(val drawable: Int) {
    RED(drawable = R.drawable.avatar_red),
    BLUE(drawable = R.drawable.avatar_blue),
    ORANGE(drawable = R.drawable.avatar_orange)
}
