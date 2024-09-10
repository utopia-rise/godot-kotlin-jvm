package godot.codegen.models.enriched

import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.WithDefaultValueTrait
import godot.codegen.workarounds.sanitizeApiType
import godot.tools.common.constants.GodotTypes
import godot.tools.common.extensions.convertToCamelCase
import godot.tools.common.extensions.escapeKotlinReservedNames

class EnrichedArgument(val internal: Argument) : CastableTrait, NullableTrait, WithDefaultValueTrait {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    override val type = internal.type.sanitizeApiType()
    override val defaultValue = internal.defaultValue
    override val meta: String? = internal.meta
    override val nullable = isObjectSubClass() || type == GodotTypes.variant
}

fun List<Argument>.toEnriched() = map { EnrichedArgument(it) }
fun Argument.toEnriched() = EnrichedArgument(this)
