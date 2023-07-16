package godot.entrygenerator.model

data class RegisteredProperty(
    val fqName: String,
    val type: Type,
    val isMutable: Boolean = true,
    val isLateinit: Boolean = false,
    val isOverridee: Boolean = false,
    val annotations: List<PropertyAnnotation> = emptyList(),
    override val source: Any
) : GodotJvmSourceElement {
    val name: String = fqName.substringAfterLast(".")
}
