package godot.annotation.processor.classgraph

import java.io.File

data class Settings(
    val classPrefix: String?,
    val isFqNameRegistrationEnabled: Boolean,
    val projectName: String,
    val projectBaseDir: File,
    val registrationBaseDirPathRelativeToProjectDir: String,
    val isRegistrationFileHierarchyEnabled: Boolean,
    val isRegistrationFileGenerationEnabled: Boolean,
    val generatedSourceRootDir: File
)
