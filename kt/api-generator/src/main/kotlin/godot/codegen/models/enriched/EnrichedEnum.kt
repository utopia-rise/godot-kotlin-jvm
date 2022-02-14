package godot.codegen.models.enriched

import godot.codegen.models.Enum

class EnrichedEnum(val internal: Enum, isGlobal: Boolean) {
    val name = if (isGlobal) {
        internal.name.replace(".", "")
    } else {
        internal.name
    }
}

fun List<Enum>.toEnriched(isGlobal: Boolean = false) = map { EnrichedEnum(it, isGlobal) }
fun Enum.toEnriched(isGlobal: Boolean = false) = EnrichedEnum(this, isGlobal)