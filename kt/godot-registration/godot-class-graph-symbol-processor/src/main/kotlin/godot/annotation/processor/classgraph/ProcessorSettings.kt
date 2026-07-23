package godot.annotation.processor.classgraph

import java.io.File

/** Inputs the symbol processor needs while scanning compiled user code into the registration model. */
enum class AnnotationProcessingMode {
    Explicit,
    Inferred,
    Automatic,
}

data class ProcessorSettings(
    val projectName: String,
    val godotProjectDirectory: File,
    val userSourceRoots: Set<File>,
    val userCodeClassPathRoots: Set<File>,
    val annotationProcessingMode: AnnotationProcessingMode,
)
