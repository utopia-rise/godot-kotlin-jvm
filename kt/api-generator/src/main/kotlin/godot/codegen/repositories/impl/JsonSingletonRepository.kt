package godot.codegen.repositories.impl

import godot.codegen.models.Singleton
import godot.codegen.models.enriched.EnrichedSingleton
import godot.codegen.repositories.SingletonRepository

class JsonSingletonRepository(private val rawData: List<EnrichedSingleton>) : SingletonRepository {

    override fun list() = rawData.toList()

    override infix fun findByName(name: String) = rawData.firstOrNull { it.name == name }

    override infix fun findByType(type: String) = rawData.filter { it.type == type }
}