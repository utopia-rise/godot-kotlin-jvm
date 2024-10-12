package godot.codegen.services

import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.poet.ClassTypeNameWrapper

interface IApiService {
    fun getSingletons(): List<EnrichedClass>
    fun getClasses(): List<EnrichedClass>
    fun getGlobalEnums() : List<EnrichedEnum>


    fun updatePropertyIfShouldUseSuper(className: String, propertyName: String)
    fun findGetSetMethodsAndUpdateProperties()
    fun findEnumValue(enumClassName: ClassTypeNameWrapper, enumValue: Long): DefaultEnumValue
}
