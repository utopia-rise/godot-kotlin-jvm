package godot.entrygenerator.model

data class RegisterClassAnnotation(
    val customName: String? = null,
    override val source: Any
) : ClassAnnotation
