package godot.codegen.services

import java.io.File

interface ISignalGenerationService {
    fun generate(outputDir: File)
}
