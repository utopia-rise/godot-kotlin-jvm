// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MouseButtonMask
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [BaseButton] is an abstract base class for GUI buttons. It doesn't display anything by itself.
 */
@GodotBaseType
public open class BaseButton : Control() {
  /**
   * Emitted when the button is toggled or pressed. This is on [signal button_down] if [actionMode]
   * is [ACTION_MODE_BUTTON_PRESS] and on [signal button_up] otherwise.
   *
   * If you need to know the button's pressed state (and [toggleMode] is active), use [signal
   * toggled] instead.
   */
  public val pressed: Signal0 by Signal0

  /**
   * Emitted when the button stops being held down.
   */
  public val buttonUp: Signal0 by Signal0

  /**
   * Emitted when the button starts being held down.
   */
  public val buttonDown: Signal0 by Signal0

  /**
   * Emitted when the button was just toggled between pressed and normal states (only if
   * [toggleMode] is active). The new state is contained in the [toggledOn] argument.
   */
  public val toggled: Signal1<Boolean> by Signal1

  /**
   * If `true`, the button is in disabled state and can't be clicked or toggled.
   */
  public final inline var disabled: Boolean
    @JvmName("disabledProperty")
    get() = isDisabled()
    @JvmName("disabledProperty")
    set(`value`) {
      setDisabled(value)
    }

  /**
   * If `true`, the button is in toggle mode. Makes the button flip state between pressed and
   * unpressed each time its area is clicked.
   */
  public final inline var toggleMode: Boolean
    @JvmName("toggleModeProperty")
    get() = isToggleMode()
    @JvmName("toggleModeProperty")
    set(`value`) {
      setToggleMode(value)
    }

  /**
   * If `true`, the button's state is pressed. Means the button is pressed down or toggled (if
   * [toggleMode] is active). Only works if [toggleMode] is `true`.
   *
   * **Note:** Changing the value of [buttonPressed] will result in [signal toggled] to be emitted.
   * If you want to change the pressed state without emitting that signal, use [setPressedNoSignal].
   */
  public final inline var buttonPressed: Boolean
    @JvmName("buttonPressedProperty")
    get() = isPressed()
    @JvmName("buttonPressedProperty")
    set(`value`) {
      setPressed(value)
    }

  /**
   * Determines when the button is considered clicked, one of the [ActionMode] constants.
   */
  public final inline var actionMode: ActionMode
    @JvmName("actionModeProperty")
    get() = getActionMode()
    @JvmName("actionModeProperty")
    set(`value`) {
      setActionMode(value)
    }

  /**
   * Binary mask to choose which mouse buttons this button will respond to.
   *
   * To allow both left-click and right-click, use `MOUSE_BUTTON_MASK_LEFT |
   * MOUSE_BUTTON_MASK_RIGHT`.
   */
  public final inline var buttonMask: MouseButtonMask
    @JvmName("buttonMaskProperty")
    get() = getButtonMask()
    @JvmName("buttonMaskProperty")
    set(`value`) {
      setButtonMask(value)
    }

  /**
   * If `true`, the button stays pressed when moving the cursor outside the button while pressing
   * it.
   *
   * **Note:** This property only affects the button's visual appearance. Signals will be emitted at
   * the same moment regardless of this property's value.
   */
  public final inline var keepPressedOutside: Boolean
    @JvmName("keepPressedOutsideProperty")
    get() = isKeepPressedOutside()
    @JvmName("keepPressedOutsideProperty")
    set(`value`) {
      setKeepPressedOutside(value)
    }

  /**
   * The [ButtonGroup] associated with the button. Not to be confused with node groups.
   *
   * **Note:** The button will be configured as a radio button if a [ButtonGroup] is assigned to it.
   */
  public final inline var buttonGroup: ButtonGroup?
    @JvmName("buttonGroupProperty")
    get() = getButtonGroup()
    @JvmName("buttonGroupProperty")
    set(`value`) {
      setButtonGroup(value)
    }

  /**
   * [Shortcut] associated to the button.
   */
  public final inline var shortcut: Shortcut?
    @JvmName("shortcutProperty")
    get() = getShortcut()
    @JvmName("shortcutProperty")
    set(`value`) {
      setShortcut(value)
    }

  /**
   * If `true`, the button will highlight for a short amount of time when its shortcut is activated.
   * If `false` and [toggleMode] is `false`, the shortcut will activate without any visual feedback.
   */
  public final inline var shortcutFeedback: Boolean
    @JvmName("shortcutFeedbackProperty")
    get() = isShortcutFeedback()
    @JvmName("shortcutFeedbackProperty")
    set(`value`) {
      setShortcutFeedback(value)
    }

