package godot.codegen.repositories.impl

import godot.codegen.constants.PrimitiveNativeStructures
import godot.codegen.models.enriched.EnrichedNativeStructure
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.traits.TypedTrait

class NativeStructureRepository(
    jsonData: List<EnrichedNativeStructure>
) : INativeStructureRepository {

    private val rawData: List<EnrichedNativeStructure>

    init {
        val data = jsonData.toMutableList()
        data.addAll(PrimitiveNativeStructures.all)
        rawData = data
    }

    override fun list() = rawData.toList()
    override fun findMatchingType(typed: TypedTrait) = rawData
        .firstOrNull { "${it.type}\\s*\\*".toRegex().containsMatchIn(typed.type ?: "") }
}