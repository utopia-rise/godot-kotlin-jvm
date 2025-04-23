package godot.entrygenerator.model

data class RegisteredConstructor(
    val fqName: String,
    val annotations: List<ConstructorAnnotation> = emptyList(),
    override val symbolProcessorSource: Any
) : GodotJvmSourceElement
