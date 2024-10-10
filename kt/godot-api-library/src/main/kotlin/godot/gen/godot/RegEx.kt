// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_REGEX_INDEX: Int = 482

/**
 * A regular expression (or regex) is a compact language that can be used to recognize strings that
 * follow a specific pattern, such as URLs, email addresses, complete sentences, etc. For example, a
 * regex of `ab[0-9]` would find any string that is `ab` followed by any number from `0` to `9`. For a
 * more in-depth look, you can easily find various tutorials and detailed explanations on the Internet.
 * To begin, the RegEx object needs to be compiled with the search pattern using [compile] before it
 * can be used.
 * [codeblock]
 * var regex = RegEx.new()
 * regex.compile("\\w-(\\d+)")
 * [/codeblock]
 * The search pattern must be escaped first for GDScript before it is escaped for the expression.
 * For example, `compile("\\d+")` would be read by RegEx as `\d+`. Similarly,
 * `compile("\"(?:\\\\.|[^\"])*\"")` would be read as `"(?:\\.|[^"])*"`. In GDScript, you can also use
 * raw string literals (r-strings). For example, `compile(r'"(?:\\.|[^"])*"')` would be read the same.
 * Using [search], you can find the pattern within the given text. If a pattern is found,
 * [RegExMatch] is returned and you can retrieve details of the results using methods such as
 * [RegExMatch.getString] and [RegExMatch.getStart].
 * [codeblock]
 * var regex = RegEx.new()
 * regex.compile("\\w-(\\d+)")
 * var result = regex.search("abc n-0123")
 * if result:
 *     print(result.get_string()) # Would print n-0123
 * [/codeblock]
 * The results of capturing groups `()` can be retrieved by passing the group number to the various
 * methods in [RegExMatch]. Group 0 is the default and will always refer to the entire pattern. In the
 * above example, calling `result.get_string(1)` would give you `0123`.
 * This version of RegEx also supports named capturing groups, and the names can be used to retrieve
 * the results. If two or more groups have the same name, the name would only refer to the first one
 * with a match.
 * [codeblock]
 * var regex = RegEx.new()
 * regex.compile("d(?<digit>[0-9]+)|x(?<digit>[0-9a-f]+)")
 * var result = regex.search("the number is x2f")
 * if result:
 *     print(result.get_string("digit")) # Would print 2f
 * [/codeblock]
 * If you need to process multiple results, [searchAll] generates a list of all non-overlapping
 * results. This can be combined with a `for` loop for convenience.
 * [codeblock]
 * for result in regex.search_all("d01, d03, d0c, x3f and x42"):
 *     print(result.get_string("digit"))
 * # Would print 01 03 0 3f 42
 * [/codeblock]
 * **Example of splitting a string using a RegEx:**
 * [codeblock]
 * var regex = RegEx.new()
 * regex.compile("\\S+") # Negated whitespace character class.
 * var results = []
 * for result in regex.search_all("One  Two \n\tThree"):
 *     results.push_back(result.get_string())
 * # The `results` array now contains "One", "Two", "Three".
 * [/codeblock]
 * **Note:** Godot's regex implementation is based on the [url=https://www.pcre.org/]PCRE2[/url]
 * library. You can view the full pattern reference
 * [url=https://www.pcre.org/current/doc/html/pcre2pattern.html]here[/url].
 * **Tip:** You can use [url=https://regexr.com/]Regexr[/url] to test regular expressions online.
 */
