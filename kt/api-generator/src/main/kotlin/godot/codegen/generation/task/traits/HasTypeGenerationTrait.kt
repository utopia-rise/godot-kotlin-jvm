package godot.codegen.generation.task.traits

import com.squareup.kotlinpoet.ClassName

interface HasTypeGenerationTrait {
    val type: TypeGenerationTrait
    val nullable: Boolean
    val genericParameters: List<ClassName>

    fun getClassName() = type.getClassName()
    fun getTypeName() = type.getTypeName(nullable, genericParameters)
}



