package godot.entrygenerator.model

data class RegisteredFunction(
    val fqName: String,
    val parameters: List<ValueParameter> = emptyList(),
    val returnType: Type? = null,
    val annotations: List<FunctionAnnotation> = emptyList()
) : GodotJvmSourceElement
