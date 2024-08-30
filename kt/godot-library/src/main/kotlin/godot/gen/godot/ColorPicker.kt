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
import godot.core.PackedColorArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A widget that provides an interface for selecting or modifying a color. It can optionally provide
 * functionalities like a color sampler (eyedropper), color modes, and presets.
 * **Note:** This control is the color picker widget itself. You can use a [ColorPickerButton]
 * instead if you need a button that brings up a [ColorPicker] in a popup.
 */
@GodotBaseType
public open class ColorPicker : VBoxContainer() {
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
   * If `true`, shows an alpha channel slider (opacity).
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

  /**
   * The currently selected color mode. See [ColorModeType].
   */
  public var colorMode: ColorModeType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorModePtr, LONG)
      return ColorPicker.ColorModeType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorModePtr, NIL)
    }

  /**
   * If `true`, the color will apply only after the user releases the mouse button, otherwise it
   * will apply immediately even in mouse motion event (which can cause performance issues).
   */
  public var deferredMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeferredModePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeferredModePtr, NIL)
    }

  /**
   * The shape of the color space view. See [PickerShapeType].
   */
  public var pickerShape: PickerShapeType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPickerShapePtr, LONG)
      return ColorPicker.PickerShapeType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPickerShapePtr, NIL)
    }

  /**
   * If `true`, it's possible to add presets under Swatches. If `false`, the button to add presets
   * is disabled.
   */
  public var canAddSwatches: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areSwatchesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCanAddSwatchesPtr, NIL)
    }

  /**
   * If `true`, the color sampler and color preview are visible.
   */
  public var samplerVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSamplerVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSamplerVisiblePtr, NIL)
    }

  /**
   * If `true`, the color mode buttons are visible.
   */
  public var colorModesVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areModesVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModesVisiblePtr, NIL)
    }

  /**
   * If `true`, the color sliders are visible.
   */
  public var slidersVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areSlidersVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSlidersVisiblePtr, NIL)
    }

  /**
   * If `true`, the hex color code input field is visible.
   */
  public var hexVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHexVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHexVisiblePtr, NIL)
    }

  /**
   * If `true`, the Swatches and Recent Colors presets are visible.
   */
  public var presetsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.arePresetsVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPresetsVisiblePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLORPICKER, scriptIndex)
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
   * val myCoreType = colorpicker.color
   * //Your changes
   * colorpicker.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * Adds the given color to a list of color presets. The presets are displayed in the color picker
   * and the user will be able to select them.
   * **Note:** The presets list is only for *this* color picker.
   */
  public fun addPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addPresetPtr, NIL)
  }

  /**
   * Removes the given color from the list of color presets of this color picker.
   */
  public fun erasePreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.erasePresetPtr, NIL)
  }

  /**
   * Returns the list of colors in the presets of the color picker.
   */
  public fun getPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPresetsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  /**
   * Adds the given color to a list of color recent presets so that it can be picked later. Recent
   * presets are the colors that were picked recently, a new preset is automatically created and added
   * to recent presets when you pick a new color.
   * **Note:** The recent presets list is only for *this* color picker.
   */
  public fun addRecentPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addRecentPresetPtr, NIL)
  }

  /**
   * Removes the given color from the list of color recent presets of this color picker.
   */
  public fun eraseRecentPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseRecentPresetPtr, NIL)
  }

  /**
   * Returns the list of colors in the recent presets of the color picker.
   */
  public fun getRecentPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRecentPresetsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
  }

  public enum class ColorModeType(
    id: Long,
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
     * Allows the color R, G, B component values to go beyond 1.0, which can be used for certain
     * special operations that require it (like tinting without darkening or rendering sprites in HDR).
     */
    MODE_RAW(2),
    /**
     * Allows editing the color with Hue/Saturation/Lightness sliders.
     * OKHSL is a new color space similar to HSL but that better match perception by leveraging the
     * Oklab color space which is designed to be simple to use, while doing a good job at predicting
     * perceived lightness, chroma and hue.
     * [url=https://bottosson.github.io/posts/colorpicker/]Okhsv and Okhsl color spaces[/url]
     */
    MODE_OKHSL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ColorModeType = entries.single { it.id == `value` }
    }
  }

  public enum class PickerShapeType(
    id: Long,
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
     * The color space shape and the shape select button are hidden. Can't be selected from the
     * shapes popup.
     */
    SHAPE_NONE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PickerShapeType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_pick_color")

    public val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_pick_color")

    public val setDeferredModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_deferred_mode")

    public val isDeferredModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_deferred_mode")

    public val setColorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_color_mode")

    public val getColorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_color_mode")

    public val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_edit_alpha")

    public val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_editing_alpha")

    public val setCanAddSwatchesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_can_add_swatches")

    public val areSwatchesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_swatches_enabled")

    public val setPresetsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_presets_visible")

    public val arePresetsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_presets_visible")

    public val setModesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_modes_visible")

    public val areModesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_modes_visible")

    public val setSamplerVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_sampler_visible")

    public val isSamplerVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_sampler_visible")

    public val setSlidersVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_sliders_visible")

    public val areSlidersVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_sliders_visible")

    public val setHexVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_hex_visible")

    public val isHexVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_hex_visible")

    public val addPresetPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPicker", "add_preset")

    public val erasePresetPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPicker", "erase_preset")

    public val getPresetsPtr: VoidPtr = TypeManager.getMethodBindPtr("ColorPicker", "get_presets")

    public val addRecentPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "add_recent_preset")

    public val eraseRecentPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "erase_recent_preset")

    public val getRecentPresetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_recent_presets")

    public val setPickerShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_picker_shape")

    public val getPickerShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_picker_shape")
  }
}
