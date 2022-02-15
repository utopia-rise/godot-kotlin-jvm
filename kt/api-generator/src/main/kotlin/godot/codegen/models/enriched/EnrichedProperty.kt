package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.models.Argument
import godot.codegen.models.Property
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait

class EnrichedProperty(val internal: Property, engineClassIndexName: String) : TypedTrait, NullableTrait {
    val name = internal.name.convertToCamelCase().replace("/", "_")
    val getter = internal.getter.convertToCamelCase()
    val setter = internal.setter.convertToCamelCase()
    val engineSetterIndexName = "ENGINEMETHOD_${engineClassIndexName}_SET_${internal.name.replace("/", "_").toUpperCase()}"
    val engineGetterIndexName = "ENGINEMETHOD_${engineClassIndexName}_GET_${internal.name.replace("/", "_").toUpperCase()}"

    var hasValidSetterInClass = false
    var hasValidGetterInClass = false

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

fun List<Property>.toEnriched(engineClassIndexName: String) = map {
    EnrichedProperty(it, engineClassIndexName)
}

fun EnrichedProperty.toSetterCallable() = object : CallableTrait {
    override val arguments = listOf(
        EnrichedArgument(
            Argument("value", internal.type, null, null)
        )
    )
    override val isVararg = false
    override val engineIndexName = engineSetterIndexName
    override val type = ""
    override val nullable = false
}

fun EnrichedProperty.toGetterCallable() = object : CallableTrait {
    override val arguments = listOf<EnrichedArgument>()
    override val isVararg = false
    override val engineIndexName = engineGetterIndexName
    override val type = this@toGetterCallable.type
    override val nullable = this@toGetterCallable.nullable
}