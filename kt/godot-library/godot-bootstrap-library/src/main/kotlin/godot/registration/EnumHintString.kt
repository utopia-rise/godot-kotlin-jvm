package godot.registration

import godot.core.GodotEnum
import godot.core.VariantParser

fun <E : Enum<E>> enumHintString(entries: Array<E>): String =
    entries.joinToString(",") { entry ->
        if (entry is GodotEnum) {
            "${entry.name}:${entry.value}"
        } else {
            entry.name
        }
    }

fun <E : Enum<E>> enumListHintString(entries: Array<E>): String =
    "${VariantParser.LONG.id}/${VariantParser.LONG.id}:${enumHintString(entries)}"
