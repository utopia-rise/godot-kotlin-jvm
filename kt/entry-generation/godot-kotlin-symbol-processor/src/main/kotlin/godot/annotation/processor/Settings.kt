package godot.annotation.processor

import godot.entrygenerator.model.RegisteredClassMetadataContainer
import java.io.File

internal data class Settings(
    val projectName: String,
    val projectBaseDir: File,
    val registrationBaseDirPathRelativeToProjectDir: String,
    val classPrefix: String?,
    val isFqNameRegistrationEnabled: Boolean,
    val isRegistrationFileHierarchyEnabled: Boolean,
    val isRegistrationFileGenerationEnabled: Boolean,
    var registeredClassMetadataContainers: List<RegisteredClassMetadataContainer>,
)
