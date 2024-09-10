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
 * [SpinBox] is a numerical input text field. It allows entering integers and floating-point
 * numbers.
 * **Example:**
 *
 * gdscript:
 * ```gdscript
 * var spin_box = SpinBox.new()
 * add_child(spin_box)
 * var line_edit = spin_box.get_line_edit()
 * line_edit.context_menu_enabled = false
 * spin_box.horizontal_alignment = LineEdit.HORIZONTAL_ALIGNMENT_RIGHT
 * ```
 * csharp:
 * ```csharp
 * var spinBox = new SpinBox();
 * AddChild(spinBox);
 * var lineEdit = spinBox.GetLineEdit();
 * lineEdit.ContextMenuEnabled = false;
 * spinBox.AlignHorizontal = LineEdit.HorizontalAlignEnum.Right;
 * ```
 *
 * The above code will create a [SpinBox], disable context menu on it and set the text alignment to
 * right.
 * See [Range] class for more options over the [SpinBox].
 * **Note:** With the [SpinBox]'s context menu disabled, you can right-click the bottom half of the
 * spinbox to set the value to its minimum, while right-clicking the top half sets the value to its
 * maximum.
 * **Note:** [SpinBox] relies on an underlying [LineEdit] node. To theme a [SpinBox]'s background,
 * add theme items for [LineEdit] and customize them.
 * **Note:** If you want to implement drag and drop for the underlying [LineEdit], you can use
 * [Control.setDragForwarding] on the node returned by [getLineEdit].
 */
@GodotBaseType
public open class SpinBox : Range() {
  /**
   * Changes the alignment of the underlying [LineEdit].
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
   * If `true`, the [SpinBox] will be editable. Otherwise, it will be read only.
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
   * Sets the value of the [Range] for this [SpinBox] when the [LineEdit] text is *changed* instead
   * of *submitted*. See [signal LineEdit.text_changed] and [signal LineEdit.text_submitted].
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
   * Adds the specified prefix string before the numerical value of the [SpinBox].
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
   * Adds the specified suffix string after the numerical value of the [SpinBox].
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
   * If not `0`, [Range.value] will always be rounded to a multiple of [customArrowStep] when
   * interacting with the arrow buttons of the [SpinBox].
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
   * If `true`, the [SpinBox] will select the whole text when the [LineEdit] gains focus. Clicking
   * the up and down arrows won't trigger this behavior.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SPINBOX, scriptIndex)
  }

  /**
   * Applies the current value of this [SpinBox].
   */
  public fun apply(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.applyPtr, NIL)
  }

  /**
   * Returns the [LineEdit] instance from this [SpinBox]. You can use it to access properties and
   * methods of [LineEdit].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as LineEdit?)
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_horizontal_alignment", 2312603777)

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_horizontal_alignment", 341400642)

    public val setSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_suffix", 83702148)

    public val getSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_suffix", 201670096)

    public val setPrefixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_prefix", 83702148)

    public val getPrefixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_prefix", 201670096)

    public val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_editable", 2586408642)

    public val setCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_custom_arrow_step", 373806689)

    public val getCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_custom_arrow_step", 1740695150)

    public val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "is_editable", 36873697)

    public val setUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_update_on_text_changed", 2586408642)

    public val getUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_update_on_text_changed", 36873697)

    public val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_select_all_on_focus", 2586408642)

    public val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "is_select_all_on_focus", 36873697)

    public val applyPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "apply", 3218959716)

    public val getLineEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_line_edit", 4071694264)
  }
}
