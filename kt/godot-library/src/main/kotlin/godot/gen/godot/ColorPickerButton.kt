// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A button that brings up a [godot.ColorPicker] when pressed.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/517](https://godotengine.org/asset-library/asset/517)
 *
 * Encapsulates a [godot.ColorPicker], making it accessible by pressing a button. Pressing the button will toggle the [godot.ColorPicker]'s visibility.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 *
 * **Note:** By default, the button may not be wide enough for the color preview swatch to be visible. Make sure to set [godot.Control.customMinimumSize] to a big enough value to give the button enough space.
 */
@GodotBaseType
public open class ColorPickerButton : Button() {
  /**
   * Emitted when the color changes.
   */
  public val colorChanged: Signal1<Color> by signal("color")

  /**
   * Emitted when the [godot.ColorPicker] is closed.
   */
  public val popupClosed: Signal0 by signal()

  /**
   * Emitted when the [godot.ColorPicker] is created (the button is pressed for the first time).
   */
  public val pickerCreated: Signal0 by signal()

  /**
   * The currently selected color.
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPickColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPickColorPtr, NIL)
    }

  /**
   * If `true`, the alpha channel in the displayed [godot.ColorPicker] will be visible.
   */
  public var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditingAlphaPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditAlphaPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLORPICKERBUTTON, scriptIndex)
    return true
  }

  /**
   * The currently selected color.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = colorpickerbutton.color
   * //Your changes
   * colorpickerbutton.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * Returns the [godot.ColorPicker] that this node toggles.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getPicker(): ColorPicker? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPickerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ColorPicker?)
  }

  /**
   * Returns the control's [godot.PopupPanel] which allows you to connect to popup signals. This allows you to handle events when the ColorPicker is shown or hidden.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getPopup(): PopupPanel? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupPanel?)
  }

  public companion object

  internal object MethodBindings {
    public val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_pick_color")

    public val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_pick_color")

    public val getPickerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_picker")

    public val getPopupPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPickerButton", "get_popup")

    public val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_edit_alpha")

    public val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "is_editing_alpha")
  }
}
