package godot.util

typealias VoidPtr = Long
const val nullptr: VoidPtr = 0L

fun String.camelToSnakeCase(): String {
    return "(?<=[a-zA-Z0-9])[A-Z]".toRegex().replace(this) {
        "_${it.value}"
    }.toLowerCase()
}