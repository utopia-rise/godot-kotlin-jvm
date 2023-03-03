package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.*
import java.io.BufferedWriter
import kotlin.reflect.KClass

object MainEntryFileBuilder {
    private val initFunctionSpec = FunSpec
        .builder("init")
        .receiver(ClassName("$godotRegistrationPackage.${GodotKotlinJvmTypes.entry}", GodotKotlinJvmTypes.context))
        .addModifiers(KModifier.OVERRIDE)

    private val initEngineTypesFunSpec = FunSpec
        .builder("initEngineTypes")
        .receiver(ClassName("$godotRegistrationPackage.${GodotKotlinJvmTypes.entry}", GodotKotlinJvmTypes.context))
        .addModifiers(KModifier.OVERRIDE)
        .addStatement("%M()", MemberName(godotApiPackage, "registerVariantMapping"))
        .addStatement("%M()", MemberName(godotApiPackage, "registerEngineTypes"))
        .addStatement("%M()", MemberName(godotApiPackage, "registerEngineTypeMethods"))

    private val registerUserTypesVariantMappingsFunSpec = FunSpec
        .builder("getRegisteredClasses")
        .receiver(ClassName("$godotRegistrationPackage.${GodotKotlinJvmTypes.entry}", GodotKotlinJvmTypes.context))
        .addModifiers(KModifier.OVERRIDE)
        .returns(
            List::class
                .asTypeName()
                .parameterizedBy(
                    KClass::class.asTypeName()
                        .parameterizedBy(STAR)
                )
        )

    private val dependencyRebindsFunSpec = FunSpec
        .builder("dependencyRebinds")
        .receiver(ClassName("$godotRegistrationPackage.${GodotKotlinJvmTypes.entry}", GodotKotlinJvmTypes.context))
        .addModifiers(KModifier.OVERRIDE)
        .returns(
            Map::class
                .asTypeName()
                .parameterizedBy(
                    String::class.asTypeName(),
                    String::class.asTypeName(),
                )
        )

    fun build(randomPackageForEntryFile: String, outAppendable: () -> BufferedWriter) {
        val entryFileSpec = FileSpec
            .builder("$godotEntryBasePackage.$randomPackageForEntryFile", "Entry")
            .addFileComment(GENERATED_COMMENT)

        entryFileSpec.addType(
            TypeSpec
                .classBuilder(ClassName("$godotEntryBasePackage.$randomPackageForEntryFile", GodotKotlinJvmTypes.entry))
                .superclass(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.entry))
                .addFunction(initFunctionSpec.build())
                .addFunction(initEngineTypesFunSpec.build())
                .addFunction(registerUserTypesVariantMappingsFunSpec.build())
                .addFunction(dependencyRebindsFunSpec.build())
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
            "return %M(${listOfArguments.joinToString { "%T::class" }})",
            KOTLIN_LIST_OF,
            *listOfArguments.toTypedArray()
        )
    }

    fun registerDependencyRebinds(rebinds: Map<String, String>) {
        dependencyRebindsFunSpec.addStatement(
            "return %M(${rebinds.entries.joinToString { (originalResPath, newResPath) -> "\"$originalResPath\"·to·\"$newResPath\"" }})",
            KOTLIN_MAP_OF
        )
    }
}
