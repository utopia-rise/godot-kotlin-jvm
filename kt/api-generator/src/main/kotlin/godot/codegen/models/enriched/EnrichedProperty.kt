package godot.codegen.models.enriched

import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Property
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.IDocumented
import godot.codegen.traits.NullableTrait
import godot.codegen.workarounds.sanitizeApiType
import godot.common.extensions.convertToCamelCase
import godot.tools.common.constants.GodotTypes

class EnrichedProperty(model: Property) : CastableTrait, NullableTrait, IDocumented {
    val name = model.name.convertToCamelCase()
    val getterName = model.getter.convertToCamelCase()
    val setterName = model.setter?.convertToCamelCase()
    val index = model.index
    val isIndexed = model.index != null

    var getterMethod: EnrichedMethod? = null
        private set
    var setterMethod: EnrichedMethod? = null
        private set
    val hasGetter: Boolean
        get() = getterMethod != null
    val hasSetter: Boolean
        get() = setterMethod != null

    private val originalType = model.type.sanitizeApiType()
    override val type: String
        get() = getterMethod?.type ?: originalType

    override val nullable = isObjectSubClass() || type == GodotTypes.variant
    override val meta: String?
        get() = getterMethod?.meta
    override var description = model.description

    fun setGetter(method: EnrichedMethod) {
        getterMethod = method
    }

    fun setSetter(method: EnrichedMethod) {
        setterMethod = method
    }
}

fun List<Property>.toEnriched() = map {
    EnrichedProperty(it)
}
