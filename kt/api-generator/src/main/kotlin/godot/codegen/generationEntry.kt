package godot.codegen

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.squareup.kotlinpoet.FileSpec
import godot.codegen.constants.GENERATED_COMMENT
import godot.codegen.constants.godotApiPackage
import godot.codegen.models.ApiDescription
import godot.codegen.models.enriched.toEnriched
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.repositories.*
import godot.codegen.repositories.impl.*
import godot.codegen.services.*
import godot.codegen.services.impl.*
import godot.docgen.DocGen
import java.io.File

fun File.generateApiFrom(jsonSource: File, docsDir: File? = null) {
    val classDocs = docsDir?.let { DocGen.deserializeDoc(it) } ?: mapOf()
    val apiDescription = ObjectMapper().readValue(jsonSource, object : TypeReference<ApiDescription>() {})

    val classRepository: ClassRepository = JsonClassRepository(apiDescription.classes.toEnriched())
    val singletonRepository: SingletonRepository = JsonSingletonRepository(apiDescription.singletons.toEnriched())
    val globalEnumRepository: GlobalEnumRepository = JsonGlobalEnumRepository(apiDescription.globalEnums.toEnriched())
    val coreTypeEnumRepository: CoreTypeEnumRepository = KnownCoreTypeEnumRepository()
    val docRepository: IDocRepository = DocRepository(classDocs)
    val nativeStructureRepository = NativeStructureRepository(apiDescription.nativeStructures.toEnriched())

    val classGraphService: IClassGraphService = ClassGraphService(classRepository)
    val classService: IClassService = ClassService(
        classRepository,
        singletonRepository,
        classGraphService
    )
    val enumService: IEnumService = EnumService(globalEnumRepository, coreTypeEnumRepository, classService)
    val generationService: IGenerationService = GenerationService(docRepository, classGraphService, enumService, nativeStructureRepository)

    classService.findGetSetMethodsAndUpdateProperties()

    //TODO: generateEngineTypesRegistration

    val engineIndexFile = FileSpec.builder(godotApiPackage, "EngineIndexes")
    val registrationFileSpec = RegistrationFileSpec()

    //We first generate singletons so that their index in engine types and engine singleton lists are same.
    for (singleton in classService.getSingletons()) {
        for (property in singleton.properties) {
            classService.updatePropertyIfShouldUseSuper(singleton.name, property.name)
        }

        generationService.generateSingleton(singleton).writeTo(this)
        generationService.generateEngineIndexesForClass(engineIndexFile, singleton)
        generationService.generateEngineTypesRegistrationForSingleton(registrationFileSpec, singleton)
    }

    for (enrichedClass in classService.getClasses()) {
        for (property in enrichedClass.properties) {
            classService.updatePropertyIfShouldUseSuper(enrichedClass.name, property.name)
        }

        generationService.generateClass(enrichedClass).writeTo(this)
        generationService.generateEngineIndexesForClass(engineIndexFile, enrichedClass)
        generationService.generateEngineTypesRegistrationForClass(registrationFileSpec, enrichedClass)
    }

    engineIndexFile.build().writeTo(this)
    registrationFileSpec.build().writeTo(this)

    for (enum in enumService.getGlobalEnums()) {
        FileSpec.builder(godotApiPackage, enum.name)
            .addType(
                generationService.generateEnum(enum)
            )
            .addComment(GENERATED_COMMENT)
            .build()
            .writeTo(this)
    }
}
