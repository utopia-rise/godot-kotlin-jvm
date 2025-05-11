package godot.codegen.services

import java.io.File

interface ICallableGenerationService {
    fun generate(outputDir: File)
}
