package godot.registrar.generator

import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.filebuilder.ClassRegistrarFileBuilder
import godot.registrar.generator.settings.Settings
import godot.registration.model.JvmType
import godot.registration.model.types.ScriptClass
import godot.registration.model.util.Logger
import godot.tools.common.constants.godotRegistrarBasePackage
import java.io.File

object RegistrarGenerator {
    private var _logger: Logger? = null
    internal val logger: Logger
        get() = _logger
            ?: throw UninitializedPropertyAccessException("logger not yet initialized. Get logger only after generateRegistrarFiles was called")

    private var _jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)? = null
    internal val jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)
        get() = _jvmTypeFqNamesProvider
            ?: throw UninitializedPropertyAccessException("jvmTypeFqNamesProvider not yet initialized. Get jvmTypeFqNamesProvider only after generateRegistrarFiles was called")


    fun generateRegistrarFilesUsingRegisteredClasses(
        settings: Settings,
        logger: Logger,
        registeredClasses: List<ScriptClass>,
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
        sourceOutputDir: File,
        serviceFile: File
    ) {
        serviceFile.parentFile.mkdirs()

        _logger = logger
        _jvmTypeFqNamesProvider = jvmTypeFqNamesProvider

        val registeredClassesByFqName = registeredClasses.associateBy { it.fqName }
        registeredClasses.forEach { registeredClass ->
            ClassRegistrarFileBuilder(
                registeredClass = registeredClass,
                settings = settings,
                sourceOutputDir = sourceOutputDir,
                registeredClassesByFqName = registeredClassesByFqName,
            ).build(settings)
        }

        generateServiceFile(
            serviceFile = serviceFile,
            registeredClasses = registeredClasses,
            settings = settings,
        )
    }

    private fun generateServiceFile(
        serviceFile: File,
        registeredClasses: List<ScriptClass>,
        settings: Settings
    ) {
        serviceFile.writeText(
            registeredClasses.joinToString(separator = "\n") { registeredClass ->
                "$godotRegistrarBasePackage.${registeredClass.getRegisteredName(settings)}Registrar"
            }
        )
    }
}
