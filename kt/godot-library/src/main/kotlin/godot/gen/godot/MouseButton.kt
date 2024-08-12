// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class MouseButton(
  id: Long,
) {
  /**
   * Enum value which doesn't correspond to any mouse button. This is used to initialize
   * [MouseButton] properties with a generic state.
   */
  MOUSE_BUTTON_NONE(0),
  /**
   * Primary mouse button, usually assigned to the left button.
   */
  MOUSE_BUTTON_LEFT(1),
  /**
   * Secondary mouse button, usually assigned to the right button.
   */
  MOUSE_BUTTON_RIGHT(2),
  /**
   * Middle mouse button.
   */
  MOUSE_BUTTON_MIDDLE(3),
  /**
   * Mouse wheel scrolling up.
   */
  MOUSE_BUTTON_WHEEL_UP(4),
  /**
   * Mouse wheel scrolling down.
   */
  MOUSE_BUTTON_WHEEL_DOWN(5),
  /**
   * Mouse wheel left button (only present on some mice).
   */
  MOUSE_BUTTON_WHEEL_LEFT(6),
  /**
   * Mouse wheel right button (only present on some mice).
   */
  MOUSE_BUTTON_WHEEL_RIGHT(7),
  /**
   * Extra mouse button 1. This is sometimes present, usually to the sides of the mouse.
   */
  MOUSE_BUTTON_XBUTTON1(8),
  /**
   * Extra mouse button 2. This is sometimes present, usually to the sides of the mouse.
   */
  MOUSE_BUTTON_XBUTTON2(9),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}
