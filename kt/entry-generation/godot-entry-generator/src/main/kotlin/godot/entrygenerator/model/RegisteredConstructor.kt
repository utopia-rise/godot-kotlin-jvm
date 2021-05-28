package godot.entrygenerator.model

data class RegisteredConstructor(
    val parameters: List<ValueParameter> = emptyList(),
    val annotations: List<ConstructorAnnotation> = emptyList()
) : GodotJvmSourceElement
