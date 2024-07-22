package fr.o80.mostwanted.internals.domain.model

import fr.o80.mostwanted.exercises.R

enum class Avatar(val drawable: Int) {
    RED(drawable = R.drawable.avatar_red),
    BLUE(drawable = R.drawable.avatar_blue),
    ORANGE(drawable = R.drawable.avatar_orange)
}
