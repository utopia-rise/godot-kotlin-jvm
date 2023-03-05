// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class MouseButtonMask(
  id: Long,
) {
  MOUSE_BUTTON_MASK_LEFT(1),
  MOUSE_BUTTON_MASK_RIGHT(2),
  MOUSE_BUTTON_MASK_MIDDLE(4),
  MOUSE_BUTTON_MASK_MB_XBUTTON1(128),
  MOUSE_BUTTON_MASK_MB_XBUTTON2(256),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}
