package godot.entrygenerator.model

data class RegisteredConstructor(
    val fqName: String,
    val parameters: List<ValueParameter> = emptyList(),
    val annotations: List<ConstructorAnnotation> = emptyList()
) : GodotJvmSourceElement
