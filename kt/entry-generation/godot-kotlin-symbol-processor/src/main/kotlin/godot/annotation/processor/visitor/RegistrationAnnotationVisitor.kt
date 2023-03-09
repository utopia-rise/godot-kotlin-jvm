package godot.annotation.processor.visitor

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
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.SourceFile

/**
 * Collects [RegisterClass], [RegisterConstructor], [RegisterFunction], [RegisterProperty], [RegisterSignal] annotations
 * for registrar generation and entry generation
 */
internal class RegistrationAnnotationVisitor(
    private val isFqNameRegistrationEnabled: Boolean,
    private val classNamePrefix: String?,
    private val localResourcePathProvider: (fqName: String, registeredName: String) -> String,
) : KSVisitorVoid() {

    private val registerAnnotations = listOf(
        RegisterClass::class.qualifiedName!!,
        RegisterConstructor::class.qualifiedName!!,
        RegisterFunction::class.qualifiedName!!,
        RegisterProperty::class.qualifiedName!!,
        RegisterSignal::class.qualifiedName!!
    )

    private val _registeredClassToKSFileMap: MutableMap<RegisteredClass, KSFile> = mutableMapOf()
    val registeredClassToKSFileMap: Map<RegisteredClass, KSFile> = _registeredClassToKSFileMap

    private val _sourceFilesContainingRegisteredClasses: MutableList<SourceFile> = mutableListOf()
    val sourceFilesContainingRegisteredClasses: List<SourceFile> = _sourceFilesContainingRegisteredClasses

    override fun visitFile(file: KSFile, data: Unit) {
        val absolutePath = file.filePath
        val registeredClasses = file
            .declarations
            .mapNotNull { declaration ->
                when (declaration) {
                    is KSClassDeclaration -> {
                        if (declaration.hasCompilationErrors()) {
                            null
                        } else {
                            val clazz = declaration.mapToClazz(isFqNameRegistrationEnabled, classNamePrefix, localResourcePathProvider)
                            if (clazz is RegisteredClass) {
                                clazz
                            } else null
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
                _registeredClassToKSFileMap[registeredClass] = file
            }
            .toList()

        if (registeredClasses.isNotEmpty()) {
            _sourceFilesContainingRegisteredClasses.add(
                SourceFile(
                    absolutePath = absolutePath,
                    registeredClasses = registeredClasses,
                    source = this
                )
            )
        }
    }
}
