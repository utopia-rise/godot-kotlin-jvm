package godot.entrygenerator.model

import java.io.File

data class SourceFile(
    val absolutePath: String,
    val classes: List<Clazz> = emptyList(),
    val registeredClasses: List<RegisteredClass> = classes.filterIsInstance<RegisteredClass>()
) : GodotJvmSourceElement {
    val name = absolutePath.substringAfterLast("/").substringAfterLast(File.separator)
    val extension = absolutePath.substringAfterLast(".")
}
