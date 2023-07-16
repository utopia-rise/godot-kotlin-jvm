// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.VariantType.ANY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class RegExMatch : RefCounted() {
  public val subject: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_SUBJECT, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public val names: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_NAMES, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }

  public val strings: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_STRINGS,
          PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REGEXMATCH, scriptIndex)
    return true
  }

  public fun getGroupCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_GROUP_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getString(name: Any = 0): String {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_STRING, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getStart(name: Any = 0): Int {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_START, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getEnd(name: Any = 0): Int {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_END, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}
