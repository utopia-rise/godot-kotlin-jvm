// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Color picker control.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/146](https://godotengine.org/asset-library/asset/146)
 *
 * Displays a color picker widget. Useful for selecting a color from an RGB/RGBA colorspace.
 *
 * **Note:** This control is the color picker widget itself. You can use a [godot.ColorPickerButton] instead if you need a button that brings up a [godot.ColorPicker] in a pop-up.
 */
@GodotBaseType
public open class ColorPicker : BoxContainer() {
  /**
   * Emitted when a preset is removed.
   */
  public val presetRemoved: Signal1<Color> by signal("color")

  /**
   * Emitted when a preset is added.
   */
  public val presetAdded: Signal1<Color> by signal("color")

  /**
   * Emitted when the color is changed.
   */
  public val colorChanged: Signal1<Color> by signal("color")

  /**
   * The currently selected color.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PICK_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PICK_COLOR, NIL)
    }

  /**
   * If `true`, shows an alpha channel slider (opacity).
   */
  public var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_EDITING_ALPHA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_EDIT_ALPHA, NIL)
    }

  /**
   * If `true`, allows editing the color with Hue/Saturation/Value sliders.
   *
   * **Note:** Cannot be enabled if raw mode is on.
   */
  public var hsvMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_HSV_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_HSV_MODE, NIL)
    }

  /**
   * If `true`, allows the color R, G, B component values to go beyond 1.0, which can be used for certain special operations that require it (like tinting without darkening or rendering sprites in HDR).
   *
   * **Note:** Cannot be enabled if HSV mode is on.
   */
  public var rawMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_RAW_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_RAW_MODE, NIL)
    }

  /**
   * If `true`, the color will apply only after the user releases the mouse button, otherwise it will apply immediately even in mouse motion event (which can cause performance issues).
   */
  public var deferredMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_DEFERRED_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_DEFERRED_MODE,
          NIL)
    }

  /**
   * The shape of the color space view. See [enum PickerShapeType].
   */
  public var pickerShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PICKER_SHAPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PICKER_SHAPE, NIL)
    }

  /**
   * If `true`, the "add preset" button is enabled.
   */
  public var presetsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_PRESETS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_ENABLED,
          NIL)
    }

  /**
   * If `true`, saved color presets are visible.
   */
  public var presetsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_PRESETS_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_VISIBLE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLORPICKER)
  }

  /**
   * Adds the given color to a list of color presets. The presets are displayed in the color picker and the user will be able to select them.
   *
   * **Note:** The presets list is only for *this* color picker.
   */
  public fun addPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ADD_PRESET, NIL)
  }

  /**
   * Removes the given color from the list of color presets of this color picker.
   */
  public fun erasePreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ERASE_PRESET, NIL)
  }

  /**
   * Returns the list of colors in the presets of the color picker.
   */
  public fun getPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS,
        PACKED_COLOR_ARRAY)
    return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
  }

  public enum class PickerShapeType(
    id: Long
  ) {
    /**
     * HSV Color Model rectangle color space.
     */
    SHAPE_HSV_RECTANGLE(0),
    /**
     * HSV Color Model rectangle color space with a wheel.
     */
    SHAPE_HSV_WHEEL(1),
    /**
     * HSV Color Model circle color space. Use Saturation as a radius.
     */
    SHAPE_VHS_CIRCLE(2),
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
