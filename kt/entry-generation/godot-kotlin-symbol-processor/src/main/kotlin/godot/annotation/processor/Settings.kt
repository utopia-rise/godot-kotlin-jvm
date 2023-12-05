package godot.annotation.processor

import java.io.File

internal data class Settings(
    val projectName: String,
    val projectBaseDir: File,
    val registrationBaseDirPathRelativeToProjectDir: String,
    val classPrefix: String?,
    val isFqNameRegistrationEnabled: Boolean,
    val isRegistrationFileHierarchyEnabled: Boolean,
    val isRegistrationFileGenerationEnabled: Boolean,
)
