package godot.codegen.repositories.impl

import godot.codegen.models.Class
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.ClassRepository

class JsonClassRepository(private val rawData: List<EnrichedClass>) : ClassRepository {
    override fun list() = rawData
    override fun findByClassName(className: String) = rawData.firstOrNull { it.name == className }
}