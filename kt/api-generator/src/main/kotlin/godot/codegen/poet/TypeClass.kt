package godot.codegen.poet

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName

class TypeClass(val className: ClassName) {
    constructor(pack: String, name: String) : this(ClassName(pack, name))
    constructor(pack: String, names: List<String>) : this(ClassName(pack, names))

    var typeName: TypeName = className
        private set

    fun parameterizedBy(vararg typeParameters: TypeName): TypeClass {
        typeName = className.parameterizedBy(*typeParameters)
        return this
    }

    fun setNullable(): TypeClass {
        typeName = typeName.copy(nullable = true)
        return this
    }
}
