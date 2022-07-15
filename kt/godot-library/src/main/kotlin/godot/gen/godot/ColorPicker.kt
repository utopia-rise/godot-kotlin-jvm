// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
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
  public open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_COLOR, NIL)
    }

  /**
   * If `true`, the color will apply only after the user releases the mouse button, otherwise it will apply immediately even in mouse motion event (which can cause performance issues).
   */
  public open var deferredMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_DEFERRED_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_DEFERRED_MODE,
          NIL)
    }

  /**
   * If `true`, shows an alpha channel slider (opacity).
   */
  public open var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_EDIT_ALPHA, BOOL)
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
  public open var hsvMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_HSV_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_HSV_MODE, NIL)
    }

  /**
   * If `true`, the "add preset" button is enabled.
   */
  public open var presetsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS_ENABLED,
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
  public open var presetsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_VISIBLE,
          NIL)
    }

  /**
   * If `true`, allows the color R, G, B component values to go beyond 1.0, which can be used for certain special operations that require it (like tinting without darkening or rendering sprites in HDR).
   *
   * **Note:** Cannot be enabled if HSV mode is on.
   */
  public open var rawMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_RAW_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_RAW_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLORPICKER)
  }

  @CoreTypeHelper
  public open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  public open fun _addPresetPressed(): Unit {
  }

  public open fun _focusEnter(): Unit {
  }

  public open fun _focusExit(): Unit {
  }

  public open fun _hsvDraw(arg0: Long, arg1: Control): Unit {
  }

  public open fun _htmlEntered(arg0: String): Unit {
  }

  public open fun _htmlFocusExit(): Unit {
  }

  public open fun _presetInput(arg0: InputEvent, arg1: Color): Unit {
  }

  public open fun _sampleDraw(): Unit {
  }

  public open fun _sampleInput(arg0: InputEvent): Unit {
  }

  public open fun _screenInput(arg0: InputEvent): Unit {
  }

  public open fun _screenPickPressed(): Unit {
  }

  public open fun _textTypeToggled(): Unit {
  }

  public open fun _updatePresets(): Unit {
  }

  public open fun _uvInput(arg0: InputEvent): Unit {
  }

  public open fun _valueChanged(arg0: Double): Unit {
  }

  public open fun _wInput(arg0: InputEvent): Unit {
  }

  /**
   * Adds the given color to a list of color presets. The presets are displayed in the color picker and the user will be able to select them.
   *
   * **Note:** The presets list is only for *this* color picker.
   */
  public open fun addPreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ADD_PRESET, NIL)
  }

  /**
   * Removes the given color from the list of color presets of this color picker.
   */
  public open fun erasePreset(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ERASE_PRESET, NIL)
  }

  /**
   * Returns the list of colors in the presets of the color picker.
   */
  public open fun getPresets(): PoolColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS,
        POOL_COLOR_ARRAY)
    return TransferContext.readReturnValue(POOL_COLOR_ARRAY, false) as PoolColorArray
  }
}
