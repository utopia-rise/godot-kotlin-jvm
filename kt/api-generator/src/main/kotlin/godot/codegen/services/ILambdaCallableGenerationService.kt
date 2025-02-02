package godot.codegen.services

import java.io.File

interface ILambdaCallableGenerationService {
    fun generate(outputDir: File)
}
