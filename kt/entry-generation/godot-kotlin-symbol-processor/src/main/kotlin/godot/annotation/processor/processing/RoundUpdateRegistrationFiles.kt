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
            val kspRegistrationFilesBaseDir = settings.projectBaseDir.resolve("build/generated/ksp/main/resources/entryFiles").resolve(settings.registrationBaseDirPathRelativeToProjectDir)
            val initialRegistrationFilesOutDir = settings.projectBaseDir.resolve(settings.registrationBaseDirPathRelativeToProjectDir)

            updateRegistrationFiles(
                kspRegistrationFilesBaseDir = kspRegistrationFilesBaseDir,
                initialRegistrationFilesOutDir = initialRegistrationFilesOutDir,
                existingRegistrationFilesMap = blackboard.existingRegistrationFilesMap,
            )
        }

        return emptyList()
    }

    private fun updateRegistrationFiles(
        kspRegistrationFilesBaseDir: File,
        initialRegistrationFilesOutDir: File,
        existingRegistrationFilesMap: Map<String, File>
    ) {
        val kspRegistrationFiles = kspRegistrationFilesBaseDir
            .walkTopDown()
            .filter { file ->
                file.extension == FileExtensions.GodotKotlinJvm.registrationFile
            }
            .associateBy { file ->
                file.name
            }

        // compare ksp and existing registration files
        val deletedRegistrationFiles = existingRegistrationFilesMap
            .filterKeys { registrationFileName -> !kspRegistrationFiles.containsKey(registrationFileName) }
            .values

        val updatedRegistrationFiles = existingRegistrationFilesMap
            .filterKeys { registrationFileName -> kspRegistrationFiles.containsKey(registrationFileName) }

        val newRegistrationFiles = kspRegistrationFiles
            .filterKeys { registrationFileName -> !existingRegistrationFilesMap.containsKey(registrationFileName) }


        // delete obsolete registration files
        deletedRegistrationFiles.forEach { obsoleteRegistrationFile ->
            try {
                obsoleteRegistrationFile.delete()
            } catch (e: Throwable) {
                logger.warn("Could not delete obsolete registration file. You need to delete it manually! ${obsoleteRegistrationFile.absolutePath}")
            }
        }
        // delete empty dirs in the initial gdj out folder (but not anywhere else!)
        initialRegistrationFilesOutDir
            .walkBottomUp()
            .filter { dir -> dir.isDirectory && dir.listFiles()?.isEmpty() == true }
            .forEach { emptyDir ->
                try {
                    emptyDir.delete()
                } catch (e: Throwable) {
                    logger.warn("Could not delete seemingly empty registration directory! ${emptyDir.absolutePath}")
                }
            }

        // replace existing registration files
        updatedRegistrationFiles.forEach { (registrationFileName, registrationFile) ->
            kspRegistrationFiles[registrationFileName]?.copyTo(registrationFile, overwrite = true)
        }

        // copy new registration files
        newRegistrationFiles.forEach { (_, registrationFile) ->
            val relativePath = registrationFile.toRelativeString(kspRegistrationFilesBaseDir)
            val targetFile = initialRegistrationFilesOutDir.resolve(relativePath)
            registrationFile.copyTo(targetFile, overwrite = true)
        }
    }
}
