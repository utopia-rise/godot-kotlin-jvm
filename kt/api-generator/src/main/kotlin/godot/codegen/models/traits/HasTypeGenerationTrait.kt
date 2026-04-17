package godot.codegen.models.traits

import com.squareup.kotlinpoet.TypeName

interface HasTypeGenerationTrait {
    val type: TypeGenerationTrait
    val genericParameters: List<TypeName>
    val nullable: Boolean
        get() = type.isNullable()

    fun getClassName(): TypeName = type.className
    fun getTypeName() = TypeName.from(type, genericParameters, nullable)
}



