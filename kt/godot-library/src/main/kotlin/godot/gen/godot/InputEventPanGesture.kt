// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class InputEventPanGesture : InputEventGesture() {
  /**
   *
   */
  public open var delta: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTPANGESTURE_GET_DELTA,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTPANGESTURE_SET_DELTA,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTPANGESTURE)
  }

  public companion object
}
