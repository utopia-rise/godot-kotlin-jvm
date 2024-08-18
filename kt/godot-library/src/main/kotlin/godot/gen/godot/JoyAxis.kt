// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class JoyAxis(
  id: Long,
) {
  /**
   * An invalid game controller axis.
   */
  JOY_AXIS_INVALID(-1),
  /**
   * Game controller left joystick x-axis.
   */
  JOY_AXIS_LEFT_X(0),
  /**
   * Game controller left joystick y-axis.
   */
  JOY_AXIS_LEFT_Y(1),
  /**
   * Game controller right joystick x-axis.
   */
  JOY_AXIS_RIGHT_X(2),
  /**
   * Game controller right joystick y-axis.
   */
  JOY_AXIS_RIGHT_Y(3),
  /**
   * Game controller left trigger axis.
   */
  JOY_AXIS_TRIGGER_LEFT(4),
  /**
   * Game controller right trigger axis.
   */
  JOY_AXIS_TRIGGER_RIGHT(5),
  /**
   * The number of SDL game controller axes.
   */
  JOY_AXIS_SDL_MAX(6),
  /**
   * The maximum number of game controller axes: OpenVR supports up to 5 Joysticks making a total of
   * 10 axes.
   */
  JOY_AXIS_MAX(10),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): JoyAxis = entries.single { it.id == `value` }
  }
}
