// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
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
open class InputEventPanGesture : InputEventGesture() {
  /**
   *
   */
  open var delta: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTPANGESTURE_GET_DELTA,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTPANGESTURE_SET_DELTA,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_INPUTEVENTPANGESTURE)
  }

  open fun delta(schedule: Vector2.() -> Unit): Vector2 = delta.apply{
      schedule(this)
      delta = this
  }

}
