package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec

interface IKtCallableGenerationService {
    fun generate(maxArgumentCount: Int): FileSpec
}