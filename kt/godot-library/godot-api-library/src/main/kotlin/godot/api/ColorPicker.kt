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
import godot.addPresetPtr
import godot.addRecentPresetPtr
import godot.areModesVisiblePtr
import godot.arePresetsVisiblePtr
import godot.areSlidersVisiblePtr
import godot.areSwatchesEnabledPtr
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.erasePresetPtr
import godot.eraseRecentPresetPtr
import godot.getColorModePtr
import godot.getPickColorPtr
import godot.getPickerShapePtr
import godot.getPresetsPtr
import godot.getRecentPresetsPtr
import godot.isDeferredModePtr
import godot.isEditingAlphaPtr
import godot.isHexVisiblePtr
import godot.isSamplerVisiblePtr
import godot.setCanAddSwatchesPtr
import godot.setColorModePtr
import godot.setDeferredModePtr
import godot.setEditAlphaPtr
import godot.setHexVisiblePtr
import godot.setModesVisiblePtr
import godot.setPickColorPtr
import godot.setPickerShapePtr
import godot.setPresetsVisiblePtr
import godot.setSamplerVisiblePtr
import godot.setSlidersVisiblePtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_COLORPICKER: Int = 192

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
  public val colorChanged: Signal1<Color> by Signal1

  /**
   * Emitted when a preset is added.
   */
  public val presetAdded: Signal1<Color> by Signal1

  /**
   * Emitted when a preset is removed.
   */
  public val presetRemoved: Signal1<Color> by Signal1

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
   * If `true`, shows an alpha channel slider (opacity).
   */
  public final inline var editAlpha: Boolean
    @JvmName("editAlphaProperty")
    get() = isEditingAlpha()
    @JvmName("editAlphaProperty")
    set(`value`) {
      setEditAlpha(value)
    }

  /**
   * The currently selected color mode. See [ColorModeType].
   */
  public final inline var colorMode: ColorModeType
    @JvmName("colorModeProperty")
    get() = getColorMode()
    @JvmName("colorModeProperty")
    set(`value`) {
      setColorMode(value)
    }

  /**
   * If `true`, the color will apply only after the user releases the mouse button, otherwise it
   * will apply immediately even in mouse motion event (which can cause performance issues).
   */
  public final inline var deferredMode: Boolean
    @JvmName("deferredModeProperty")
    get() = isDeferredMode()
    @JvmName("deferredModeProperty")
    set(`value`) {
      setDeferredMode(value)
    }

  /**
   * The shape of the color space view. See [PickerShapeType].
   */
  public final inline var pickerShape: PickerShapeType
    @JvmName("pickerShapeProperty")
    get() = getPickerShape()
    @JvmName("pickerShapeProperty")
    set(`value`) {
      setPickerShape(value)
    }

  /**
   * If `true`, it's possible to add presets under Swatches. If `false`, the button to add presets
   * is disabled.
   */
  public final inline var canAddSwatches: Boolean
    @JvmName("canAddSwatchesProperty")
    get() = areSwatchesEnabled()
    @JvmName("canAddSwatchesProperty")
    set(`value`) {
      setCanAddSwatches(value)
    }

  /**
   * If `true`, the color sampler and color preview are visible.
   */
  public final inline var samplerVisible: Boolean
    @JvmName("samplerVisibleProperty")
    get() = isSamplerVisible()
    @JvmName("samplerVisibleProperty")
    set(`value`) {
      setSamplerVisible(value)
    }

  /**
   * If `true`, the color mode buttons are visible.
   */
  public final inline var colorModesVisible: Boolean
    @JvmName("colorModesVisibleProperty")
    get() = areModesVisible()
    @JvmName("colorModesVisibleProperty")
    set(`value`) {
      setModesVisible(value)
    }

  /**
   * If `true`, the color sliders are visible.
   */
  public final inline var slidersVisible: Boolean
    @JvmName("slidersVisibleProperty")
    get() = areSlidersVisible()
    @JvmName("slidersVisibleProperty")
    set(`value`) {
      setSlidersVisible(value)
    }

  /**
   * If `true`, the hex color code input field is visible.
   */
  public final inline var hexVisible: Boolean
    @JvmName("hexVisibleProperty")
    get() = isHexVisible()
    @JvmName("hexVisibleProperty")
    set(`value`) {
      setHexVisible(value)
    }

  /**
   * If `true`, the Swatches and Recent Colors presets are visible.
   */
  public final inline var presetsVisible: Boolean
    @JvmName("presetsVisibleProperty")
    get() = arePresetsVisible()
    @JvmName("presetsVisibleProperty")
    set(`value`) {
      setPresetsVisible(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_COLORPICKER, scriptIndex)
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

  public final fun setDeferredMode(mode: Boolean): Unit {
    TransferContext.writeArguments(BOOL to mode)
    TransferContext.callMethod(ptr, MethodBindings.setDeferredModePtr, NIL)
  }

  public final fun isDeferredMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDeferredModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColorMode(colorMode: ColorModeType): Unit {
    TransferContext.writeArguments(LONG to colorMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setColorModePtr, NIL)
  }

  public final fun getColorMode(): ColorModeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorModePtr, LONG)
    return ColorPicker.ColorModeType.from(TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setCanAddSwatches(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCanAddSwatchesPtr, NIL)
  }

  public final fun areSwatchesEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areSwatchesEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPresetsVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setPresetsVisiblePtr, NIL)
  }

  public final fun arePresetsVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.arePresetsVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setModesVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setModesVisiblePtr, NIL)
  }

  public final fun areModesVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areModesVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSamplerVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setSamplerVisiblePtr, NIL)
  }

  public final fun isSamplerVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSamplerVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSlidersVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setSlidersVisiblePtr, NIL)
  }

  public final fun areSlidersVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areSlidersVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHexVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setHexVisiblePtr, NIL)
  }

  public final fun isHexVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHexVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds the given color to a list of color presets. The presets are displayed in the color picker
   * and the user will be able to select them.
   * **Note:** The presets list is only for *this* color picker.
   */
  public final fun addPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.addPresetPtr, NIL)
  }

  /**
   * Removes the given color from the list of color presets of this color picker.
   */
  public final fun erasePreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.erasePresetPtr, NIL)
  }

  /**
   * Returns the list of colors in the presets of the color picker.
   */
  public final fun getPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPresetsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  /**
   * Adds the given color to a list of color recent presets so that it can be picked later. Recent
   * presets are the colors that were picked recently, a new preset is automatically created and added
   * to recent presets when you pick a new color.
   * **Note:** The recent presets list is only for *this* color picker.
   */
  public final fun addRecentPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.addRecentPresetPtr, NIL)
  }

  /**
   * Removes the given color from the list of color recent presets of this color picker.
   */
  public final fun eraseRecentPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.eraseRecentPresetPtr, NIL)
  }

  /**
   * Returns the list of colors in the recent presets of the color picker.
   */
  public final fun getRecentPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRecentPresetsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public final fun setPickerShape(shape: PickerShapeType): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(ptr, MethodBindings.setPickerShapePtr, NIL)
  }

  public final fun getPickerShape(): PickerShapeType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPickerShapePtr, LONG)
    return ColorPicker.PickerShapeType.from(TransferContext.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val setPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_pick_color", 2920490490)

    internal val getPickColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_pick_color", 3444240500)

    internal val setDeferredModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_deferred_mode", 2586408642)

    internal val isDeferredModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_deferred_mode", 36873697)

    internal val setColorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_color_mode", 1579114136)

    internal val getColorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_color_mode", 392907674)

    internal val setEditAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_edit_alpha", 2586408642)

    internal val isEditingAlphaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_editing_alpha", 36873697)

    internal val setCanAddSwatchesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_can_add_swatches", 2586408642)

    internal val areSwatchesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_swatches_enabled", 36873697)

    internal val setPresetsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_presets_visible", 2586408642)

    internal val arePresetsVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_presets_visible", 36873697)

    internal val setModesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_modes_visible", 2586408642)

    internal val areModesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_modes_visible", 36873697)

    internal val setSamplerVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_sampler_visible", 2586408642)

    internal val isSamplerVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_sampler_visible", 36873697)

    internal val setSlidersVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_sliders_visible", 2586408642)

    internal val areSlidersVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "are_sliders_visible", 36873697)

    internal val setHexVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_hex_visible", 2586408642)

    internal val isHexVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "is_hex_visible", 36873697)

    internal val addPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "add_preset", 2920490490)

    internal val erasePresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "erase_preset", 2920490490)

    internal val getPresetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_presets", 1392750486)

    internal val addRecentPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "add_recent_preset", 2920490490)

    internal val eraseRecentPresetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "erase_recent_preset", 2920490490)

    internal val getRecentPresetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_recent_presets", 1392750486)

    internal val setPickerShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "set_picker_shape", 3981373861)

    internal val getPickerShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPicker", "get_picker_shape", 1143229889)
  }
}
