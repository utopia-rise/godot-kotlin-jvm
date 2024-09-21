package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec

interface IAwaitGenerationService {
    fun generate(maxArgumentCount: Int): FileSpec
}
