package godot.entrygenerator.model

data class RegisteredSignal(
    val fqName: String,
    val type: Type,
    val parameterNameToType: Map<String, Type>,
    val isOverridee: Boolean = false,
    val annotations: List<PropertyAnnotation> = emptyList(),
) : GodotJvmSourceElement {
    val name: String = fqName.substringAfterLast(".")
}