  /**
   * If `true`, the button will add information about its shortcut in the tooltip.
   *
   * **Note:** This property does nothing when the tooltip control is customized using
   * [Control.MakeCustomTooltip].
   */
  public final inline var shortcutInTooltip: Boolean
    @JvmName("shortcutInTooltipProperty")
    get() = isShortcutInTooltipEnabled()
    @JvmName("shortcutInTooltipProperty")
    set(`value`) {
      setShortcutInTooltip(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(103, scriptIndex)
  }

  /**
   * Called when the button is pressed. If you need to know the button's pressed state (and
   * [toggleMode] is active), use [_toggled] instead.
   */
  public open fun _pressed(): Unit {
    throw NotImplementedError("BaseButton::_pressed is not implemented.")
  }

  /**
   * Called when the button is toggled (only if [toggleMode] is active).
   */
  public open fun _toggled(toggledOn: Boolean): Unit {
    throw NotImplementedError("BaseButton::_toggled is not implemented.")
  }

  public final fun setPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(ptr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Changes the [buttonPressed] state of the button, without emitting [signal toggled]. Use when
   * you just want to change the state of the button without sending the pressed event (e.g. when
   * initializing scene). Only works if [toggleMode] is `true`.
   *
   * **Note:** This method doesn't unpress other buttons in [buttonGroup].
   */
  public final fun setPressedNoSignal(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(ptr, MethodBindings.setPressedNoSignalPtr, NIL)
  }

  /**
   * Returns `true` if the mouse has entered the button and has not left it yet.
   */
  public final fun isHovered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHoveredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setToggleMode(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setToggleModePtr, NIL)
  }

  public final fun isToggleMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isToggleModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcutInTooltip(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setShortcutInTooltipPtr, NIL)
  }

  public final fun isShortcutInTooltipEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShortcutInTooltipEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDisabled(disabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.setDisabledPtr, NIL)
  }

  public final fun isDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setActionMode(mode: ActionMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setActionModePtr, NIL)
  }

  public final fun getActionMode(): ActionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionModePtr, LONG)
    return ActionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setButtonMask(mask: MouseButtonMask): Unit {
    TransferContext.writeArguments(LONG to mask.flag)
    TransferContext.callMethod(ptr, MethodBindings.setButtonMaskPtr, NIL)
  }

  public final fun getButtonMask(): MouseButtonMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getButtonMaskPtr, LONG)
    return MouseButtonMask(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the visual state used to draw the button. This is useful mainly when implementing your
   * own draw code by either overriding _draw() or connecting to "draw" signal. The visual state of the
   * button is defined by the [DrawMode] enum.
   */
  public final fun getDrawMode(): DrawMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDrawModePtr, LONG)
    return DrawMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setKeepPressedOutside(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setKeepPressedOutsidePtr, NIL)
  }

  public final fun isKeepPressedOutside(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isKeepPressedOutsidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcutFeedback(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setShortcutFeedbackPtr, NIL)
  }

  public final fun isShortcutFeedback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShortcutFeedbackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcut(shortcut: Shortcut?): Unit {
    TransferContext.writeArguments(OBJECT to shortcut)
    TransferContext.callMethod(ptr, MethodBindings.setShortcutPtr, NIL)
  }

  public final fun getShortcut(): Shortcut? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShortcutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shortcut?)
  }

  public final fun setButtonGroup(buttonGroup: ButtonGroup?): Unit {
    TransferContext.writeArguments(OBJECT to buttonGroup)
    TransferContext.callMethod(ptr, MethodBindings.setButtonGroupPtr, NIL)
  }

  public final fun getButtonGroup(): ButtonGroup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getButtonGroupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ButtonGroup?)
  }

  public enum class DrawMode(
    id: Long,
  ) {
    /**
     * The normal state (i.e. not pressed, not hovered, not toggled and enabled) of buttons.
     */
    NORMAL(0),
    /**
     * The state of buttons are pressed.
     */
    PRESSED(1),
    /**
     * The state of buttons are hovered.
     */
    HOVER(2),
    /**
     * The state of buttons are disabled.
     */
    DISABLED(3),
    /**
     * The state of buttons are both hovered and pressed.
     */
    HOVER_PRESSED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawMode = entries.single { it.id == `value` }
    }
  }

  public enum class ActionMode(
    id: Long,
  ) {
    /**
     * Require just a press to consider the button clicked.
     */
    BUTTON_PRESS(0),
    /**
     * Require a press and a subsequent release before considering the button clicked.
     */
    BUTTON_RELEASE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ActionMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_pressed", 2586408642)

    internal val isPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_pressed", 36873697)

    internal val setPressedNoSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_pressed_no_signal", 2586408642)

    internal val isHoveredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_hovered", 36873697)

    internal val setToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_toggle_mode", 2586408642)

    internal val isToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_toggle_mode", 36873697)

    internal val setShortcutInTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_shortcut_in_tooltip", 2586408642)

    internal val isShortcutInTooltipEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_shortcut_in_tooltip_enabled", 36873697)

    internal val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_disabled", 2586408642)

    internal val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_disabled", 36873697)

    internal val setActionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_action_mode", 1985162088)

    internal val getActionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_action_mode", 2589712189)

    internal val setButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_button_mask", 3950145251)

    internal val getButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_button_mask", 2512161324)

    internal val getDrawModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_draw_mode", 2492721305)

    internal val setKeepPressedOutsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_keep_pressed_outside", 2586408642)

    internal val isKeepPressedOutsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_keep_pressed_outside", 36873697)

    internal val setShortcutFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_shortcut_feedback", 2586408642)

    internal val isShortcutFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "is_shortcut_feedback", 36873697)

    internal val setShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_shortcut", 857163497)

    internal val getShortcutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_shortcut", 3415666916)

    internal val setButtonGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "set_button_group", 1794463739)

    internal val getButtonGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseButton", "get_button_group", 281644053)
  }
}
