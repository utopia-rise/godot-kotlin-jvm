package godot.codegen.models.enriched

import godot.codegen.models.NativeStructure
import godot.codegen.generation.task.traits.Nature
import godot.codegen.generation.task.traits.GenerationType
import godot.codegen.generation.task.traits.TypeGenerationTrait

class EnrichedNativeStructure(model: NativeStructure) : TypeGenerationTrait {
    override val identifier = model.name
    override val nature = Nature.NATIVE
}


fun List<NativeStructure>.toEnriched() = map { EnrichedNativeStructure(it) }
fun NativeStructure.toEnriched() = EnrichedNativeStructure(this)
