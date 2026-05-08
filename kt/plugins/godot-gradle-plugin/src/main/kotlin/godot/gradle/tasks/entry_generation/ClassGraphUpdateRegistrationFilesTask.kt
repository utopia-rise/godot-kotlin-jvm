package godot.gradle.tasks

import godot.gradle.projectExt.godotJvmExtension
import godot.gradle.tasks.entry_generation.ClassGraphIndexExistingRegistrationFilesTask
import godot.gradle.tasks.entry_generation.readExistingRegistrationFileIndex
import godot.gradle.tasks.entry_generation.readGeneratedRegistrationFiles
import godot.gradle.tasks.entry_generation.requireConfiguredGodotProjectDirectory
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFiles
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import java.io.File

@CacheableTask
abstract class ClassGraphUpdateRegistrationFilesTask : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val generatedRegistrationFilesRootDir: DirectoryProperty

    @get:Input
    abstract val godotProjectDirPath: Property<String>

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val existingRegistrationFilesIndexFile: RegularFileProperty

    @get:OutputDirectory
    abstract val registrationFilesOutputDir: DirectoryProperty

    @get:OutputFiles
    abstract val synchronizedRegistrationFiles: ConfigurableFileCollection

    @TaskAction
    fun update() {
        val generatedRoot = generatedRegistrationFilesRootDir.get().asFile
        val godotProjectDir = File(godotProjectDirPath.get())
        val existingRegistrationFileIndex = readExistingRegistrationFileIndex(existingRegistrationFilesIndexFile.get().asFile)
        val generatedFilesByFqName = readGeneratedRegistrationFiles(generatedRoot, logger)
        val targetRoot = registrationFilesOutputDir.get().asFile
        val matchedFqNames = mutableSetOf<String>()
        val candidateEmptyDirs = mutableSetOf<File>()

        targetRoot.mkdirs()

        existingRegistrationFileIndex.forEach { indexEntry ->
            val existingFile = godotProjectDir.resolve(indexEntry.relativePath)
            val generatedFile = generatedFilesByFqName[indexEntry.fqName]

            if (generatedFile != null) {
                matchedFqNames.add(indexEntry.fqName)
                existingFile.parentFile.mkdirs()
                generatedFile.file.copyTo(existingFile, overwrite = true)
            } else if (existingFile.exists()) {
                if (!existingFile.delete()) {
                    logger.warn("Could not delete obsolete registration file. You need to delete it manually! ${existingFile.absolutePath}")
                } else {
                    existingFile.parentFile?.let(candidateEmptyDirs::add)
                }
            }
        }

        generatedFilesByFqName.values
            .asSequence()
            .filter { generatedFile -> generatedFile.fqName !in matchedFqNames }
            .forEach { generatedFile ->
                val targetFile = targetRoot.resolve(generatedFile.relativePath)
                targetFile.parentFile.mkdirs()
                generatedFile.file.copyTo(targetFile, overwrite = true)
            }

        candidateEmptyDirs
            .flatMap { dir -> generateSequence(dir) { currentDir -> currentDir.parentFile?.takeIf { parent -> parent.startsWith(targetRoot) } } }
            .distinct()
            .sortedByDescending { it.invariantSeparatorsPath.length }
            .filter { it.startsWith(targetRoot) && it != targetRoot }
            .forEach { emptyDir ->
                if (emptyDir.isDirectory && emptyDir.listFiles()?.isEmpty() == true && !emptyDir.delete()) {
                    logger.warn("Could not delete seemingly empty registration directory! ${emptyDir.absolutePath}")
                }
            }
    }
}

fun Project.entryGenerationSyncRegistrationFilesTask(
    generateEntryFilesTask: TaskProvider<ClassGraphGenerateEntryFilesTask>,
    indexExistingRegistrationFilesTask: TaskProvider<ClassGraphIndexExistingRegistrationFilesTask>,
): TaskProvider<ClassGraphUpdateRegistrationFilesTask> {
    val registrationFilesOutputDir = providers.provider {
        (
            godotJvmExtension
                .registrationFilesDirectory
                .orNull
                ?.asFile
                ?: projectDir
                    .resolve("gdj")
                    .apply { mkdirs() }
            )
            .relativeTo(projectDir)
            .path
            .replace(java.io.File.separator, "/")
            .removePrefix("/")
            .removeSuffix("/")
    }

    return tasks.register(
        "entryGenerationSyncRegistrationFiles",
        ClassGraphUpdateRegistrationFilesTask::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Synchronizes staged generated .gdj files into the Godot project."
        task.dependsOn(generateEntryFilesTask)
        task.dependsOn(indexExistingRegistrationFilesTask)
        task.generatedRegistrationFilesRootDir.convention(
            generateEntryFilesTask.flatMap { it.generatedRegistrationFilesRootDir }
        )
        task.godotProjectDirPath.convention(providers.provider { requireConfiguredGodotProjectDirectory().absolutePath })
        task.existingRegistrationFilesIndexFile.convention(
            indexExistingRegistrationFilesTask.flatMap { it.existingRegistrationFilesIndexFile }
        )
        task.registrationFilesOutputDir.convention(
            project.layout.projectDirectory.dir(registrationFilesOutputDir)
        )
        task.synchronizedRegistrationFiles.from(providers.provider {
            val generatedRoot = task.generatedRegistrationFilesRootDir.get().asFile
            val generatedFilesByFqName = readGeneratedRegistrationFiles(generatedRoot, logger)
            val existingRegistrationFileIndex = readExistingRegistrationFileIndex(task.existingRegistrationFilesIndexFile.get().asFile)
            val matchedFqNames = mutableSetOf<String>()
            val synchronizedFiles = mutableListOf<File>()
            val targetRoot = task.registrationFilesOutputDir.get().asFile

            existingRegistrationFileIndex.forEach { indexEntry ->
                if (generatedFilesByFqName.containsKey(indexEntry.fqName)) {
                    matchedFqNames.add(indexEntry.fqName)
                    synchronizedFiles.add(File(task.godotProjectDirPath.get()).resolve(indexEntry.relativePath))
                }
            }

            generatedFilesByFqName.values
                .asSequence()
                .filter { generatedFile -> generatedFile.fqName !in matchedFqNames }
                .mapTo(synchronizedFiles) { generatedFile ->
                    targetRoot.resolve(generatedFile.relativePath)
                }

            synchronizedFiles
        })
    }
}
