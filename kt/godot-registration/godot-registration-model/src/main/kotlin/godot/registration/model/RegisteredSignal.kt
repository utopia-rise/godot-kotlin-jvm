package godot.registration.model

import godot.registration.model.types.Type

data class RegisteredSignal(
    val fqName: String,
    val type: Type,
    val parameterTypes: List<Type>,
    val parameterNames: List<String>,
    val isFunctionReference: Boolean = false,
    val isOverridee: Boolean = false,
) {
    val name: String = fqName.substringAfterLast(".")
}
