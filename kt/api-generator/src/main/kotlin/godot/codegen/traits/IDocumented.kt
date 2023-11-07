package godot.codegen.traits

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.tools.common.extensions.convertToCamelCase

private val titlesToSanitize = arrayOf(
    "member",
    "method"
)

private val tagsToSanitize = arrayOf(
    "code" to "`",
    "i" to "*",
    "b" to "**"
)

private val languages = arrayOf(
    "gdscript",
    "csharp"
)

interface IDocumented {
    val documentation: String?

    val sanitizedDocumentation: String?
        get() {
            var unicodeString = documentation
                ?.replace("/*", "&#47;*")
                ?.replace("%", "&#37;")
                ?.replace("*/", "*&#92;")
                ?.replace(System.lineSeparator(), "\n")

            for (title in titlesToSanitize) {
                val regex = Regex("\\[($title\\s)(\\S+)(\\])")

                var matchResult = unicodeString?.let { regex.find(it) }
                while (matchResult != null) {
                    val titleRange = matchResult.groups[1]!!.range
                    val contentRange = matchResult.groups[2]!!.range
                    val content = unicodeString!!.substring(contentRange).convertToCamelCase()
                    unicodeString = unicodeString
                        .replaceRange(contentRange, content)
                        .removeRange(titleRange)
                    matchResult = unicodeString.let { regex.find(it) }
                }
            }

            for (tag in tagsToSanitize) {
                val regex = Regex("(\\[${tag.first}\\])((?:(?!\\[\\/${tag.first}\\]|\\[${tag.first}\\]).)*)(\\[\\/${tag.first}\\])")

                var matchResult = unicodeString?.let { regex.find(it) }
                while (matchResult != null) {
                    val endTagRange = matchResult.groups[3]!!.range
                    val beginTagRange = matchResult.groups[1]!!.range
                    unicodeString = unicodeString!!
                        .replaceRange(endTagRange, tag.second)
                        .replaceRange(beginTagRange, tag.second)
                    matchResult = unicodeString.let { regex.find(it) }
                }
            }

            unicodeString = unicodeString
                ?.replace("[codeblocks]", "")
                ?.replace("[/codeblocks]", "")

            for (language in languages) {
                unicodeString = unicodeString
                    ?.replace("[$language]", "$language:\n```$language")
                    ?.replace("[/$language]", "```")
            }

            return unicodeString
        }
}

//TODO: Use Documentable interface from poet when upgrading kotlin poet.
fun TypeSpec.Builder.addKdoc(documented: IDocumented): TypeSpec.Builder {
    val documentation = documented.sanitizedDocumentation
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}

fun PropertySpec.Builder.addKdoc(documented: IDocumented): PropertySpec.Builder {
    val documentation = documented.sanitizedDocumentation
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}

fun FunSpec.Builder.addKdoc(documented: IDocumented): FunSpec.Builder {
    val documentation = documented.sanitizedDocumentation
    return if (documentation.isNullOrEmpty()) {
        this
    } else {
        this.addKdoc(documentation)
    }
}