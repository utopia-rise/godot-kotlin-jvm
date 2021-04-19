package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.*
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.generator.clazz.ClassRegistrationGenerator
import godot.entrygenerator.model.ClassWithMembers
import org.jetbrains.kotlin.resolve.BindingContext
import java.io.File

object EntryFileBuilder {

    private val entryFileSpec = FileSpec
        .builder("godot", "Entry")
        .addComment("THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD")

    fun build(outputPath: String) {
        entryFileSpec.build().writeTo(File(outputPath))
    }

    fun registerClassesWithMembers(
        bindingContext: BindingContext,
        classesWithMembers: Set<ClassWithMembers>,
        outputPath: String
    ): EntryFileBuilder {
        val entryClassSpec = TypeSpec
            .classBuilder(ClassName("godot", "Entry"))
            .superclass(ClassName("godot.runtime", "Entry"))

        val initFunctionSpec = FunSpec
            .builder("init")
            .receiver(ClassName("godot.runtime.Entry", "Context"))
            .addModifiers(KModifier.OVERRIDE)

        val initEngineTypesFunSpec = FunSpec
            .builder("initEngineTypes")
            .receiver(ClassName("godot.runtime.Entry", "Context"))
            .addModifiers(KModifier.OVERRIDE)

        EntryGenerator.addCallsToExistingEntryFilesToMainEntryRegistry(outputPath, classesWithMembers, initFunctionSpec)

        ClassRegistrationGenerator
            .registerClasses(classesWithMembers, initFunctionSpec, bindingContext, outputPath)

        initEngineTypesFunSpec.addStatement("%M()", MemberName("godot", "registerVariantMapping"))
        initEngineTypesFunSpec.addStatement("%M()", MemberName("godot", "registerEngineTypes"))
        initEngineTypesFunSpec.addStatement("%M()", MemberName("godot", "registerEngineTypeMethods"))

        entryClassSpec.addFunction(initFunctionSpec.build())
        entryClassSpec.addFunction(initEngineTypesFunSpec.build())
        entryFileSpec.addType(entryClassSpec.build())
        return this
    }
}
