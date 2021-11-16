// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Numerical input text field.
 *
 * SpinBox is a numerical input text field. It allows entering integers and floats.
 *
 * **Example:**
 *
 * ```
 * 		var spin_box = SpinBox.new()
 * 		add_child(spin_box)
 * 		var line_edit = spin_box.get_line_edit()
 * 		line_edit.context_menu_enabled = false
 * 		spin_box.align = LineEdit.ALIGN_RIGHT
 * 		```
 *
 * The above code will create a [godot.SpinBox], disable context menu on it and set the text alignment to right.
 *
 * See [godot.Range] class for more options over the [godot.SpinBox].
 *
 * **Note:** [godot.SpinBox] relies on an underlying [godot.LineEdit] node. To theme a [godot.SpinBox]'s background, add theme items for [godot.LineEdit] and customize them.
 */
@GodotBaseType
public open class SpinBox : Range() {
  /**
   * Sets the text alignment of the [godot.SpinBox].
   */
  public open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_ALIGN, NIL)
    }

  /**
   * If `true`, the [godot.SpinBox] will be editable. Otherwise, it will be read only.
   */
  public open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_EDITABLE, NIL)
    }

  /**
   * Adds the specified `prefix` string before the numerical value of the [godot.SpinBox].
   */
  public open var prefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_PREFIX, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_PREFIX, NIL)
    }

  /**
   * Adds the specified `suffix` string after the numerical value of the [godot.SpinBox].
   */
  public open var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_SUFFIX, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_SUFFIX, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPINBOX)
  }

  public override fun _guiInput(event: InputEvent): Unit {
  }

  public open fun _lineEditFocusExit(): Unit {
  }

  public open fun _lineEditInput(arg0: InputEvent): Unit {
  }

  public open fun _rangeClickTimeout(): Unit {
  }

  public open fun _textEntered(arg0: String): Unit {
  }

  /**
   * Applies the current value of this [godot.SpinBox].
   */
  public open fun apply(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_APPLY, NIL)
  }

  /**
   * Returns the [godot.LineEdit] instance from this [godot.SpinBox]. You can use it to access properties and methods of [godot.LineEdit].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_LINE_EDIT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as LineEdit?
  }
}
