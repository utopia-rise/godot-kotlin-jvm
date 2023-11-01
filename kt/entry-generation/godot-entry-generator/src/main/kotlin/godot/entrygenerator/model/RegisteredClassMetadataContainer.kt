package godot.entrygenerator.model

data class RegisteredClassMetadataContainer(
    val registeredName : String,
    val baseType: String,
    val fqName: String,
    val projectName: String,
    val superTypes: String,
    val signals: String,
    val properties: String,
    val functions: String,
)
