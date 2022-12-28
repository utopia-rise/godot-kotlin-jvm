package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.extensions.sanitizeApiType
import godot.codegen.models.Argument
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

    override val type = internal.returnValue?.type?.sanitizeApiType()
    override val nullable = isObjectSubClass() || getTypeClassName().className == ANY
}

fun List<Method>.toEnriched(engineClassIndexName: String) = map { EnrichedMethod(it, engineClassIndexName) }

fun EnrichedMethod.isSameSignature(other: EnrichedMethod): Boolean {
    val otherInternal = other.internal
    val otherArguments = otherInternal.arguments
    val selfArguments = internal.arguments
    val areArgumentsSame = (selfArguments == null && otherArguments == null) ||
        selfArguments?.mapIndexed { index: Int, argument: Argument ->
            argument.name == (otherArguments?.get(index)?.name ?: false) &&
                argument.type == (otherArguments?.get(index)?.type ?: false) &&
                argument.meta == (otherArguments?.get(index)?.meta ?: false)
        }?.all { it } ?: false
    return internal.name == other.name &&
        internal.isVirtual == otherInternal.isVirtual &&
        internal.isStatic == otherInternal.isStatic &&
        internal.isVararg == otherInternal.isVararg &&
        internal.isConst == otherInternal.isConst &&
        internal.returnType == otherInternal.returnType &&
        internal.returnValue == otherInternal.returnValue &&
        areArgumentsSame
}
