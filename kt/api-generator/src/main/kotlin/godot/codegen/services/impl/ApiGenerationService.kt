package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.asClassName
import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.isBitField
import godot.codegen.generation.BitFieldGenerator
import godot.codegen.generation.ClassGenerator
import godot.codegen.generation.EnumGenerator
import godot.codegen.generation.RegistrationGenerator
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedEnumValue
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.repositories.IClassRepository
import godot.codegen.services.IApiGenerationService
import godot.codegen.repositories.ICoreRepository
import godot.codegen.traits.TypedTrait
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.godotCorePackage
import java.io.File
import java.util.*
import kotlin.collections.firstOrNull

const val methodBindingsInnerClassName = "MethodBindings"

class ApiGenerationService(
    override val classRepository: IClassRepository,
    override val coreRepository: ICoreRepository,
    override val nativeStructureRepository: INativeStructureRepository
) : IApiGenerationService {


    override fun generateCore(outputDir: File) {
        classRepository
            .listClasses()
            .filter { it.type == "Object" || it.type == "RefCounted" }
            .forEach { clazz ->
                val spec = ClassGenerator.generateClass(clazz, this)
                spec.writeTo(outputDir)
                RegistrationGenerator.generateEngineTypesRegistrationForClass(clazz)
            }


        for (enum in coreRepository.getGlobalEnums()) {
            val enumAndExtensions = if (enum.isBitField()) {
                BitFieldGenerator.generate(enum, this)
            } else {
                EnumGenerator.generate(enum, this)
            }
            val fileBuilder = FileSpec.builder(godotCorePackage, enum.name)
            for (typeSpec in enumAndExtensions.first) {
                fileBuilder.addType(typeSpec)
            }
            for (extension in enumAndExtensions.second) {
                fileBuilder.addFunction(extension)
            }

            fileBuilder
                .addFileComment(GENERATED_COMMENT)
                .build()
                .writeTo(outputDir)
        }
    }

    override fun generateApi(outputDir: File) {

        //We first generate singletons so that their index in engine types and engine singleton lists are same.
        for (singleton in classRepository.listSingletons()) {
            ClassGenerator.generateSingleton(singleton, this).writeTo(outputDir)
            RegistrationGenerator.generateEngineTypesRegistrationForSingleton(singleton)
        }

        for (enrichedClass in classRepository.listClasses()) {
            if (enrichedClass.type != "Object" && enrichedClass.type != "RefCounted") {
                ClassGenerator.generateClass(enrichedClass, this).writeTo(outputDir)
                RegistrationGenerator.generateEngineTypesRegistrationForClass(enrichedClass)
            }
        }
    }

    override fun generateEngineRegistration(outputDir: File) {
        RegistrationGenerator.generateEngineRegistration(outputDir)
    }


    override fun findDefaultEnumValue(enumClass: TypedTrait, enumValue: Long): EnrichedEnumValue {
        val simpleNames = enumClass.getClassName().simpleNames
        return if (simpleNames.size > 1) {
            val className = simpleNames[0]
            val enrichedEnum = if (GodotTypes.coreTypes.contains(className)) {
                coreRepository.getCoreEnum(className)
            } else {
                classRepository.findTypeByName(className)!!.enums
            }.firstOrNull {
                it.type == enumClass.type
            } ?: throw NoMatchingEnumFound(simpleNames.joinToString("."))

            enrichedEnum.values.firstOrNull { it.value == enumValue } ?: enrichedEnum.getBitFieldCustomValue(enumValue)
        } else {
            coreRepository
                .getGlobalEnums()
                .first { it.name == simpleNames[0] }
                .values
                .first { it.value == enumValue }
        }
    }
}
