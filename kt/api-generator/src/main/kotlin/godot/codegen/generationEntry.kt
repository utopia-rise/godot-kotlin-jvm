package godot.codegen

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.squareup.kotlinpoet.FileSpec
import godot.codegen.models.ApiDescription
import godot.codegen.models.enriched.toEnriched
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.repositories.ClassRepository
import godot.codegen.repositories.CoreTypeEnumRepository
import godot.codegen.repositories.GlobalEnumRepository
import godot.codegen.repositories.SingletonRepository
import godot.codegen.repositories.impl.JsonClassRepository
import godot.codegen.repositories.impl.JsonGlobalEnumRepository
import godot.codegen.repositories.impl.JsonSingletonRepository
import godot.codegen.repositories.impl.KnownCoreTypeEnumRepository
import godot.codegen.repositories.impl.NativeStructureRepository
import godot.codegen.services.IClassGraphService
import godot.codegen.services.IClassService
import godot.codegen.services.IEnumService
import godot.codegen.services.IGenerationService
import godot.codegen.services.impl.AwaitGenerationService
import godot.codegen.services.impl.ClassGraphService
import godot.codegen.services.impl.ClassService
import godot.codegen.services.impl.EnumService
import godot.codegen.services.impl.GenerationService
import godot.codegen.services.impl.LambdaCallableGenerationService
import godot.codegen.services.impl.SignalGenerationService
import godot.tools.common.constants.Constraints
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.godotApiPackage
import java.io.File

fun File.generateApiFrom(jsonSource: File) {
    val apiDescription = ObjectMapper().readValue(jsonSource, object : TypeReference<ApiDescription>() {})

    val classRepository: ClassRepository = JsonClassRepository(apiDescription.classes.toEnriched())
    val singletonRepository: SingletonRepository = JsonSingletonRepository(apiDescription.singletons.toEnriched())
    val globalEnumRepository: GlobalEnumRepository = JsonGlobalEnumRepository(apiDescription.globalEnums.toEnriched())
    val coreTypeEnumRepository: CoreTypeEnumRepository = KnownCoreTypeEnumRepository()
    val nativeStructureRepository = NativeStructureRepository(apiDescription.nativeStructures.toEnriched())

    val classGraphService: IClassGraphService = ClassGraphService(classRepository)
    val classService: IClassService = ClassService(
        classRepository,
        singletonRepository,
        classGraphService
    )
    val enumService: IEnumService = EnumService(globalEnumRepository, coreTypeEnumRepository, classService)
    val generationService: IGenerationService = GenerationService(classGraphService, enumService, nativeStructureRepository)

    classService.findGetSetMethodsAndUpdateProperties()

    //TODO: generateEngineTypesRegistration

    val engineIndexFile = FileSpec.builder(godotApiPackage, "EngineIndexes")
    val registrationFileSpec = RegistrationFileSpec()

    //We first generate singletons so that their index in engine types and engine singleton lists are same.
    for (singleton in classService.getSingletons()) {
        generationService.generateSingleton(singleton).writeTo(this)
        generationService.generateEngineIndexesForClass(engineIndexFile, singleton)
        generationService.generateEngineTypesRegistrationForSingleton(registrationFileSpec, singleton)
    }

    for (enrichedClass in classService.getClasses()) {
        generationService.generateClass(enrichedClass).writeTo(this)
        generationService.generateEngineIndexesForClass(engineIndexFile, enrichedClass)
        generationService.generateEngineTypesRegistrationForClass(registrationFileSpec, enrichedClass)
    }

    engineIndexFile.build().writeTo(this)
    registrationFileSpec.build().writeTo(this)

    for (enum in enumService.getGlobalEnums()) {
        val enumAndExtensions = generationService.generateEnum(enum)
        val fileBuilder = FileSpec.builder(godotApiPackage, enum.name)
        for (typeSpec in enumAndExtensions.first) {
            fileBuilder.addType(typeSpec)
        }
        for (extension in enumAndExtensions.second) {
            fileBuilder.addFunction(extension)
        }

        fileBuilder
            .addFileComment(GENERATED_COMMENT)
            .build()
            .writeTo(this)
    }

    LambdaCallableGenerationService().generate(Constraints.MAX_FUNCTION_ARG_COUNT).writeTo(this)
    SignalGenerationService().generate(Constraints.MAX_FUNCTION_ARG_COUNT).writeTo(this)
}

fun File.generateCoroutine() {
    AwaitGenerationService.generate(Constraints.MAX_FUNCTION_ARG_COUNT).writeTo(this)
}
