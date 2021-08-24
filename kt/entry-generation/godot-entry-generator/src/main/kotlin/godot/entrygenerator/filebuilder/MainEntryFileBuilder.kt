package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeSpec
import java.io.BufferedWriter

object MainEntryFileBuilder {
    private val entryFileSpec = FileSpec
        .builder("godot", "Entry")
        .addComment("THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD")

    private val initFunctionSpec = FunSpec
        .builder("init")
        .receiver(ClassName("godot.registration.Entry", "Context"))
        .addModifiers(KModifier.OVERRIDE)

    private val initEngineTypesFunSpec = FunSpec
        .builder("initEngineTypes")
        .receiver(ClassName("godot.registration.Entry", "Context"))
        .addModifiers(KModifier.OVERRIDE)
        .addStatement("%M()", MemberName("godot", "registerVariantMapping"))
        .addStatement("%M()", MemberName("godot", "registerEngineTypes"))
        .addStatement("%M()", MemberName("godot", "registerEngineTypeMethods"))

    fun build(outAppendable: () -> BufferedWriter) {

        entryFileSpec.addType(
            TypeSpec
                .classBuilder(ClassName("godot", "Entry"))
                .superclass(ClassName("godot.registration", "Entry"))
                .addFunction(initFunctionSpec.build())
                .addFunction(initEngineTypesFunSpec.build())
                .build()
        )
        outAppendable().use {
            entryFileSpec.build().writeTo(it)
        }
    }

    fun registerClassRegistrar(
        classRegistrarBuilder: ClassRegistrarFileBuilder
    ): MainEntryFileBuilder {
        val (templateString, templateArgs) = classRegistrarBuilder.build()
        initFunctionSpec.addStatement(templateString, *templateArgs)
        return this
    }
}
