// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Encapsulates a [ColorPicker], making it accessible by pressing a button. Pressing the button will
 * toggle the [ColorPicker]'s visibility.
 * See also [BaseButton] which contains common properties and methods associated with this node.
 * **Note:** By default, the button may not be wide enough for the color preview swatch to be
 * visible. Make sure to set [Control.customMinimumSize] to a big enough value to give the button
 * enough space.
 */
@GodotBaseType
public open class ColorPickerButton : Button() {
  /**
   * Emitted when the color changes.
   */
  public val colorChanged: Signal1<Color> by Signal1

  /**
   * Emitted when the [ColorPicker] is closed.
   */
  public val popupClosed: Signal0 by Signal0

  /**
   * Emitted when the [ColorPicker] is created (the button is pressed for the first time).
   */
  public val pickerCreated: Signal0 by Signal0

  /**
   * The currently selected color.
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getPickColor()
    @JvmName("colorProperty")
    set(`value`) {
      setPickColor(value)
    }

  /**
   * If `true`, the alpha channel in the displayed [ColorPicker] will be visible.
   */
  public final inline var editAlpha: Boolean
    @JvmName("editAlphaProperty")
    get() = isEditingAlpha()
    @JvmName("editAlphaProperty")
    set(`value`) {
      setEditAlpha(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_COLORPICKERBUTTON, scriptIndex)
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
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun setPickColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setPickColorPtr, NIL)
  }

  public final fun getPickColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPickColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the [ColorPicker] that this node toggles.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getPicker(): ColorPicker? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPickerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ColorPicker?)
  }

  /**
   * Returns the control's [PopupPanel] which allows you to connect to popup signals. This allows
   * you to handle events when the ColorPicker is shown or hidden.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [Window.visible] property.
   */
  public final fun getPopup(): PopupPanel? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPopupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PopupPanel?)
  }

  public final fun setEditAlpha(show: Boolean): Unit {
    TransferContext.writeArguments(BOOL to show)
    TransferContext.callMethod(ptr, MethodBindings.setEditAlphaPtr, NIL)
  }

  public final fun isEditingAlpha(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditingAlphaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_pick_color", 2920490490)

    public val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_pick_color", 3444240500)

    public val getPickerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_picker", 331835996)

    public val getPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_popup", 1322440207)

    public val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_edit_alpha", 2586408642)

    public val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "is_editing_alpha", 36873697)
  }
}
