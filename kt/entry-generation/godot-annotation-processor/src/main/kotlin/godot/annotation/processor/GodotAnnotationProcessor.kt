package godot.annotation.processor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.EntryGenerator
import godot.registration.annotation.RegisterClass
import godot.registration.annotation.RegisterFunction
import godot.registration.annotation.RegisterProperty
import godot.registration.annotation.RegisterSignal
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.platform.TargetPlatform
import org.jetbrains.kotlin.resolve.BindingContext
import java.lang.instrument.IllegalClassFormatException

class GodotAnnotationProcessor(
    private val entryGenerationOutputDir: String,
    private val serviceFileOutputDir: String
): AbstractProcessor() {
    lateinit var bindingContext: BindingContext

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return mutableSetOf(
            RegisterClass::class.java.canonicalName,
            RegisterFunction::class.java.canonicalName,
            RegisterProperty::class.java.canonicalName,
            RegisterSignal::class.java.canonicalName
        )
    }

    override fun isTargetPlatformSupported(platform: TargetPlatform): Boolean {
        return when (val targetName = platform.first().platformName) {
            KotlinPlatformValues.JS -> false
            KotlinPlatformValues.JVM -> true
            KotlinPlatformValues.NATIVE -> false
            else -> {
                log("Unknown configured target: $targetName")
                false
            }
        }
    }

    private val classes: MutableSet<ClassDescriptor> = mutableSetOf()
    private val properties: MutableSet<PropertyDescriptor> = mutableSetOf()
    private val functions: MutableSet<FunctionDescriptor> = mutableSetOf()
    private val signals: MutableSet<PropertyDescriptor> = mutableSetOf()

    override fun process(roundEnvironment: RoundEnvironment) {
        classes.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterClass::class.java.canonicalName)
                .map { it as Element.ClassElement }
                .map { it.classDescriptor }
        )

        properties.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterProperty::class.java.canonicalName)
                .map { it as Element.PropertyElement }
                .map { it.propertyDescriptor }
        )

        functions.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterFunction::class.java.canonicalName)
                .map { it as Element.FunctionElement }
                .map { it.func }
        )

        signals.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterSignal::class.java.canonicalName)
                .map { it as Element.PropertyElement }
                .map { it.propertyDescriptor }
        )

        performSanityChecks()
    }

    private fun performSanityChecks() {
        classes.forEach {
            if (it.constructors.size > 1) {
                throw IllegalClassFormatException("A Class annotated with \"@RegisterClass\" can only have a default constructor!\nBut ${it.name} contains ${it.constructors.size} constructors")
            }
        }
        functions.forEach {
            if (!classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a registered function: ${it.name} but is not annotated with @RegisterClass! Classes containing functions which are registered, also have to be registered!")
            }
        }
        properties.forEach {
            if (!classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a registered property: ${it.name} but is not annotated with @RegisterClass! Classes containing properties which are registered, also have to be registered!")
            }
        }
        signals.forEach {
            if (!classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a signal: ${it.name} but is not annotated with @RegisterClass! Classes containing signals, also have to be registered!")
            }
        }
    }

    override fun processingOver() {
        EntryGenerator.generateEntryFile(EntryGenerationType.JVM, bindingContext, entryGenerationOutputDir, classes, properties, functions, signals)
        EntryGenerator.generateServiceFile(serviceFileOutputDir)
    }
}
