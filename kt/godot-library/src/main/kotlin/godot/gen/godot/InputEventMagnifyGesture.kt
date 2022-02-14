// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class InputEventMagnifyGesture : InputEventGesture() {
  /**
   *
   */
  public open var factor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMAGNIFYGESTURE_GET_FACTOR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMAGNIFYGESTURE_SET_FACTOR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMAGNIFYGESTURE)
  }

  public companion object
}
