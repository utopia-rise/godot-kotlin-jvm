package godot.codegen.poet

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName

class ClassTypeNameWrapper private constructor(
    val className: ClassName,
    typeName: TypeName
) {
    var typeName: TypeName = typeName
        private set

    constructor(className: ClassName) : this(className, className)

    fun parameterizedBy(vararg typeParameters: TypeName): ClassTypeNameWrapper {
        typeName = className.parameterizedBy(*typeParameters)
        return this
    }

    fun modify(
        nullable: Boolean = typeName.isNullable,
        annotations: List<AnnotationSpec> = typeName.annotations.toList()
    ): ClassTypeNameWrapper {
        typeName = typeName.copy(nullable, annotations)
        return this
    }
}