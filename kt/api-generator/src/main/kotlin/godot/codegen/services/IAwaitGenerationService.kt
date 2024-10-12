package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec
import java.io.File

interface IAwaitGenerationService {
    fun generate(output: File)
}
