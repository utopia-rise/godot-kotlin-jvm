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
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PICK_COLOR,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PICK_COLOR,
          NIL.ordinal)
    }

  /**
   * If `true`, shows an alpha channel slider (opacity).
   */
  public var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_EDITING_ALPHA,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_EDIT_ALPHA,
          NIL.ordinal)
    }

  public var hsvMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_HSV_MODE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_HSV_MODE, NIL.ordinal)
    }

  public var rawMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_RAW_MODE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_RAW_MODE, NIL.ordinal)
    }

  /**
   * If `true`, the color will apply only after the user releases the mouse button, otherwise it will apply immediately even in mouse motion event (which can cause performance issues).
   */
  public var deferredMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_IS_DEFERRED_MODE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_DEFERRED_MODE,
          NIL.ordinal)
    }

  /**
   * The shape of the color space view. See [enum PickerShapeType].
   */
  public var pickerShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PICKER_SHAPE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PICKER_SHAPE,
          NIL.ordinal)
    }

  /**
   * If `true`, the "add preset" button is enabled.
   */
  public var presetsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_PRESETS_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_ENABLED,
          NIL.ordinal)
    }

  /**
   * If `true`, saved color presets are visible.
   */
  public var presetsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ARE_PRESETS_VISIBLE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_VISIBLE,
          NIL.ordinal)
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
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ADD_PRESET, NIL.ordinal)
  }

  /**
   * Removes the given color from the list of color presets of this color picker.
   */
  public fun erasePreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ERASE_PRESET, NIL.ordinal)
  }

  /**
   * Returns the list of colors in the presets of the color picker.
   */
  public fun getPresets(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS,
        PACKED_COLOR_ARRAY.ordinal)
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
