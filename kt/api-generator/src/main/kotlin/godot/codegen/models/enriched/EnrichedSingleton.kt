package godot.codegen.models.enriched

import godot.common.extensions.escapeUnderscore
import godot.codegen.workarounds.sanitizeApiType
import godot.codegen.models.Singleton

class EnrichedSingleton(val internal: Singleton) {
    val name = internal.name
    val type = internal.type.sanitizeApiType().escapeUnderscore()
}

fun List<Singleton>.toEnriched() = map { EnrichedSingleton(it) }
