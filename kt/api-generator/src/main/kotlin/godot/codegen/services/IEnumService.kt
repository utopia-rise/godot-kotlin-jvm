package godot.codegen.services

import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.models.enriched.EnrichedEnum

interface IEnumService {
    fun getGlobalEnums() : List<EnrichedEnum>
    fun findEnumValue(enumName: String, enumValue: Int): DefaultEnumValue
}