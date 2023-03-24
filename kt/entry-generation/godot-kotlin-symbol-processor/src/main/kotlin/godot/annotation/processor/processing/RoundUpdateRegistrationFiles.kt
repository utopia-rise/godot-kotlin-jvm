package godot.annotation.processor.processing

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated
import godot.annotation.processor.Settings
import godot.tools.common.constants.FileExtensions
import java.io.File

/**
 * Third round:
 *
 * Copies new/modified registration files to the designated destination directory and deletes obsolete registrations
 * files and empty directories as a result of the deletion of registration files.
 */
internal class RoundUpdateRegistrationFiles(
    override val blackboard: ProcessingRoundsBlackboard,
    override val resolver: Resolver,
    override val codeGenerator: CodeGenerator,
    override val logger: KSPLogger,
    private val settings: Settings,
) : BaseRound() {
    override fun executeInternal(): List<KSAnnotated> {
        if (settings.isRegistrationFileGenerationEnabled) {
            val newRegistrationFilesBaseDir = settings.projectBasePath.resolve("build/generated/ksp/main/resources/entryFiles")
            val currentRegistrationFilesBaseDir = settings.projectBasePath.resolve(settings.registrationBaseDirPathRelativeToProjectDir)

            deleteObsoleteRegistrationFilesAndEmptyDirs(currentRegistrationFilesBaseDir, newRegistrationFilesBaseDir)
            createOrUpdateRegistrationFiles(newRegistrationFilesBaseDir)
        }

        return emptyList()
    }

    private fun createOrUpdateRegistrationFiles(newRegistrationFilesBaseDir: File) {
        newRegistrationFilesBaseDir.copyRecursively(
            target = settings.projectBasePath,
            overwrite = true
        )
    }

    private fun deleteObsoleteRegistrationFilesAndEmptyDirs(
        currentRegistrationFilesBaseDir: File,
        newRegistrationFilesBaseDir: File,
    ) {
        val newRegistrationFileRelativePaths = newRegistrationFilesBaseDir
            .walkTopDown()
            .filter { file -> file.extension == FileExtensions.GodotKotlinJvm.registrationFile }
            .toList()
            .map { file ->
                file.relativeTo(newRegistrationFilesBaseDir)
            }
            .map { file ->
                file
                    .path // is relative path because of `relativeTo` above
                    .substringAfter("/") // first directory is always the project name in the resource dir
            }

        currentRegistrationFilesBaseDir
            .walkBottomUp()
            .filter { file ->
                !newRegistrationFileRelativePaths.contains(file.relativeTo(currentRegistrationFilesBaseDir).path)
            }
            .forEach { file ->
                if (file.isFile && file.extension == FileExtensions.GodotKotlinJvm.registrationFile) {
                    file.delete()
                }
                if (file.isDirectory && (file.listFiles() ?: arrayOf()).isEmpty()) {
                    file.delete()
                }
            }
    }
}
