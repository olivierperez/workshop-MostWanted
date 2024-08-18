package fr.o80.mostwanted.boss.model

data class Mission(
    val title: String,
    val type: BossMissionType,
    val state: BossMissionState
)
