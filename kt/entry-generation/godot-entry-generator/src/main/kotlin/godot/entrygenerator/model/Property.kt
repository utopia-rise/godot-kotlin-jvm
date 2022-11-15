package godot.entrygenerator.model


open class Property(
    open val fqName: String,
    open val type: Type,
    open val isMutable: Boolean = true,
    open val isLateinit: Boolean = false,
    open val isOverridee: Boolean = false,
    open val annotations: List<PropertyAnnotation> = emptyList(),
) : GodotJvmSourceElement {
    val name: String
        get() = fqName.substringAfterLast(".")
}

data class RegisteredProperty(
    override val fqName: String,
    override val type: Type,
    override val isMutable: Boolean = true,
    override val isLateinit: Boolean = false,
    override val isOverridee: Boolean = false,
    override val annotations: List<PropertyAnnotation> = emptyList(),
    val defaultValueTemplateAndArgs: () -> Pair<String, Array<out Any>>? = { "null" to arrayOf() }
) : Property(fqName, type, isMutable, isLateinit, isOverridee, annotations)
