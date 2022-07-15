package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedNativeStructure
import godot.codegen.traits.TypedTrait

interface INativeStructureRepository {
    fun list(): List<EnrichedNativeStructure>
    fun findMatchingType(typed: TypedTrait): EnrichedNativeStructure?
}