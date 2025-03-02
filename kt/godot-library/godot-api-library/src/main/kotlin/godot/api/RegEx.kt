// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

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
 * **Example:** Split a string using a RegEx:
 * [codeblock]
 * var regex = RegEx.new()
 * regex.compile("\\S+") # Negated whitespace character class.
 * var results = []
 * for result in regex.search_all("One  Two \n\tThree"):
 *     results.push_back(result.get_string())
 * # The `results` array now contains "One", "Two", and "Three".
 * [/codeblock]
 * **Note:** Godot's regex implementation is based on the [url=https://www.pcre.org/]PCRE2[/url]
 * library. You can view the full pattern reference
 * [url=https://www.pcre.org/current/doc/html/pcre2pattern.html]here[/url].
 * **Tip:** You can use [url=https://regexr.com/]Regexr[/url] to test regular expressions online.
 */
@GodotBaseType
public open class RegEx : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(549, scriptIndex)
  }

  /**
   * This method resets the state of the object, as if it was freshly created. Namely, it unassigns
   * the regular expression of this object.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Compiles and assign the search pattern to use. Returns [OK] if the compilation is successful.
   * If compilation fails, returns [FAILED] and when [showError] is `true`, details are printed to
   * standard output.
   */
  @JvmOverloads
  public final fun compile(pattern: String, showError: Boolean = true): Error {
    TransferContext.writeArguments(STRING to pattern, BOOL to showError)
    TransferContext.callMethod(ptr, MethodBindings.compilePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
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
    TransferContext.writeArguments(STRING to subject, LONG to offset.toLong(), LONG to end.toLong())
    TransferContext.callMethod(ptr, MethodBindings.searchPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as RegExMatch?)
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
    TransferContext.writeArguments(STRING to subject, LONG to offset.toLong(), LONG to end.toLong())
    TransferContext.callMethod(ptr, MethodBindings.searchAllPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RegExMatch>)
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
    TransferContext.writeArguments(STRING to subject, STRING to replacement, BOOL to all, LONG to offset.toLong(), LONG to end.toLong())
    TransferContext.callMethod(ptr, MethodBindings.subPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns whether this object has a valid search pattern assigned.
   */
  public final fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the original search pattern that was compiled.
   */
  public final fun getPattern(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPatternPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the number of capturing groups in compiled pattern.
   */
  public final fun getGroupCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroupCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array of names of named capturing groups in the compiled pattern. They are ordered
   * by appearance.
   */
  public final fun getNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNamesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public companion object {
    /**
     * Creates and compiles a new [RegEx] object. See also [compile].
     */
    @JvmOverloads
    public final fun createFromString(pattern: String, showError: Boolean = true): RegEx? {
      TransferContext.writeArguments(STRING to pattern, BOOL to showError)
      TransferContext.callMethod(0, MethodBindings.createFromStringPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as RegEx?)
    }
  }

  public object MethodBindings {
    internal val createFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegEx", "create_from_string", 4249111514)

    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "clear", 3218959716)

    internal val compilePtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "compile", 3565188097)

    internal val searchPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "search", 3365977994)

    internal val searchAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegEx", "search_all", 849021363)

    internal val subPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "sub", 54019702)

    internal val isValidPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "is_valid", 36873697)

    internal val getPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegEx", "get_pattern", 201670096)

    internal val getGroupCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegEx", "get_group_count", 3905245786)

    internal val getNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegEx", "get_names", 1139954409)
  }
}
