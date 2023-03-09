// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class MouseButton(
  id: Long,
) {
  MOUSE_BUTTON_NONE(0),
  MOUSE_BUTTON_LEFT(1),
  MOUSE_BUTTON_RIGHT(2),
  MOUSE_BUTTON_MIDDLE(3),
  MOUSE_BUTTON_WHEEL_UP(4),
  MOUSE_BUTTON_WHEEL_DOWN(5),
  MOUSE_BUTTON_WHEEL_LEFT(6),
  MOUSE_BUTTON_WHEEL_RIGHT(7),
  MOUSE_BUTTON_XBUTTON1(8),
  MOUSE_BUTTON_XBUTTON2(9),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}
