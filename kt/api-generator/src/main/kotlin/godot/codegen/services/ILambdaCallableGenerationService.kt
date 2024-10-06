package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec

interface ILambdaCallableGenerationService {
    fun generate(maxArgumentCount: Int): FileSpec
}
