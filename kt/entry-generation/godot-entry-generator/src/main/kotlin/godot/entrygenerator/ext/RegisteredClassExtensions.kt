package godot.entrygenerator.ext

import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredClassMetadataContainer
import godot.tools.common.constants.FileExtensions

fun RegisteredClass.provideRegistrationFilePathForInitialGeneration(
    registeredClassMetadataContainers: List<RegisteredClassMetadataContainer>,
    isRegistrationFileHierarchyEnabledSetting: Boolean,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String
) = provideRegistrationFilePathForInitialGeneration(
    registeredClassMetadataContainers,
    isRegistrationFileHierarchyEnabledSetting,
    fqName,
    registeredName,
    compilationProjectName,
    classProjectName,
    registrationFileOutDir
)

fun provideRegistrationFilePathForInitialGeneration(
    registeredClassMetadataContainers: List<RegisteredClassMetadataContainer>,
    isRegistrationFileHierarchyEnabledSetting: Boolean,
    fqName: String,
    registeredName: String,
    compilationProjectName: String,
    classProjectName: String,
    registrationFileOutDir: String
): String {
    val registrationMetadata = registeredClassMetadataContainers.firstOrNull { it.fqName == fqName }
    val isRegistrationFileHierarchyEnabled = if (registrationMetadata != null) {
        registrationMetadata.isRegistrationFileHierarchyEnabled
    } else {
        isRegistrationFileHierarchyEnabledSetting
    }

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
