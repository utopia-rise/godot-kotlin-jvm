package godot.codegen.models.custom

import godot.codegen.models.EnumValue
import godot.codegen.models.enriched.EnrichedEnum

class DefaultEnumValue(enrichedEnum: EnrichedEnum, enumValue: EnumValue) {
    val name = (if (enrichedEnum.encapsulatingType?.type == null) "" else "${enrichedEnum.encapsulatingType.type}.") +
            "${enrichedEnum.name}.${enumValue.name}"
}