package godot.codegen.models.enriched

import godot.codegen.extensions.bitfieldPrefix
import godot.codegen.extensions.enumPrefix
import godot.codegen.models.Enum
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.codegen.workarounds.sanitizeApiType

class EnrichedEnum(model: Enum, val outerClass: String?) : TypedTrait {
    val simpleName = model.name.sanitizeApiType()

    override val type = run {
        val prefix = if (model.isBitField) bitfieldPrefix else enumPrefix
        val encapsulating = if (outerClass != null) "${outerClass}." else ""
        (prefix + encapsulating + simpleName)
    }

    val values = model.values.map {
        EnrichedEnumValue(
            it.name,
            it.value,
            it.description ?: ""
        )
    }
}

class EnrichedEnumValue(val name: String, val value: Long, override val description: String?) : IDocumented


fun List<Enum>.toEnriched(outerClass: String? = null) = map { EnrichedEnum(it, outerClass) }
fun Enum.toEnriched(outerClass: String? = null) = EnrichedEnum(this, outerClass)
