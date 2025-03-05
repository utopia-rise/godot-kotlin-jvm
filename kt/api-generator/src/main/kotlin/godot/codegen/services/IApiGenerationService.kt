package godot.codegen.services

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.*
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.repositories.IClassRepository
import godot.codegen.repositories.ICoreRepository
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.traits.TypedTrait
import java.io.File

interface IApiGenerationService {
    val classRepository: IClassRepository
    val coreRepository: ICoreRepository
    val nativeStructureRepository: INativeStructureRepository

    fun generateCore(outputDir: File)
    fun generateApi(outputDir: File)
    fun generateEngineRegistration(outputDir: File)

    fun findDefaultEnumValue(enumClass: TypedTrait, enumValue: Long): EnrichedEnumValue
}
