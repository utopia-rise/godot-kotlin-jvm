package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.names.Kotlin
import godot.tools.common.names.Registration
import java.io.BufferedWriter
import kotlin.reflect.KClass

class MainEntryFileBuilder {
    private val initFunctionSpec = FunSpec
        .builder("init")
        .receiver(Registration.classRegistry)
        .addModifiers(KModifier.OVERRIDE)

    private val registerUserTypesVariantMappingsFunSpec = FunSpec
        .builder("getRegisteredClasses")
        .receiver(Registration.classRegistry)
        .addModifiers(KModifier.OVERRIDE)
        .returns(
            List::class
                .asTypeName()
                .parameterizedBy(
                    KClass::class.asTypeName()
                        .parameterizedBy(STAR)
                )
        )

    fun build(randomPackageForEntryFile: String, outAppendable: () -> BufferedWriter) {
        val entryFileSpec = FileSpec
            .builder(randomPackageForEntryFile, "Entry")
            .addFileComment(GENERATED_COMMENT)

        entryFileSpec.addType(
            TypeSpec
                .classBuilder(Registration.generatedEntry(randomPackageForEntryFile))
                .superclass(Registration.entry)
                .addFunction(initFunctionSpec.build())
                .addFunction(registerUserTypesVariantMappingsFunSpec.build())
                .build()
        )
        outAppendable().use {
            entryFileSpec.build().writeTo(it)
        }
    }

    fun registerClassRegistrar(classRegistrarBuilder: ClassRegistrarFileBuilder): MainEntryFileBuilder {
        val (templateString, templateArgs) = classRegistrarBuilder.build()
        initFunctionSpec.addStatement(templateString, *templateArgs)
        return this
    }

    fun registerUserTypesVariantMappings(registeredClasses: List<RegisteredClass>) {
        val listOfArguments = registeredClasses.map {
            ClassName(it.containingPackage, it.name)
        }
        registerUserTypesVariantMappingsFunSpec.addStatement(
            "return %M(${listOfArguments.joinToString(separator = ", ") { "%T::class" }})",
            Kotlin.listOf,
            *listOfArguments.toTypedArray()
        )
    }
}

