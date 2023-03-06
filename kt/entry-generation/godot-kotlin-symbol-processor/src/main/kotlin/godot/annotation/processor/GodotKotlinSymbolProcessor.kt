package godot.annotation.processor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import godot.annotation.processor.compiler.CompilerDataProvider
import godot.annotation.processor.processing.*
import java.io.File

/**
 * KSP (https://github.com/google/ksp) based kotlin symbol processor
 *
 * Acts as a annotation processor on steroids for godot kotlin annotations and maps ksp compiler classes to entry gen
 * classes so they can be processed language independent.
 */
class GodotKotlinSymbolProcessor(
    private val options: Map<String, String>,
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {
    private lateinit var settings: Settings
    private val processingRoundsBlackboard = ProcessingRoundsBlackboard()
    private var processingRound = -1

    override fun process(resolver: Resolver): List<KSAnnotated> {
        processingRound++
        if (processingRound == 0) {
            CompilerDataProvider.init(
                resolver,
                options["srcDirs"]
                    ?.split(File.pathSeparator)
                    ?: throw IllegalStateException("No srcDirs option provided")
            )
            settings = provideSettingsFromArguments()
        }

        val currentProcessingRound = ProcessingRound.values().getOrNull(processingRound)
            ?: return emptyList<KSAnnotated>().also {
                logger.warn("Unexpected processing round: $processingRound. Only expecting ${ProcessingRound.values().size} rounds. No op.")
            }
        logger.info("Current processing round: $currentProcessingRound")

        return when (currentProcessingRound) {
            ProcessingRound.GENERATE_REGISTRARS_AND_REGISTRATION_FILES_FOR_DEPENDENCIES -> RoundGenerateRegistrarsAndDependencyRegistrationFiles(
                blackboard = processingRoundsBlackboard,
                resolver = resolver,
                codeGenerator = codeGenerator,
                logger = logger,
                settings = settings
            )

            ProcessingRound.GENERATE_REGISTRATION_FILES_FOR_REGISTRARS -> RoundGenerateRegistrationFilesForCurrentCompilation(
                blackboard = processingRoundsBlackboard,
                resolver = resolver,
                codeGenerator = codeGenerator,
                logger = logger,
                settings = settings
            )

            ProcessingRound.UPDATE_REGISTRATION_FILES -> RoundUpdateRegistrationFiles(
                blackboard = processingRoundsBlackboard,
                resolver = resolver,
                codeGenerator = codeGenerator,
                logger = logger,
                settings = settings
            )
        }.execute()
    }

    private fun provideSettingsFromArguments(): Settings {
        return Settings(
            projectName = options["projectName"] ?: throw IllegalStateException("No projectName option provided"),
            projectBasePath = options["projectBasePath"]?.let { absolutePath -> File(absolutePath) }
                ?: throw IllegalStateException("No projectBasePath option provided"),
            registrationBaseDirPathRelativeToProjectDir = options["registrationFileBaseDir"]
                ?: throw IllegalStateException("No registrationFileBaseDir option provided"),
            classPrefix = options["classPrefix"]?.let { prefix ->
                if (prefix == "null") {
                    null
                } else {
                    prefix
                }
            },
            isFqNameRegistrationEnabled = options["isFqNameRegistrationEnabled"]?.toBooleanStrictOrNull()
                ?: throw IllegalStateException("No isFqNameRegistrationEnabled option provided or not a boolean"),
            isRegistrationFileHierarchyEnabled = options["isRegistrationFileHierarchyEnabled"]?.toBooleanStrictOrNull()
                ?: throw IllegalStateException("No isRegistrationFileHierarchyEnabled option provided or not a boolean")
        )
    }
}
