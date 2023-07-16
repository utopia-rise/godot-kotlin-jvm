package godot.entrygenerator.model

import java.io.File

data class SourceFile(
    val absolutePath: String,
    val registeredClasses: List<RegisteredClass> = emptyList(),
    override val source: Any
) : GodotJvmSourceElement {
    val name = absolutePath.substringAfterLast("/").substringAfterLast(File.separator)
    val extension = absolutePath.substringAfterLast(".")
}
