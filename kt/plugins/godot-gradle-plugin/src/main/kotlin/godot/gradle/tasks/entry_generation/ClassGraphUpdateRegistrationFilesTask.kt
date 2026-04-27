package godot.gradle.tasks

import godot.gradle.projectExt.godotJvmExtension
import godot.tools.common.constants.FileExtensions
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import java.io.File

abstract class ClassGraphUpdateRegistrationFilesTask : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val generatedRegistrationFilesRootDir: DirectoryProperty

    @get:OutputDirectory
    abstract val registrationFilesOutputDir: DirectoryProperty

    @TaskAction
    fun update() {
        val generatedRoot = generatedRegistrationFilesRootDir.get().asFile
        val targetRoot = registrationFilesOutputDir.get().asFile
        targetRoot.mkdirs()

        val generatedFilesByRelativePath = generatedRoot
            .walkTopDown()
            .filter { it.isFile && it.extension == FileExtensions.GodotKotlinJvm.registrationFile }
            .associateBy { it.relativeTo(generatedRoot).invariantSeparatorsPath }

        val targetFilesByRelativePath = targetRoot
            .walkTopDown()
            .filter { it.isFile && it.extension == FileExtensions.GodotKotlinJvm.registrationFile }
            .filterNot { it.relativeTo(targetRoot).invariantSeparatorsPath.startsWith("dependencies/") }
            .associateBy { it.relativeTo(targetRoot).invariantSeparatorsPath }

        targetFilesByRelativePath
            .filterKeys { relativePath -> relativePath !in generatedFilesByRelativePath }
            .values
            .forEach { obsoleteFile ->
                if (!obsoleteFile.delete()) {
                    logger.warn("Could not delete obsolete registration file. You need to delete it manually! ${obsoleteFile.absolutePath}")
                }
            }

        generatedFilesByRelativePath.forEach { (relativePath, generatedFile) ->
            val targetFile = targetRoot.resolve(relativePath)
            targetFile.parentFile.mkdirs()
            generatedFile.copyTo(targetFile, overwrite = true)
        }

        targetRoot
            .walkBottomUp()
            .filter { dir -> dir.isDirectory && dir.listFiles()?.isEmpty() == true }
            .filterNot { it == targetRoot }
            .filterNot { it.relativeTo(targetRoot).invariantSeparatorsPath.startsWith("dependencies") }
            .forEach { emptyDir ->
                if (!emptyDir.delete()) {
                    logger.warn("Could not delete seemingly empty registration directory! ${emptyDir.absolutePath}")
                }
            }
    }
}

fun Project.classGraphUpdateRegistrationFilesTask(
    generateEntryFilesTask: TaskProvider<ClassGraphGenerateEntryFilesTask>,
): TaskProvider<ClassGraphUpdateRegistrationFilesTask> {
    val registrationFilesOutputDir = providers.provider {
        (
            godotJvmExtension
                .registrationFileBaseDir
                .orNull
                ?.asFile
                ?: projectDir
                    .resolve(FileExtensions.GodotKotlinJvm.registrationFile)
                    .apply {
                        if (godotJvmExtension.isRegistrationFileGenerationEnabled.getOrElse(true)) {
                            mkdirs()
                        }
                    }
            )
            .relativeTo(projectDir)
            .path
            .replace(java.io.File.separator, "/")
            .removePrefix("/")
            .removeSuffix("/")
    }

    return tasks.register(
        "classGraphUpdateRegistrationFiles",
        ClassGraphUpdateRegistrationFilesTask::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Applies staged generated .gdj files to the project registration directory."
        task.dependsOn(generateEntryFilesTask)
        task.generatedRegistrationFilesRootDir.convention(
            generateEntryFilesTask.flatMap { it.generatedRegistrationFilesRootDir }
        )
        task.registrationFilesOutputDir.convention(
            project.layout.projectDirectory.dir(registrationFilesOutputDir)
        )
        task.onlyIf { godotJvmExtension.isRegistrationFileGenerationEnabled.getOrElse(true) }
    }
}
