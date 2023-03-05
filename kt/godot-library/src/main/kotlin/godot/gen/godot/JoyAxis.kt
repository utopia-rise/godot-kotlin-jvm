// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class JoyAxis(
  id: Long,
) {
  JOY_AXIS_INVALID(-1),
  JOY_AXIS_LEFT_X(0),
  JOY_AXIS_LEFT_Y(1),
  JOY_AXIS_RIGHT_X(2),
  JOY_AXIS_RIGHT_Y(3),
  JOY_AXIS_TRIGGER_LEFT(4),
  JOY_AXIS_TRIGGER_RIGHT(5),
  JOY_AXIS_SDL_MAX(6),
  JOY_AXIS_MAX(10),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}
