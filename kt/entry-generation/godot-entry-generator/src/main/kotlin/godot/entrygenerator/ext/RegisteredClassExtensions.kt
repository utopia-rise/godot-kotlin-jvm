package godot.entrygenerator.ext

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.entrygenerator.settings.Settings
import godot.tools.common.constants.FileExtensions

val RegisteredClass.shouldGenerateGdjFile: Boolean
    get() = !isAbstract

fun RegisteredClass.provideRegistrationFileRelativePath(settings: Settings): String {
    val relativeDir = buildString {
        if (sourceProjectName != settings.projectName) {
            append(sourceProjectName)
        }

        if (settings.registrationFileLayoutMode == RegistrationFileLayoutMode.HIERARCHICAL && fqName.contains(".")) {
            val packagePath = fqName.substringBeforeLast(".").replace(".", "/")
            if (isNotEmpty()) {
                append("/")
            }
            append(packagePath)
        }
    }

    return buildString {
        if (relativeDir.isNotEmpty()) {
            append(relativeDir)
            append("/")
        }
        append(getRegisteredName(settings))
        append(".")
        append(FileExtensions.GodotKotlinJvm.registrationFile)
    }
}
