package godot.entrygenerator.model

data class RegisteredProperty(
    val fqName: String,
    val type: Type,
    val isMutable: Boolean = true,
    val isOverridee: Boolean = false,
    val isInheritedButNotOverridden: Boolean = false,
    val annotations: List<PropertyAnnotation> = emptyList(),
    val defaultValueProvider: (RegisteredProperty) -> Pair<String, Array<Any?>> = { "" to arrayOf() }
) : GodotJvmSourceElement {
    val name: String = fqName.substringAfterLast(".")
}
