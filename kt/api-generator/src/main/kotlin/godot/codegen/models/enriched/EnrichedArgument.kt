package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.tools.common.extensions.convertToCamelCase
import godot.tools.common.extensions.escapeKotlinReservedNames
import godot.codegen.extensions.getTypeClassName
import godot.codegen.workarounds.sanitizeApiType
import godot.codegen.models.Argument
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.WithDefaultValueTrait
import godot.tools.common.constants.GodotTypes

class EnrichedArgument(val internal: Argument) : CastableTrait, NullableTrait, WithDefaultValueTrait {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    override val type = internal.type.sanitizeApiType()
    override val defaultValue = internal.defaultValue
    override val meta: String? = internal.meta
    override val nullable = internal.defaultValue == "null" || type == GodotTypes.variant
}

fun List<Argument>.toEnriched() = map { EnrichedArgument(it) }
fun Argument.toEnriched() = EnrichedArgument(this)
