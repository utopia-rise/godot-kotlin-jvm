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

    private lateinit var projectName: String
    private lateinit var projectBasePath: File
    private lateinit var projectRelativeDummyFilesBaseDirPath: String
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

        projectName = options["projectName"]
            ?: throw IllegalStateException("No projectName option provided")

        projectBasePath = options["projectBasePath"]?.let { absolutePath -> File(absolutePath) }
            ?: throw IllegalStateException("No projectBasePath option provided")

        projectRelativeDummyFilesBaseDirPath = options["projectRelativeDummyFilesBaseDirPath"]
            ?: throw IllegalStateException("No projectRelativeDummyFilesBaseDirPath option provided")

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
            localResourcePathProvider = { fqName, registeredName ->
                //  if the fqName does not contain a . it means the class is in the root package
                if (isDummyFileHierarchyEnabled && fqName.contains(".")) {
                    "${fqName.substringBeforeLast(".").replace(".", "/")}/$registeredName"
                } else {
                    registeredName
                }.let { localPath -> "$localPath.gdj" }
            }
        )

        resolver.getNewFiles().ifEmpty { resolver.getAllFiles() }.toList().map {
            it.accept(registerAnnotationVisitor, Unit)
        }

        val metadataAnnotationVisitor = MetadataAnnotationVisitor(registeredClassMetadataContainers)

        resolver.getDeclarationsFromPackage(godotEntryBasePackage).forEach { declaration ->
            declaration.accept(metadataAnnotationVisitor, Unit)
        }

        // first round: dependencies
        // second round: user scripts
        // third round: empty
        val metadataToGenerateDummyFilesFor = registeredClassMetadataContainers
            .filter { !alreadyGeneratedDummyFiles.contains(it.localResPath) }

        if (shouldGenerateRegistrars) {
            EntryGenerator.generateEntryFiles(
                projectName = projectName,
                projectDir = projectBasePath.absolutePath,
                dependencyCount = metadataToGenerateDummyFilesFor.size,
                logger = LoggerWrapper(logger),
                sourceFiles = sourceFilesContainingRegisteredClasses,
                projectRelativeDummyFilesBaseDirPath = projectRelativeDummyFilesBaseDirPath,
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
            registeredClassMetadataContainers = metadataToGenerateDummyFilesFor,
            dummyFileAppendableProvider = { metadata ->
                alreadyGeneratedDummyFiles.add(metadata.localResPath)

                // keep in sync with ClassRegistry!
                val resourcePathFromProjectRoot = if (metadata.projectName == projectName) {
                    "$projectRelativeDummyFilesBaseDirPath/${metadata.localResPath}"
                } else {
                    "$projectRelativeDummyFilesBaseDirPath/dependencies/${metadata.projectName}/${metadata.localResPath}"
                }

                codeGenerator.createNewFileByPath(
                    Dependencies.ALL_FILES,
                    "entryFiles/${resourcePathFromProjectRoot.removeSuffix(".gdj")}", // suffix will be added by the codeGenerator of KSP and is defined one line below
                    "gdj"
                ).bufferedWriter()
            }
        )

        return emptyList()
    }

    override fun finish() {
        super.finish()

        cleanupOldDummyFiles()
        copyNewDummyFiles()
    }

    private fun cleanupOldDummyFiles() {
        projectBasePath
            .resolve(projectRelativeDummyFilesBaseDirPath)
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
