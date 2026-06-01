package godot.registration.model

import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.types.Type

data class RegisteredProperty(
    val fqName: String,
    val type: Type,
    val getterFqName: String? = null,
    val setterFqName: String? = null,
    val isMutable: Boolean = true,
    val isLateinit: Boolean = false,
    val isOverridee: Boolean = false,
    val isExported: Boolean = false,
    val hints: List<PropertyHint> = emptyList(),
) {
    val name: String = fqName.substringAfterLast(".")
    val getterName = getterFqName?.substringAfterLast(".")
    val setterName = setterFqName?.substringAfterLast(".")
}
