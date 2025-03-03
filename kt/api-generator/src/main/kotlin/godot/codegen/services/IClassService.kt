package godot.codegen.services

import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty

interface IClassService {
    fun listTypes(): List<EnrichedClass>
    fun listSingletons(): List<EnrichedClass>
    fun listClasses(): List<EnrichedClass>

    fun findTypeByName(name: String): EnrichedClass?
    fun findClassByName(name: String): EnrichedClass?
    fun findSingletonByName(name: String): EnrichedClass?
}
