package godot.entrygenerator.model

open class Function(
    open val fqName: String,
    open val isOverridee: Boolean = false,
    open val parameters: List<ValueParameter> = emptyList(),
    open val returnType: Type? = null,
    open val annotations: List<FunctionAnnotation> = emptyList()
) : GodotJvmSourceElement {
    val name: String
        get() = fqName.substringAfterLast(".")
}

data class RegisteredFunction(
    override val fqName: String,
    override val isOverridee: Boolean = false,
    override val parameters: List<ValueParameter> = emptyList(),
    override val returnType: Type? = null,
    override val annotations: List<FunctionAnnotation> = emptyList()
) : Function(fqName, isOverridee, parameters, returnType, annotations)
