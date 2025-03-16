package godot.codegen.services


import java.io.File

interface IApiGenerationService {
    fun generateCore(outputDir: File)
    fun generateApi(outputDir: File)
    fun generateEngineRegistration(outputDir: File)
}

