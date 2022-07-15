package godot.codegen.models.enriched

import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.escapeKotlinReservedNames
import godot.codegen.models.Signal
import godot.codegen.traits.TypedTrait

class EnrichedSignal(val internal: Signal) : TypedTrait {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    val arguments = internal.arguments?.toEnriched() ?: listOf()
    override val type = "Signal${arguments.size}"
}

fun List<Signal>.toEnriched() = map { EnrichedSignal(it) }