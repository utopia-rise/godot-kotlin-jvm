package godot.registrar.generator

import godot.registrar.generator.builder.RegistrarClassGenerator
import godot.registrar.generator.builder.RegistrarServiceFileBuilder
import godot.registrar.generator.builder.RegistrationFileBuilder
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass
import java.io.File

object RegistrarGenerator {
    fun generateRegistrarFiles(
        settings: Settings,
        logger: Logger,
        scriptClasses: List<ScriptClass>,
        sourceOutputDir: File,
        serviceFile: File,
        registrationOutputDir: File? = null,
    ) {
        val context = GeneratorContext(
            settings = settings,
            logger = logger,
            scriptClasses = scriptClasses,
        )
        val registeredClasses = scriptClasses.filter { scriptClass -> scriptClass.isRegistered }

        generateClassArtifactsUsingRegisteredClasses(context, settings, registeredClasses, sourceOutputDir, registrationOutputDir)
        RegistrarServiceFileBuilder(context, serviceFile).generate(registeredClasses)
    }

    fun generateRegistrarFilesUsingRegisteredClasses(
        settings: Settings,
        logger: Logger,
        registeredClasses: List<ScriptClass>,
        sourceOutputDir: File,
        serviceFile: File,
        registrationOutputDir: File? = null,
    ) {
        val context = GeneratorContext(
            settings = settings,
            logger = logger,
            registeredClassesByFqName = registeredClasses.associateBy { it.fqName },
        )

        generateClassArtifactsUsingRegisteredClasses(context, settings, registeredClasses, sourceOutputDir, registrationOutputDir)
        RegistrarServiceFileBuilder(context, serviceFile).generate(registeredClasses)
    }

    fun generateClassArtifacts(
        settings: Settings,
        logger: Logger,
        scriptClasses: List<ScriptClass>,
        sourceOutputDir: File,
        registrationOutputDir: File? = null,
        generatedClassFqNames: Set<String>? = null,
    ) {
        val context = GeneratorContext(
            settings = settings,
            logger = logger,
            scriptClasses = scriptClasses,
        )
        val registeredClasses = scriptClasses
            .filter { scriptClass -> scriptClass.isRegistered }
            .filter { scriptClass -> generatedClassFqNames == null || scriptClass.fqName in generatedClassFqNames }

        generateClassArtifactsUsingRegisteredClasses(
            context = context,
            settings = settings,
            registeredClasses = registeredClasses,
            sourceOutputDir = sourceOutputDir,
            registrationOutputDir = registrationOutputDir,
        )
    }

    fun generateClassArtifactsUsingRegisteredClasses(
        settings: Settings,
        logger: Logger,
        registeredClasses: List<ScriptClass>,
        sourceOutputDir: File,
        registrationOutputDir: File? = null,
    ) {
        val context = GeneratorContext(
            settings = settings,
            logger = logger,
            registeredClassesByFqName = registeredClasses.associateBy { it.fqName },
        )
        generateClassArtifactsUsingRegisteredClasses(context, settings, registeredClasses, sourceOutputDir, registrationOutputDir)
    }

    private fun generateClassArtifactsUsingRegisteredClasses(
        context: GeneratorContext,
        settings: Settings,
        registeredClasses: List<ScriptClass>,
        sourceOutputDir: File,
        registrationOutputDir: File? = null,
    ) {
        RegistrarClassGenerator(context, sourceOutputDir).generate(registeredClasses)
        registrationOutputDir?.let { outputDir ->
            RegistrationFileBuilder(context, settings, outputDir).generate(registeredClasses)
        }
    }
}
