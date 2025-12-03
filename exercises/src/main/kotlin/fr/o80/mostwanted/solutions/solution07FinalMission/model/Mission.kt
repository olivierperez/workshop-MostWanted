import fr.o80.mostwanted.solutions.solution07FinalMission.model.MissionState
import fr.o80.mostwanted.solutions.solution07FinalMission.model.MissionType

data class Mission(
    val title: String,
    val type: MissionType,
    val state: MissionState
)
