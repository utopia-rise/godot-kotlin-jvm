package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.Enum
import godot.codegen.models.enriched.*
import godot.codegen.poet.RegistrationFileSpec

interface IGenerationService {
    fun generateSingleton(singletonClass: EnrichedClass): FileSpec
    fun generateClass(clazz: EnrichedClass): FileSpec
    fun generateEngineIndexesForClass(fileSpecBuilder: FileSpec.Builder, clazz: EnrichedClass)
    fun generateEnum(enum: EnrichedEnum, containingClassName: String? = null): TypeSpec
    fun generateConstant(constant: EnrichedConstant, containingClassName: String?): PropertySpec

    fun generateEngineTypesRegistrationForClass(
        registrationFileSpec: RegistrationFileSpec,
        clazz: EnrichedClass
    )
    fun generateEngineTypesRegistrationForSingleton(
        registrationFileSpec: RegistrationFileSpec,
        singleton: EnrichedClass
    )
}