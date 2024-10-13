package godot.codegen.models.enriched

import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.models.Property
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.CastableTrait
import godot.codegen.traits.IDocumented
import godot.codegen.traits.NullableTrait
import godot.codegen.workarounds.sanitizeApiType
import godot.tools.common.constants.GodotTypes
import godot.common.extensions.convertToCamelCase

class EnrichedProperty(val internal: Property) : CastableTrait, NullableTrait, IDocumented {
    val name = internal.name.convertToCamelCase()
    val getter = internal.getter.convertToCamelCase()
    val setter = internal.setter?.convertToCamelCase()
    val isIndexed = internal.index != null

    var getterMethod: EnrichedMethod? = null
    var setterMethod: EnrichedMethod? = null

    val hasValidGetterInClass: Boolean
        get() = getterMethod != null

    val hasValidSetterInClass: Boolean
        get() = setterMethod != null

    // Here we use getter type instead.
    // We have part of code that check if core type or not before it is possible to
    // set getter. So if getter is not set, we use property type.
    val internalType: String
        get() = getterMethod?.type ?: internal.type

    override val type: String
        get() = if (internalType.indexOf(",") != -1) {
            // There are property with multiple types, and it's all Materials, so
            // Godot's developer should make more strict API
            "Material"
        } else {
            // There are inconsistencies between property type and getter type in api.
            internalType.sanitizeApiType()
        }
    override val nullable = isObjectSubClass() || type == GodotTypes.variant
    override val meta: String?
        get() = getterMethod?.meta
    override val description = internal.description
}

fun List<Property>.toEnriched() = map {
    EnrichedProperty(it)
}

fun EnrichedProperty.toSetterCallable() = object : CallableTrait {
    init {
        requireNotNull(setterMethod)
    }

    private val setterArgument = Argument("value", internalType, this@toSetterCallable.meta, null).toEnriched()

    override val arguments = if (isIndexed) {
        listOf(
            Argument("index", GodotTypes.int, null, null).toEnriched(),
            setterArgument
        )
    } else {
        listOf(
            setterArgument
        )
    }
    override val isVararg = false
    override val voidPtrVariableName = setterMethod!!.voidPtrVariableName
    override val type = ""
    override val meta: String? = null
    override val nullable = false
}

fun EnrichedProperty.toGetterCallable() = object : CallableTrait {
    init {
        requireNotNull(getterMethod)
    }

    override val arguments = if (isIndexed) {
        listOf(Argument("index", GodotTypes.int, null, null).toEnriched())
    } else {
        listOf()
    }
    override val isVararg = false
    override val voidPtrVariableName = getterMethod!!.voidPtrVariableName
    override val type = this@toGetterCallable.type
    override val meta: String? = getterMethod!!.meta
    override val nullable = this@toGetterCallable.nullable
}
