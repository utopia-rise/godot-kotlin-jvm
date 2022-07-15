package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedEnum

interface CoreTypeEnumRepository {
    fun list(): List<EnrichedEnum>
    fun listForCoreType(coreType: String): List<EnrichedEnum>?
}