package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedNativeStructure
import godot.codegen.generation.task.traits.HasTypeGenerationTrait

interface INativeStructureRepository {
    fun findMatchingType(typed: HasTypeGenerationTrait): EnrichedNativeStructure?
}
