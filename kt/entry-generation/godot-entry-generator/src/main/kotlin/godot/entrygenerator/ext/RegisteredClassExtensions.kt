package godot.entrygenerator.ext

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.entrygenerator.settings.RegisteredNameMode
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

fun RegisteredClass.provideRegistrationFilePathForInitialGeneration(
    settings: Settings,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String,
    registrationFileLayoutMode: RegistrationFileLayoutMode,
) = provideRegistrationFilePathForInitialGeneration(
    fqName,
    provideRegisteredName(settings),
    compilationProjectName,
    classProjectName,
    registrationFileOutDir,
    registrationFileLayoutMode
)

fun provideRegistrationFilePathForInitialGeneration(
    fqName: String,
    registeredName: String,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String,
    registrationFileLayoutMode: RegistrationFileLayoutMode,
): String {
    val registrationFileRelativePath = if (registrationFileLayoutMode == RegistrationFileLayoutMode.HIERARCHICAL && fqName.contains(".")) {
        fqName.substringBeforeLast(".").replace(".", "/")
    } else ""

    val localResourcePath = "$registrationFileRelativePath/$registeredName".removePrefix("/")

    val pathWithoutExtension = if (compilationProjectName == classProjectName) {
        "${registrationFileOutDir}/$localResourcePath"
    } else {
        "${registrationFileOutDir}/${classProjectName}/$localResourcePath"
    }

    return "$pathWithoutExtension.${FileExtensions.GodotKotlinJvm.registrationFile}"
}

val RegisteredClass.shouldGenerateGdjFile: Boolean
    get() = !isAbstract
