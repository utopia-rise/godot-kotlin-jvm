package godot.codegen.models.traits

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

interface HasTypeGenerationTrait {
    val type: TypeGenerationTrait
    val nullable: Boolean
    val genericParameters: List<TypeName>

    fun getClassName() = type.className
    fun getTypeName() = TypeName.from(type, nullable, genericParameters)
}



