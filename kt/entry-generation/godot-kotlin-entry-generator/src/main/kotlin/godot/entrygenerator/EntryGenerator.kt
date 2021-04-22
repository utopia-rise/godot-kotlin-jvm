package godot.entrygenerator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.compiler.CompilerEnvironmentProvider
import godot.entrygenerator.exceptions.ClassNameRegistrationException
import godot.entrygenerator.exceptions.MultipleClassesPerFileRegistrationException
import godot.entrygenerator.exceptions.WrongPackagePathRegistrationException
import godot.entrygenerator.extension.getFqNameToRegisteredClassNamePair
import godot.entrygenerator.filebuilder.EntryFileBuilder
import godot.entrygenerator.generator.ServiceGenerator
import godot.entrygenerator.model.ClassWithMembers
import godot.entrygenerator.model.PsiClassWithMembers
import godot.entrygenerator.model.REGISTER_CLASS_ANNOTATION
import godot.entrygenerator.transformer.transformTypeDeclarationsToClassWithMembers
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import java.io.File

object EntryGenerator {
    /**
     * Only needed on the JVM to get propertyPsiAssignments on not recompiled compiled parent classes on
     * incremental builds
     */
    var psiClassesWithMembers: List<PsiClassWithMembers> = listOf()

    /**
     * Only needed on the JVM as for performance optimization we register the resPath instead of the fqName
     */
    var fqNamesToRePath: Map<String, String> = mapOf()

    fun generateEntryFiles(
        bindingContext: BindingContext,
        outputPath: String,
        classes: Set<ClassDescriptor>,
        properties: Set<PropertyDescriptor>,
        functions: Set<FunctionDescriptor>,
        signals: Set<PropertyDescriptor>,
        srcDirs: List<String>
    ) {
        EntryFileBuilder
            .registerClassesWithMembers(
                bindingContext,
                transformTypeDeclarationsToClassWithMembers(
                    classes,
                    properties,
                    functions,
                    signals
                ),
                outputPath
            )
            .build(outputPath)

        classNameSanityCheck()
        oneClassPerFileSanityCheck()
        packagePathSanityCheck(srcDirs)
    }

    fun generateServiceFile(serviceFileDir: String) = ServiceGenerator.generateServiceFile(serviceFileDir)

    /**
     * To be called from gradle plugin
     *
     * Deletes old entry files and regenerated the main entry file with calls to all existing and new class specific entry files.
     *
     * Needed for incremental compilation
     */
    fun deleteOldEntryFilesAndReGenerateMainEntryFile(sourceDirs: List<String>, outputPath: String) {

        val userClassesFqNames = CompilerEnvironmentProvider
            .provide(sourceDirs)
            .getSourceFiles()
            .flatMap { ktFile ->
                ktFile
                    .children
                    .filterIsInstance<KtClass>()
                    .mapNotNull { ktClass -> ktClass.fqName?.asString() }
            }

        File(outputPath)
            .walkTopDown()
            .filter { it.isFile && it.exists() && it.extension == "kt" }
            .forEach {
                val fqName = it
                    .absolutePath
                    .removePrefix(outputPath)
                    .removePrefix("${File.separator}godot${File.separator}")
                    .replace(File.separator, ".")
                    .removeSuffix("Entry.kt")

                if (!userClassesFqNames.contains(fqName) && it.name != "Entry") {
                    it.delete()
                }
            }

        val mainEntryRegistryControlFlow = FunSpec
            .builder("init")
            .receiver(ClassName("godot.runtime.Entry", "Context"))
            .addModifiers(KModifier.OVERRIDE)

        addCallsToExistingEntryFilesToMainEntryRegistry(outputPath, setOf(), mainEntryRegistryControlFlow)

        FileSpec
            .builder("godot", "Entry")
            .addComment("THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD")
            .addType(
                TypeSpec
                    .classBuilder(ClassName("godot", "Entry"))
                    .superclass(ClassName("godot.runtime", "Entry"))
                    .addFunction(mainEntryRegistryControlFlow.build())
                    .addFunction(
                        FunSpec
                            .builder("initEngineTypes")
                            .receiver(ClassName("godot.runtime.Entry", "Context"))
                            .addModifiers(KModifier.OVERRIDE)
                            .addStatement("%M()", MemberName("godot", "registerVariantMapping"))
                            .addStatement("%M()", MemberName("godot", "registerEngineTypes"))
                            .addStatement("%M()", MemberName("godot", "registerEngineTypeMethods"))
                            .build()
                    )
                    .build()
            )
            .build()
            .writeTo(File(outputPath))
    }

