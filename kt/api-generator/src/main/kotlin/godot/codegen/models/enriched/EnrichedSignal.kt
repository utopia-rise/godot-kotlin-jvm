package godot.codegen.models.enriched

import godot.codegen.exceptions.TooManySignalArgument
import godot.codegen.models.Signal
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.common.constants.Constraints
import godot.common.extensions.convertToCamelCase

class EnrichedSignal(model: Signal) : TypedTrait, IDocumented {
    val name = model.name.convertToCamelCase()

    // We assume signals parameters can't be null
    val arguments = model.arguments?.toEnriched(false) ?: listOf()
    override val type = "Signal${arguments.size}"
    override var description = model.description

    init {
        if (arguments.size > Constraints.MAX_SIGNAL_ARG_COUNT) {
            throw TooManySignalArgument(this)
        }
    }
}

fun List<Signal>.toEnriched() = map { EnrichedSignal(it) }
