package godot.entrygenerator.model

class FileHintAnnotation(
    val extensions: List<String>,
    val global: Boolean,
    source: Any
) : PropertyHintAnnotation(source)
