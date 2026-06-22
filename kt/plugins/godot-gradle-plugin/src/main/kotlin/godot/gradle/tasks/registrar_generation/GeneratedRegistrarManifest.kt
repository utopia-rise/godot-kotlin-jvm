package godot.gradle.tasks

import godot.registrar.generator.Settings
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.ext.provideRegistrationFileRelativePath
import godot.registrar.generator.ext.shouldGenerateGdjFile
import godot.registration.model.types.ScriptClass
import godot.tools.common.constants.godotRegistrarBasePackage
import java.io.File

internal data class GeneratedRegistrarManifestEntry(
    val sourceFqName: String,
    val registeredName: String,
    val registrarSourceRelativePath: String,
    val registrationFileRelativePath: String?,
) {
    val registrarServiceName: String
        get() = "$godotRegistrarBasePackage.${registeredName}Registrar"
}

internal fun readGeneratedRegistrarManifest(manifestFile: File): Map<String, GeneratedRegistrarManifestEntry> {
    if (!manifestFile.isFile) {
        return emptyMap()
    }

    return manifestFile.readLines()
        .asSequence()
        .filter(String::isNotBlank)
        .mapNotNull { line ->
            val parts = line.split('\t')
            if (parts.size != 4) {
                null
            } else {
                GeneratedRegistrarManifestEntry(
                    sourceFqName = parts[0],
                    registeredName = parts[1],
                    registrarSourceRelativePath = parts[2],
                    registrationFileRelativePath = parts[3].ifBlank { null },
                )
            }
        }
        .associateBy(GeneratedRegistrarManifestEntry::sourceFqName)
}

internal fun writeGeneratedRegistrarManifest(
    manifestFile: File,
    entries: Collection<GeneratedRegistrarManifestEntry>,
) {
    manifestFile.parentFile.mkdirs()
    manifestFile.writeText(
        entries
            .sortedBy(GeneratedRegistrarManifestEntry::sourceFqName)
            .joinToString(separator = "\n", postfix = if (entries.isNotEmpty()) "\n" else "") { entry ->
                listOf(
                    entry.sourceFqName,
                    entry.registeredName,
                    entry.registrarSourceRelativePath,
                    entry.registrationFileRelativePath.orEmpty(),
                ).joinToString("\t")
            }
    )
}

internal fun ScriptClass.toGeneratedRegistrarManifestEntry(
    settings: Settings,
    includeRegistrationFile: Boolean,
): GeneratedRegistrarManifestEntry {
    val registeredName = getRegisteredName(settings)
    return GeneratedRegistrarManifestEntry(
        sourceFqName = fqName,
        registeredName = registeredName,
        registrarSourceRelativePath = buildString {
            append("main/kotlin/")
            append(godotRegistrarBasePackage.replace('.', '/'))
            append("/")
            append(registeredName)
            append("Registrar.kt")
        },
        registrationFileRelativePath = takeIf { includeRegistrationFile && shouldGenerateGdjFile }
            ?.provideRegistrationFileRelativePath(settings),
    )
}
