package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedEnum

interface GlobalEnumRepository {
    fun list(): List<EnrichedEnum>
}