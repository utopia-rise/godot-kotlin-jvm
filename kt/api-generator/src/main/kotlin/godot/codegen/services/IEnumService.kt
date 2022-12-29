package godot.codegen.services

import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.poet.ClassTypeNameWrapper

interface IEnumService {
    fun getGlobalEnums() : List<EnrichedEnum>
    fun findEnumValue(enumClassName: ClassTypeNameWrapper, enumValue: Int): DefaultEnumValue
}