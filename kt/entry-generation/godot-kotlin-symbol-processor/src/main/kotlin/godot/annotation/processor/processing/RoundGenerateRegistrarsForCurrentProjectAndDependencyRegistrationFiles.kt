package godot.annotation.processor.processing

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated
import godot.annotation.processor.Settings
import godot.annotation.processor.ext.provideRegistrationFileDir
import godot.annotation.processor.utils.JvmTypeProvider
import godot.annotation.processor.utils.LoggerWrapper
import godot.annotation.processor.visitor.MetadataAnnotationVisitor
import godot.annotation.processor.visitor.RegistrationAnnotationVisitor
import godot.entrygenerator.EntryGenerator
import godot.tools.common.constants.FileExtensions
import godot.tools.common.constants.godotEntryBasePackage

/**
 * First round:
 *
 * Generates entry files for current compilation and registration files for registrars from dependencies
 */
internal class RoundGenerateRegistrarsForCurrentProjectAndDependencyRegistrationFiles(
    override val blackboard: ProcessingRoundsBlackboard,
    override val resolver: Resolver,
    override val codeGenerator: CodeGenerator,
    override val logger: KSPLogger,
    private val settings: Settings,
) : BaseRound() {
    override fun executeInternal(): List<KSAnnotated> {
        val registerAnnotationVisitor = RegistrationAnnotationVisitor(
            isFqNameRegistrationEnabled = settings.isFqNameRegistrationEnabled,
            classNamePrefix = settings.classPrefix,
            localResourcePathProvider = { fqName, registeredName ->
                //  if the fqName does not contain a '.' it means the class is in the root package
                if (settings.isRegistrationFileHierarchyEnabled && fqName.contains(".")) {
                    "${fqName.substringBeforeLast(".").replace(".", "/")}/$registeredName"
                } else {
                    registeredName
                }.let { localPath -> "$localPath.${FileExtensions.GodotKotlinJvm.registrationFile}" }
            }
        )

        resolver.getNewFiles().ifEmpty { resolver.getAllFiles() }.toList().map {
            it.accept(registerAnnotationVisitor, Unit)
        }

        val metadataAnnotationVisitor = MetadataAnnotationVisitor()
        resolver.getDeclarationsFromPackage(godotEntryBasePackage).forEach { declaration ->
            declaration.accept(metadataAnnotationVisitor, Unit)
        }


        // generate entry files for this compilation
        EntryGenerator.generateEntryFiles(
            projectName = settings.projectName,
            projectDir = settings.projectBasePath.absolutePath,
            // in this first round, the received metadata containers are all from dependencies as the ones from this compilation will only be present in the next processing round
            classRegistrarFromDependencyCount = metadataAnnotationVisitor.registeredClassMetadataContainers.size,
            logger = LoggerWrapper(logger),
            sourceFiles = registerAnnotationVisitor.sourceFilesContainingRegisteredClasses,
            registrationFileBaseDir = settings.registrationBaseDirPathRelativeToProjectDir,
            jvmTypeFqNamesProvider = JvmTypeProvider(),
            classRegistrarAppendableProvider = { registeredClass ->
                codeGenerator.createNewFile(
                    Dependencies(
                        true,
                        requireNotNull(registerAnnotationVisitor.registeredClassToKSFileMap[registeredClass]) {
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
                        *registerAnnotationVisitor.registeredClassToKSFileMap.map { it.value }.toTypedArray()
                    ),
                    "godot",
                    "Entry"
                ).bufferedWriter()
            }
        )

        if (settings.isRegistrationFileGenerationEnabled) {
            EntryGenerator.generateRegistrationFiles(
                registeredClassMetadataContainers = metadataAnnotationVisitor.registeredClassMetadataContainers,
                registrationFileAppendableProvider = { metadata ->
                    blackboard.alreadyGeneratedRegistrationFiles.add(metadata.fqName)

                    val resourcePathFromProjectRoot = metadata.provideRegistrationFileDir(
                        currentCompilationProjectName = settings.projectName,
                        registrationBaseDirPathRelativeToProjectDir = settings.registrationBaseDirPathRelativeToProjectDir
                    )

                    codeGenerator.createNewFileByPath(
                        Dependencies.ALL_FILES,
                        "entryFiles/${resourcePathFromProjectRoot.removeSuffix(".${FileExtensions.GodotKotlinJvm.registrationFile}")}", // suffix will be added by the codeGenerator of KSP and is defined one line below
                        FileExtensions.GodotKotlinJvm.registrationFile
                    ).bufferedWriter()
                }
            )
        }

        return emptyList()
    }
}
