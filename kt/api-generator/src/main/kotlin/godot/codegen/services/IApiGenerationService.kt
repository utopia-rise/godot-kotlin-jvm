package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.*
import godot.codegen.poet.RegistrationFileSpec
import java.io.File

interface IApiGenerationService {
    fun generateSingleton(singletonClass: EnrichedClass): FileSpec
    fun generateClass(clazz: EnrichedClass): FileSpec
    fun generateEnum(enum: EnrichedEnum, containingClassName: String? = null): Pair<List<TypeSpec>, List<FunSpec>>
    fun generateConstant(constant: EnrichedConstant, containingClassName: String?): PropertySpec

    fun generateEngineTypesRegistrationForClass(
        registrationFileSpec: RegistrationFileSpec,
        clazz: EnrichedClass
    )
    fun generateEngineTypesRegistrationForSingleton(
        registrationFileSpec: RegistrationFileSpec,
        singleton: EnrichedClass
    )

    fun generateCore(outputDir: File)
    fun generateApi(outputDir: File)
    fun generateEngineRegistration(outputDir: File)
}
