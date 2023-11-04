package godot.annotation.processor.ext

import godot.tools.common.constants.FileExtensions
import org.jetbrains.kotlin.konan.properties.suffix

internal fun provideRegistrationFilePathForInitialGenerationWithoutExtension(
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

    return if (compilationProjectName == classProjectName) {
        "${registrationFileOutDir}/$localResourcePath"
    } else {
        "${registrationFileOutDir}/dependencies/${classProjectName}/$localResourcePath"
    }.suffix(FileExtensions.GodotKotlinJvm.registrationFile)
}
