package godot.codegen.models.enriched

import godot.codegen.exceptions.TooManyMethodArgument
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.models.Method
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.IDocumented
import godot.codegen.workarounds.sanitizeApiType
import godot.common.constants.Constraints
import godot.tools.common.constants.GodotTypes
import godot.common.extensions.convertToCamelCase

class EnrichedMethod(val internal: Method) : CallableTrait, IDocumented {
    override val arguments = internal.arguments?.toEnriched() ?: listOf()
    override val isVararg = internal.isVararg
    val name: String
    override val voidPtrVariableName: String

    init {
        var kotlinName = internal.name.convertToCamelCase()
        if (internal.isVirtual && !kotlinName.startsWith("_")) {
            kotlinName = "_$kotlinName"
        }

        name = kotlinName
        voidPtrVariableName = "${name}Ptr"
        if (arguments.size > Constraints.MAX_FUNCTION_ARG_COUNT) {
            throw TooManyMethodArgument(this)
        }
    }

    override val type = internal.returnValue?.type?.sanitizeApiType()
    override val meta: String? = internal.returnValue?.meta
    override val nullable = isObjectSubClass() || type == GodotTypes.variant
    override val description = internal.description
}

fun List<Method>.toEnriched() = map { EnrichedMethod(it) }

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
