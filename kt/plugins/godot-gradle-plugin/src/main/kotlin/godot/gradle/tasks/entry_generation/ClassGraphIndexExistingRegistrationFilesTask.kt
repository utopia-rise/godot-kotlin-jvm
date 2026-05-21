package godot.gradle.tasks.entry_generation

import godot.gradle.projectExt.godotJvmExtension
import godot.tools.common.constants.FileExtensions
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.logging.Logger
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import java.io.File

private const val godotProjectFileName = "project.godot"
private val gdjFqNameRegex = Regex("^fqName\\s*=\\s*(.+)$", setOf(RegexOption.MULTILINE))

internal data class ExistingRegistrationFileIndexEntry(
    val fqName: String,
    val relativePath: String,
)

internal data class GeneratedRegistrationFile(
    val fqName: String,
    val relativePath: String,
    val file: File,
)

@CacheableTask
abstract class ClassGraphIndexExistingRegistrationFilesTask : DefaultTask() {

    @get:Input
    abstract val godotProjectDirPath: Property<String>

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val existingRegistrationFiles: ConfigurableFileCollection

    @get:OutputFile
    abstract val existingRegistrationFilesIndexFile: RegularFileProperty

    @TaskAction
    fun index() {
        val godotProjectDir = File(godotProjectDirPath.get())
        val indexEntries = existingRegistrationFiles.files
            .asSequence()
            .filter(File::isFile)
            .mapNotNull { registrationFile ->
                val fqName = registrationFile.extractRegistrationFqName()
                if (fqName == null) {
                    logger.warn("Skipping registration file without fqName entry: ${registrationFile.absolutePath}")
                    null
                } else {
                    ExistingRegistrationFileIndexEntry(
                        fqName = fqName,
                        relativePath = registrationFile.relativeTo(godotProjectDir).invariantSeparatorsPath
                    )
                }
            }
            .sortedWith(compareBy(ExistingRegistrationFileIndexEntry::fqName, ExistingRegistrationFileIndexEntry::relativePath))
            .toList()

        val indexFile = existingRegistrationFilesIndexFile.get().asFile
        indexFile.parentFile.mkdirs()
        indexFile.writeText(
            indexEntries.joinToString(separator = "\n", postfix = if (indexEntries.isNotEmpty()) "\n" else "") { entry ->
                "${entry.fqName}\t${entry.relativePath}"
            }
        )
    }
}

internal fun findGodotProjectRoot(start: File): File {
    var current: File? = start.takeIf { it.isDirectory } ?: start.parentFile
    while (current != null) {
        if (current.resolve(godotProjectFileName).isFile) {
            return current
        }
        current = current.parentFile
    }
    return start
}

internal fun Project.requireConfiguredGodotProjectDirectory(): File {
    val configuredDir = godotJvmExtension.godotProjectDirectory.orNull?.asFile ?: projectDir
    val projectFile = configuredDir.resolve(godotProjectFileName)
    if (!projectFile.isFile) {
        throw GradleException(
            "No $godotProjectFileName file was found in the configured Godot project directory: ${configuredDir.absolutePath}. " +
                "Set godot.godotProjectDirectory to the directory that contains $godotProjectFileName."
        )
    }
    return configuredDir
}

internal fun Project.godotRegistrationFileTree(rootDir: File) = fileTree(rootDir).matching { patternFilterable ->
    patternFilterable.include("**/*.${FileExtensions.GodotKotlinJvm.registrationFile}")
    patternFilterable.exclude("build/**")
    patternFilterable.exclude("android/**")
    patternFilterable.exclude(".*/**")
    patternFilterable.exclude("**/.*/**")
}

internal fun File.extractRegistrationFqName(): String? {
    return gdjFqNameRegex.find(readText())?.groupValues?.get(1)?.trim()?.takeIf { it.isNotEmpty() }
}

internal fun readExistingRegistrationFileIndex(indexFile: File): List<ExistingRegistrationFileIndexEntry> {
    if (!indexFile.isFile) {
        return emptyList()
    }

    return indexFile.readLines()
        .asSequence()
        .filter { it.isNotBlank() }
        .mapNotNull { line ->
            val separatorIndex = line.indexOf('\t')
            if (separatorIndex <= 0 || separatorIndex == line.lastIndex) {
                null
            } else {
                ExistingRegistrationFileIndexEntry(
                    fqName = line.substring(0, separatorIndex),
                    relativePath = line.substring(separatorIndex + 1)
                )
            }
        }
        .toList()
}

internal fun readGeneratedRegistrationFiles(generatedRoot: File, logger: Logger): Map<String, GeneratedRegistrationFile> {
    val generatedFilesByFqName = linkedMapOf<String, GeneratedRegistrationFile>()

    generatedRoot
        .walkTopDown()
        .filter { it.isFile && it.extension == FileExtensions.GodotKotlinJvm.registrationFile }
        .forEach { generatedFile ->
            val fqName = generatedFile.extractRegistrationFqName()
            if (fqName == null) {
                logger.warn("Skipping generated registration file without fqName entry: ${generatedFile.absolutePath}")
            } else {
                val generatedRegistrationFile = GeneratedRegistrationFile(
                    fqName = fqName,
                    relativePath = generatedFile.relativeTo(generatedRoot).invariantSeparatorsPath,
                    file = generatedFile
                )
                val previousValue = generatedFilesByFqName.putIfAbsent(fqName, generatedRegistrationFile)
                if (previousValue != null) {
                    logger.warn(
                        "Multiple generated registration files share fqName $fqName. Keeping ${previousValue.file.absolutePath} and ignoring ${generatedFile.absolutePath}."
                    )
                }
            }
        }

    return generatedFilesByFqName
}

fun Project.entryGenerationIndexExistingRegistrationFilesTask(): TaskProvider<ClassGraphIndexExistingRegistrationFilesTask> {
    return tasks.register(
        "entryGenerationIndexExistingRegistrationFiles",
        ClassGraphIndexExistingRegistrationFilesTask::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Indexes existing .gdj files across the Godot project."
        task.godotProjectDirPath.convention(providers.provider { requireConfiguredGodotProjectDirectory().absolutePath })
        task.existingRegistrationFiles.from(providers.provider { godotRegistrationFileTree(requireConfiguredGodotProjectDirectory()) })
        task.existingRegistrationFilesIndexFile.convention(
            layout.buildDirectory.file("intermediates/entry-generation/existing-registration-files.idx")
        )
    }
}
