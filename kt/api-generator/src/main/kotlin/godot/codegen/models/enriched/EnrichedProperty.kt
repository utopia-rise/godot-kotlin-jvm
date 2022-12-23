package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.codegen.constants.GodotTypes
import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.models.Property
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait

class EnrichedProperty(val internal: Property) : TypedTrait, NullableTrait {
    val name = internal.name.replace("/", "_").convertToCamelCase()
    val getter = internal.getter.convertToCamelCase()
    val setter = internal.setter.convertToCamelCase()
    val isIndexed = internal.index != -1

    var getterMethod: EnrichedMethod? = null
    var setterMethod: EnrichedMethod? = null

    val hasValidSetterInClass: Boolean
        get() = setterMethod != null

    val hasValidGetterInClass: Boolean
        get() = getterMethod != null

    var shouldUseSuperSetter = false
    var shouldUseSuperGetter = false

    // There are property with multiple types, and it's all Materials, so
    // Godot's developer should make more strict API
    override val type = if (internal.type.indexOf(",") != -1) {
        "Material"
    } else {
        internal.type
    }
    override val nullable = isObjectSubClass() || getTypeClassName().className == ANY
}

fun List<Property>.toEnriched() = map {
    EnrichedProperty(it)
}

fun EnrichedProperty.toSetterCallable() = object : CallableTrait {
    init {
        requireNotNull(setterMethod)
    }

    override val arguments = if (isIndexed) {
        listOf(
            Argument("index", GodotTypes.int, null, null).toEnriched(),
            Argument("value", internal.type, null, null).toEnriched()
        )
    } else {
        listOf(
            Argument("value", internal.type, null, null).toEnriched()
        )
    }
    override val isVararg = false
    override val engineIndexName = setterMethod!!.engineIndexName
    override val type = ""
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
    override val engineIndexName = getterMethod!!.engineIndexName
    override val type = this@toGetterCallable.type
    override val nullable = this@toGetterCallable.nullable
}
