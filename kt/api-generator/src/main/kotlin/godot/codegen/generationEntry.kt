package godot.codegen

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import godot.codegen.models.ApiDescription
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.IClassRepository
import godot.codegen.repositories.IEnumRepository
import godot.codegen.repositories.impl.ClassRepository
import godot.codegen.repositories.impl.EnumRepository
import godot.codegen.repositories.impl.NativeStructureRepository
import godot.codegen.services.IApiGenerationService
import godot.codegen.services.impl.ApiGenerationService
import godot.codegen.services.impl.AwaitGenerationService
import godot.codegen.services.impl.LambdaCallableGenerationService
import godot.codegen.services.impl.SignalGenerationService
import java.io.File

fun generateApiFrom(jsonSource: File, coreDir: File, apiDir: File) {
    val apiDescription = ObjectMapper().readValue(jsonSource, object : TypeReference<ApiDescription>() {})

    val nativeStructureRepository = NativeStructureRepository(apiDescription.nativeStructures)
    val coreService: IEnumRepository = EnumRepository(apiDescription.builtinClasses, apiDescription.globalEnums)
    val classService: IClassRepository = ClassRepository(apiDescription.classes, apiDescription.singletons)

    val generationService: IApiGenerationService = ApiGenerationService(classService, coreService, nativeStructureRepository)
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
