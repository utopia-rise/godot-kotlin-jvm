// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.KeyModifierMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Stores information about mouse, keyboard, and touch gesture input events. This includes
 * information about which modifier keys are pressed, such as [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See
 * [Node.Input].
 */
@GodotBaseType
public open class InputEventWithModifiers internal constructor() : InputEventFromWindow() {
  /**
   * Automatically use [kbd]Meta[/kbd] ([kbd]Cmd[/kbd]) on macOS and [kbd]Ctrl[/kbd] on other
   * platforms. If `true`, [ctrlPressed] and [metaPressed] cannot be set.
   */
  public var commandOrControlAutoremap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCommandOrControlAutoremapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCommandOrControlAutoremapPtr, NIL)
    }

  /**
   * State of the [kbd]Alt[/kbd] modifier.
   */
  public var altPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAltPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAltPressedPtr, NIL)
    }

  /**
   * State of the [kbd]Shift[/kbd] modifier.
   */
  public var shiftPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShiftPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShiftPressedPtr, NIL)
    }

  /**
   * State of the [kbd]Ctrl[/kbd] modifier.
   */
  public var ctrlPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCtrlPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCtrlPressedPtr, NIL)
    }

  /**
   * State of the [kbd]Meta[/kbd] modifier. On Windows and Linux, this represents the Windows key
   * (sometimes called "meta" or "super" on Linux). On macOS, this represents the Command key.
   */
  public var metaPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMetaPressedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetaPressedPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTWITHMODIFIERS, scriptIndex)
  }

  /**
   * On macOS, returns `true` if [kbd]Meta[/kbd] ([kbd]Cmd[/kbd]) is pressed.
   * On other platforms, returns `true` if [kbd]Ctrl[/kbd] is pressed.
   */
  public fun isCommandOrControlPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommandOrControlPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the keycode combination of modifier keys.
   */
  public fun getModifiersMask(): KeyModifierMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModifiersMaskPtr, LONG)
    return KeyModifierMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setCommandOrControlAutoremapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_command_or_control_autoremap", 2586408642)

    public val isCommandOrControlAutoremapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_command_or_control_autoremap", 36873697)

    public val isCommandOrControlPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_command_or_control_pressed", 36873697)

    public val setAltPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_alt_pressed", 2586408642)

    public val isAltPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_alt_pressed", 36873697)

    public val setShiftPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_shift_pressed", 2586408642)

    public val isShiftPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_shift_pressed", 36873697)

    public val setCtrlPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_ctrl_pressed", 2586408642)

    public val isCtrlPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_ctrl_pressed", 36873697)

    public val setMetaPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "set_meta_pressed", 2586408642)

    public val isMetaPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "is_meta_pressed", 36873697)

    public val getModifiersMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventWithModifiers", "get_modifiers_mask", 1258259499)
  }
}
