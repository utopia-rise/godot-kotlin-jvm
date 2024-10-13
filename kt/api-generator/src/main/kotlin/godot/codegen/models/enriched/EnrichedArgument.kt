package godot.codegen.models.enriched

import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.WithDefaultValueTrait
import godot.codegen.workarounds.sanitizeApiType
import godot.tools.common.constants.GodotTypes
import godot.common.extensions.convertToCamelCase
import godot.common.extensions.escapeKotlinReservedNames

class EnrichedArgument(val internal: Argument, canBeNull: Boolean) : CastableTrait, NullableTrait, WithDefaultValueTrait {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    override val type = internal.type.sanitizeApiType()
    override val defaultValue = internal.defaultValue
    override val meta: String? = internal.meta
    override var nullable = (isObjectSubClass() || type == GodotTypes.variant) && canBeNull
}

fun List<Argument>.toEnriched(canBeNull: Boolean = true) = map { EnrichedArgument(it, canBeNull) }
fun Argument.toEnriched(canBeNull: Boolean = true) = EnrichedArgument(this, canBeNull)
