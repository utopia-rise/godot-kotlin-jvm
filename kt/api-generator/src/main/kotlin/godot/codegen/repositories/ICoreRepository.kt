package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedEnum


interface ICoreRepository {
    fun getGlobalEnums(): List<EnrichedEnum>
    fun getCoreEnum(type: String): List<EnrichedEnum>
}
