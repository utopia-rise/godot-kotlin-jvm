package godot.codegen.models.enriched

import godot.codegen.models.ApiType
import godot.codegen.models.Class
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait
import godot.tools.common.extensions.escapeUnderscore
import java.util.*

class EnrichedClass(val internal: Class) : TypedTrait, IDocumented {
    val constants= internal.constants?.toEnriched() ?: listOf()
    val signals = internal.signals?.toEnriched() ?: listOf()
    val name = internal.name.escapeUnderscore()
    val inherits = internal.inherits?.escapeUnderscore()
    val engineClassDBIndexName = "ENGINECLASS_${internal.name.uppercase(Locale.US)}"
    val properties= internal.properties?.toEnriched() ?: listOf()
    val methods = internal.methods?.toEnriched() ?: listOf()
    val apiType = ApiType.from(internal.apiType)
    override val description = internal.description

    override val type = name

    val additionalImports = mutableListOf<AdditionalImport>()

    val enums = internal.enums?.toEnriched(this) ?: listOf()

    fun copy(internalNewName: String) = EnrichedClass(internal.copy(internalNewName))
}

fun List<Class>.toEnriched() = map { EnrichedClass(it) }
fun Class.toEnriched() = EnrichedClass(this)
