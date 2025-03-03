package godot.codegen.models.enriched

import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.WithDefaultValueTrait
import godot.codegen.workarounds.sanitizeApiType
import godot.tools.common.constants.GodotTypes
import godot.common.extensions.convertToCamelCase
import godot.common.extensions.escapeKotlinReservedNames

class EnrichedArgument(model: Argument, canBeNull: Boolean) : CastableTrait, NullableTrait, WithDefaultValueTrait {
    val name = model.name.convertToCamelCase().escapeKotlinReservedNames()
    override val type = model.type.sanitizeApiType()
    override val defaultValue = model.defaultValue
    override val meta: String? = model.meta
    override var nullable = (isObjectSubClass() || type == GodotTypes.variant) && canBeNull

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if(other !is EnrichedArgument) return false
        return name == other.name && type == other.type && meta == other.meta
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + type.hashCode()
        result = 31 * result + (meta?.hashCode() ?: 0)
        return result
    }
}

fun List<Argument>.toEnriched(canBeNull: Boolean = true) = map { EnrichedArgument(it, canBeNull) }
fun Argument.toEnriched(canBeNull: Boolean = true) = EnrichedArgument(this, canBeNull)
