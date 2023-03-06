package godot.annotation.processor.processing

/**
 * Data store for inter processing round data
 */
internal data class ProcessingRoundsBlackboard(
    val alreadyGeneratedRegistrationFiles: MutableList<String> = mutableListOf()
)
