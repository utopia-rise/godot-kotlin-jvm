package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedEnum


interface IEnumRepository {
    fun getGlobalEnums(): List<EnrichedEnum>
    fun getGlobalEnum(type: String): EnrichedEnum?
    fun getCoreEnum(type: String): List<EnrichedEnum>
}
