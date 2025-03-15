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

fun String.toScreamingSnakeCase(): String {
    if (this.isEmpty()) return this

    val result = StringBuilder()
    for (i in this.indices) {
        val currentChar = this[i]
        if (i > 0 && currentChar.isUpperCase()) {
            val prevChar = this[i - 1]
            // Insert underscore if the previous character is lowercase
            // OR if the previous character is uppercase but the next character exists and is lowercase
            if (prevChar.isLowerCase() || (prevChar.isUpperCase() && i < this.lastIndex && this[i + 1].isLowerCase())) {
                result.append('_')
            }
        }
        result.append(currentChar)
    }
    return result.toString().uppercase(Locale.getDefault())
}

fun String.removePrefixWords(wordWithDashes: String): String {
    // We split the 2 strings into different "words"
    val otherWords = wordWithDashes.split('_')
    val valueWords = this.split('_')

    var index = 0
    for (enumWord in otherWords) {
        if (index >= valueWords.size) break
        val valueWord = valueWords[index]
        // Remove the word if the receiver word is not longer than the parameter word
        // and the parameter word starts with the entire value word.
        if (valueWord.length <= enumWord.length && enumWord.startsWith(valueWord)) {
            index++
        } else {
            break
        }
    }
    // Join the remaining words with underscores.
    return valueWords.drop(index).joinToString("_")
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
