package godot.entrygenerator.model

data class GodotScriptAnnotation(
    val customName: String? = null,
    override val symbolProcessorSource: Any
) : ClassAnnotation
