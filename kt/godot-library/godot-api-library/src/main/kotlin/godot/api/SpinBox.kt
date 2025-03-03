// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.HorizontalAlignment
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [SpinBox] is a numerical input text field. It allows entering integers and floating-point
 * numbers.
 * **Example:** Create a [SpinBox], disable its context menu and set its text alignment to right.
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
 * See [Range] class for more options over the [SpinBox].
 * **Note:** With the [SpinBox]'s context menu disabled, you can right-click the bottom half of the
 * spinbox to set the value to its minimum, while right-clicking the top half sets the value to its
 * maximum.
 * **Note:** [SpinBox] relies on an underlying [LineEdit] node. To theme a [SpinBox]'s background,
 * add theme items for [LineEdit] and customize them. The [LineEdit] has the `SpinBoxInnerLineEdit`
 * theme variation, so that you can give it a distinct appearance from regular [LineEdit]s.
 * **Note:** If you want to implement drag and drop for the underlying [LineEdit], you can use
 * [Control.setDragForwarding] on the node returned by [getLineEdit].
 */
@GodotBaseType
public open class SpinBox : Range() {
  /**
   * Changes the alignment of the underlying [LineEdit].
   */
  public final inline var alignment: HorizontalAlignment
    @JvmName("alignmentProperty")
    get() = getHorizontalAlignment()
    @JvmName("alignmentProperty")
    set(`value`) {
      setHorizontalAlignment(value)
    }

  /**
   * If `true`, the [SpinBox] will be editable. Otherwise, it will be read only.
   */
  public final inline var editable: Boolean
    @JvmName("editableProperty")
    get() = isEditable()
    @JvmName("editableProperty")
    set(`value`) {
      setEditable(value)
    }

  /**
   * Sets the value of the [Range] for this [SpinBox] when the [LineEdit] text is *changed* instead
   * of *submitted*. See [signal LineEdit.text_changed] and [signal LineEdit.text_submitted].
   */
  public final inline var updateOnTextChanged: Boolean
    @JvmName("updateOnTextChangedProperty")
    get() = getUpdateOnTextChanged()
    @JvmName("updateOnTextChangedProperty")
    set(`value`) {
      setUpdateOnTextChanged(value)
    }

  /**
   * Adds the specified prefix string before the numerical value of the [SpinBox].
   */
  public final inline var prefix: String
    @JvmName("prefixProperty")
    get() = getPrefix()
    @JvmName("prefixProperty")
    set(`value`) {
      setPrefix(value)
    }

  /**
   * Adds the specified suffix string after the numerical value of the [SpinBox].
   */
  public final inline var suffix: String
    @JvmName("suffixProperty")
    get() = getSuffix()
    @JvmName("suffixProperty")
    set(`value`) {
      setSuffix(value)
    }

  /**
   * If not `0`, [Range.value] will always be rounded to a multiple of [customArrowStep] when
   * interacting with the arrow buttons of the [SpinBox].
   */
  public final inline var customArrowStep: Double
    @JvmName("customArrowStepProperty")
    get() = getCustomArrowStep()
    @JvmName("customArrowStepProperty")
    set(`value`) {
      setCustomArrowStep(value)
    }

  /**
   * If `true`, the [SpinBox] will select the whole text when the [LineEdit] gains focus. Clicking
   * the up and down arrows won't trigger this behavior.
   */
  public final inline var selectAllOnFocus: Boolean
    @JvmName("selectAllOnFocusProperty")
    get() = isSelectAllOnFocus()
    @JvmName("selectAllOnFocusProperty")
    set(`value`) {
      setSelectAllOnFocus(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(626, scriptIndex)
  }

  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSuffix(suffix: String): Unit {
    TransferContext.writeArguments(STRING to suffix)
    TransferContext.callMethod(ptr, MethodBindings.setSuffixPtr, NIL)
  }

  public final fun getSuffix(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSuffixPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setPrefix(prefix: String): Unit {
    TransferContext.writeArguments(STRING to prefix)
    TransferContext.callMethod(ptr, MethodBindings.setPrefixPtr, NIL)
  }

  public final fun getPrefix(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrefixPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setEditable(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEditablePtr, NIL)
  }

  public final fun setCustomArrowStep(arrowStep: Double): Unit {
    TransferContext.writeArguments(DOUBLE to arrowStep)
    TransferContext.callMethod(ptr, MethodBindings.setCustomArrowStepPtr, NIL)
  }

  public final fun getCustomArrowStep(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomArrowStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun isEditable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateOnTextChanged(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUpdateOnTextChangedPtr, NIL)
  }

  public final fun getUpdateOnTextChanged(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpdateOnTextChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectAllOnFocus(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSelectAllOnFocusPtr, NIL)
  }

  public final fun isSelectAllOnFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSelectAllOnFocusPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Applies the current value of this [SpinBox].
   */
  public final fun apply(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.applyPtr, NIL)
  }

  /**
   * Returns the [LineEdit] instance from this [SpinBox]. You can use it to access properties and
   * methods of [LineEdit].
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getLineEdit(): LineEdit? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineEditPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as LineEdit?)
  }

  public companion object

  public object MethodBindings {
    internal val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_horizontal_alignment", 341400642)

    internal val setSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_suffix", 83702148)

    internal val getSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_suffix", 201670096)

    internal val setPrefixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_prefix", 83702148)

    internal val getPrefixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_prefix", 201670096)

    internal val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_editable", 2586408642)

    internal val setCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_custom_arrow_step", 373806689)

    internal val getCustomArrowStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_custom_arrow_step", 1740695150)

    internal val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "is_editable", 36873697)

    internal val setUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_update_on_text_changed", 2586408642)

    internal val getUpdateOnTextChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_update_on_text_changed", 36873697)

    internal val setSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "set_select_all_on_focus", 2586408642)

    internal val isSelectAllOnFocusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "is_select_all_on_focus", 36873697)

    internal val applyPtr: VoidPtr = TypeManager.getMethodBindPtr("SpinBox", "apply", 3218959716)

    internal val getLineEditPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpinBox", "get_line_edit", 4071694264)
  }
}
