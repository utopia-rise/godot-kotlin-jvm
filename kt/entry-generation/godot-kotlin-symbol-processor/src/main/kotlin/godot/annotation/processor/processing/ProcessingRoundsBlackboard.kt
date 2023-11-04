package godot.annotation.processor.processing

import java.io.File

/**
 * Data store for inter processing round data
 */
internal data class ProcessingRoundsBlackboard(
    val existingRegistrationFilesMap: Map<String, File>,
    val alreadyGeneratedRegistrationFiles: MutableList<String> = mutableListOf(),
    var previousRoundHadErrors: Boolean = false,
)
