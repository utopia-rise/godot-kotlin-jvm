package godot.annotation.processor.visitor

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSVisitorVoid
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.processor.ext.fqNameUnsafe
import godot.annotation.processor.ext.hasCompilationErrors
import godot.annotation.processor.ext.mapToClazz
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.SourceFile

class RegistrationAnnotationVisitor(
    private val logger: KSPLogger,
    private val projectBasePath: String,
    private val registeredClassToKSFileMap: MutableMap<Clazz, KSFile>,
    private val sourceFilesContainingRegisteredClasses: MutableList<SourceFile>
) : KSVisitorVoid() {

    private val registerAnnotations = listOf(
        RegisterClass::class.qualifiedName!!,
        RegisterConstructor::class.qualifiedName!!,
        RegisterFunction::class.qualifiedName!!,
        RegisterProperty::class.qualifiedName!!,
        RegisterSignal::class.qualifiedName!!
    )

    override fun visitFile(file: KSFile, data: Unit) {
        val absolutePath = file.filePath
        val registeredClasses = file
            .declarations
            .mapNotNull { declaration ->
                when (declaration) {
                    is KSClassDeclaration -> {
                        if (!declaration.hasCompilationErrors()) {
                            declaration.mapToClazz(projectBasePath)
                        } else {
                            logger.warn("Declaration will not be processed as it seems to have compilation errors.", declaration)
                            null
                        }
                    }
                    else -> if (declaration.annotations.any { registerAnnotations.contains(it.fqNameUnsafe) }) {
                        throw IllegalStateException("${declaration.qualifiedName} was registered top level. Only classes can be registered top level.")
                    } else {
                        null
                    }
                }
            }
            .onEach { registeredClass ->
                registeredClassToKSFileMap[registeredClass] = file
            }
            .toList()

        if (registeredClasses.isNotEmpty()) {
            sourceFilesContainingRegisteredClasses.add(
                SourceFile(
                    absolutePath,
                    registeredClasses
                )
            )
        }
    }
}
