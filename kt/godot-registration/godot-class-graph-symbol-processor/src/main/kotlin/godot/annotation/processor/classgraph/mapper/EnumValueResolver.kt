package godot.annotation.processor.classgraph.mapper

import godot.annotation.processor.classgraph.constants.GODOT_ENUM
import godot.registration.model.hint.property.EnumValue
import io.github.classgraph.ClassInfo

/**
 * Reads the enum constants of [this] enum class into [EnumValue]s for an enum/flag/list hint.
 *
 * When the enum implements `godot.core.GodotEnum`, each constant's explicit `value` is read reflectively so
 * the user controls the exact integer (dropdown value, list element, or flag mask). For a regular Kotlin
 * enum no explicit value exists, so the value is `null` and the hint is emitted names-only.
 */
internal fun ClassInfo.toEnumValues(): List<EnumValue> {
    val constants = fieldInfo.filter { field -> field.isEnum }

    if (interfaces.none { iface -> iface.name == GODOT_ENUM }) {
        return constants.map { field -> EnumValue(field.name, null) }
    }

    val valueByName = (loadClass().enumConstants ?: emptyArray()).associate { constant ->
        val name = (constant as Enum<*>).name
        val value = constant.javaClass.getMethod("getValue").invoke(constant) as Long
        name to value
    }

    return constants.map { field -> EnumValue(field.name, valueByName[field.name]) }
}
