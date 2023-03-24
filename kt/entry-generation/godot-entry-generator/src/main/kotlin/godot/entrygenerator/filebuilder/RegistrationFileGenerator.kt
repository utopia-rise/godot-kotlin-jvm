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
                    |// THIS FILE IS GENERATED! DO NOT EDIT, MOVE OR DELETE IT. EDIT, MOVE OR DELETE THE ASSOCIATED SOURCE CODE FILE INSTEAD
                    |
                    |registeredName = ${metadata.registeredName}
                    |fqName = ${metadata.fqName}
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
