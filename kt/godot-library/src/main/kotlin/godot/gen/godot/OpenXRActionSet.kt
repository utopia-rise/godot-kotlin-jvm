// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRActionSet : Resource() {
  public var localizedName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_LOCALIZED_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_SET_LOCALIZED_NAME, NIL)
    }

  public var priority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_PRIORITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_SET_PRIORITY, NIL)
    }

  public var actions: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_ACTIONS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_SET_ACTIONS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRACTIONSET, scriptIndex)
    return true
  }

  public fun getActionCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_ACTION_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun addAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_ADD_ACTION, NIL)
  }

  public fun removeAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_REMOVE_ACTION, NIL)
  }

  public companion object
}
