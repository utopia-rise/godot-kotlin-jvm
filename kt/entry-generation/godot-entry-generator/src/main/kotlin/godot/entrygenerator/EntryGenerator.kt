package godot.entrygenerator

import godot.entrygenerator.checks.ClassesPerFileCheck
import godot.entrygenerator.checks.ConstructorArgCountCheck
import godot.entrygenerator.checks.ConstructorOverloadingCheck
import godot.entrygenerator.checks.DefaultConstructorCheck
import godot.entrygenerator.checks.ExportedMutablilityCheck
import godot.entrygenerator.checks.PackageSameAsFileNameCheck
import godot.entrygenerator.checks.RpcCheck
import godot.entrygenerator.checks.SignalTypeCheck
import godot.entrygenerator.filebuilder.ClassRegistrarFileBuilder
import godot.entrygenerator.filebuilder.MainEntryFileBuilder
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import java.io.BufferedWriter

object EntryGenerator {
    private var _logger: Logger? = null
    internal val logger: Logger
        get() = _logger ?: throw UninitializedPropertyAccessException("logger not yet initialized. Get logger only after generateEntryFiles was called")

    private var _jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)? = null
    internal val jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)
        get() = _jvmTypeFqNamesProvider ?: throw UninitializedPropertyAccessException("jvmTypeFqNamesProvider not yet initialized. Get jvmTypeFqNamesProvider only after generateEntryFiles was called")

    fun generateEntryFiles(
        projectDir: String,
        srcDirs: List<String>,
        logger: Logger,
        sourceFiles: List<SourceFile>,
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
        appendableProvider: (RegisteredClass) -> BufferedWriter,
        mainBufferedWriterProvider: () -> BufferedWriter
    ) {
        _logger = logger
        _jvmTypeFqNamesProvider = jvmTypeFqNamesProvider

        executeSanityChecks(projectDir, srcDirs, logger, sourceFiles)

        with(MainEntryFileBuilder) {
            sourceFiles.forEach { sourceFile ->
                sourceFile.registeredClasses.forEach { registeredClass ->
                    registerClassRegistrar(
                        ClassRegistrarFileBuilder(
                            registeredClass,
                            appendableProvider
                        )
                    )
                }
            }
            registerUserTypesVariantMappings(sourceFiles.flatMap { it.registeredClasses })
            build(mainBufferedWriterProvider)
        }
    }

    private fun executeSanityChecks(
        projectDir: String,
        srcDirs: List<String>,
        logger: Logger,
        sourceFiles: List<SourceFile>
    ) {
        ClassesPerFileCheck(logger, sourceFiles).execute()
        PackageSameAsFileNameCheck(projectDir, srcDirs, logger, sourceFiles).execute()

        DefaultConstructorCheck(logger, sourceFiles).execute()
        ConstructorArgCountCheck(logger, sourceFiles).execute()
        ConstructorOverloadingCheck(logger, sourceFiles).execute()

        SignalTypeCheck(logger, sourceFiles).execute()

        ExportedMutablilityCheck(logger, sourceFiles).execute()

        RpcCheck(logger, sourceFiles).execute()
    }
}
