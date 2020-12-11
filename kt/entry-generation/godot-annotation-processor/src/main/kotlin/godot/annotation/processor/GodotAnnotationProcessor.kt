package godot.annotation.processor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.extension.DescriptorContainer
import godot.entrygenerator.extension.EntryGeneratorExtension
import org.jetbrains.kotlin.platform.TargetPlatform
import org.jetbrains.kotlin.resolve.BindingContext
import java.io.File
import java.lang.instrument.IllegalClassFormatException
import java.net.URLClassLoader
import java.util.*

class GodotAnnotationProcessor(
    private val entryGenerationOutputDir: String,
    private val serviceFileOutputDir: String,
    private val extensionsJarDir: String
) : AbstractProcessor() {
    lateinit var bindingContext: BindingContext
    private val extensions = loadExtensions()

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return mutableSetOf(
            RegisterClass::class.java.canonicalName,
            RegisterFunction::class.java.canonicalName,
            RegisterProperty::class.java.canonicalName,
            RegisterSignal::class.java.canonicalName
        ).also {
            it.addAll(
                extensions.flatMap { extension -> extension.provideFullyQualifiedAnnotations() }
            )
        }
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

    private val registrationContainer = DescriptorContainer()

    private val extensionToDescriptors: MutableMap<EntryGeneratorExtension, DescriptorContainer> = extensions
        .map {
            it to DescriptorContainer()
        }
        .toMap()
        .toMutableMap()


    override fun process(roundEnvironment: RoundEnvironment) {
        registrationContainer.classes.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterClass::class.java.canonicalName)
                .map { it as Element.ClassElement }
                .map { it.classDescriptor }
        )

        registrationContainer.properties.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterProperty::class.java.canonicalName)
                .map { it as Element.PropertyElement }
                .map { it.propertyDescriptor }
        )

        registrationContainer.functions.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterFunction::class.java.canonicalName)
                .map { it as Element.FunctionElement }
                .map { it.func }
        )

        registrationContainer.signals.addAll(
            roundEnvironment
                .getElementsAnnotatedWith(RegisterSignal::class.java.canonicalName)
                .map { it as Element.PropertyElement }
                .map { it.propertyDescriptor }
        )

        extensionToDescriptors.entries.forEach { (extension, container) ->
            extension.provideFullyQualifiedAnnotations().forEach { annotation ->
                with(container.classes) {
                    addAll(
                        roundEnvironment
                            .getElementsAnnotatedWith(annotation)
                            .filterIsInstance<Element.ClassElement>()
                            .map { it.classDescriptor }
                    )
                    addAll(registrationContainer.classes)
                }
                container
                    .properties
                    .addAll(
                        roundEnvironment
                            .getElementsAnnotatedWith(annotation)
                            .filterIsInstance<Element.PropertyElement>()
                            .map { it.propertyDescriptor }
                    )
                container
                    .functions
                    .addAll(
                        roundEnvironment
                            .getElementsAnnotatedWith(annotation)
                            .filterIsInstance<Element.FunctionElement>()
                            .map { it.func }
                    )
                container
                    .signals
                    .addAll(
                        roundEnvironment
                            .getElementsAnnotatedWith(annotation)
                            .filterIsInstance<Element.PropertyElement>()
                            .map { it.propertyDescriptor }
                    )
            }
        }

        performSanityChecks()
    }

    private fun performSanityChecks() {
        registrationContainer.classes.forEach {
            if (it.constructors.size > 1) {
                throw IllegalClassFormatException("A Class annotated with \"@RegisterClass\" can only have a default constructor!\nBut ${it.name} contains ${it.constructors.size} constructors")
            }
        }
        registrationContainer.functions.forEach {
            if (!registrationContainer.classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a registered function: ${it.name} but is not annotated with @RegisterClass! Classes containing functions which are registered, also have to be registered!")
            }
        }
        registrationContainer.properties.forEach {
            if (!registrationContainer.classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a registered property: ${it.name} but is not annotated with @RegisterClass! Classes containing properties which are registered, also have to be registered!")
            }
        }
        registrationContainer.signals.forEach {
            if (!registrationContainer.classes.contains(it.containingDeclaration)) {
                throw Exception("${it.containingDeclaration.name.asString()} contains a signal: ${it.name} but is not annotated with @RegisterClass! Classes containing signals, also have to be registered!")
            }
        }
        extensionToDescriptors.forEach { (extension, container) -> extension.performSanityChecks(container, processingEnv.messager) }
    }

    override fun processingOver() {
        extensionToDescriptors.forEach { (extension, container) -> extension.beforeEntryGenerationHook(registrationContainer, container, bindingContext, processingEnv.messager) }
        EntryGenerator.generateEntryFile(EntryGenerationType.JVM, bindingContext, processingEnv.messager, entryGenerationOutputDir, registrationContainer, extensionToDescriptors)
        EntryGenerator.generateServiceFile(serviceFileOutputDir)
        extensionToDescriptors.forEach { (extension, container) -> extension.afterEntryGenerationHook(registrationContainer, container, bindingContext, processingEnv.messager) }
    }

    private fun loadExtensions(): List<EntryGeneratorExtension> {
        val uris = File(extensionsJarDir)
            .walkTopDown()
            .filter { it.extension == "jar" && it.name.startsWith("entryGeneratorExtension_") }
            .map { it.toURI().toURL() }
            .toList()
            .toTypedArray()

        val classloader = URLClassLoader(uris, this::class.java.classLoader)
        val serviceLoader = ServiceLoader.load(EntryGeneratorExtension::class.java, classloader)
        return serviceLoader.toList()
    }
}
