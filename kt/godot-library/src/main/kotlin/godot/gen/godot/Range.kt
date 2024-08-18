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
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Range is an abstract base class for controls that represent a number within a range, using a
 * configured [step] and [page] size. See e.g. [ScrollBar] and [Slider] for examples of higher-level
 * nodes using Range.
 */
@GodotBaseType
public open class Range : Control() {
  /**
   * Emitted when [value] changes. When used on a [Slider], this is called continuously while
   * dragging (potentially every frame). If you are performing an expensive operation in a function
   * connected to [signal value_changed], consider using a *debouncing* [Timer] to call the function
   * less often.
   * **Note:** Unlike signals such as [signal LineEdit.text_changed], [signal value_changed] is also
   * emitted when [value] is set directly via code.
   */
  public val valueChanged: Signal1<Double> by signal("value")

  /**
   * Emitted when [minValue], [maxValue], [page], or [step] change.
   */
  public val changed: Signal0 by signal()

  /**
   * Minimum value. Range is clamped if [value] is less than [minValue].
   */
  public var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinPtr, NIL)
    }

  /**
   * Maximum value. Range is clamped if [value] is greater than [maxValue].
   */
  public var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPtr, NIL)
    }

  /**
   * If greater than 0, [value] will always be rounded to a multiple of this property's value. If
   * [rounded] is also `true`, [value] will first be rounded to a multiple of this property's value,
   * then rounded to the nearest integer.
   */
  public var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
    }

  /**
   * Page size. Used mainly for [ScrollBar]. ScrollBar's length is its size multiplied by [page]
   * over the difference between [minValue] and [maxValue].
   */
  public var page: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPagePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPagePtr, NIL)
    }

  /**
   * Range's current value. Changing this property (even via code) will trigger [signal
   * value_changed] signal. Use [setValueNoSignal] if you want to avoid it.
   */
  public var `value`: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setValuePtr, NIL)
    }

  /**
   * The value mapped between 0 and 1.
   */
  public var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAsRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsRatioPtr, NIL)
    }

  /**
   * If `true`, and [minValue] is greater than 0, [value] will be represented exponentially rather
   * than linearly.
   */
  public var expEdit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRatioExpPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpRatioPtr, NIL)
    }

  /**
   * If `true`, [value] will always be rounded to the nearest integer.
   */
  public var rounded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingRoundedValuesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseRoundedValuesPtr, NIL)
    }

  /**
   * If `true`, [value] may be greater than [maxValue].
   */
  public var allowGreater: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGreaterAllowedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowGreaterPtr, NIL)
    }

  /**
   * If `true`, [value] may be less than [minValue].
   */
  public var allowLesser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLesserAllowedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowLesserPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RANGE, scriptIndex)
  }

  /**
   * Called when the [Range]'s value is changed (following the same conditions as [signal
   * value_changed]).
   */
  public open fun _valueChanged(newValue: Double): Unit {
  }

  /**
   * Sets the [Range]'s current value to the specified [value], without emitting the [signal
   * value_changed] signal.
   */
  public fun setValueNoSignal(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setValueNoSignalPtr, NIL)
  }

  /**
   * Binds two [Range]s together along with any ranges previously grouped with either of them. When
   * any of range's member variables change, it will share the new value with all other ranges in its
   * group.
   */
  public fun share(with: Node): Unit {
    TransferContext.writeArguments(OBJECT to with)
    TransferContext.callMethod(rawPtr, MethodBindings.sharePtr, NIL)
  }

  /**
   * Stops the [Range] from sharing its member variables with any other.
   */
  public fun unshare(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unsharePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _valueChangedPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "_value_changed")

    public val getValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_value")

    public val getMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_min")

    public val getMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_max")

    public val getStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_step")

    public val getPagePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_page")

    public val getAsRatioPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_as_ratio")

    public val setValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_value")

    public val setValueNoSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_value_no_signal")

    public val setMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_min")

    public val setMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_max")

    public val setStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_step")

    public val setPagePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_page")

    public val setAsRatioPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_as_ratio")

    public val setUseRoundedValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_use_rounded_values")

    public val isUsingRoundedValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_using_rounded_values")

    public val setExpRatioPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_exp_ratio")

    public val isRatioExpPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "is_ratio_exp")

    public val setAllowGreaterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_allow_greater")

    public val isGreaterAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_greater_allowed")

    public val setAllowLesserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_allow_lesser")

    public val isLesserAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_lesser_allowed")

    public val sharePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "share")

    public val unsharePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "unshare")
  }
}
