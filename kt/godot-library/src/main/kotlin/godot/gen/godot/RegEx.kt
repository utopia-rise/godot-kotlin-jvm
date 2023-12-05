// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class RegEx : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REGEX, scriptIndex)
    return true
  }

  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun compile(pattern: String): GodotError {
    TransferContext.writeArguments(STRING to pattern)
    TransferContext.callMethod(rawPtr, MethodBindings.compilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun search(
    subject: String,
    offset: Int = 0,
    end: Int = -1,
  ): RegExMatch? {
    TransferContext.writeArguments(STRING to subject, LONG to offset.toLong(), LONG to end.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.searchPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RegExMatch?)
  }

  @JvmOverloads
  public fun searchAll(
    subject: String,
    offset: Int = 0,
    end: Int = -1,
  ): VariantArray<RegExMatch> {
    TransferContext.writeArguments(STRING to subject, LONG to offset.toLong(), LONG to end.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.searchAllPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RegExMatch>)
  }

  @JvmOverloads
  public fun sub(
    subject: String,
    replacement: String,
    all: Boolean = false,
    offset: Int = 0,
    end: Int = -1,
  ): String {
    TransferContext.writeArguments(STRING to subject, STRING to replacement, BOOL to all, LONG to offset.toLong(), LONG to end.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.subPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPattern(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getGroupCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getNames(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public companion object {
    public fun createFromString(pattern: String): RegEx? {
      TransferContext.writeArguments(STRING to pattern)
      TransferContext.callMethod(0, MethodBindings.createFromStringPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as RegEx?)
    }
  }

  internal object MethodBindings {
    public val createFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegEx", "create_from_string")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "clear")

    public val compilePtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "compile")

    public val searchPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "search")

    public val searchAllPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "search_all")

    public val subPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "sub")

    public val isValidPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "is_valid")

    public val getPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "get_pattern")

    public val getGroupCountPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "get_group_count")

    public val getNamesPtr: VoidPtr = TypeManager.getMethodBindPtr("RegEx", "get_names")
  }
}
