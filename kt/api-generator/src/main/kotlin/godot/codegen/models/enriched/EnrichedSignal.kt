package godot.codegen.models.enriched

import godot.codegen.exceptions.TooManySignalArgument
import godot.codegen.models.Signal
import godot.codegen.generation.task.traits.DocumentedGenerationTrait
import godot.codegen.generation.task.traits.Nature
import godot.codegen.generation.task.traits.GenerationType
import godot.codegen.generation.task.traits.HasTypeGenerationTrait
import godot.common.constants.Constraints
import godot.common.extensions.convertToCamelCase

class EnrichedSignal(model: Signal) : HasTypeGenerationTrait, DocumentedGenerationTrait {
    override val type = GenerationType("Signal${model.arguments?.size ?: 0}")
    override val nullable = false     // We assume signals parameters can't be null
    override val genericParameters = model.arguments?.map { GenerationType(it.type).getClassName() } ?: listOf()
    override var description = model.description

    val name = model.name.convertToCamelCase()

    init {
        if ((model.arguments?.size ?: 0) > Constraints.MAX_SIGNAL_ARG_COUNT) {
            throw TooManySignalArgument(model)
        }
    }
}

fun List<Signal>.toEnriched() = map { EnrichedSignal(it) }
