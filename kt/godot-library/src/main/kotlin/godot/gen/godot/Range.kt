// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val valueChanged: Signal1<Double> by Signal1

  /**
   * Emitted when [minValue], [maxValue], [page], or [step] change.
   */
  public val changed: Signal0 by Signal0

  /**
   * Minimum value. Range is clamped if [value] is less than [minValue].
   */
  public final inline var minValue: Double
    @JvmName("minValueProperty")
    get() = getMin()
    @JvmName("minValueProperty")
    set(`value`) {
      setMin(value)
    }

  /**
   * Maximum value. Range is clamped if [value] is greater than [maxValue].
   */
  public final inline var maxValue: Double
    @JvmName("maxValueProperty")
    get() = getMax()
    @JvmName("maxValueProperty")
    set(`value`) {
      setMax(value)
    }

  /**
   * If greater than 0, [value] will always be rounded to a multiple of this property's value. If
   * [rounded] is also `true`, [value] will first be rounded to a multiple of this property's value,
   * then rounded to the nearest integer.
   */
  public final inline var step: Double
    @JvmName("stepProperty")
    get() = getStep()
    @JvmName("stepProperty")
    set(`value`) {
      setStep(value)
    }

  /**
   * Page size. Used mainly for [ScrollBar]. ScrollBar's length is its size multiplied by [page]
   * over the difference between [minValue] and [maxValue].
   */
  public final inline var page: Double
    @JvmName("pageProperty")
    get() = getPage()
    @JvmName("pageProperty")
    set(`value`) {
      setPage(value)
    }

  /**
   * Range's current value. Changing this property (even via code) will trigger [signal
   * value_changed] signal. Use [setValueNoSignal] if you want to avoid it.
   */
  public final inline var `value`: Double
    @JvmName("valueProperty")
    get() = getValue()
    @JvmName("valueProperty")
    set(`value`) {
      setValue(value)
    }

  /**
   * The value mapped between 0 and 1.
   */
  public final inline var ratio: Double
    @JvmName("ratioProperty")
    get() = getAsRatio()
    @JvmName("ratioProperty")
    set(`value`) {
      setAsRatio(value)
    }

  /**
   * If `true`, and [minValue] is greater than 0, [value] will be represented exponentially rather
   * than linearly.
   */
  public final inline var expEdit: Boolean
    @JvmName("expEditProperty")
    get() = isRatioExp()
    @JvmName("expEditProperty")
    set(`value`) {
      setExpRatio(value)
    }

  /**
   * If `true`, [value] will always be rounded to the nearest integer.
   */
  public final inline var rounded: Boolean
    @JvmName("roundedProperty")
    get() = isUsingRoundedValues()
    @JvmName("roundedProperty")
    set(`value`) {
      setUseRoundedValues(value)
    }

  /**
   * If `true`, [value] may be greater than [maxValue].
   */
  public final inline var allowGreater: Boolean
    @JvmName("allowGreaterProperty")
    get() = isGreaterAllowed()
    @JvmName("allowGreaterProperty")
    set(`value`) {
      setAllowGreater(value)
    }

  /**
   * If `true`, [value] may be less than [minValue].
   */
  public final inline var allowLesser: Boolean
    @JvmName("allowLesserProperty")
    get() = isLesserAllowed()
    @JvmName("allowLesserProperty")
    set(`value`) {
      setAllowLesser(value)
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

  public final fun getValue(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getMin(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getMax(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getStep(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getPage(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPagePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getAsRatio(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAsRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setValue(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(ptr, MethodBindings.setValuePtr, NIL)
  }

  /**
   * Sets the [Range]'s current value to the specified [value], without emitting the [signal
   * value_changed] signal.
   */
  public final fun setValueNoSignal(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(ptr, MethodBindings.setValueNoSignalPtr, NIL)
  }

  public final fun setMin(minimum: Double): Unit {
    TransferContext.writeArguments(DOUBLE to minimum)
    TransferContext.callMethod(ptr, MethodBindings.setMinPtr, NIL)
  }

  public final fun setMax(maximum: Double): Unit {
    TransferContext.writeArguments(DOUBLE to maximum)
    TransferContext.callMethod(ptr, MethodBindings.setMaxPtr, NIL)
  }

  public final fun setStep(step: Double): Unit {
    TransferContext.writeArguments(DOUBLE to step)
    TransferContext.callMethod(ptr, MethodBindings.setStepPtr, NIL)
  }

  public final fun setPage(pagesize: Double): Unit {
    TransferContext.writeArguments(DOUBLE to pagesize)
    TransferContext.callMethod(ptr, MethodBindings.setPagePtr, NIL)
  }

  public final fun setAsRatio(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(ptr, MethodBindings.setAsRatioPtr, NIL)
  }

  public final fun setUseRoundedValues(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseRoundedValuesPtr, NIL)
  }

  public final fun isUsingRoundedValues(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingRoundedValuesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExpRatio(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setExpRatioPtr, NIL)
  }

  public final fun isRatioExp(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRatioExpPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowGreater(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowGreaterPtr, NIL)
  }

  public final fun isGreaterAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isGreaterAllowedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowLesser(allow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to allow)
    TransferContext.callMethod(ptr, MethodBindings.setAllowLesserPtr, NIL)
  }

  public final fun isLesserAllowed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLesserAllowedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Binds two [Range]s together along with any ranges previously grouped with either of them. When
   * any of range's member variables change, it will share the new value with all other ranges in its
   * group.
   */
  public final fun share(with: Node?): Unit {
    TransferContext.writeArguments(OBJECT to with)
    TransferContext.callMethod(ptr, MethodBindings.sharePtr, NIL)
  }

  /**
   * Stops the [Range] from sharing its member variables with any other.
   */
  public final fun unshare(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.unsharePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_value", 1740695150)

    public val getMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_min", 1740695150)

    public val getMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_max", 1740695150)

    public val getStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_step", 1740695150)

    public val getPagePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "get_page", 1740695150)

    public val getAsRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "get_as_ratio", 1740695150)

    public val setValuePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_value", 373806689)

    public val setValueNoSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_value_no_signal", 373806689)

    public val setMinPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_min", 373806689)

    public val setMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_max", 373806689)

    public val setStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_step", 373806689)

    public val setPagePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "set_page", 373806689)

    public val setAsRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_as_ratio", 373806689)

    public val setUseRoundedValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_use_rounded_values", 2586408642)

    public val isUsingRoundedValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_using_rounded_values", 36873697)

    public val setExpRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_exp_ratio", 2586408642)

    public val isRatioExpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_ratio_exp", 36873697)

    public val setAllowGreaterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_allow_greater", 2586408642)

    public val isGreaterAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_greater_allowed", 36873697)

    public val setAllowLesserPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "set_allow_lesser", 2586408642)

    public val isLesserAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Range", "is_lesser_allowed", 36873697)

    public val sharePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "share", 1078189570)

    public val unsharePtr: VoidPtr = TypeManager.getMethodBindPtr("Range", "unshare", 3218959716)
  }
}
