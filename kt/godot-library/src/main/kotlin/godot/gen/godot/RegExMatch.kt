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
      TransferContext.callMethod(rawPtr, MethodBindings.getSubjectPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public val names: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNamesPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }

  public val strings: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStringsPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REGEXMATCH, scriptIndex)
    return true
  }

  public fun getGroupCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getString(name: Any? = 0): String {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun getStart(name: Any? = 0): Int {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getStartPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun getEnd(name: Any? = 0): Int {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getEndPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val getSubjectPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_subject")

    public val getGroupCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RegExMatch", "get_group_count")

    public val getNamesPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_names")

    public val getStringsPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_strings")

    public val getStringPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_string")

    public val getStartPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_start")

    public val getEndPtr: VoidPtr = TypeManager.getMethodBindPtr("RegExMatch", "get_end")
  }
}
