// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRActionSet : Resource() {
  public var localizedName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_LOCALIZED_NAME,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_SET_LOCALIZED_NAME,
          NIL.ordinal)
    }

  public var priority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_PRIORITY,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_SET_PRIORITY,
          NIL.ordinal)
    }

  public var actions: OpenXRAction?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_GET_ACTIONS,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as OpenXRAction?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_SET_ACTIONS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OPENXRACTIONSET)
  }

  public fun addAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_ADD_ACTION, NIL.ordinal)
  }

  public fun removeAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONSET_REMOVE_ACTION,
        NIL.ordinal)
  }

  public companion object
}
