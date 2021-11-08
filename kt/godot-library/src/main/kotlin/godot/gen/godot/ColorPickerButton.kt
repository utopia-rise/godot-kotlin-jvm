// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
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
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/517](https://godotengine.org/asset-library/asset/517)
 *
 * Encapsulates a [godot.ColorPicker] making it accessible by pressing a button. Pressing the button will toggle the [godot.ColorPicker] visibility.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 *
 * **Note:** By default, the button may not be wide enough for the color preview swatch to be visible. Make sure to set [godot.Control.rectMinSize] to a big enough value to give the button enough space.
 */
@GodotBaseType
public open class ColorPickerButton : Button() {
  /**
   * Emitted when the color changes.
   */
  public val colorChanged: Signal1<Color> by signal("color")

  /**
   * Emitted when the [godot.ColorPicker] is created (the button is pressed for the first time).
   */
  public val pickerCreated: Signal0 by signal()

  /**
   * Emitted when the [godot.ColorPicker] is closed.
   */
  public val popupClosed: Signal0 by signal()

  /**
   * The currently selected color.
   */
  public open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_SET_COLOR, NIL)
    }

  /**
   * If `true`, the alpha channel in the displayed [godot.ColorPicker] will be visible.
   */
  public open var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_EDIT_ALPHA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_SET_EDIT_ALPHA,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLORPICKERBUTTON)
  }

  @CoreTypeHelper
  public open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  public open fun _aboutToShow(): Unit {
  }

  public open fun _colorChanged(arg0: Color): Unit {
  }

  public open fun _modalClosed(): Unit {
  }

  /**
   * Returns the [godot.ColorPicker] that this node toggles.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getPicker(): ColorPicker? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_PICKER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ColorPicker?
  }

  /**
   * Returns the control's [godot.PopupPanel] which allows you to connect to popup signals. This allows you to handle events when the ColorPicker is shown or hidden.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getPopup(): PopupPanel? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKERBUTTON_GET_POPUP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupPanel?
  }
}
