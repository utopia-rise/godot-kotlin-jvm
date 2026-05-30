package godot.entrygenerator

import godot.entrygenerator.checks.FunctionArgCountCheck
import godot.entrygenerator.checks.LateinitPropertyCheck
import godot.entrygenerator.checks.NullablePropertyCheck
import godot.entrygenerator.checks.PropertyMutablilityCheck
import godot.entrygenerator.checks.PropertyTypeCheck
import godot.entrygenerator.checks.RpcCheck
import godot.entrygenerator.checks.SignalTypeCheck
import godot.entrygenerator.exceptions.ChecksFailedException
import godot.entrygenerator.filebuilder.ClassRegistrarFileBuilder
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.Settings
import godot.entrygenerator.utils.Logger
import godot.tools.common.constants.godotEntryBasePackage
import java.io.BufferedWriter
import java.io.File

object EntryGenerator {
    private var _logger: Logger? = null
    internal val logger: Logger
        get() = _logger ?: throw UninitializedPropertyAccessException("logger not yet initialized. Get logger only after generateEntryFiles was called")

    private var _jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)? = null
    internal val jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)
        get() = _jvmTypeFqNamesProvider
            ?: throw UninitializedPropertyAccessException("jvmTypeFqNamesProvider not yet initialized. Get jvmTypeFqNamesProvider only after generateEntryFiles was called")


    fun generateEntryFilesUsingRegisteredClasses(
        settings: Settings,
        logger: Logger,
        registeredClasses: List<RegisteredClass>,
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
        classRegistrarAppendableProvider: (RegisteredClass) -> BufferedWriter,
        serviceFile: File
    ) {
        serviceFile.parentFile.mkdirs()

        _logger = logger
        _jvmTypeFqNamesProvider = jvmTypeFqNamesProvider

        if (executeSanityChecksUsingRegisteredClasses(logger, registeredClasses)) {
            throw ChecksFailedException()
        }

        val registeredClassesByFqName = registeredClasses.associateBy { it.fqName }
        registeredClasses.forEach { registeredClass ->
            ClassRegistrarFileBuilder(
                registeredClass = registeredClass,
                settings = settings,
                registrarAppendableProvider = classRegistrarAppendableProvider,
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
        registeredClasses: List<RegisteredClass>,
        settings: Settings
    ) {
        serviceFile.writeText(
            registeredClasses.joinToString(separator = "\n") { registeredClass ->
                "$godotEntryBasePackage.${registeredClass.getRegisteredName(settings)}Registrar"
            }
        )
    }

    private fun executeSanityChecksUsingRegisteredClasses(
        logger: Logger,
        registeredClasses: List<RegisteredClass>
    ): Boolean {
        return listOf(
            FunctionArgCountCheck(logger, registeredClasses).execute(),

            SignalTypeCheck(logger, registeredClasses).execute(),

            PropertyTypeCheck(logger, registeredClasses).execute(),
            PropertyMutablilityCheck(logger, registeredClasses).execute(),
            LateinitPropertyCheck(logger, registeredClasses).execute(),
            NullablePropertyCheck(logger, registeredClasses).execute(),

            RpcCheck(logger, registeredClasses).execute(),
        ).any { hasIssue -> hasIssue }
    }
}
