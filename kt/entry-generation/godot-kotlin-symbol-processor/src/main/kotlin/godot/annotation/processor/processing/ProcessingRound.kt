package godot.annotation.processor.processing

/**
 * Current processing round indicator. Mainly used for human-readable form of process round count
 */
internal enum class ProcessingRound {
    GENERATE_REGISTRARS_FOR_THIS_PROJECT_AND_REGISTRATION_FILES_FOR_DEPENDENCIES,
    GENERATE_REGISTRATION_FILES_FOR_REGISTRARS,
    UPDATE_REGISTRATION_FILES
}
