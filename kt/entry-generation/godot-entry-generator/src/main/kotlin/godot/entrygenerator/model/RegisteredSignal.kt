package godot.entrygenerator.model

data class RegisteredSignal(
    val fqName: String,
    val type: Type,
    val parameterTypes: List<Type>,
    val parameterNames: List<String>,
    val isOverridee: Boolean = false,
    val annotations: List<PropertyAnnotation> = emptyList(),
) : GodotJvmSourceElement {
    val name: String = fqName.substringAfterLast(".")
}