@GodotBaseType
public open class RegEx : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_REGEX_INDEX, scriptIndex)
  }

  /**
   * This method resets the state of the object, as if it was freshly created. Namely, it unassigns
   * the regular expression of this object.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Compiles and assign the search pattern to use. Returns [OK] if the compilation is successful.
   * If an error is encountered, details are printed to standard output and an error is returned.
   */
  public final fun compile(pattern: String): Error {
    Internals.writeArguments(STRING to pattern)
    Internals.callMethod(rawPtr, MethodBindings.compilePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Searches the text for the compiled pattern. Returns a [RegExMatch] container of the first
   * matching result if found, otherwise `null`.
   * The region to search within can be specified with [offset] and [end]. This is useful when
   * searching for another match in the same [subject] by calling this method again after a previous
   * success. Note that setting these parameters differs from passing over a shortened string. For
   * example, the start anchor `^` is not affected by [offset], and the character before [offset] will
   * be checked for the word boundary `\b`.
   */
  @JvmOverloads
  public final fun search(
    subject: String,
    offset: Int = 0,
    end: Int = -1,
  ): RegExMatch? {
    Internals.writeArguments(STRING to subject, LONG to offset.toLong(), LONG to end.toLong())
    Internals.callMethod(rawPtr, MethodBindings.searchPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as RegExMatch?)
  }

  /**
   * Searches the text for the compiled pattern. Returns an array of [RegExMatch] containers for
   * each non-overlapping result. If no results were found, an empty array is returned instead.
   * The region to search within can be specified with [offset] and [end]. This is useful when
   * searching for another match in the same [subject] by calling this method again after a previous
   * success. Note that setting these parameters differs from passing over a shortened string. For
   * example, the start anchor `^` is not affected by [offset], and the character before [offset] will
   * be checked for the word boundary `\b`.
   */
  @JvmOverloads
  public final fun searchAll(
    subject: String,
    offset: Int = 0,
    end: Int = -1,
  ): VariantArray<RegExMatch> {
    Internals.writeArguments(STRING to subject, LONG to offset.toLong(), LONG to end.toLong())
    Internals.callMethod(rawPtr, MethodBindings.searchAllPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RegExMatch>)
  }

  /**
   * Searches the text for the compiled pattern and replaces it with the specified string. Escapes
   * and backreferences such as `$1` and `$name` are expanded and resolved. By default, only the first
   * instance is replaced, but it can be changed for all instances (global replacement).
   * The region to search within can be specified with [offset] and [end]. This is useful when
   * searching for another match in the same [subject] by calling this method again after a previous
   * success. Note that setting these parameters differs from passing over a shortened string. For
   * example, the start anchor `^` is not affected by [offset], and the character before [offset] will
   * be checked for the word boundary `\b`.
   */
  @JvmOverloads
  public final fun sub(
    subject: String,
    replacement: String,
    all: Boolean = false,
    offset: Int = 0,
    end: Int = -1,
  ): String {
    Internals.writeArguments(STRING to subject, STRING to replacement, BOOL to all, LONG to offset.toLong(), LONG to end.toLong())
    Internals.callMethod(rawPtr, MethodBindings.subPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns whether this object has a valid search pattern assigned.
   */
  public final fun isValid(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isValidPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the original search pattern that was compiled.
   */
  public final fun getPattern(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPatternPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the number of capturing groups in compiled pattern.
   */
  public final fun getGroupCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGroupCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array of names of named capturing groups in the compiled pattern. They are ordered
   * by appearance.
   */
  public final fun getNames(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNamesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public companion object {
    /**
     * Creates and compiles a new [RegEx] object.
     */
    public final fun createFromString(pattern: String): RegEx? {
      Internals.writeArguments(STRING to pattern)
      Internals.callMethod(0, MethodBindings.createFromStringPtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as RegEx?)
    }
  }

  internal object MethodBindings {
    public val createFromStringPtr: VoidPtr =
        Internals.getMethodBindPtr("RegEx", "create_from_string", 2150300909)

    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "clear", 3218959716)

    public val compilePtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "compile", 166001499)

    public val searchPtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "search", 3365977994)

    public val searchAllPtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "search_all", 849021363)

    public val subPtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "sub", 54019702)

    public val isValidPtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "is_valid", 36873697)

    public val getPatternPtr: VoidPtr =
        Internals.getMethodBindPtr("RegEx", "get_pattern", 201670096)

    public val getGroupCountPtr: VoidPtr =
        Internals.getMethodBindPtr("RegEx", "get_group_count", 3905245786)

    public val getNamesPtr: VoidPtr = Internals.getMethodBindPtr("RegEx", "get_names", 1139954409)
  }
}
