package godot.codegen.models.enriched

import godot.codegen.extensions.bitfieldPrefix
import godot.codegen.extensions.enumPrefix
import godot.codegen.models.Enum
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.codegen.workarounds.sanitizeApiType
import godot.common.extensions.isValidKotlinIdentifier
import godot.common.extensions.removeWords
import godot.common.extensions.removePrefixWords
import godot.common.extensions.removeSuffixWords
import godot.common.extensions.toScreamingSnakeCase

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
            simpleName,
            it.value,
            it.description ?: ""
        )
    }
}

class EnrichedEnumValue(valueName: String, ownerName: String, val value: Long, override val description: String?) : IDocumented {
    val name = run {
        val screamingSnakeCase = ownerName.toScreamingSnakeCase()
        val prefixRemoved = valueName
            .removePrefixWords(screamingSnakeCase)
            .removePrefixWords("_")
            .takeIf { it.isValidKotlinIdentifier() }
            ?: valueName

        val suffixRemoved = prefixRemoved
            .removeSuffixWords(screamingSnakeCase)
            .removePrefixWords("_")
            .takeIf { it.isValidKotlinIdentifier() }
            ?: prefixRemoved

        suffixRemoved
            .removeWords(screamingSnakeCase)
            .takeIf { it.isValidKotlinIdentifier() }
            ?: suffixRemoved
    }
}

fun List<Enum>.toEnriched(outerClass: String? = null) = map { EnrichedEnum(it, outerClass) }
fun Enum.toEnriched(outerClass: String? = null) = EnrichedEnum(this, outerClass)
