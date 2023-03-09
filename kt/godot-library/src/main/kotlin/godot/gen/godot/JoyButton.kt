// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class JoyButton(
  id: Long,
) {
  JOY_BUTTON_INVALID(-1),
  JOY_BUTTON_A(0),
  JOY_BUTTON_B(1),
  JOY_BUTTON_X(2),
  JOY_BUTTON_Y(3),
  JOY_BUTTON_BACK(4),
  JOY_BUTTON_GUIDE(5),
  JOY_BUTTON_START(6),
  JOY_BUTTON_LEFT_STICK(7),
  JOY_BUTTON_RIGHT_STICK(8),
  JOY_BUTTON_LEFT_SHOULDER(9),
  JOY_BUTTON_RIGHT_SHOULDER(10),
  JOY_BUTTON_DPAD_UP(11),
  JOY_BUTTON_DPAD_DOWN(12),
  JOY_BUTTON_DPAD_LEFT(13),
  JOY_BUTTON_DPAD_RIGHT(14),
  JOY_BUTTON_MISC1(15),
  JOY_BUTTON_PADDLE1(16),
  JOY_BUTTON_PADDLE2(17),
  JOY_BUTTON_PADDLE3(18),
  JOY_BUTTON_PADDLE4(19),
  JOY_BUTTON_TOUCHPAD(20),
  JOY_BUTTON_SDL_MAX(21),
  JOY_BUTTON_MAX(128),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}
