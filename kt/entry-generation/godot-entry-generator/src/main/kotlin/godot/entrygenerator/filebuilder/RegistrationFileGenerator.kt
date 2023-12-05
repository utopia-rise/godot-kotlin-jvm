package godot.entrygenerator.filebuilder

import godot.entrygenerator.model.RegisteredClassMetadataContainer
import godot.util.camelToSnakeCase
import java.io.BufferedWriter

class RegistrationFileGenerator(
    private val metadata: RegisteredClassMetadataContainer,
    private val registrationFileAppendableProvider: (RegisteredClassMetadataContainer) -> BufferedWriter,
) {
    fun build() {
        registrationFileAppendableProvider(metadata).use { bufferedWriter ->
            bufferedWriter.write(
                """
                    |// THIS FILE IS GENERATED! DO NOT EDIT OR DELETE IT. EDIT OR DELETE THE ASSOCIATED SOURCE CODE FILE INSTEAD
                    |// Note: You can however freely move this file inside your godot project if you want. Keep in mind however, that if you rename the originating source code file, this file will be deleted and regenerated as a new file instead of being updated! Other modifications to the source file however, will result in this file being updated.
                    |
                    |registeredName = ${metadata.registeredName}
                    |fqName = ${metadata.fqName}
                    |relativeSourcePath = ${metadata.relativeSourcePath}
                    |baseType = ${metadata.baseType}
                    |supertypes = [
                    |    ${metadata.superTypes.split(",").joinToString(",\n\t") { it.trim() }}
                    |]
                    |signals = [
                    |    ${metadata.signals.split(",").joinToString(",\n\t") { it.substringAfterLast(".").trim().camelToSnakeCase() }}
                    |]
                    |properties = [
                    |    ${metadata.properties.split(",").joinToString(",\n\t") { it.substringAfterLast(".").trim().camelToSnakeCase() }}
                    |]
                    |functions = [
                    |    ${metadata.functions.split(",").joinToString(",\n\t") { it.substringAfterLast(".").trim().camelToSnakeCase() }}
                    |]
                """.trimMargin()
            )
        }
    }
}
