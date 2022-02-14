package godot.docgen

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText
import godot.codegen.extensions.convertToCamelCase

@JsonIgnoreProperties(ignoreUnknown = true)
open class RawClassDoc {
    var name: String = ""
    var inherits: String = ""

    @JacksonXmlProperty(localName = "brief_description")
    var briefDescription: String = ""
        get() = field.getFormattedDescription()
    var description: String = ""
        get() = field.getFormattedDescription()

    @JacksonXmlProperty(localName = "tutorials")
    var tutorials: TutorialContainer? = null
    var methods: MethodContainer? = null
    var members: MemberContainer? = null
    var signals: SignalsContainer? = null
    var constants: ConstantsContainer? = null
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class TutorialContainer {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "link")
    var links: List<String> = listOf()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class MethodContainer {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "method")
    var methods: List<RawMethodDoc> = listOf()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class RawMethodDoc {
    var name: String = ""

    @JacksonXmlProperty(localName = "return")
    var returnType: ReturnContainer? = null

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "argument")
    var arguments: List<RawArgumentDoc> = listOf()
    var description: String = ""
        get() = field.getFormattedDescription()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class ReturnContainer {
    var type: String = ""
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class RawArgumentDoc {
    var index: String = ""
    var name: String = ""
    var type: String = ""
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class MemberContainer {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "member")
    var members: List<RawMemberDoc> = listOf()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class RawMemberDoc {
    var name: String = ""
    var type: String = ""
    var setter = ""
    var getter = ""
    var default = ""

    @JacksonXmlText
    var description: String = ""
        get() = field.getFormattedDescription()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class SignalsContainer {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "signal")
    var signals: List<RawSignalDoc> = listOf()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class RawSignalDoc {
    var name: String = ""
    var description: String = ""
        get() = field.getFormattedDescription()

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "argument")
    var arguments: List<RawArgumentDoc> = listOf()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class ConstantsContainer {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "constant")
    var constants: List<RawConstantDoc> = listOf()
}

@JsonIgnoreProperties(ignoreUnknown = true)
open class RawConstantDoc {
    var name: String = ""
    var value: String = ""
    var enum: String = ""

    @JacksonXmlText
    var description: String = ""
        get() = field.getFormattedDescription()
}

//order important! As we expect some things already replaced in the regexes at the bottom to keep them simpler
private fun String.getFormattedDescription(): String = trim()
    .replace("[i]", "*")
    .replace("[/i]", "*")
    .replace("[b]", "**")
    .replace("[/b]", "**")
    .replace("[u]", "<u>")
    .replace("[/u]", "</u>")
    .replace("[s]", "~~")
    .replace("[/s]", "~~")
    .replace("[code]", "`")
    .replace("[/code]", "`")
    .replace("[codeblock]", "```")
    .replace("[/codeblock]", "```")
    .replaceUrls()
    .replaceCodeReferences()
    .replaceClassReferences()
    .replaceNewLines()
    .replaceInvalidCommentSequences()
    .replace(" ", "·") //so kotlin poet does not break where we don't want it


/**
 * Replaces wrong comment characters sequence to avoid invalid comment syntax.
 */
fun String.replaceInvalidCommentSequences(): String = this.replace("*/", "* / ")

/**
 * Replaces new line chars with two new line chars so they are rendered on an new line in kdoc
 *
 * Does not replace newLines in codeblocks
 */
private fun String.replaceNewLines(): String {
    var tmpString = this
    val originalCodeBlocks = "```(.|\\n)+?(?=```)```".toRegex(RegexOption.DOT_MATCHES_ALL)
        .findAll(this)
        .map { it.value }
        .toList()

    tmpString = tmpString.replace("\n", "\n\n").replace("\t", "")
    "```(.|\\n)+?(?=```)```".toRegex(RegexOption.DOT_MATCHES_ALL)
        .findAll(tmpString)
        .map { it.value }
        .forEachIndexed { index, blockToReplace ->
            tmpString = tmpString.replace(blockToReplace, originalCodeBlocks[index])
        }
    return tmpString
}

fun String.replaceUrls(): String {
    var tmpString = this
    //example: [url=http://www.pcg-random.org/]PCG32[/url]
    "\\[url=.+?(?=])].+?(?=\\[/url])\\[/url]".toRegex()
        .findAll(tmpString) //extract all urls with the pattern of the above example from the string
        .map { it.value }
        .map { oldBBCodeUrl ->
            //extract actual url from the match: http://www.pcg-random.org/ in the case of [url=http://www.pcg-random.org/]PCG32[/url]
            val url = "(?<=\\[url=).+?(?=])".toRegex().find(oldBBCodeUrl)?.value
            //extract text from the match: PCG32 in the case of [url=http://www.pcg-random.org/]PCG32[/url]
            val text = "(?<=]).+?(?=\\[/)".toRegex().find(oldBBCodeUrl)?.value
            oldBBCodeUrl to "[$text]($url)"
        }
        .forEach { (oldUrlFormat, newUrlFormat) ->
            tmpString = tmpString.replace(oldUrlFormat, newUrlFormat)
        }

    return tmpString
}

private fun String.replaceCodeReferences(): String {
    var tmpString = this
    //properties
    //example: [member size]
    "\\[member .+?(?=])]".toRegex()
        .findAll(tmpString)
        .map { it.value }
        .map { oldPropertyReference ->
            //extracts property name from match. example: size in the case of [member size]
            val propertyName = "(?<=\\[member ).+?(?=])".toRegex().find(oldPropertyReference)?.value
            oldPropertyReference to propertyName?.convertToCamelCase()
        }
        .filter { it.second != null }
        .forEach { (oldPropertyReference, newPropertyReference) ->
            tmpString = tmpString.replace(oldPropertyReference, "[$newPropertyReference]") //nulls already filtered
        }

    //signals
    //example: [signal pressed]
    "\\[signal .+?(?=])]".toRegex()
        .findAll(tmpString)
        .map { it.value }
        .map { oldSignalReference ->
            //extracts signal name from match. example: pressed in the case of [signal pressed]
            val signalName = "(?<=\\[signal ).+?(?=])".toRegex().find(oldSignalReference)?.value
            oldSignalReference to signalName?.convertToCamelCase()
        }
        .filter { it.second != null }
        .forEach { (oldSignalReference, newSignalReference) ->
            tmpString = tmpString.replace(oldSignalReference, "[$newSignalReference]") //nulls already filtered
        }

    //signals
    //example: [constant MODE_OPEN_FILE]
    "\\[constant .+?(?=])]".toRegex()
        .findAll(tmpString)
        .map { it.value }
        .map { oldConstantReference ->
            //extracts constant name from match. example: MODE_OPEN_FILE in the case of [constant MODE_OPEN_FILE]
            val constantName = "(?<=\\[constant ).+?(?=])".toRegex().find(oldConstantReference)?.value
            oldConstantReference to constantName
        }
        .filter { it.second != null }
        .forEach { (oldConstantReference, newConstantReference) ->
            tmpString = tmpString.replace(oldConstantReference, "[$newConstantReference]") //nulls already filtered
        }

    //functions
    //example: [method get_node]
    "\\[method .+?(?=])]".toRegex()
        .findAll(tmpString)
        .map { it.value }
        .map { oldFunctionReference ->
            //extracts function name from match. example: get_node in the case of [method get_node]
            val functionName = "(?<=\\[method ).+?(?=])".toRegex().find(oldFunctionReference)?.value
            oldFunctionReference to functionName?.convertToCamelCase()
        }
        .filter { it.second != null }
        .forEach { (oldFunctionReference, newFunctionReference) ->
            tmpString = tmpString.replace(oldFunctionReference, "[$newFunctionReference]") //nulls already filtered
        }

    return tmpString
}

private fun String.replaceClassReferences(): String {
    var tmpString = this
    //examples: [Object], [Object.get]
    //matches capitalized string in []
    "(?<=\\[)[A-Z].+?(?=])".toRegex()
        .findAll(tmpString)
        .map { it.value }
        .map { oldClassReference ->
            oldClassReference to if (oldClassReference.matches("^[A-Z]+(?:_[A-Z]+)*\$".toRegex())) {
                oldClassReference //no class ref. its a constant. Not handled in regex to keep it simpler
            } else {
                oldClassReference.setPackagePath()
            }
        }
        .forEach { (oldClassReference, newClassReference) ->
            tmpString = tmpString.replace("[$oldClassReference]", "[$newClassReference]")
        }
    return tmpString
}

private fun String.setPackagePath(): String {
    return if (this.matches("^[A-Z]+(?:_[A-Z]+)*\$".toRegex())) {
        this //no class ref. its a constant. Not handled in regex to keep it simpler
    } else {
        when(this) {
            "Vector2",
            "Rect2",
            "Vector3",
            "Transform2D",
            "Plane",
            "Quat",
            "AABB",
            "Basis",
            "Transform",
            "Color",
            "NodePath",
            "RID",
            "Dictionary",
            "PoolByteArray",
            "PoolIntArray",
            "PoolRealArray",
            "PoolStringArray",
            "PoolColorArray",
            "PoolVector2Array",
            "PoolVector3Array",
            "VariantArray",
            "ObjectArray",
            "EnumArray",
            "BoolVariantArray",
            "IntVariantArray",
            "RealVariantArray",
            "StringVariantArray",
            "AABBArray",
            "BasisArray",
            "ColorArray",
            "NodePathArray",
            "PlaneArray",
            "QuatArray",
            "Rect2Array",
            "RIDArray",
            "Transform2DArray",
            "TransformArray",
            "Vector2Array",
            "Vector3Array" -> "godot.core.$this"
            "Variant" -> this // we don't have a variant class anymore
            else -> "godot.${this.replace("@GDScript", "GD")}"
        }
    }
}
