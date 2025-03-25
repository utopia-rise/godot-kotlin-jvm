package godot.codegen.services


import java.io.File

interface IApiGenerationService {
    fun generateApi(coreDir: File, apiDir: File)
}

