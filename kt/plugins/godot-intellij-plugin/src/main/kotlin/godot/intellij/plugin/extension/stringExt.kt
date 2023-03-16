package godot.intellij.plugin.extension

import java.util.*

fun String.snakeToLowerCamelCase(): String {
    return "_[a-zA-Z]"
        .toRegex()
        .replace(this) {
            it
                .value
                .replace("_", "")
                .uppercase(Locale.US)
        }
}

//TODO: replace once entry gen checks and helper functions are in a shared module
fun String.camelToSnakeCase(): String {
    return "(?<=[a-zA-Z0-9])[A-Z]".toRegex().replace(this) {
        "_${it.value}"
    }.lowercase(Locale.ENGLISH)
}

fun String.capitalize() = this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
