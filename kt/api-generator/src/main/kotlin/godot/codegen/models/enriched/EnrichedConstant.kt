package godot.codegen.models.enriched

import godot.codegen.workarounds.sanitizeApiType
import godot.codegen.models.Constant
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait

class EnrichedConstant(model: Constant) : TypedTrait, IDocumented {
    override val type = model.type?.sanitizeApiType() ?: "int"
    val name = model.name
    val value = model.value
    override val description = model.description
}

fun List<Constant>.toEnriched() = map { EnrichedConstant(it) }
