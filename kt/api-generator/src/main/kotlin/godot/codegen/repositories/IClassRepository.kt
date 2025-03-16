package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedClass

interface IClassRepository {
    fun listTypes(): List<EnrichedClass>
    fun listSingletons(): List<EnrichedClass>
    fun listClasses(): List<EnrichedClass>

    fun findTypeByName(name: String): EnrichedClass?
    fun findClassByName(name: String): EnrichedClass?
    fun findSingletonByName(name: String): EnrichedClass?
}
