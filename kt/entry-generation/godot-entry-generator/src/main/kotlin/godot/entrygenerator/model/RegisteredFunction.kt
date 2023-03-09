package godot.entrygenerator.model

data class RegisteredFunction(
    val fqName: String,
    val parameters: List<ValueParameter> = emptyList(),
    val returnType: Type? = null,
    val annotations: List<FunctionAnnotation> = emptyList(),
    override val source: Any
) : GodotJvmSourceElement {
    val name: String
        get() = fqName.substringAfterLast(".")
}
