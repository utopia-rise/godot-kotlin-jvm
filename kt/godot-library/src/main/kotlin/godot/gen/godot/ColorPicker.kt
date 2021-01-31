// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class ColorPicker : BoxContainer() {
  val colorChanged: Signal1<Color> by signal("color")

  val presetAdded: Signal1<Color> by signal("color")

  val presetRemoved: Signal1<Color> by signal("color")

  open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_COLOR, NIL)
    }

  open var deferredMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_DEFERRED_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_DEFERRED_MODE,
          NIL)
    }

  open var editAlpha: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_EDIT_ALPHA, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_EDIT_ALPHA, NIL)
    }

  open var hsvMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_HSV_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_HSV_MODE, NIL)
    }

  open var presetsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_ENABLED,
          NIL)
    }

  open var presetsVisible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_PRESETS_VISIBLE,
          NIL)
    }

  open var rawMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_RAW_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_SET_RAW_MODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_COLORPICKER)

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun _add_preset_pressed() {
  }

  open fun _focus_enter() {
  }

  open fun _focus_exit() {
  }

  open fun _hsv_draw(arg0: Long, arg1: Control) {
  }

  open fun _html_entered(arg0: String) {
  }

  open fun _html_focus_exit() {
  }

  open fun _preset_input(arg0: InputEvent) {
  }

  open fun _sample_draw() {
  }

  open fun _screen_input(arg0: InputEvent) {
  }

  open fun _screen_pick_pressed() {
  }

  open fun _text_type_toggled() {
  }

  open fun _update_presets() {
  }

  open fun _uv_input(arg0: InputEvent) {
  }

  open fun _value_changed(arg0: Double) {
  }

  open fun _w_input(arg0: InputEvent) {
  }

  open fun addPreset(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ADD_PRESET, NIL)
  }

  open fun erasePreset(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_ERASE_PRESET, NIL)
  }

  open fun getPresets(): PoolColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORPICKER_GET_PRESETS,
        POOL_COLOR_ARRAY)
    return TransferContext.readReturnValue(POOL_COLOR_ARRAY, false) as PoolColorArray
  }
}
