// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract base class for range-based controls.
 *
 * Range is a base class for [godot.Control] nodes that change a floating-point [value] between a [minValue] and [maxValue], using a configured [step] and [page] size. See e.g. [godot.ScrollBar] and [godot.Slider] for examples of higher level nodes using Range.
 */
@GodotBaseType
public open class Range : Control() {
  /**
   * Emitted when [value] changes. When used on a [godot.Slider], this is called continuously while dragging (potentially every frame). If you are performing an expensive operation in a function connected to [valueChanged], consider using a *debouncing* [godot.Timer] to call the function less often.
   *
   * **Note:** Unlike signals such as [godot.LineEdit.textChanged], [valueChanged] is also emitted when [value] is set directly via code.
   */
  public val valueChanged: Signal1<Double> by signal("value")

  /**
   * Emitted when [minValue], [maxValue], [page], or [step] change.
   */
  public val changed: Signal0 by signal()

  /**
   * Minimum value. Range is clamped if `value` is less than `min_value`.
   */
  public var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_MIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_MIN, NIL)
    }

  /**
   * Maximum value. Range is clamped if `value` is greater than `max_value`.
   */
  public var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_MAX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_MAX, NIL)
    }

  /**
   * If greater than 0, `value` will always be rounded to a multiple of `step`. If `rounded` is also `true`, `value` will first be rounded to a multiple of `step` then rounded to the nearest integer.
   */
  public var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_STEP, NIL)
    }

  /**
   * Page size. Used mainly for [godot.ScrollBar]. ScrollBar's length is its size multiplied by `page` over the difference between `min_value` and `max_value`.
   */
  public var page: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_PAGE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_PAGE, NIL)
    }

  /**
   * Range's current value. Changing this property (even via code) will trigger [valueChanged] signal. Use [setValueNoSignal] if you want to avoid it.
   */
  public var `value`: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_VALUE, NIL)
    }

  /**
   * The value mapped between 0 and 1.
   */
  public var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_AS_RATIO, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_AS_RATIO, NIL)
    }

  /**
   * If `true`, and `min_value` is greater than 0, `value` will be represented exponentially rather than linearly.
   */
  public var expEdit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_IS_RATIO_EXP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_EXP_RATIO, NIL)
    }

  /**
   * If `true`, `value` will always be rounded to the nearest integer.
   */
  public var rounded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_IS_USING_ROUNDED_VALUES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_USE_ROUNDED_VALUES, NIL)
    }

  /**
   * If `true`, [value] may be greater than [maxValue].
   */
  public var allowGreater: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_IS_GREATER_ALLOWED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_ALLOW_GREATER, NIL)
    }

  /**
   * If `true`, [value] may be less than [minValue].
   */
  public var allowLesser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_IS_LESSER_ALLOWED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_ALLOW_LESSER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RANGE, scriptIndex)
    return true
  }

  /**
   * Called when the [godot.Range]'s value is changed (following the same conditions as [valueChanged]).
   */
  public open fun _valueChanged(newValue: Double): Unit {
  }

  /**
   * Sets the [godot.Range]'s current value to the specified [value], without emitting the [valueChanged] signal.
   */
  public fun setValueNoSignal(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_VALUE_NO_SIGNAL, NIL)
  }

  /**
   * Binds two [godot.Range]s together along with any ranges previously grouped with either of them. When any of range's member variables change, it will share the new value with all other ranges in its group.
   */
  public fun share(with: Node): Unit {
    TransferContext.writeArguments(OBJECT to with)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SHARE, NIL)
  }

  /**
   * Stops the [godot.Range] from sharing its member variables with any other.
   */
  public fun unshare(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_UNSHARE, NIL)
  }

  public companion object
}
