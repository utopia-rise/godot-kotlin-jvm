package godot.codegen.models.enriched

import godot.codegen.extensions.escapeUnderscore
import godot.codegen.models.Singleton

class EnrichedSingleton(val internal: Singleton) {
    val name = internal.name
    val type = internal.type.escapeUnderscore()
}

fun List<Singleton>.toEnriched() = map { EnrichedSingleton(it) }