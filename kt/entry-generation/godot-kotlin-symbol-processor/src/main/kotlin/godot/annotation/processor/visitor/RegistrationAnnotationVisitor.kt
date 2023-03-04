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
import godot.annotation.processor.ext.mapToClazz
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.SourceFile

class RegistrationAnnotationVisitor(
    private val isFqNameRegistrationEnabled: Boolean,
    private val registeredClassToKSFileMap: MutableMap<RegisteredClass, KSFile>,
    private val sourceFilesContainingRegisteredClasses: MutableList<SourceFile>,
    private val localResourcePathProvider: (fqName: String, registeredName: String) -> String,
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
                        val clazz = declaration.mapToClazz(isFqNameRegistrationEnabled, localResourcePathProvider)
                        if (clazz is RegisteredClass) {
                            clazz
                        } else null
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
