package godot.codegen.models.enriched

import godot.codegen.workarounds.sanitizeApiType
import godot.codegen.models.Constant
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait

class EnrichedConstant(val internal: Constant) : TypedTrait, IDocumented {
    override val type = internal.type?.sanitizeApiType() ?: "int"
    override val documentation = internal.documentation
}

fun List<Constant>.toEnriched() = map { EnrichedConstant(it) }