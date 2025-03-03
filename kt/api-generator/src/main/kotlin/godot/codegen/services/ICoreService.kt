package godot.codegen.services

import godot.codegen.models.enriched.EnrichedEnum


interface ICoreService {
    fun getGlobalEnums(): List<EnrichedEnum>
    fun getCoreType(type: String): List<EnrichedEnum>
}
