package godot.codegen

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import godot.codegen.models.ApiDescription
import godot.codegen.services.IApiGenerationService
import godot.codegen.services.impl.ApiGenerationService
import godot.codegen.services.impl.AwaitGenerationService
import godot.codegen.services.impl.LambdaCallableGenerationService
import godot.codegen.services.impl.SignalGenerationService
import java.io.File

fun generateApiFrom(jsonSource: File, coreDir: File, apiDir: File) {
    val apiDescription = ObjectMapper().readValue(jsonSource, object : TypeReference<ApiDescription>() {})
    val generationService: IApiGenerationService = ApiGenerationService(apiDescription)
    generationService.generateApi(coreDir, apiDir)

    LambdaCallableGenerationService.generate(coreDir)
    SignalGenerationService.generateCore(coreDir)
}

fun generateExtension(outputDir: File) {
    SignalGenerationService.generateExtension(outputDir)
}

fun generateCoroutine(outputDir: File) {
    AwaitGenerationService.generate(outputDir)
}
