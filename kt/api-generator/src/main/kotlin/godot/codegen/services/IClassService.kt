package godot.codegen.services

import godot.codegen.models.enriched.EnrichedClass

interface IClassService {
    fun getSingletons(): List<EnrichedClass>
    fun getClasses(): List<EnrichedClass>
    fun updatePropertyIfShouldUseSuper(className: String, propertyName: String)
    fun findGetSetMethodsAndUpdateProperties()
}