    internal fun addCallsToExistingEntryFilesToMainEntryRegistry(
        outputPath: String,
        classesWithMembersInCurrentCompilationRound: Set<ClassWithMembers>,
        mainEntryRegistryControlFlow: FunSpec.Builder
    ) {
        val classesFqNamesInCurrentCompilationRound = classesWithMembersInCurrentCompilationRound
            .map { it.classDescriptor.fqNameSafe.asString() }
        File(outputPath)
            .walkTopDown()
            .filter { it.isFile && it.exists() && it.extension == "kt" }
            .map { entryFile ->
                if (entryFile.name != "Entry") {
                    entryFile
                        .absolutePath
                        .removePrefix(outputPath)
                        .removePrefix("${File.separator}godot${File.separator}")
                        .replace(File.separator, ".")
                        .removeSuffix("Entry.kt")
                } else null
            }
            .filterNotNull()
            .filter { classFqName -> !classesFqNamesInCurrentCompilationRound.contains(classFqName) }
            .forEach { classFqName ->
                val classNameAsString = classFqName.substringAfterLast(".")
                val packagePath = if (classNameAsString != classFqName) {
                    classFqName.substringBeforeLast(".")
                } else ""
                mainEntryRegistryControlFlow.addStatement(
                    "%T().register(registry)",
                    ClassName("godot.$packagePath", "${classNameAsString}Registrar")
                )
            }
    }

    internal val registeredClassNames: MutableList<Pair<String, String>> = mutableListOf()
    private fun classNameSanityCheck() {
        psiClassesWithMembers
            .map { psiClassWithMembers ->
                psiClassWithMembers.ktClass
            }
            .filter { it.fqName != null }
            .mapNotNull { ktClass -> ktClass.getFqNameToRegisteredClassNamePair() }
            .forEach { (fqName, registeredClassName) ->
                if (!registeredClassNames.map { it.first }.contains(fqName)) {
                    registeredClassNames.add(fqName to registeredClassName)
                }
            }

        val duplicatedClasses = registeredClassNames
            .groupBy { it.second }
            .filter { it.value.size > 1 }
            .map { it.value }

        if (duplicatedClasses.isNotEmpty()) {
            val exceptionMessage = buildString {
                appendLine("There are classes registered with the same name. Check your customName argument for the annotation @RegisterClass:")
                duplicatedClasses
                    .forEachIndexed { index, duplications ->
                        if (index != 0) {
                            appendLine("---")
                        }
                        duplications.forEach { (classFqName, registeredName) ->
                            appendLine("RegisteredName: $registeredName, ActualClass: $classFqName")
                        }
                    }
            }
            throw ClassNameRegistrationException(exceptionMessage)
        }
    }

    private fun oneClassPerFileSanityCheck() {
        val filesWithMultipleRegisteredClasses = psiClassesWithMembers
            .asSequence()
            .map { it.ktClass }
            .map { it.containingKtFile }
            .toSet()
            .filter { ktFile ->
                ktFile
                    .classes
                    .filter { ktClass ->
                        ktClass
                            .annotations
                            .firstOrNull { annotation -> annotation.qualifiedName == REGISTER_CLASS_ANNOTATION } != null
                    }
                    .size > 1
            }
            .toSet()

        if (filesWithMultipleRegisteredClasses.isNotEmpty()) {
            throw MultipleClassesPerFileRegistrationException(
                "Only one registered class per file is allowed! The following files contain more than one registered class:\n${
                    filesWithMultipleRegisteredClasses.joinToString(
                        "\n"
                    ) { it.virtualFilePath }
                }"
            )
        }
    }

    private fun packagePathSanityCheck(srcDirs: List<String>) {
        val classesWithWrongPackagePath = psiClassesWithMembers
            .asSequence()
            .map { it.ktClass }
            .filter { ktClass ->
                var containingFilePath = ktClass.containingKtFile.virtualFile.path
                srcDirs.forEach { srcDir ->
                    // Replace separator by unix separator because of windows file system
                    containingFilePath = containingFilePath.removePrefix(srcDir.replace(File.separatorChar, '/'))
                }
                containingFilePath = containingFilePath.removePrefix("/").removeSuffix(".kt")
                val packagePath = ktClass.fqName?.asString()?.replace('.', '/')
                packagePath != containingFilePath
            }
            .toSet()

        if (classesWithWrongPackagePath.isNotEmpty()) {
            throw WrongPackagePathRegistrationException(
                "Package path of registered classes has to match the directory they are stored in! Also the file name has to match the class name! The following classes have wrong package path's or wrong file names:\n${
                    classesWithWrongPackagePath.joinToString(
                        "\n"
                    ) { it.fqName?.asString() ?: "" }
                }"
            )
        }
    }
}
