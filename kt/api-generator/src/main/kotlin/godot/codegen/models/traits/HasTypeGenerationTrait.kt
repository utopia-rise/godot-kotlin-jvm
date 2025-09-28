package godot.codegen.models.traits

import com.squareup.kotlinpoet.TypeName

interface HasTypeGenerationTrait {
    val type: TypeGenerationTrait
    val genericParameters: List<TypeName>

    fun getClassName() = type.className
    fun getTypeName() = TypeName.from(type, genericParameters)
}



