// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base input event type for mouse events.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html)
 *
 * Stores general mouse events information.
 */
@GodotBaseType
open class InputEventMouse : InputEventWithModifiers() {
  /**
   * The mouse button mask identifier, one of or a bitwise combination of the [enum ButtonList] button masks.
   */
  open var buttonMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_GET_BUTTON_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_SET_BUTTON_MASK,
          NIL)
    }

  /**
   * The global mouse position relative to the current [godot.Viewport] when used in [godot.Control.GuiInput], otherwise is at 0,0.
   */
  open var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_GET_GLOBAL_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_SET_GLOBAL_POSITION, NIL)
    }

  /**
   * The local mouse position relative to the [godot.Viewport]. If used in [godot.Control.GuiInput], the position is relative to the current [godot.Control] which is under the mouse.
   */
  open var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_GET_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_SET_POSITION, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSE)
  }

  open fun globalPosition(schedule: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      schedule(this)
      globalPosition = this
  }


  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }

}
