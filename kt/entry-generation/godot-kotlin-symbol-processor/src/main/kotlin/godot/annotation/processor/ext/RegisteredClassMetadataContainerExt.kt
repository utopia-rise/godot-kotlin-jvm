package godot.annotation.processor.ext

import godot.annotation.processor.Settings
import godot.tools.common.constants.FileExtensions

internal fun provideRegistrationFilePathForInitialGenerationWithoutExtension(
    settings: Settings,
    fqName: String,
    registeredName: String,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String
): String {
    val registrationMetadata = settings.registeredClassMetadataContainers.firstOrNull { it.fqName == fqName }
    val isRegistrationFileHierarchyEnabled = if (registrationMetadata != null) {
        registrationMetadata.isRegistrationFileHierarchyEnabled
    } else {
        settings.isRegistrationFileHierarchyEnabled
    }
    val registrationFileRelativePath = if (isRegistrationFileHierarchyEnabled && fqName.contains(".")) {
        fqName.substringBeforeLast(".").replace(".", "/")
    } else ""

    val localResourcePath = "$registrationFileRelativePath/$registeredName".removePrefix("/")

    return if (compilationProjectName == classProjectName) {
        "${registrationFileOutDir}/$localResourcePath"
    } else {
        "${registrationFileOutDir}/dependencies/${classProjectName}/$localResourcePath"
    }.let { "${it}.${FileExtensions.GodotKotlinJvm.registrationFile}" }
}
