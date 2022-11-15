package godot.annotation.processor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFile
import godot.annotation.processor.compiler.CompilerDataProvider
import godot.annotation.processor.utils.LoggerWrapper
import godot.annotation.processor.visitor.RegistrationAnnotationVisitor
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.SourceFile
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
    private val classToKSFileMap = mutableMapOf<Clazz, KSFile>()
    private val sourceFilesContainingRegisteredClasses = mutableListOf<SourceFile>()

    private lateinit var projectBasePath: String

    override fun process(resolver: Resolver): List<KSAnnotated> {
        CompilerDataProvider.init(
            resolver,
            options["srcDirs"]
                ?.split(File.pathSeparator)
                ?: throw IllegalStateException("No srcDirs option provided")
        )
        projectBasePath = options["projectBasePath"]
            ?: throw IllegalStateException("No projectBasePath option provided")

        val registerAnnotationVisitor = RegistrationAnnotationVisitor(
            logger,
            projectBasePath,
            classToKSFileMap,
            sourceFilesContainingRegisteredClasses
        )

        resolver.getAllFiles().toList().map {
            it.accept(registerAnnotationVisitor, Unit)
        }
        return emptyList()
    }

    override fun finish() {
        super.finish()
        EntryGenerator.generateEntryFiles(
            projectDir = projectBasePath,
            srcDirs = CompilerDataProvider.srcDirs,
            logger = LoggerWrapper(logger),
            sourceFiles = sourceFilesContainingRegisteredClasses,
            appendableProvider = { registeredClass ->
                codeGenerator.createNewFile(
                    Dependencies(
                        false,
                        requireNotNull(classToKSFileMap[registeredClass]) {
                            "No KSFile found for $registeredClass. This should never happen"
                        }
                    ),
                    "godot.${registeredClass.containingPackage}",
                    "${registeredClass.name}Registrar"
                ).bufferedWriter()
            },
            mainBufferedWriterProvider = {
                codeGenerator.createNewFile(
                    Dependencies(
                        true,
                        *classToKSFileMap.map { it.value }.toTypedArray()
                    ),
                    "godot",
                    "Entry"
                ).bufferedWriter()
            }
        )
    }
}
