package godot.codegen.services

import java.io.File

interface IConnectorGenerationService {
    fun generate(extensionDir: File)
}
