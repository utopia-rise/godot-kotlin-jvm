package godot.codegen.models.enriched

import godot.codegen.extensions.bitfieldPrefix
import godot.codegen.extensions.enumPrefix
import godot.codegen.models.Enum
import godot.codegen.traits.TypedTrait

class EnrichedEnum(val internal: Enum, val encapsulatingType: TypedTrait?) : TypedTrait {
    val name = if (encapsulatingType == null) {
        internal.name.replace(".", "")
    } else {
        internal.name
    }
    override val type: String by lazy {
        val prefix = if (internal.isBitField) bitfieldPrefix else enumPrefix
        val encapsulating = if (encapsulatingType != null) "${encapsulatingType.type}." else ""
        prefix + encapsulating + name
    }
}

fun List<Enum>.toEnriched(encapsulatingType: TypedTrait? = null) = map { EnrichedEnum(it, encapsulatingType) }
fun Enum.toEnriched(encapsulatingType: TypedTrait? = null) = EnrichedEnum(this, encapsulatingType)