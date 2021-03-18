// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Input event type for mouse motion events.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/mouse_and_input_coordinates.html](https://docs.godotengine.org/en/latest/tutorials/inputs/mouse_and_input_coordinates.html)
 *
 * Contains mouse and pen motion information. Supports relative, absolute positions and speed. See [godot.Node.Input].
 *
 * **Note:** By default, this event is only emitted once per frame rendered at most. If you need more precise input reporting, call [godot.Input.setUseAccumulatedInput] with `false` to make events emitted as often as possible. If you use InputEventMouseMotion to draw lines, consider implementing [godot.Bresenham's line algorithm](https://en.wikipedia.org/wiki/Bresenham%27s_line_algorithm) as well to avoid visible gaps in lines if the user is moving the mouse quickly.
 */
@GodotBaseType
open class InputEventMouseMotion : InputEventMouse() {
  /**
   * Represents the pressure the user puts on the pen. Ranges from `0.0` to `1.0`.
   */
  open var pressure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_PRESSURE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_PRESSURE, NIL)
    }

  /**
   * The mouse position relative to the previous position (position at the last frame).
   *
   * **Note:** Since [godot.InputEventMouseMotion] is only emitted when the mouse moves, the last event won't have a relative position of `Vector2(0, 0)` when the user stops moving the mouse.
   */
  open var relative: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_RELATIVE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_RELATIVE, NIL)
    }

  /**
   * The mouse speed in pixels per second.
   */
  open var speed: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_SPEED,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_SPEED,
          NIL)
    }

  /**
   * Represents the angles of tilt of the pen. Positive X-coordinate value indicates a tilt to the right. Positive Y-coordinate value indicates a tilt toward the user. Ranges from `-1.0` to `1.0` for both axes.
   */
  open var tilt: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_TILT,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_TILT,
          NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENTMOUSEMOTION)

  open fun relative(schedule: Vector2.() -> Unit): Vector2 = relative.apply{
      schedule(this)
      relative = this
  }


  open fun speed(schedule: Vector2.() -> Unit): Vector2 = speed.apply{
      schedule(this)
      speed = this
  }


  open fun tilt(schedule: Vector2.() -> Unit): Vector2 = tilt.apply{
      schedule(this)
      tilt = this
  }

}
