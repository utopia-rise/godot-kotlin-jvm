package godot.codegen.models.enriched

import godot.codegen.models.NativeStructure
import godot.codegen.traits.TypedTrait

class EnrichedNativeStructure(val internal: NativeStructure) : TypedTrait {
    override val type = internal.name
}

fun List<NativeStructure>.toEnriched() = map { EnrichedNativeStructure(it) }
fun NativeStructure.toEnriched() = EnrichedNativeStructure(this)