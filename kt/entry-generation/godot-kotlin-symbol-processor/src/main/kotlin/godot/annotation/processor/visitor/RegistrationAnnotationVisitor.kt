package godot.annotation.processor.visitor

import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSVisitorVoid
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.annotation.processor.Settings
import godot.annotation.processor.ext.hasCompilationErrors
import godot.annotation.processor.ext.hasRegistrationAnnotation
import godot.annotation.processor.ext.mapToClazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.SourceFile

/**
 * Collects [GodotScript], [GodotMember] annotations
 * for registrar generation and entry generation
 */
internal class RegistrationAnnotationVisitor(
    private val settings: Settings,
) : KSVisitorVoid() {

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
                            val clazz = declaration.mapToClazz(settings)
                            if (clazz is RegisteredClass) {
                                clazz
                            } else null
                        }
                    }
                    else -> if (declaration.hasRegistrationAnnotation()) {
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
                    symbolProcessorSource = this
                )
            )
        }
    }
}
