package godot.entrygenerator.ext

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.RegisteredNameMode
import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.entrygenerator.settings.Settings
import godot.tools.common.constants.FileExtensions

fun RegisteredClass.provideRegisteredName(settings: Settings): String {
    val customRegisteredName = customName?.takeIf { it.isNotBlank() }
    if (customRegisteredName != null) {
        return customRegisteredName
    }

    val defaultRegisteredName = when (settings.registeredNameMode) {
        RegisteredNameMode.SIMPLE_NAME,
        RegisteredNameMode.PROJECT_PREFIX -> fqName.substringAfterLast(".")

        RegisteredNameMode.FQ_NAME -> fqName
    }

    return when (settings.registeredNameMode) {
        RegisteredNameMode.SIMPLE_NAME,
        RegisteredNameMode.FQ_NAME -> defaultRegisteredName

        RegisteredNameMode.PROJECT_PREFIX -> {
            if (sourceProjectName == settings.projectName) {
                defaultRegisteredName
            } else {
                "${sourceProjectName}_$defaultRegisteredName"
            }
        }
    }
}

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
        append(provideRegisteredName(settings))
        append(".")
        append(FileExtensions.GodotKotlinJvm.registrationFile)
    }
}
