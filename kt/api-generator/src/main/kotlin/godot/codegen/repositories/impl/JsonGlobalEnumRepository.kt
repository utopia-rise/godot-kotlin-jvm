package godot.codegen.repositories.impl

import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.repositories.GlobalEnumRepository

class JsonGlobalEnumRepository(private val rawData: List<EnrichedEnum>) : GlobalEnumRepository {
    override fun list() = rawData
}