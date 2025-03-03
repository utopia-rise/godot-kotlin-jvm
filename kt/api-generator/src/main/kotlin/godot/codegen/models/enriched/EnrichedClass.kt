package godot.codegen.models.enriched

import godot.codegen.models.ApiType
import godot.codegen.models.Class
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.common.extensions.escapeUnderscore

class EnrichedClass(model: Class) : TypedTrait, IDocumented {
    override val type = model.name.escapeUnderscore()
    val inherits = model.inherits?.escapeUnderscore()
    val apiType = ApiType.from(model.apiType)

    val isInstantiable = model.isInstantiable
    
    val constants= model.constants?.toEnriched() ?: listOf()
    val enums = model.enums?.toEnriched(this) ?: listOf()
    val signals = model.signals?.toEnriched() ?: listOf()
    val properties= model.properties?.toEnriched() ?: listOf()
    val methods = model.methods?.toEnriched() ?: listOf()
    
    override val description = model.description
    val additionalImports = mutableListOf<AdditionalImport>()
}

fun List<Class>.toEnriched() = map { EnrichedClass(it) }
fun Class.toEnriched() = EnrichedClass(this)
