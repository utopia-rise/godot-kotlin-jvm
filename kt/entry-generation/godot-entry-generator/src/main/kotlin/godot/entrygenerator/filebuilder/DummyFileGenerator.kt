package godot.entrygenerator.filebuilder

import godot.entrygenerator.model.RegisteredClassMetadataContainer
import godot.util.camelToSnakeCase
import java.io.BufferedWriter

class DummyFileGenerator(
    private val metadata: RegisteredClassMetadataContainer,
    private val dummyFileAppendableProvider: (RegisteredClassMetadataContainer) -> BufferedWriter,
) {
    fun build() {
        dummyFileAppendableProvider(metadata).use { bufferedWriter ->
            bufferedWriter.write(
                """
                    |// dummy file
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
