package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedClass

interface ClassRepository {
    fun listTypes(): List<EnrichedClass>
    fun listClasses(): List<EnrichedClass>
    fun listSingleton(): List<EnrichedClass>

    fun findTypeByName(className: String): EnrichedClass?
    fun findClassByName(className: String): EnrichedClass?
    fun findSingletonByName(name: String): EnrichedClass?
}
