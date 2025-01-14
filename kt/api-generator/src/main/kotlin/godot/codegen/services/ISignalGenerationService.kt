package godot.codegen.services

import java.io.File

interface ISignalGenerationService {
    fun generateCore(outputDir: File)
    fun generateExtension(outputDir: File)
}
