package godot.codegen.repositories

import godot.codegen.models.enriched.EnrichedClass

interface ClassRepository {
    fun list(): List<EnrichedClass>
    infix fun findByClassName(className: String): EnrichedClass?
}