package godot.entrygenerator

import godot.entrygenerator.checks.ConstructorArgCountCheck
import godot.entrygenerator.checks.ConstructorOverloadingCheck
import godot.entrygenerator.checks.DefaultConstructorCheck
import godot.entrygenerator.checks.ExportedMutablilityCheck
import godot.entrygenerator.checks.RpcCheck
import godot.entrygenerator.checks.SignalTypeCheck
import godot.entrygenerator.filebuilder.ClassRegistrarFileBuilder
import godot.entrygenerator.filebuilder.DummyFileGenerator
import godot.entrygenerator.filebuilder.MainEntryFileBuilder
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredClassMetadataContainer
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import godot.tools.common.constants.godotEntryBasePackage
import godot.tools.common.constants.godotRegistrationPackage
import java.io.BufferedWriter
import java.io.File
import kotlin.random.Random

object EntryGenerator {
    private var _logger: Logger? = null
    internal val logger: Logger
        get() = _logger ?: throw UninitializedPropertyAccessException("logger not yet initialized. Get logger only after generateEntryFiles was called")

    private var _jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)? = null
    internal val jvmTypeFqNamesProvider: ((JvmType) -> Set<String>)
        get() = _jvmTypeFqNamesProvider ?: throw UninitializedPropertyAccessException("jvmTypeFqNamesProvider not yet initialized. Get jvmTypeFqNamesProvider only after generateEntryFiles was called")

    fun generateEntryFiles(
        projectDir: String,
        logger: Logger,
        sourceFiles: List<SourceFile>,
        dependencyRegisteredClassMetadataContainers: List<RegisteredClassMetadataContainer>,
        dummyFileBaseDir: String,
        isDummyFileHierarchyEnabled: Boolean,
        jvmTypeFqNamesProvider: (JvmType) -> Set<String>,
        classRegistrarAppendableProvider: (RegisteredClass) -> BufferedWriter,
        mainBufferedWriterProvider: () -> BufferedWriter
    ) {
        // the package path for an entry file needs to be unique over all possible dependencies otherwise they'll override each other and only one will be used/loaded
        val randomPackageForEntryFile = randomPackageName()

        _logger = logger
        _jvmTypeFqNamesProvider = jvmTypeFqNamesProvider

        executeSanityChecks(logger, sourceFiles)

        with(MainEntryFileBuilder) {
            sourceFiles.forEach { sourceFile ->
                sourceFile.registeredClasses.forEach { registeredClass ->
                    registerClassRegistrar(
                        ClassRegistrarFileBuilder(
                            registeredClass,
                            classRegistrarAppendableProvider
                        )
                    )
                }
            }
            registerUserTypesVariantMappings(sourceFiles.flatMap { it.registeredClasses })
            registerDependencyRebinds(
                dependencyRegisteredClassMetadataContainers.associate { dependencyRegisteredClassMetadataContainer ->
                    val relativeBasePath = File(dummyFileBaseDir).relativeTo(File(projectDir))
                    val newResPath = if (isDummyFileHierarchyEnabled) {
                        val filePath = if (dependencyRegisteredClassMetadataContainer.fqName.contains(".")) {
                            "$relativeBasePath/${dependencyRegisteredClassMetadataContainer.fqName.substringBeforeLast(".").replace(".", "/")}/${dependencyRegisteredClassMetadataContainer.registeredName}.gdj"
                        } else {
                            // in this case the class is in the top level package and has no package path
                            "$relativeBasePath/${dependencyRegisteredClassMetadataContainer.registeredName}.gdj"
                        }
                        "res://$filePath"
                    } else {
                        "res://$relativeBasePath/${dependencyRegisteredClassMetadataContainer.registeredName}.gdj"
                    }
                    dependencyRegisteredClassMetadataContainer.resPath to newResPath
                }
            )
            build(randomPackageForEntryFile, mainBufferedWriterProvider)
        }

        generateServiceFile(randomPackageForEntryFile, projectDir)
    }

    fun generateDummyFiles(
        registeredClassMetadataContainers: List<RegisteredClassMetadataContainer>,
        dummyFileAppendableProvider: (RegisteredClassMetadataContainer) -> BufferedWriter,
    ) {
        registeredClassMetadataContainers.forEach { metadata ->
            DummyFileGenerator(
                metadata,
                dummyFileAppendableProvider
            ).build()
        }
    }

    private fun generateServiceFile(randomPackagePathForEntryFile: String, projectDir: String) {
        File(projectDir)
            .resolve("src/main/resources/META-INF/services")
            .apply { mkdirs() }
            .resolve("$godotRegistrationPackage.Entry")
            .apply {
                writeText("$godotEntryBasePackage.$randomPackagePathForEntryFile.Entry")
            }
    }

    private fun executeSanityChecks(
        logger: Logger,
        sourceFiles: List<SourceFile>
    ) {
        DefaultConstructorCheck(logger, sourceFiles).execute()
        ConstructorArgCountCheck(logger, sourceFiles).execute()
        ConstructorOverloadingCheck(logger, sourceFiles).execute()

        SignalTypeCheck(logger, sourceFiles).execute()

        ExportedMutablilityCheck(logger, sourceFiles).execute()

        RpcCheck(logger, sourceFiles).execute()
    }

    private fun randomPackageName(length: Int = 20): String {
        val allowedChars = ('A'..'Z') + ('a'..'z')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }

}
