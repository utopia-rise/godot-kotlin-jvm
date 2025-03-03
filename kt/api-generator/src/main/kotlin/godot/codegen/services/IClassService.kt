package godot.codegen.services

import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty

interface IClassService {
    fun getTypes(): List<EnrichedClass>
    fun getSingletons(): List<EnrichedClass>
    fun getClasses(): List<EnrichedClass>

    fun findTypeByName(name: String): EnrichedClass?
    fun findClassByName(name: String): EnrichedClass?
    fun findSingletonByName(name: String): EnrichedClass?

    fun getMethodFromAncestor(cl: EnrichedClass, method: EnrichedMethod): Pair<EnrichedClass, EnrichedMethod>?
    fun doAncestorsHaveProperty(cl: EnrichedClass, prop: EnrichedProperty): Boolean
    fun doAncestorsHaveMethod(cl: EnrichedClass, method: EnrichedMethod): Boolean
    fun getSanitisedArgumentName(cl: EnrichedClass, method: EnrichedMethod, index: Int): String
}
