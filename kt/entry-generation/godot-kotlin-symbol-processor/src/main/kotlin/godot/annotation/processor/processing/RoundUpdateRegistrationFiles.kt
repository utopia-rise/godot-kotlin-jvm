package godot.annotation.processor.processing

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated
import godot.annotation.processor.Settings
import godot.entrygenerator.EntryGenerator

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

            EntryGenerator.updateRegistrationFiles(
                generatedRegistrationFilesBaseDir = kspRegistrationFilesBaseDir,
                initialRegistrationFilesOutDir = initialRegistrationFilesOutDir,
                existingRegistrationFilesMap = blackboard.existingRegistrationFilesMap,
            )
        }

        return emptyList()
    }
}
