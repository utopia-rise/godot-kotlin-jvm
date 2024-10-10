// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.KeyModifierMaskValue
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var commandOrControlAutoremap: Boolean
    @JvmName("commandOrControlAutoremapProperty")
    get() = isCommandOrControlAutoremap()
    @JvmName("commandOrControlAutoremapProperty")
    set(`value`) {
      setCommandOrControlAutoremap(value)
    }

  /**
   * State of the [kbd]Alt[/kbd] modifier.
   */
  public final inline var altPressed: Boolean
    @JvmName("altPressedProperty")
    get() = isAltPressed()
    @JvmName("altPressedProperty")
    set(`value`) {
      setAltPressed(value)
    }

  /**
   * State of the [kbd]Shift[/kbd] modifier.
   */
  public final inline var shiftPressed: Boolean
    @JvmName("shiftPressedProperty")
    get() = isShiftPressed()
    @JvmName("shiftPressedProperty")
    set(`value`) {
      setShiftPressed(value)
    }

  /**
   * State of the [kbd]Ctrl[/kbd] modifier.
   */
  public final inline var ctrlPressed: Boolean
    @JvmName("ctrlPressedProperty")
    get() = isCtrlPressed()
    @JvmName("ctrlPressedProperty")
    set(`value`) {
      setCtrlPressed(value)
    }

  /**
   * State of the [kbd]Meta[/kbd] modifier. On Windows and Linux, this represents the Windows key
   * (sometimes called "meta" or "super" on Linux). On macOS, this represents the Command key.
   */
  public final inline var metaPressed: Boolean
    @JvmName("metaPressedProperty")
    get() = isMetaPressed()
    @JvmName("metaPressedProperty")
    set(`value`) {
      setMetaPressed(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTWITHMODIFIERS, scriptIndex)
  }

  public final fun setCommandOrControlAutoremap(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setCommandOrControlAutoremapPtr, NIL)
  }

  public final fun isCommandOrControlAutoremap(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommandOrControlAutoremapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * On macOS, returns `true` if [kbd]Meta[/kbd] ([kbd]Cmd[/kbd]) is pressed.
   * On other platforms, returns `true` if [kbd]Ctrl[/kbd] is pressed.
   */
  public final fun isCommandOrControlPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommandOrControlPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAltPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setAltPressedPtr, NIL)
  }

  public final fun isAltPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isAltPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShiftPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setShiftPressedPtr, NIL)
  }

  public final fun isShiftPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isShiftPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCtrlPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setCtrlPressedPtr, NIL)
  }

  public final fun isCtrlPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCtrlPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMetaPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setMetaPressedPtr, NIL)
  }

  public final fun isMetaPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMetaPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the keycode combination of modifier keys.
   */
  public final fun getModifiersMask(): KeyModifierMask {
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
