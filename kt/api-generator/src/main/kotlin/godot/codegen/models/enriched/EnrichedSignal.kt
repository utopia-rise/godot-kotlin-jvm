package godot.codegen.models.enriched

import godot.codegen.exceptions.TooManySignalArgument
import godot.tools.common.extensions.convertToCamelCase
import godot.tools.common.extensions.escapeKotlinReservedNames
import godot.codegen.models.Signal
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.tools.common.constants.Constraints

class EnrichedSignal(val internal: Signal) : TypedTrait, IDocumented {
    val name = internal.name.convertToCamelCase().escapeKotlinReservedNames()
    val arguments = internal.arguments?.toEnriched() ?: listOf()
    override val type = "Signal${arguments.size}"
    override val documentation = internal.documentation

    init{
        if (arguments.size > Constraints.MAX_SIGNAL_ARG_COUNT) {
            throw TooManySignalArgument(this)
        }
    }
}

fun List<Signal>.toEnriched() = map { EnrichedSignal(it) }
