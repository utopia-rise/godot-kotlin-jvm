package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Method
import godot.codegen.traits.CallableTrait

class EnrichedMethod(val internal: Method, engineClassIndexName: String) : CallableTrait {
    override val arguments = internal.arguments?.toEnriched() ?: listOf()
    override val isVararg = internal.isVararg
    val name: String
    override val engineIndexName = "ENGINEMETHOD_${engineClassIndexName}_${internal.name.toUpperCase()}"

    init {
        var kotlinName = internal.name.convertToCamelCase()
        if (internal.isVirtual && !kotlinName.startsWith("_")) {
            kotlinName = "_$kotlinName"
        }
        name = kotlinName
    }

    var isGetterOrSetter = false

    override val type = internal.returnValue?.type
    override val nullable = isObjectSubClass() || getTypeClassName().className == ANY
}

fun List<Method>.toEnriched(engineClassIndexName: String) = map { EnrichedMethod(it, engineClassIndexName) }