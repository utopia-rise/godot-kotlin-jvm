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
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.SourceFile
import java.io.File

class GodotKotlinSymbolProcessor(
    private val options: Map<String, String>,
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {
    private val registeredClassToKSFileMap = mutableMapOf<RegisteredClass, KSFile>()
    private val sourceFilesContainingRegisteredClasses = mutableListOf<SourceFile>()

    override fun process(resolver: Resolver): List<KSAnnotated> {
        CompilerDataProvider.init(
            resolver,
            options["srcDirs"]
                ?.split(File.pathSeparator)
                ?: throw IllegalStateException("No srcDirs option provided")
        )
        val projectBasePath = options["projectBasePath"]
            ?: throw IllegalStateException("No projectBasePath option provided")

        val registerAnnotationVisitor = RegistrationAnnotationVisitor(
            projectBasePath,
            registeredClassToKSFileMap,
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
            LoggerWrapper(logger),
            sourceFilesContainingRegisteredClasses,
            { registeredClass ->
                codeGenerator.createNewFile(
                    Dependencies(
                        false,
                        requireNotNull(registeredClassToKSFileMap[registeredClass]) {
                            "No KSFile found for $registeredClass. This should never happen"
                        }
                    ),
                    "godot.${registeredClass.containingPackage}",
                    "${registeredClass.name}Registrar"
                ).bufferedWriter()
            },
            {
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
}
