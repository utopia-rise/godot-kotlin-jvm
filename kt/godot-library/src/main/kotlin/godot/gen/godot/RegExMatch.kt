// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Contains the results of a single [RegEx] match returned by [RegEx.search] and [RegEx.searchAll].
 * It can be used to find the position and range of the match and its capturing groups, and it can
 * extract its substring for you.
 */
@GodotBaseType
public open class RegExMatch : RefCounted() {
  /**
   * The source string used with the search pattern to find this matching result.
   */
  public final inline val subject: String
    @JvmName("subjectProperty")
    get() = getSubject()

  /**
   * A dictionary of named groups and its corresponding group number. Only groups that were matched
   * are included. If multiple groups have the same name, that name would refer to the first matching
   * one.
   */
  public final inline val names: Dictionary<Any?, Any?>
    @JvmName("namesProperty")
    get() = getNames()

  /**
   * An [Array] of the match and its capturing groups.
   */
  public final inline val strings: PackedStringArray
    @JvmName("stringsProperty")
    get() = getStrings()

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_REGEXMATCH, scriptIndex)
  }

  public final fun getSubject(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSubjectPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the number of capturing groups.
   */
  public final fun getGroupCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun getNames(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public final fun getStrings(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStringsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the substring of the match from the source string. Capturing groups can be retrieved by
   * providing its group number as an integer or its string name (if it's a named group). The default
   * value of 0 refers to the whole pattern.
   * Returns an empty string if the group did not match or doesn't exist.
   */
  @JvmOverloads
  public final fun getString(name: Any? = 0): String {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the starting position of the match within the source string. The starting position of
   * capturing groups can be retrieved by providing its group number as an integer or its string name
   * (if it's a named group). The default value of 0 refers to the whole pattern.
   * Returns -1 if the group did not match or doesn't exist.
   */
  @JvmOverloads
  public final fun getStart(name: Any? = 0): Int {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getStartPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the end position of the match within the source string. The end position of capturing
   * groups can be retrieved by providing its group number as an integer or its string name (if it's a
   * named group). The default value of 0 refers to the whole pattern.
   * Returns -1 if the group did not match or doesn't exist.
   */
  @JvmOverloads
  public final fun getEnd(name: Any? = 0): Int {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getEndPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val getSubjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_subject", 201670096)

    public val getGroupCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_group_count", 3905245786)

    public val getNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_names", 3102165223)

    public val getStringsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_strings", 1139954409)

    public val getStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_string", 687115856)

    public val getStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_start", 490464691)

    public val getEndPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_end", 490464691)
  }
}
