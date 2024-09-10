package godot.codegen.models.enriched

import godot.codegen.exceptions.TooManySignalArgument
import godot.codegen.models.Signal
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.tools.common.constants.Constraints
import godot.tools.common.extensions.convertToCamelCase
import godot.tools.common.extensions.escapeKotlinReservedNames

class EnrichedSignal(val internal: Signal) : TypedTrait, IDocumented {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    // We assume signals parameters can't be null
    val arguments = internal.arguments?.toEnriched(false) ?: listOf()
    override val type = "Signal${arguments.size}"
    override val description = internal.description

    init{
        if (arguments.size > Constraints.MAX_SIGNAL_ARG_COUNT) {
            throw TooManySignalArgument(this)
        }
    }
}

fun List<Signal>.toEnriched() = map { EnrichedSignal(it) }
