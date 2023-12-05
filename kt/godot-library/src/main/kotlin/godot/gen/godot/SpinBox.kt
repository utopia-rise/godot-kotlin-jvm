// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  /**
   * If `true`, the [godot.SpinBox] will be editable. Otherwise, it will be read only.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  /**
   * Sets the value of the [godot.Range] for this [godot.SpinBox] when the [godot.LineEdit] text is *changed* instead of *submitted*. See [godot.LineEdit.textChanged] and [godot.LineEdit.textSubmitted].
   */
  public var updateOnTextChanged: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateOnTextChangedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateOnTextChangedPtr, NIL)
    }

  /**
   * Adds the specified `prefix` string before the numerical value of the [godot.SpinBox].
   */
  public var prefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPrefixPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPrefixPtr, NIL)
    }

  /**
   * Adds the specified `suffix` string after the numerical value of the [godot.SpinBox].
   */
  public var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuffixPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSuffixPtr, NIL)
    }

  /**
   * If not `0`, `value` will always be rounded to a multiple of `custom_arrow_step` when interacting with the arrow buttons of the [godot.SpinBox].
   */
  public var customArrowStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomArrowStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomArrowStepPtr, NIL)
    }

  /**
   * If `true`, the [godot.SpinBox] will select the whole text when the [godot.LineEdit] gains focus. Clicking the up and down arrows won't trigger this behavior.
   */
  public var selectAllOnFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectAllOnFocusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectAllOnFocusPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.applyPtr, NIL)
  }

  /**
   * Returns the [godot.LineEdit] instance from this [godot.SpinBox]. You can use it to access properties and methods of [godot.LineEdit].
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_horizontal_alignment")

    public val setSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "set_suffix")

    public val getSuffixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "get_suffix")

    public val setPrefixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "set_prefix")

    public val getPrefixPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "get_prefix")

    public val setEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "set_editable")

    public val setCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_custom_arrow_step")

    public val getCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_custom_arrow_step")

    public val isEditablePtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "is_editable")

    public val setUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_update_on_text_changed")

    public val getUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_update_on_text_changed")

    public val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_select_all_on_focus")

    public val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "is_select_all_on_focus")

    public val applyPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "apply")

    public val getLineEditPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "get_line_edit")
  }
}
