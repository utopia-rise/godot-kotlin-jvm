// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.MethodStringName0
import godot.core.MethodStringName1
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
import kotlin.jvm.JvmStatic

/**
 * Encapsulates a [ColorPicker], making it accessible by pressing a button. Pressing the button will
 * toggle the [ColorPicker]'s visibility.
 *
 * See also [BaseButton] which contains common properties and methods associated with this node.
 *
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(162, scriptIndex)
  }

  /**
   * This is a helper function for [color] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = colorpickerbutton.color
   * //Your changes
   * colorpickerbutton.color = myCoreType
   * ``````
   *
   * The currently selected color.
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply {
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
   *
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
   *
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

  public companion object {
    @JvmStatic
    public val setPickColorName: MethodStringName1<ColorPickerButton, Unit, Color> =
        MethodStringName1<ColorPickerButton, Unit, Color>("set_pick_color")

    @JvmStatic
    public val getPickColorName: MethodStringName0<ColorPickerButton, Color> =
        MethodStringName0<ColorPickerButton, Color>("get_pick_color")

    @JvmStatic
    public val getPickerName: MethodStringName0<ColorPickerButton, ColorPicker?> =
        MethodStringName0<ColorPickerButton, ColorPicker?>("get_picker")

    @JvmStatic
    public val getPopupName: MethodStringName0<ColorPickerButton, PopupPanel?> =
        MethodStringName0<ColorPickerButton, PopupPanel?>("get_popup")

    @JvmStatic
    public val setEditAlphaName: MethodStringName1<ColorPickerButton, Unit, Boolean> =
        MethodStringName1<ColorPickerButton, Unit, Boolean>("set_edit_alpha")

    @JvmStatic
    public val isEditingAlphaName: MethodStringName0<ColorPickerButton, Boolean> =
        MethodStringName0<ColorPickerButton, Boolean>("is_editing_alpha")
  }

  public object MethodBindings {
    internal val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_pick_color", 2920490490)

    internal val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_pick_color", 3444240500)

    internal val getPickerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_picker", 331835996)

    internal val getPopupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "get_popup", 1322440207)

    internal val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "set_edit_alpha", 2586408642)

    internal val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPickerButton", "is_editing_alpha", 36873697)
  }
}
