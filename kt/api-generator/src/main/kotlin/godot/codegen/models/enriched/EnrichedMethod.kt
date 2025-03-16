package godot.codegen.models.enriched

import godot.codegen.exceptions.TooManyMethodArgument
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Method
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.IDocumented
import godot.codegen.workarounds.sanitizeApiType
import godot.common.constants.Constraints
import godot.common.extensions.convertToCamelCase
import godot.tools.common.constants.GodotTypes

class EnrichedMethod(model: Method) : CallableTrait, IDocumented {
    val name = model.name.convertToCamelCase().let {
        if (model.isVirtual && !it.startsWith("_")) {
            "_$it"
        } else {
            it
        }
    }
    val hash = model.hash

    override val type = model.returnValue?.type?.sanitizeApiType()
    override val arguments = model.arguments?.toEnriched() ?: listOf()
    override val isVararg = model.isVararg

    val isVirtual = model.isVirtual
    val isStatic = model.isStatic

    val godotName = model.name
    override val voidPtrVariableName = "${name}Ptr"

    override val meta: String? = model.returnValue?.meta
    override val nullable = isObjectSubClass() || type == GodotTypes.variant

    override var description = model.description

    init {
        if (arguments.size > Constraints.MAX_FUNCTION_ARG_COUNT) {
            throw TooManyMethodArgument(this)
        }
    }
}

fun List<Method>.toEnriched() = map { EnrichedMethod(it) }

fun EnrichedMethod.isSameSignature(other: EnrichedMethod): Boolean {
    return name == other.name &&
        type == other.type
    arguments == other.arguments
}
