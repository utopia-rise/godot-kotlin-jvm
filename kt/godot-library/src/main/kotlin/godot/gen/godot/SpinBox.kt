// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * An input field for numbers.
 *
 * [godot.SpinBox] is a numerical input text field. It allows entering integers and floating point numbers.
 *
 * **Example:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var spin_box = SpinBox.new()
 *
 * add_child(spin_box)
 *
 * var line_edit = spin_box.get_line_edit()
 *
 * line_edit.context_menu_enabled = false
 *
 * spin_box.horizontal_alignment = LineEdit.HORIZONTAL_ALIGNMENT_RIGHT
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var spinBox = new SpinBox();
 *
 * AddChild(spinBox);
 *
 * var lineEdit = spinBox.GetLineEdit();
 *
 * lineEdit.ContextMenuEnabled = false;
 *
 * spinBox.AlignHorizontal = LineEdit.HorizontalAlignEnum.Right;
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The above code will create a [godot.SpinBox], disable context menu on it and set the text alignment to right.
 *
 * See [godot.Range] class for more options over the [godot.SpinBox].
 *
 * **Note:** [godot.SpinBox] relies on an underlying [godot.LineEdit] node. To theme a [godot.SpinBox]'s background, add theme items for [godot.LineEdit] and customize them.
 *
 * **Note:** If you want to implement drag and drop for the underlying [godot.LineEdit], you can use [godot.Control.setDragForwarding] on the node returned by [getLineEdit].
 */
@GodotBaseType
public open class SpinBox : Range() {
  /**
   * Changes the alignment of the underlying [godot.LineEdit].
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return HorizontalAlignment.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * If `true`, the [godot.SpinBox] will be editable. Otherwise, it will be read only.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_IS_EDITABLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_EDITABLE, NIL)
    }

  /**
   * Sets the value of the [godot.Range] for this [godot.SpinBox] when the [godot.LineEdit] text is *changed* instead of *submitted*. See [godot.LineEdit.textChanged] and [godot.LineEdit.textSubmitted].
   */
  public var updateOnTextChanged: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_UPDATE_ON_TEXT_CHANGED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_UPDATE_ON_TEXT_CHANGED, NIL)
    }

  /**
   * Adds the specified `prefix` string before the numerical value of the [godot.SpinBox].
   */
  public var prefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_PREFIX, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_PREFIX, NIL)
    }

  /**
   * Adds the specified `suffix` string after the numerical value of the [godot.SpinBox].
   */
  public var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_SUFFIX, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_SUFFIX, NIL)
    }

  /**
   * If not `0`, `value` will always be rounded to a multiple of `custom_arrow_step` when interacting with the arrow buttons of the [godot.SpinBox].
   */
  public var customArrowStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_CUSTOM_ARROW_STEP,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_CUSTOM_ARROW_STEP,
          NIL)
    }

  /**
   * If `true`, the [godot.SpinBox] will select the whole text when the [godot.LineEdit] gains focus. Clicking the up and down arrows won't trigger this behavior.
   */
  public var selectAllOnFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_IS_SELECT_ALL_ON_FOCUS,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_SET_SELECT_ALL_ON_FOCUS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPINBOX, scriptIndex)
    return true
  }

  /**
   * Applies the current value of this [godot.SpinBox].
   */
  public fun apply(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_APPLY, NIL)
  }

  /**
   * Returns the [godot.LineEdit] instance from this [godot.SpinBox]. You can use it to access properties and methods of [godot.LineEdit].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPINBOX_GET_LINE_EDIT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  public companion object
}
