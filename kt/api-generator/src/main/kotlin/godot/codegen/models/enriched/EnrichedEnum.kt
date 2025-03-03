package godot.codegen.models.enriched

import godot.codegen.extensions.bitfieldPrefix
import godot.codegen.extensions.enumPrefix
import godot.codegen.models.Enum
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait

class EnrichedEnum(model: Enum, val outerClass: String?) : TypedTrait {
    val name = if (outerClass == null) {
        model.name.replace(".", "")
    } else {
        model.name
    }

    val values = model.values.map {
        EnrichedEnumValue(
            (if (outerClass == null) "" else "$outerClass.") + "$name.${it.name}",
            it.name,
            it.value,
            it.description ?: ""
        )
    }

    override val type = run {
        val prefix = if (model.isBitField) bitfieldPrefix else enumPrefix
        val encapsulating = if (outerClass != null) "${outerClass}." else ""
        prefix + encapsulating + name
    }

    fun getBitFieldCustomValue(value: Long) = EnrichedEnumValue(
        (if (outerClass == null) "" else "${outerClass}.${name}Value($value)"),
        "${name}Value",
        value,
        ""
    )
}

class EnrichedEnumValue(val type: String, val name: String, val value: Long, override val description: String?): IDocumented


fun List<Enum>.toEnriched(outerClass: String? = null) = map { EnrichedEnum(it, outerClass) }
fun Enum.toEnriched(outerClass: String? = null) = EnrichedEnum(this, outerClass)
