package godot.gradle.util

fun mapOfNonNullValuesOf(vararg entries: Pair<String, String?>): Map<String, String> =
    mutableMapOf<String, String>().apply {
        for ((key, value) in entries) {
            if (value != null) {
                put(key, value)
            }
        }
    }
