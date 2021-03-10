// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Button that pops out a [godot.ColorPicker].
 *
 * Encapsulates a [godot.ColorPicker] making it accessible by pressing a button. Pressing the button will toggle the [godot.ColorPicker] visibility.
 */
@GodotBaseType
open class ColorPickerButton : Button() {
  /**
   * Emitted when the color changes.
   */
  val colorChanged: Signal1<Color> by signal("color")

  /**
   * Emitted when the [godot.ColorPicker] is created (the button is pressed for the first time).
   */
  val pickerCreated: Signal0 by signal()

  /**
   * Emitted when the [godot.ColorPicker] is closed.
   */
  val popupClosed: Signal0 by signal()

  /**
   * The currently selected color.
   */
  open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_SET_COLOR, NIL)
    }

  /**
   * If `true`, the alpha channel in the displayed [godot.ColorPicker] will be visible.
   */
  open var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_EDIT_ALPHA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_SET_EDIT_ALPHA,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_COLORPICKERBUTTON)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun _colorChanged(arg0: Color) {
  }

  open fun _modalClosed() {
  }

  /**
   * Returns the [godot.ColorPicker] that this node toggles.
   */
  open fun getPicker(): ColorPicker? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_PICKER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ColorPicker?
  }

  /**
   * Returns the control's [godot.PopupPanel] which allows you to connect to popup signals. This allows you to handle events when the ColorPicker is shown or hidden.
   */
  open fun getPopup(): PopupPanel? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupPanel?
  }
}
