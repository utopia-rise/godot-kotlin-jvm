// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
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
   * Emitted when the color is changed.
   */
  public val colorChanged: Signal1<Color> by signal("color")

  /**
   * Emitted when a preset is added.
   */
  public val presetAdded: Signal1<Color> by signal("color")

  /**
   * Emitted when a preset is removed.
   */
  public val presetRemoved: Signal1<Color> by signal("color")

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
   * The currently selected color mode. See [enum ColorModeType].
   */
  public var colorMode: ColorPicker.ColorModeType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_COLOR_MODE, LONG)
      return ColorPicker.ColorModeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_COLOR_MODE, NIL)
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
  public var pickerShape: ColorPicker.PickerShapeType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PICKER_SHAPE,
          LONG)
      return ColorPicker.PickerShapeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PICKER_SHAPE, NIL)
    }

  /**
   * If `true`, it's possible to add presets under Swatches. If `false`, the button to add presets is disabled.
   */
  public var canAddSwatches: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_SWATCHES_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_CAN_ADD_SWATCHES,
          NIL)
    }

  /**
   * If `true`, the color sampler and color preview are visible.
   */
  public var samplerVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_SAMPLER_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_SAMPLER_VISIBLE,
          NIL)
    }

  /**
   * If `true`, the color mode buttons are visible.
   */
  public var colorModesVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_MODES_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_MODES_VISIBLE,
          NIL)
    }

  /**
   * If `true`, the color sliders are visible.
   */
  public var slidersVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_SLIDERS_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_SLIDERS_VISIBLE,
          NIL)
    }

  /**
   * If `true`, the hex color code input field is visible.
   */
  public var hexVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_HEX_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_HEX_VISIBLE, NIL)
    }

  /**
   * If `true`, the Swatches and Recent Colors presets are visible.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLORPICKER, scriptIndex)
    return true
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

  /**
   * Adds the given color to a list of color recent presets so that it can be picked later. Recent presets are the colors that were picked recently, a new preset is automatically created and added to recent presets when you pick a new color.
   *
   * **Note:** The recent presets list is only for *this* color picker.
   */
  public fun addRecentPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ADD_RECENT_PRESET, NIL)
  }

  /**
   * Removes the given color from the list of color recent presets of this color picker.
   */
  public fun eraseRecentPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ERASE_RECENT_PRESET,
        NIL)
  }

  /**
   * Returns the list of colors in the recent presets of the color picker.
   */
  public fun getRecentPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_RECENT_PRESETS,
        PACKED_COLOR_ARRAY)
    return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
  }

  public enum class ColorModeType(
    id: Long
  ) {
    /**
     * Allows editing the color with Red/Green/Blue sliders.
     */
    MODE_RGB(0),
    /**
     * Allows editing the color with Hue/Saturation/Value sliders.
     */
    MODE_HSV(1),
    /**
     * Allows the color R, G, B component values to go beyond 1.0, which can be used for certain special operations that require it (like tinting without darkening or rendering sprites in HDR).
     */
    MODE_RAW(2),
    /**
     * Allows editing the color with Hue/Saturation/Lightness sliders.
     *
     * OKHSL is a new color space similar to HSL but that better match perception by leveraging the Oklab color space which is designed to be simple to use, while doing a good job at predicting perceived lightness, chroma and hue.
     *
     * [godot.Okhsv and Okhsl color spaces](https://bottosson.github.io/posts/colorpicker/)
     */
    MODE_OKHSL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
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
    /**
     * HSL OK Color Model circle color space.
     */
    SHAPE_OKHSL_CIRCLE(3),
    /**
     * The color space shape and the shape select button are hidden. Can't be selected from the shapes popup.
     */
    SHAPE_NONE(4),
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
