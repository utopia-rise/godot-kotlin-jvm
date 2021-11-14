package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.entrygenerator.model.RegisteredClass
import java.io.BufferedWriter
import kotlin.reflect.KClass

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
        .builder("getRegisteredClasses")
        .receiver(ClassName("godot.registration.Entry", "Context"))
        .addModifiers(KModifier.OVERRIDE)
        .returns(
            List::class
                .asTypeName()
                .parameterizedBy(
                    KClass::class.asTypeName()
                        .parameterizedBy(STAR)
                )
        )

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

    fun registerUserTypesVariantMappings(registeredClasses: List<RegisteredClass>) {
        registerUserTypesVariantMappingsFunSpec.addStatement(
            "val ret = %M<%T<*>>()",
            MemberName("kotlin.collections", "mutableListOf"),
            ClassName("kotlin.reflect", "KClass")
        )
        for (registeredClass in registeredClasses) {
            registerUserTypesVariantMappingsFunSpec.addStatement(
                "ret.add(%T::class)",
                ClassName(registeredClass.containingPackage, registeredClass.name)
            )
        }
        registerUserTypesVariantMappingsFunSpec.addStatement(
            "return ret"
        )
    }
}
