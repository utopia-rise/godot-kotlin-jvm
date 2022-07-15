// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Input event type for mouse motion events.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * Contains mouse and pen motion information. Supports relative, absolute positions and speed. See [godot.Node.Input].
 *
 * **Note:** The behavior of this event is affected by the value of [godot.Input.useAccumulatedInput]. When set to `true` (default), mouse/pen motion events received from the OS will be merged to emit an accumulated event only once per frame rendered at most. When set to `false`, the events will be emitted as received, which means that they can be emitted multiple times per frame rendered, allowing for precise input reporting at the expense of CPU usage.
 *
 * **Note:** If you use InputEventMouseMotion to draw lines, consider implementing [godot.Bresenham's line algorithm](https://en.wikipedia.org/wiki/Bresenham%27s_line_algorithm) as well to avoid visible gaps in lines if the user is moving the mouse quickly.
 */
@GodotBaseType
public open class InputEventMouseMotion : InputEventMouse() {
  /**
   * Returns `true` when using the eraser end of a stylus pen.
   *
   * **Note:** This property is implemented on Linux, macOS and Windows.
   */
  public open var penInverted: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_PEN_INVERTED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_PEN_INVERTED, NIL)
    }

  /**
   * Represents the pressure the user puts on the pen. Ranges from `0.0` to `1.0`.
   */
  public open var pressure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_PRESSURE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_PRESSURE, NIL)
    }

  /**
   * The mouse position relative to the previous position (position at the last frame).
   *
   * **Note:** Since [godot.InputEventMouseMotion] is only emitted when the mouse moves, the last event won't have a relative position of `Vector2(0, 0)` when the user stops moving the mouse.
   */
  public open var relative: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_RELATIVE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_RELATIVE, NIL)
    }

  /**
   * The mouse speed in pixels per second.
   */
  public open var speed: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_SPEED,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_SPEED,
          NIL)
    }

  /**
   * Represents the angles of tilt of the pen. Positive X-coordinate value indicates a tilt to the right. Positive Y-coordinate value indicates a tilt toward the user. Ranges from `-1.0` to `1.0` for both axes.
   */
  public open var tilt: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_GET_TILT,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEMOTION_SET_TILT,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEMOTION)
  }

  @CoreTypeHelper
  public open fun relative(schedule: Vector2.() -> Unit): Vector2 = relative.apply{
      schedule(this)
      relative = this
  }


  @CoreTypeHelper
  public open fun speed(schedule: Vector2.() -> Unit): Vector2 = speed.apply{
      schedule(this)
      speed = this
  }


  @CoreTypeHelper
  public open fun tilt(schedule: Vector2.() -> Unit): Vector2 = tilt.apply{
      schedule(this)
      tilt = this
  }

}
