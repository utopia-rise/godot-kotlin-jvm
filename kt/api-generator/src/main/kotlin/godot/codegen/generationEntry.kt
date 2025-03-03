package godot.codegen

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import godot.codegen.models.ApiDescription
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.ClassRepository
import godot.codegen.repositories.CoreTypeEnumRepository
import godot.codegen.repositories.GlobalEnumRepository
import godot.codegen.repositories.impl.JsonClassRepository
import godot.codegen.repositories.impl.JsonGlobalEnumRepository
import godot.codegen.repositories.impl.KnownCoreTypeEnumRepository
import godot.codegen.repositories.impl.NativeStructureRepository
import godot.codegen.services.IClassService
import godot.codegen.services.IApiService
import godot.codegen.services.IApiGenerationService
import godot.codegen.services.impl.AwaitGenerationService
import godot.codegen.services.impl.ClassService
import godot.codegen.services.impl.ApiService
import godot.codegen.services.impl.ApiGenerationService
import godot.codegen.services.impl.LambdaCallableGenerationService
import godot.codegen.services.impl.SignalGenerationService
import java.io.File

fun generateApiFrom(jsonSource: File, coreDir: File, apiDir: File) {
    val apiDescription = ObjectMapper().readValue(jsonSource, object : TypeReference<ApiDescription>() {})

    val classRepository: ClassRepository = JsonClassRepository(apiDescription.classes, apiDescription.singletons)
    val globalEnumRepository: GlobalEnumRepository = JsonGlobalEnumRepository(apiDescription.globalEnums.toEnriched())
    val coreTypeEnumRepository: CoreTypeEnumRepository = KnownCoreTypeEnumRepository()
    val nativeStructureRepository = NativeStructureRepository(apiDescription.nativeStructures.toEnriched())

    val classGraphService: IClassService = ClassService(classRepository)
    val apiService: IApiService = ApiService(
        globalEnumRepository,
        coreTypeEnumRepository,
        classGraphService
    )

    val generationService: IApiGenerationService = ApiGenerationService(classGraphService, apiService, nativeStructureRepository)
    generationService.generateCore(coreDir)
    generationService.generateApi(apiDir)
    generationService.generateEngineRegistration((apiDir))

    LambdaCallableGenerationService.generate(coreDir)
    SignalGenerationService.generateCore(coreDir)
}

fun generateExtension(outputDir: File) {
    SignalGenerationService.generateExtension(outputDir)
}

fun generateCoroutine(outputDir: File) {
    AwaitGenerationService.generate(outputDir)
}
