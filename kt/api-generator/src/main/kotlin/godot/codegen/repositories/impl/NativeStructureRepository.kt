package godot.codegen.repositories.impl

import godot.codegen.constants.PrimitiveNativeStructures
import godot.codegen.models.NativeStructure
import godot.codegen.models.enriched.EnrichedNativeStructure
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.generation.task.traits.HasTypeGenerationTrait

class NativeStructureRepository(
    jsonData: List<NativeStructure>
) : INativeStructureRepository {

    private val map = HashMap<String, EnrichedNativeStructure>()

    init {
        jsonData.toEnriched().forEach {
            map[it.identifier] = it
            map[it.identifier + "*"] = it
            map["const " + it.identifier + "*"] = it
        }

        PrimitiveNativeStructures.all.forEach {
            // We don't include the base name here because they are always used as pointer and can overlap with a plain "float".
            map[it.identifier + "*"] = it
            map["const " + it.identifier + "*"] = it
        }
    }

    override fun findMatchingType(typed: HasTypeGenerationTrait) = map[typed.type.identifier]
}
