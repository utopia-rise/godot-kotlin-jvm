// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class JoyButton(
  id: Long,
) {
  /**
   * An invalid game controller button.
   */
  JOY_BUTTON_INVALID(-1),
  /**
   * Game controller SDL button A. Corresponds to the bottom action button: Sony Cross, Xbox A,
   * Nintendo B.
   */
  JOY_BUTTON_A(0),
  /**
   * Game controller SDL button B. Corresponds to the right action button: Sony Circle, Xbox B,
   * Nintendo A.
   */
  JOY_BUTTON_B(1),
  /**
   * Game controller SDL button X. Corresponds to the left action button: Sony Square, Xbox X,
   * Nintendo Y.
   */
  JOY_BUTTON_X(2),
  /**
   * Game controller SDL button Y. Corresponds to the top action button: Sony Triangle, Xbox Y,
   * Nintendo X.
   */
  JOY_BUTTON_Y(3),
  /**
   * Game controller SDL back button. Corresponds to the Sony Select, Xbox Back, Nintendo - button.
   */
  JOY_BUTTON_BACK(4),
  /**
   * Game controller SDL guide button. Corresponds to the Sony PS, Xbox Home button.
   */
  JOY_BUTTON_GUIDE(5),
  /**
   * Game controller SDL start button. Corresponds to the Sony Options, Xbox Menu, Nintendo +
   * button.
   */
  JOY_BUTTON_START(6),
  /**
   * Game controller SDL left stick button. Corresponds to the Sony L3, Xbox L/LS button.
   */
  JOY_BUTTON_LEFT_STICK(7),
  /**
   * Game controller SDL right stick button. Corresponds to the Sony R3, Xbox R/RS button.
   */
  JOY_BUTTON_RIGHT_STICK(8),
  /**
   * Game controller SDL left shoulder button. Corresponds to the Sony L1, Xbox LB button.
   */
  JOY_BUTTON_LEFT_SHOULDER(9),
  /**
   * Game controller SDL right shoulder button. Corresponds to the Sony R1, Xbox RB button.
   */
  JOY_BUTTON_RIGHT_SHOULDER(10),
  /**
   * Game controller D-pad up button.
   */
  JOY_BUTTON_DPAD_UP(11),
  /**
   * Game controller D-pad down button.
   */
  JOY_BUTTON_DPAD_DOWN(12),
  /**
   * Game controller D-pad left button.
   */
  JOY_BUTTON_DPAD_LEFT(13),
  /**
   * Game controller D-pad right button.
   */
  JOY_BUTTON_DPAD_RIGHT(14),
  /**
   * Game controller SDL miscellaneous button. Corresponds to Xbox share button, PS5 microphone
   * button, Nintendo Switch capture button.
   */
  JOY_BUTTON_MISC1(15),
  /**
   * Game controller SDL paddle 1 button.
   */
  JOY_BUTTON_PADDLE1(16),
  /**
   * Game controller SDL paddle 2 button.
   */
  JOY_BUTTON_PADDLE2(17),
  /**
   * Game controller SDL paddle 3 button.
   */
  JOY_BUTTON_PADDLE3(18),
  /**
   * Game controller SDL paddle 4 button.
   */
  JOY_BUTTON_PADDLE4(19),
  /**
   * Game controller SDL touchpad button.
   */
  JOY_BUTTON_TOUCHPAD(20),
  /**
   * The number of SDL game controller buttons.
   */
  JOY_BUTTON_SDL_MAX(21),
  /**
   * The maximum number of game controller buttons supported by the engine. The actual limit may be
   * lower on specific platforms:
   * - **Android:** Up to 36 buttons.
   * - **Linux:** Up to 80 buttons.
   * - **Windows** and **macOS:** Up to 128 buttons.
   */
  JOY_BUTTON_MAX(128),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): JoyButton = entries.single { it.id == `value` }
  }
}
