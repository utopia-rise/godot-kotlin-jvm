package godot.registration.model

import godot.registration.model.types.Type

data class RegisteredConstructor(
    val parameterTypes: List<Type> = emptyList(),
)
