package godot.entrygenerator.model

data class RegisteredProperty(
    val fqName: String,
    val type: PropertyType,
    val isMutable: Boolean = true,
    val isLateinit: Boolean = false,
    val isOverridee: Boolean = false,
    val annotations: List<PropertyAnnotation> = emptyList(),
    override val symbolProcessorSource: Any
) : GodotJvmSourceElement {
    val name: String = fqName.substringAfterLast(".")
}
