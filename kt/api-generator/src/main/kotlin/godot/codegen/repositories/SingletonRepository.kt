package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedSingleton

interface SingletonRepository {
    fun list(): List<EnrichedSingleton>
    infix fun findByName(name: String): EnrichedSingleton?
    infix fun findByType(type: String): List<EnrichedSingleton>
}