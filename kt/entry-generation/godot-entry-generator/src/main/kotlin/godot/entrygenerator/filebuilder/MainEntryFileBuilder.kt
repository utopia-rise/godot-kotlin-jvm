package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.KOTLIN_LIST_OF
import godot.tools.common.constants.godotEntryBasePackage
import godot.tools.common.constants.godotPackage
import godot.tools.common.constants.godotRegistrationPackage
import java.io.BufferedWriter
import kotlin.reflect.KClass

class MainEntryFileBuilder {
    private val initFunctionSpec = FunSpec
        .builder("init")
        .receiver(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.classRegistry))
        .addModifiers(KModifier.OVERRIDE)

    private val registerUserTypesVariantMappingsFunSpec = FunSpec
        .builder("getRegisteredClasses")
        .receiver(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.classRegistry))
        .addModifiers(KModifier.OVERRIDE)
        .returns(
            List::class
                .asTypeName()
                .parameterizedBy(
                    KClass::class.asTypeName()
                        .parameterizedBy(STAR)
                )
        )

    private val classRegistrarCountPropertySpec = PropertySpec
        .builder("classRegistrarCount", Int::class.asTypeName())
        .addModifiers(KModifier.OVERRIDE)

    private val projectNamePropertySpec = PropertySpec
        .builder("projectName", String::class.asTypeName())
        .addModifiers(KModifier.OVERRIDE)

    fun build(randomPackageForEntryFile: String, outAppendable: () -> BufferedWriter) {
        val entryFileSpec = FileSpec
            .builder(randomPackageForEntryFile, "Entry")
            .addFileComment(GENERATED_COMMENT)

        entryFileSpec.addType(
            TypeSpec
                .classBuilder(ClassName("$godotEntryBasePackage.$randomPackageForEntryFile", GodotKotlinJvmTypes.entry))
                .superclass(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.entry))
                .addFunction(initFunctionSpec.build())
                .addFunction(registerUserTypesVariantMappingsFunSpec.build())
                .addProperty(classRegistrarCountPropertySpec.build())
                .addProperty(projectNamePropertySpec.build())
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
        val listOfArguments = registeredClasses.map {
            ClassName(it.containingPackage, it.name)
        }
        registerUserTypesVariantMappingsFunSpec.addStatement(
            "return·%M(${listOfArguments.joinToString(separator = ",·") { "%T::class" }})",
            KOTLIN_LIST_OF,
            *listOfArguments.toTypedArray()
        )
    }

    fun registerProjectName(projectName: String) {
        projectNamePropertySpec.initializer("%S", projectName)
    }

    fun registerClassRegistrarCount(classRegistrarFromCurrentCompilationCount: Int, classRegistrarFromDependencyCount: Int) {
        classRegistrarCountPropertySpec.initializer(
            "%L",
            classRegistrarFromCurrentCompilationCount + classRegistrarFromDependencyCount
        )
    }
}
