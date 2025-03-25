package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.models.Property
import godot.codegen.models.traits.MetaGenerationTrait
import godot.codegen.models.traits.DocumentedGenerationTrait
import godot.codegen.models.traits.GenerationType
import godot.codegen.workarounds.sanitizeApiType
import godot.common.extensions.convertToCamelCase

class EnrichedProperty(model: Property) : MetaGenerationTrait, DocumentedGenerationTrait {
    override val type
        get() = getterMethod?.type ?: originalType
    override val nullable: Boolean
        get() = type.isObjectSubClass() || type.isVariant()
    override val genericParameters: List<ClassName>
        get() = getterMethod?.genericParameters ?: emptyList()
    override val meta: String?
        get() = getterMethod?.meta
    override var description = model.description

    private val originalType = GenerationType(model.type.sanitizeApiType())
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
