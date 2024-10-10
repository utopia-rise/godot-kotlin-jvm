package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec
import java.io.File

interface ISignalGenerationService {
    fun generate(coreDir: File, apiDir: File)
}
