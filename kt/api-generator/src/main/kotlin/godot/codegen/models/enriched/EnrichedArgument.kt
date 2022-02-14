package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.escapeKotlinReservedNames
import godot.codegen.extensions.getTypeClassName
import godot.codegen.models.Argument
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait
import godot.codegen.traits.WithDefaultValueTrait

class EnrichedArgument(val internal: Argument) : TypedTrait, NullableTrait, WithDefaultValueTrait {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    override val nullable = if (internal.defaultValue == "null") {
        true
    } else {
        getTypeClassName().className == ANY
    }

    override val type = internal.type
    override val defaultValue = internal.defaultValue
}

fun List<Argument>.toEnriched() = map { EnrichedArgument(it) }