package godot.common.extensions

import java.util.*

private val identifierRegex = Regex("""^[\p{L}_$][\p{L}\p{N}_$]*$""")
fun String.isValidKotlinIdentifier(): Boolean {
    // This regex ensures:
    // - The first character is a letter, underscore, or dollar sign.
    // - Subsequent characters can be letters, digits, underscores, or dollar signs.
    // - It supports Unicode letters using \p{L} and Unicode digits using \p{N}.
    return identifierRegex.matches(this)
}

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

fun String.removeSuffixWords(wordWithDashes: String): String {
    // We split the 2 strings into different "words"
    val otherWords = wordWithDashes.split('_')
    val valueWords = this.split('_')

    var valueIndex = valueWords.size - 1
    var enumIndex = otherWords.size - 1

    // Remove matching words from the end of the other value.
    while (valueIndex >= 0 && enumIndex >= 0) {
        val valueWord = valueWords[valueIndex]
        val enumWord = otherWords[enumIndex]
        // If the receiver word is not longer than the other word and the other word starts with the receiver word,
        // we consider it a match.
        if (valueWord.length <= enumWord.length && enumWord.startsWith(valueWord)) {
            valueIndex--
            enumIndex--
        } else {
            break
        }
    }
    // Reassemble the remaining parts of the enum value.
    return if (valueIndex < 0) "" else valueWords.subList(0, valueIndex + 1).joinToString("_")
}

fun String.escapeKotlinReservedNames() = if (kotlinReservedNames.find { s -> s == this } != null)
    "`$this`"
else
    this

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
