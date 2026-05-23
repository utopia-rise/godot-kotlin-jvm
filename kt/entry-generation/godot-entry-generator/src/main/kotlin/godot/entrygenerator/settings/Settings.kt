package godot.entrygenerator.settings

import java.io.File

data class Settings(
    val registeredNameMode: RegisteredNameMode,
    val projectName: String,
    val projectBaseDir: File,
    val userCodeClassPathRoots: Set<File>,
    val registrationFileLayoutMode: RegistrationFileLayoutMode,
    val registrationFileIndentation: RegistrationFileIndentation,
    val generatedSourceRootDir: File
)
