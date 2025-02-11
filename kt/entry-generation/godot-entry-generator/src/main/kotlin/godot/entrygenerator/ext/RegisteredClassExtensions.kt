package godot.entrygenerator.ext

import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.FileExtensions

fun RegisteredClass.provideRegistrationFilePathForInitialGeneration(
    isRegistrationFileHierarchyEnabled: Boolean,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String
) = provideRegistrationFilePathForInitialGeneration(
    isRegistrationFileHierarchyEnabled,
    fqName,
    registeredName,
    compilationProjectName,
    classProjectName,
    registrationFileOutDir
)

fun provideRegistrationFilePathForInitialGeneration(
    isRegistrationFileHierarchyEnabled: Boolean,
    fqName: String,
    registeredName: String,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String
): String {
    val registrationFileRelativePath = if (isRegistrationFileHierarchyEnabled && fqName.contains(".")) {
        fqName.substringBeforeLast(".").replace(".", "/")
    } else ""

    val localResourcePath = "$registrationFileRelativePath/$registeredName".removePrefix("/")

    val pathWithoutExtension = if (compilationProjectName == classProjectName) {
        "${registrationFileOutDir}/$localResourcePath"
    } else {
        "${registrationFileOutDir}/dependencies/${classProjectName}/$localResourcePath"
    }

    return "$pathWithoutExtension.${FileExtensions.GodotKotlinJvm.registrationFile}"
}
