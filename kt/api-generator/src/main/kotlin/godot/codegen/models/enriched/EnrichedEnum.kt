package godot.codegen.models.enriched

import godot.codegen.models.Enum
import godot.codegen.traits.TypedTrait

class EnrichedEnum(val internal: Enum, val encapsulatingType: TypedTrait?) {
    val name = if (encapsulatingType == null) {
        internal.name.replace(".", "")
    } else {
        internal.name
    }
}

fun List<Enum>.toEnriched(encapsulatingType: TypedTrait? = null) = map { EnrichedEnum(it, encapsulatingType) }
fun Enum.toEnriched(encapsulatingType: TypedTrait? = null) = EnrichedEnum(this, encapsulatingType)