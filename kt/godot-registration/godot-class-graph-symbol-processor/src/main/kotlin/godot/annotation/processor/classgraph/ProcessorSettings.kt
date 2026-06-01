package godot.annotation.processor.classgraph

import java.io.File

/** Inputs the symbol processor needs while scanning compiled user code into the registration model. */
data class ProcessorSettings(
    val projectName: String,
    val userCodeClassPathRoots: Set<File>,
)
