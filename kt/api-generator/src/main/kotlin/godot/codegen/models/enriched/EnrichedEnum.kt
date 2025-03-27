package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.models.Enum
import godot.codegen.models.traits.DocumentedGenerationTrait
import godot.codegen.models.traits.Nature
import godot.codegen.models.traits.TypeGenerationTrait
import godot.codegen.models.traits.from
import godot.codegen.workarounds.sanitizeApiType
import godot.common.extensions.isValidKotlinIdentifier
import godot.common.extensions.removePrefixWords
import godot.common.extensions.removeSuffixWords
import godot.common.extensions.removeWords
import godot.common.extensions.toUpperSnakeCase

class EnrichedEnum(model: Enum, outerClass: TypeGenerationTrait?) : TypeGenerationTrait {
    override val identifier =  if (outerClass != null) outerClass.identifier + "." + model.name.sanitizeApiType() else model.name.sanitizeApiType()
    override val nature =  if (model.isBitField) Nature.BITFIELD else Nature.ENUM
    override val className = ClassName.from(this)

    val simpleName = model.name.sanitizeApiType()

    val values = model.values.map {
        EnrichedEnumValue(
            it.name,
            simpleName,
            it.value,
            it.description ?: ""
        )
    }
}

class EnrichedEnumValue(valueName: String, ownerName: String, val value: Long, override var description: String?) : DocumentedGenerationTrait {
    val name = run {
        val uppercaseName = ownerName.toUpperSnakeCase()
        val prefixRemoved = valueName
            .removePrefixWords(uppercaseName)
            .removePrefix("_")
            .takeIf { it.isValidKotlinIdentifier() }
            ?: valueName

        val suffixRemoved = prefixRemoved
            .removeSuffixWords(uppercaseName)
            .removePrefix("_")
            .takeIf { it.isValidKotlinIdentifier() }
            ?: prefixRemoved

        suffixRemoved
            .removeWords(uppercaseName)
            .takeIf { it.isValidKotlinIdentifier() }
            ?: suffixRemoved
    }
}

fun List<Enum>.toEnriched(outerClass: TypeGenerationTrait? = null) = map { EnrichedEnum(it, outerClass) }
fun Enum.toEnriched(outerClass: TypeGenerationTrait? = null) = EnrichedEnum(this, outerClass)
