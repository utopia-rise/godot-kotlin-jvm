package godot.entrygenerator.settings

import java.io.File

data class Settings(
    val registeredNameMode: RegisteredNameMode,
    val projectName: String,
    val projectBaseDir: File,
    val userCodeClassPathRoots: Set<File>,
    val registrationBaseDirPathRelativeToProjectDir: String,
    val registrationFileLayoutMode: RegistrationFileLayoutMode,
    val isRegistrationFileGenerationEnabled: Boolean,
    val generatedSourceRootDir: File
)
