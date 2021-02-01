package godot.annotation.processor

import de.jensklingenberg.mpapt.model.AbstractProcessor
import de.jensklingenberg.mpapt.model.Element
import de.jensklingenberg.mpapt.model.RoundEnvironment
import de.jensklingenberg.mpapt.utils.KotlinPlatformValues
import godot.annotation.*
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.model.*
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.extensions.PreprocessedFileCreator
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.platform.TargetPlatform
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.resolve.BindingContext
import java.io.File
import java.lang.instrument.IllegalClassFormatException

class GodotAnnotationProcessor(
    private val project: MockProject,
    private val entryGenerationOutputDir: String,
    private val serviceFileOutputDir: String,
    private val srcDirs: List<File>
) : AbstractProcessor() {
    lateinit var bindingContext: BindingContext
    private val userClasses: List<KtClass> = getAllUserDefinedClasses()

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
        deleteObsoleteClassSpecificEntryFiles()
        EntryGenerator.psiClassesWithMembers = getAllRegisteredUserPsiClassesWithMembers()
        EntryGenerator.generateEntryFiles(
            EntryGenerationType.JVM,
            bindingContext,
            entryGenerationOutputDir,
            classes,
            properties,
            functions,
            signals,
            srcDirs
                .map {
                    it
                        .absolutePath
                        .removePrefix(File(entryGenerationOutputDir).parentFile.parentFile.absolutePath)
                        .removePrefix("/")
                        .let { path -> "$path/" }
                }
        )
        EntryGenerator.generateServiceFile(serviceFileOutputDir)
    }

    private fun getAllRegisteredUserPsiClassesWithMembers() = userClasses
        .filter { ktClass ->
            ktClass
                .annotationEntries
                .mapNotNull { annotationEntry -> annotationEntry.shortName?.asString() }
                .contains(RegisterClass::class.java.simpleName)
        }
        .map { ktClass ->
            PsiClassWithMembers(
                ktClass,
                ktClass
                    .getProperties()
                    .filter { ktProperty ->
                        ktProperty
                            .annotationEntries
                            .mapNotNull { annotationEntry -> annotationEntry.shortName?.asString() }
                            .contains(RegisterProperty::class.java.simpleName)
                    },
                ktClass
                    .declarations
                    .filterIsInstance<KtNamedFunction>()
                    .filter { ktNamedFunction ->
                        ktNamedFunction
                            .annotationEntries
                            .mapNotNull { annotationEntry -> annotationEntry.shortName?.asString() }
                            .contains(RegisterFunction::class.java.simpleName)
                    },
                ktClass
                    .getProperties()
                    .filter { ktProperty ->
                        ktProperty
                            .annotationEntries
                            .mapNotNull { annotationEntry -> annotationEntry.shortName?.asString() }
                            .contains(RegisterSignal::class.java.simpleName)
                    }
            )
        }

    private fun deleteObsoleteClassSpecificEntryFiles() {
        val userClassesFqNames = userClasses.map { userClass -> userClass.fqName?.asString() }

        File(entryGenerationOutputDir)
            .walkTopDown()
            .filter { it.isFile && it.exists() && it.extension == "kt" }
            .forEach {
                val fqName =
                    it.absolutePath.removePrefix(entryGenerationOutputDir).removePrefix("/godot/").replace("/", ".")
                        .removeSuffix("Entry.kt")
                if (!userClassesFqNames.contains(fqName)) {
                    it.delete()
                }
            }
    }

    private fun getAllUserDefinedClasses(): List<KtClass> {
        //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
        val localFileSystem = VirtualFileManager
            .getInstance()
            .getFileSystem(StandardFileSystems.FILE_PROTOCOL)
        val psiManager = PsiManager.getInstance(project)
        val virtualFileCreator = PreprocessedFileCreator(project)

        val processedFiles = hashSetOf<VirtualFile>()
        //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10

        return srcDirs
            .map { it.absolutePath }
            .flatMap { srcDirAbsolutePath ->
                //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
                val vFile = localFileSystem.findFileByPath(srcDirAbsolutePath) ?: return@flatMap emptySequence()
                if (!vFile.isDirectory && vFile.fileType != KotlinFileType.INSTANCE) {
                    return@flatMap emptySequence()
                }

                File(srcDirAbsolutePath)
                    .walkTopDown()
                    .map { file ->
                        if (!file.isFile) return@map null

                        val virtualFile = localFileSystem.findFileByPath(file.absolutePath)?.let(virtualFileCreator::create)
                        if (virtualFile != null && processedFiles.add(virtualFile)) {
                            val psiFile = psiManager.findFile(virtualFile)
                            if (psiFile is KtFile) {
                                psiFile
                            } else null
                        } else null
                    }
                    //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
                    .filterNotNull()
                    .flatMap { ktFile ->
                        ktFile
                            .children
                            .filterIsInstance<KtClass>()
                    }
            }
    }
}
