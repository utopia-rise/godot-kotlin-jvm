package godot.codegen.models.custom

import godot.codegen.models.EnumValue
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.traits.TypedTrait

class DefaultEnumValue(enumName: String?, enumValue: String, encapsulatingType: TypedTrait?) {
    constructor(enrichedEnum: EnrichedEnum, enumValue: EnumValue) : this(enrichedEnum.name, enumValue.name, enrichedEnum.encapsulatingType)

    val name = (if (encapsulatingType?.type == null) "" else "${encapsulatingType.type}.") +
            (if (enumName == null) "" else "$enumName.") + enumValue
}