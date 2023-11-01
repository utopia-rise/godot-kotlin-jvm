package godot.annotation.processor.ext

import godot.annotation.processor.Settings
import godot.entrygenerator.model.RegisteredClassMetadataContainer

internal fun RegisteredClassMetadataContainer.provideRegistrationFilePathForInitialGeneration(
    settings: Settings
): String {
    val registrationFileRelativePath = if (settings.isRegistrationFileHierarchyEnabled && fqName.contains(".")) {
        fqName.substringBeforeLast(".").replace(".", "/")
    } else ""

    val localResourcePath = "$registrationFileRelativePath/$registeredName".removePrefix("/")

    return if (settings.projectName == projectName) {
        "${settings.registrationBaseDirPathRelativeToProjectDir}/$localResourcePath"
    } else {
        "${settings.registrationBaseDirPathRelativeToProjectDir}/dependencies/${projectName}/$localResourcePath"
    }
}
