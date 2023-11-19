// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Godot editor's control for editing numeric values.
 *
 * This [godot.Control] node is used in the editor's Inspector dock to allow editing of numeric values. Can be used with [godot.EditorInspectorPlugin] to recreate the same behavior.
 */
@GodotBaseType
public open class EditorSpinSlider internal constructor() : Range() {
  /**
   * Emitted when the spinner/slider is grabbed.
   */
  public val grabbed: Signal0 by signal()

  /**
   * Emitted when the spinner/slider is ungrabbed.
   */
  public val ungrabbed: Signal0 by signal()

  /**
   * Emitted when the value form gains focus.
   */
  public val valueFocusEntered: Signal0 by signal()

  /**
   * Emitted when the value form loses focus.
   */
  public val valueFocusExited: Signal0 by signal()

  /**
   * The text that displays to the left of the value.
   */
  public var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLabelPtr, NIL)
    }

  /**
   * The suffix to display after the value (in a faded color). This should generally be a plural word. You may have to use an abbreviation if the suffix is too long to be displayed.
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
   * If `true`, the slider can't be interacted with.
   */
  public var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isReadOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReadOnlyPtr, NIL)
    }

  /**
   * If `true`, the slider will not draw background.
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  /**
   * If `true`, the slider is hidden.
   */
  public var hideSlider: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHidingSliderPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideSliderPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSPINSLIDER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "set_label")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "get_label")

    public val setSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "set_suffix")

    public val getSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "get_suffix")

    public val setReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "set_read_only")

    public val isReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "is_read_only")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorSpinSlider", "is_flat")

    public val setHideSliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "set_hide_slider")

    public val isHidingSliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSpinSlider", "is_hiding_slider")
  }
}
