package godot.tools.common.extensions

import java.util.*

fun String.escapeUnderscore(): String {
    if (this == "") return this

    var thisString = this

    while (thisString[0] == '_') thisString = thisString.drop(1)

    return thisString
}

fun String.convertToCamelCase(): String {
    if (this == "") return this

    var thisString = this

    val prefix = buildString {
        while (thisString != "" && thisString[0] == '_') {
            this.append('_')
            thisString = thisString.drop(1)
        }
    }

    var split = thisString.split('_')
    val first = split[0]
    split = split.drop(1)

    return prefix + first + split.joinToString("") { string -> string.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.US) else it.toString() } }
}

fun String.convertToSnakeCase(): String =
    fold(StringBuilder()) { accumulator, character ->
        if (character in 'A'..'Z')
            (if (accumulator.isNotEmpty()) accumulator.append('_') else accumulator)
                .append(character + ('a' - 'A'))
        else accumulator.append(character)
    }.toString()

fun String.escapeKotlinReservedNames() = if (kotlinReservedNames.find { s -> s == this } != null) "_$this" else this

private val kotlinReservedNames = listOf(
    "class",
    "enum",
    "interface",
    "in",
    "var",
    "val",
    "Char",
    "Short",
    "Boolean",
    "Int",
    "Long",
    "Float",
    "Double",
    "operator",
    "object"
)
