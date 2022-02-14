package godot.codegen.models.custom

import godot.codegen.models.EnumValue
import godot.codegen.models.enriched.EnrichedEnum

class DefaultEnumValue(enrichedEnum: EnrichedEnum, enumValue: EnumValue) {
    val name = "${enrichedEnum.name}.${enumValue.name}"
}