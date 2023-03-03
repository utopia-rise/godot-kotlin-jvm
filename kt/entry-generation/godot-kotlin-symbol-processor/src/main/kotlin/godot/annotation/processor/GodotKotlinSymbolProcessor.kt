package godot.annotation.processor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFile
import godot.annotation.processor.compiler.CompilerDataProvider
import godot.annotation.processor.utils.JvmTypeProvider
import godot.annotation.processor.utils.LoggerWrapper
import godot.annotation.processor.visitor.MetadataAnnotationVisitor
import godot.annotation.processor.visitor.RegistrationAnnotationVisitor
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredClassMetadataContainer
import godot.entrygenerator.model.SourceFile
import godot.tools.common.constants.godotEntryBasePackage
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
    private val registeredClassToKSFileMap = mutableMapOf<RegisteredClass, KSFile>()
    private val registeredClassMetadataContainers = mutableListOf<RegisteredClassMetadataContainer>()
    private val sourceFilesContainingRegisteredClasses = mutableListOf<SourceFile>()

    private lateinit var projectBasePath: File
    private lateinit var dummyFileBaseDir: File
    private var classPrefix: String? = null
    private var isFqNameRegistrationEnabled: Boolean = false
    private var isDummyFileHierarchyEnabled: Boolean = true

    private val alreadyGeneratedDummyFiles = mutableListOf<String>()

    @OptIn(KspExperimental::class)
    override fun process(resolver: Resolver): List<KSAnnotated> {
        val shouldGenerateRegistrars = registeredClassToKSFileMap.isEmpty()
        registeredClassMetadataContainers.clear()

        CompilerDataProvider.init(
            resolver,
            options["srcDirs"]
                ?.split(File.pathSeparator)
                ?: throw IllegalStateException("No srcDirs option provided")
        )

        projectBasePath = options["projectBasePath"]?.let { absolutePath -> File(absolutePath) }
            ?: throw IllegalStateException("No projectBasePath option provided")

        dummyFileBaseDir = options["dummyFileBaseDir"]?.let { absolutePath -> File(absolutePath) }
            ?: throw IllegalStateException("No dummyFileBaseDir option provided")

        classPrefix = options["classPrefix"]?.let { prefix ->
            if (prefix == "null") {
                null
            } else {
                prefix
            }
        } ?: throw IllegalStateException("No classPrefix option provided")

        isDummyFileHierarchyEnabled = options["isDummyFileHierarchyEnabled"]?.toBooleanStrictOrNull()
            ?: throw IllegalStateException("No isDummyFileHierarchyEnabled option provided or not a boolean")

        isFqNameRegistrationEnabled = options["isFqNameRegistrationEnabled"]?.toBooleanStrictOrNull()
            ?: throw IllegalStateException("No isFqNameRegistrationEnabled option provided or not a boolean")

        val registerAnnotationVisitor = RegistrationAnnotationVisitor(
            isFqNameRegistrationEnabled = isFqNameRegistrationEnabled,
            registeredClassToKSFileMap = registeredClassToKSFileMap,
            sourceFilesContainingRegisteredClasses = sourceFilesContainingRegisteredClasses,
            resPathProvider = { fqName, registeredName ->
                resPathFromFqNameAndRegisteredName(
                    fqName = fqName,
                    registeredName = registeredName,
                    isDummyFileHierarchyEnabled = isDummyFileHierarchyEnabled,
                    isFqNameRegistrationEnabled = isFqNameRegistrationEnabled,
                    projectBasePath = projectBasePath,
                    dummyFileBaseDir = dummyFileBaseDir
                )
            }
        )

        resolver.getNewFiles().ifEmpty { resolver.getAllFiles() }.toList().map {
            it.accept(registerAnnotationVisitor, Unit)
        }

        val metadataAnnotationVisitor = MetadataAnnotationVisitor(registeredClassMetadataContainers)

        resolver.getDeclarationsFromPackage(godotEntryBasePackage).forEach { declaration ->
            declaration.accept(metadataAnnotationVisitor, Unit)
        }

        val metadataToGenerateFor = registeredClassMetadataContainers
            .filter { !alreadyGeneratedDummyFiles.contains(it.resPath) }

        if (shouldGenerateRegistrars) {
            EntryGenerator.generateEntryFiles(
                projectDir = projectBasePath.absolutePath,
                logger = LoggerWrapper(logger),
                sourceFiles = sourceFilesContainingRegisteredClasses,
                // in the first round, only metadata from dependencies are present
                dependencyRegisteredClassMetadataContainers = metadataToGenerateFor,
                dummyFileBaseDir = dummyFileBaseDir.absolutePath,
                isDummyFileHierarchyEnabled = isDummyFileHierarchyEnabled,
                jvmTypeFqNamesProvider = JvmTypeProvider(),
                classRegistrarAppendableProvider = { registeredClass ->
                    codeGenerator.createNewFile(
                        Dependencies(
                            true,
                            requireNotNull(registeredClassToKSFileMap[registeredClass]) {
                                "No KSFile found for $registeredClass. This should never happen"
                            }
                        ),
                        godotEntryBasePackage,
                        "${registeredClass.registeredName}Registrar"
                    ).bufferedWriter()
                },
                mainBufferedWriterProvider = {
                    codeGenerator.createNewFile(
                        Dependencies(
                            true,
                            *registeredClassToKSFileMap.map { it.value }.toTypedArray()
                        ),
                        "godot",
                        "Entry"
                    ).bufferedWriter()
                }
            )
        }

        EntryGenerator.generateDummyFiles(
            registeredClassMetadataContainers = metadataToGenerateFor,
            dummyFileAppendableProvider = { metadata ->
                alreadyGeneratedDummyFiles.add(metadata.resPath)
                val newResPath = resPathFromFqNameAndRegisteredName(
                    fqName = metadata.fqName,
                    registeredName = metadata.registeredName,
                    isDummyFileHierarchyEnabled = isDummyFileHierarchyEnabled,
                    isFqNameRegistrationEnabled = isFqNameRegistrationEnabled,
                    projectBasePath = projectBasePath,
                    dummyFileBaseDir = dummyFileBaseDir,
                )
                codeGenerator.createNewFileByPath(
                    Dependencies.ALL_FILES,
                    "entryFiles/${newResPath.removePrefix("res://").removeSuffix(".gdj")}",
                    "gdj"
                ).bufferedWriter()
            }
        )

        return emptyList()
    }

    private fun resPathFromFqNameAndRegisteredName(
        fqName: String,
        registeredName: String,
        isDummyFileHierarchyEnabled: Boolean,
        isFqNameRegistrationEnabled: Boolean,
        projectBasePath: File,
        dummyFileBaseDir: File,
    ): String {
        val relativeBasePath = dummyFileBaseDir.relativeTo(projectBasePath)

        val fileName = if (isFqNameRegistrationEnabled) {
            fqName.replace(".", "_")
        } else {
            registeredName
        }

        return if (isDummyFileHierarchyEnabled) {
            val filePath = if (fqName.contains(".")) {
                "$relativeBasePath/${fqName.substringBeforeLast(".").replace(".", "/")}/${fileName}.gdj"
            } else {
                // in this case the class is in the top level package and has no package path
                "$relativeBasePath/${fileName}.gdj"
            }

            "res://$filePath"
        } else {
            "res://$relativeBasePath/${fileName}.gdj"
        }
    }

    override fun finish() {
        super.finish()

        cleanupOldDummyFiles()
        copyNewDummyFiles()
    }

    private fun cleanupOldDummyFiles() {
        dummyFileBaseDir
            .walkBottomUp()
            .forEach { file ->
                if (file.isFile && file.extension == "gdj") {
                    file.delete()
                }
                if (file.isDirectory && (file.listFiles() ?: arrayOf()).isEmpty()) {
                    file.delete()
                }
            }
    }

    private fun copyNewDummyFiles() {
        projectBasePath
            .resolve("build/generated/ksp/main/resources/entryFiles")
            .copyRecursively(
                target = projectBasePath,
                overwrite = true
            )
    }
}
