package godot.registrar.generator

import godot.registrar.generator.builder.RegistrationFileBuilder
import godot.registrar.generator.builder.RegistrarServiceFileBuilder
import godot.registrar.generator.builder.RegistrarClassGenerator
import godot.registration.model.types.ScriptClass
import godot.registration.model.logging.Logger
import java.io.File

object RegistrarGenerator {
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

        RegistrarClassGenerator(context, sourceOutputDir).generate(registeredClasses)
        RegistrarServiceFileBuilder(context, serviceFile).generate(registeredClasses)
        registrationOutputDir?.let { outputDir ->
            RegistrationFileBuilder(settings, outputDir).generate(registeredClasses)
        }
    }
}
