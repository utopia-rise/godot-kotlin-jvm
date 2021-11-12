package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.model.RegisteredClass
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

    private val registerUserTypesVariantMappingsFunSpec = FunSpec
        .builder("registerUserTypeVariantMappings")
        .receiver(ClassName("godot.registration.Entry", "Context"))
        .addModifiers(KModifier.OVERRIDE)

    fun build(outAppendable: () -> BufferedWriter) {

        entryFileSpec.addType(
            TypeSpec
                .classBuilder(ClassName("godot", "Entry"))
                .superclass(ClassName("godot.registration", "Entry"))
                .addFunction(initFunctionSpec.build())
                .addFunction(initEngineTypesFunSpec.build())
                .addFunction(registerUserTypesVariantMappingsFunSpec.build())
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

    fun registerUserTypesVariantMappings(registeredClass: RegisteredClass) {
        registerUserTypesVariantMappingsFunSpec.addStatement(
            "%M[%T::class] = %T",
            MemberName("godot.core", "variantMapper"),
            ClassName(registeredClass.containingPackage, registeredClass.name),
            ClassName("godot.core.VariantType", "OBJECT")
        )
    }
}
