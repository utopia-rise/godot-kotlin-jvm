package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec
import java.io.File

interface ILambdaCallableGenerationService {
    fun generate(coreDir: File, apiDir: File)
}
