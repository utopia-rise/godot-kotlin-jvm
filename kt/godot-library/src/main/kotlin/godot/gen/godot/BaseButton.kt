// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.BaseButton
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for different kinds of buttons.
 *
 * BaseButton is the abstract base class for buttons, so it shouldn't be used directly (it doesn't display anything). Other types of buttons inherit from it.
 */
@GodotBaseType
public open class BaseButton : Control() {
  /**
   * Emitted when the button starts being held down.
   */
  public val buttonDown: Signal0 by signal()

  /**
   * Emitted when the button was just toggled between pressed and normal states (only if [toggleMode] is active). The new state is contained in the `button_pressed` argument.
   */
  public val toggled: Signal1<Boolean> by signal("buttonPressed")

  /**
   * Emitted when the button is toggled or pressed. This is on [buttonDown] if [actionMode] is [ACTION_MODE_BUTTON_PRESS] and on [buttonUp] otherwise.
   *
   * If you need to know the button's pressed state (and [toggleMode] is active), use [toggled] instead.
   */
  public val pressed: Signal0 by signal()

  /**
   * Emitted when the button stops being held down.
   */
  public val buttonUp: Signal0 by signal()

  /**
   * If `true`, the button is in disabled state and can't be clicked or toggled.
   */
  public open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_DISABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_DISABLED, NIL)
    }

  /**
   * If `true`, the button is in toggle mode. Makes the button flip state between pressed and unpressed each time its area is clicked.
   */
  public open var toggleMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_TOGGLE_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_TOGGLE_MODE, NIL)
    }

  /**
   * If `true`, the button will add information about its shortcut in the tooltip.
   */
  public open var shortcutInTooltip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_SHORTCUT_IN_TOOLTIP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_SHORTCUT_IN_TOOLTIP, NIL)
    }

  /**
   * If `true`, the button's state is pressed. Means the button is pressed down or toggled (if [toggleMode] is active). Only works if [toggleMode] is `true`.
   *
   * **Note:** Setting [buttonPressed] will result in [toggled] to be emitted. If you want to change the pressed state without emitting that signal, use [setPressedNoSignal].
   */
  public open var buttonPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_BUTTON_PRESSED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_BUTTON_PRESSED,
          NIL)
    }

  /**
   * Determines when the button is considered clicked, one of the [enum ActionMode] constants.
   */
  public open var actionMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_ACTION_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_ACTION_MODE, NIL)
    }

  /**
   * Binary mask to choose which mouse buttons this button will respond to.
   *
   * To allow both left-click and right-click, use `MOUSE_BUTTON_MASK_LEFT | MOUSE_BUTTON_MASK_RIGHT`.
   */
  public open var buttonMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_BUTTON_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_BUTTON_MASK, NIL)
    }

  /**
   * If `true`, the button stays pressed when moving the cursor outside the button while pressing it.
   *
   * **Note:** This property only affects the button's visual appearance. Signals will be emitted at the same moment regardless of this property's value.
   */
  public open var keepPressedOutside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_KEEP_PRESSED_OUTSIDE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_KEEP_PRESSED_OUTSIDE, NIL)
    }

  /**
   * [godot.Shortcut] associated to the button.
   */
  public open var shortcut: Shortcut?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_SHORTCUT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shortcut?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_SHORTCUT, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * The [godot.ButtonGroup] associated with the button. Not to be confused with node groups.
   */
  public open var buttonGroup: ButtonGroup?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_BUTTON_GROUP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ButtonGroup?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_BUTTON_GROUP, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * The [godot.Node] which must be a parent of the focused GUI [godot.Control] for the shortcut to be activated. If `null`, the shortcut can be activated when any control is focused (a global shortcut). This allows shortcuts to be accepted only when the user has a certain area of the GUI focused.
   */
  public open var shortcutContext: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_SHORTCUT_CONTEXT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_SHORTCUT_CONTEXT,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BASEBUTTON)
  }

  /**
   * Called when the button is pressed. If you need to know the button's pressed state (and [toggleMode] is active), use [_toggled] instead.
   */
  public open fun _pressed(): Unit {
  }

  /**
   * Called when the button is toggled (only if [toggleMode] is active).
   */
  public open fun _toggled(buttonPressed: Boolean): Unit {
  }

  /**
   * Changes the [buttonPressed] state of the button, without emitting [toggled]. Use when you just want to change the state of the button without sending the pressed event (e.g. when initializing scene). Only works if [toggleMode] is `true`.
   *
   * **Note:** This method doesn't unpress other buttons in [buttonGroup].
   */
  public open fun setPressedNoSignal(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_SET_PRESSED_NO_SIGNAL,
        NIL)
  }

  /**
   * Returns `true` if the mouse has entered the button and has not left it yet.
   */
  public open fun isHovered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_IS_HOVERED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the visual state used to draw the button. This is useful mainly when implementing your own draw code by either overriding _draw() or connecting to "draw" signal. The visual state of the button is defined by the [enum DrawMode] enum.
   */
  public open fun getDrawMode(): BaseButton.DrawMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_DRAW_MODE, LONG)
    return BaseButton.DrawMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class ActionMode(
    id: Long
  ) {
    /**
     * Require just a press to consider the button clicked.
     */
    ACTION_MODE_BUTTON_PRESS(0),
    /**
     * Require a press and a subsequent release before considering the button clicked.
     */
    ACTION_MODE_BUTTON_RELEASE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DrawMode(
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
    DRAW_HOVER_PRESSED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
