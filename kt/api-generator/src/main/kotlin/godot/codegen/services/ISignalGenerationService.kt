package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec

interface ISignalGenerationService {
    fun generate(maxArgumentCount: Int): FileSpec
}