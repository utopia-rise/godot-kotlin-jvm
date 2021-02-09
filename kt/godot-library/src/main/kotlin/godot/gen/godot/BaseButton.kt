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

@GodotBaseType
open class BaseButton : Control() {
  val buttonDown: Signal0 by signal()

  val buttonUp: Signal0 by signal()

  val signalPressed: Signal0 by signal()

  val toggled: Signal1<Boolean> by signal("button_pressed")

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

  open fun _pressed() {
  }

  open fun _toggled(buttonPressed: Boolean) {
  }

  override fun _unhandledInput(event: InputEvent) {
  }

  open fun getDrawMode(): BaseButton.DrawMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_GET_DRAW_MODE, LONG)
    return BaseButton.DrawMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun isHovered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEBUTTON_IS_HOVERED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class ActionMode(
    id: Long
  ) {
    ACTION_MODE_BUTTON_PRESS(0),

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
    DRAW_NORMAL(0),

    DRAW_PRESSED(1),

    DRAW_HOVER(2),

    DRAW_DISABLED(3),

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
    final const val ACTION_MODE_BUTTON_PRESS: Long = 0

    final const val ACTION_MODE_BUTTON_RELEASE: Long = 1

    final const val DRAW_DISABLED: Long = 3

    final const val DRAW_HOVER: Long = 2

    final const val DRAW_HOVER_PRESSED: Long = 4

    final const val DRAW_NORMAL: Long = 0

    final const val DRAW_PRESSED: Long = 1
  }
}
