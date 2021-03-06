// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.BaseButton
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Base class for different kinds of buttons.
 *
 * BaseButton is the abstract base class for buttons, so it shouldn't be used directly (it doesn't display anything). Other types of buttons inherit from it.
 */
@GodotBaseType
open class BaseButton : Control() {
  /**
   * Emitted when the button starts being held down.
   */
  val buttonDown: Signal0 by signal()

  /**
   * Emitted when the button stops being held down.
   */
  val buttonUp: Signal0 by signal()

  val signalPressed: Signal0 by signal()

  /**
   * Emitted when the button was just toggled between pressed and normal states (only if [toggleMode] is active). The new state is contained in the `button_pressed` argument.
   */
  val toggled: Signal1<Boolean> by signal("button_pressed")

  /**
   * Determines when the button is considered clicked, one of the [enum ActionMode] constants.
   */
  open var actionMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_ACTION_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_ACTION_MODE, NIL)
    }

  /**
   * Binary mask to choose which mouse buttons this button will respond to.
   *
   * To allow both left-click and right-click, use `BUTTON_MASK_LEFT | BUTTON_MASK_RIGHT`.
   */
  open var buttonMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_BUTTON_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_BUTTON_MASK, NIL)
    }

  /**
   * If `true`, the button is in disabled state and can't be clicked or toggled.
   */
  open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_DISABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_DISABLED, NIL)
    }

  /**
   * Focus access mode to use when switching between enabled/disabled (see [godot.Control.focusMode] and [disabled]).
   */
  open var enabledFocusMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_ENABLED_FOCUS_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_ENABLED_FOCUS_MODE,
          NIL)
    }

  /**
   * [godot.ButtonGroup] associated to the button.
   */
  open var group: ButtonGroup?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_GROUP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ButtonGroup?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_GROUP, NIL)
    }

  /**
   * If `true`, the button stays pressed when moving the cursor outside the button while pressing it.
   *
   * **Note:** This property only affects the button's visual appearance. Signals will be emitted at the same moment regardless of this property's value.
   */
  open var keepPressedOutside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_KEEP_PRESSED_OUTSIDE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_KEEP_PRESSED_OUTSIDE, NIL)
    }

  /**
   * If `true`, the button's state is pressed. Means the button is pressed down or toggled (if [toggleMode] is active).
   */
  open var pressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_PRESSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_PRESSED, NIL)
    }

  /**
   * [godot.ShortCut] associated to the button.
   */
  open var shortcut: ShortCut?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_SHORTCUT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ShortCut?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_SHORTCUT, NIL)
    }

  /**
   * If `true`, the button will add information about its shortcut in the tooltip.
   */
  open var shortcutInTooltip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_SHORTCUT_IN_TOOLTIP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_SHORTCUT_IN_TOOLTIP, NIL)
    }

  /**
   * If `true`, the button is in toggle mode. Makes the button flip state between pressed and unpressed each time its area is clicked.
   */
  open var toggleMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_TOGGLE_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_TOGGLE_MODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_BASEBUTTON)

  override fun _guiInput(event: InputEvent) {
  }

  /**
   * Called when the button is pressed. If you need to know the button's pressed state (and [toggleMode] is active), use [_toggled] instead.
   */
  open fun _pressed() {
  }

  /**
   * Called when the button is toggled (only if [toggleMode] is active).
   */
  open fun _toggled(buttonPressed: Boolean) {
  }

  override fun _unhandledInput(event: InputEvent) {
  }

  /**
   * Returns the visual state used to draw the button. This is useful mainly when implementing your own draw code by either overriding _draw() or connecting to "draw" signal. The visual state of the button is defined by the [enum DrawMode] enum.
   */
  open fun getDrawMode(): BaseButton.DrawMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_DRAW_MODE, LONG)
    return BaseButton.DrawMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the mouse has entered the button and has not left it yet.
   */
  open fun isHovered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_IS_HOVERED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class ActionMode(
    id: Long
  ) {
    /**
     * Require just a press to consider the button clicked.
     */
    ACTION_MODE_BUTTON_PRESS(0),

    /**
     * Require a press and a subsequent release before considering the button clicked.
     */
    ACTION_MODE_BUTTON_RELEASE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DrawMode(
    id: Long
  ) {
    /**
     * The normal state (i.e. not pressed, not hovered, not toggled and enabled) of buttons.
     */
    DRAW_NORMAL(0),

    /**
     * The state of buttons are pressed.
     */
    DRAW_PRESSED(1),

    /**
     * The state of buttons are hovered.
     */
    DRAW_HOVER(2),

    /**
     * The state of buttons are disabled.
     */
    DRAW_DISABLED(3),

    /**
     * The state of buttons are both hovered and pressed.
     */
    DRAW_HOVER_PRESSED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Require just a press to consider the button clicked.
     */
    final const val ACTION_MODE_BUTTON_PRESS: Long = 0

    /**
     * Require a press and a subsequent release before considering the button clicked.
     */
    final const val ACTION_MODE_BUTTON_RELEASE: Long = 1

    /**
     * The state of buttons are disabled.
     */
    final const val DRAW_DISABLED: Long = 3

    /**
     * The state of buttons are hovered.
     */
    final const val DRAW_HOVER: Long = 2

    /**
     * The state of buttons are both hovered and pressed.
     */
    final const val DRAW_HOVER_PRESSED: Long = 4

    /**
     * The normal state (i.e. not pressed, not hovered, not toggled and enabled) of buttons.
     */
    final const val DRAW_NORMAL: Long = 0

    /**
     * The state of buttons are pressed.
     */
    final const val DRAW_PRESSED: Long = 1
  }
}
