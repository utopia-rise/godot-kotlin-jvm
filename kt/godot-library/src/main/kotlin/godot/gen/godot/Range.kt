// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract base class for range-based controls.
 *
 * Range is a base class for [godot.Control] nodes that change a floating-point *value* between a *minimum* and a *maximum*, using *step* and *page*, for example a [godot.ScrollBar].
 */
@GodotBaseType
public open class Range : Control() {
  /**
   * Emitted when [value] changes. When used on a [godot.Slider], this is called continuously while dragging (potentially every frame). If you are performing an expensive operation in a function connected to [valueChanged], consider using a *debouncing* [godot.Timer] to call the function less often.
   *
   * **Note:** Unlike signals such as [godot.LineEdit.textChanged], [valueChanged] is also emitted when `value` is set directly via code.
   */
  public val valueChanged: Signal1<Double> by signal("value")

  /**
   * Emitted when [minValue], [maxValue], [page], or [step] change.
   */
  public val changed: Signal0 by signal()

  /**
   * Minimum value. Range is clamped if `value` is less than `min_value`.
   */
  public open var minValue: Double
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
  public open var maxValue: Double
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
  public open var step: Double
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
  public open var page: Double
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
   * Range's current value.
   */
  public open var `value`: Double
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
  public open var ratio: Double
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
  public open var expEdit: Boolean
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
  public open var rounded: Boolean
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
  public open var allowGreater: Boolean
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
  public open var allowLesser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_IS_LESSER_ALLOWED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_ALLOW_LESSER, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RANGE)
  }

  /**
   * Called when the [godot.Range]'s value is changed (following the same conditions as [valueChanged]).
   */
  public open fun _valueChanged(newValue: Double): Unit {
  }

  /**
   * Binds two [godot.Range]s together along with any ranges previously grouped with either of them. When any of range's member variables change, it will share the new value with all other ranges in its group.
   */
  public open fun share(with: Node): Unit {
    TransferContext.writeArguments(OBJECT to with)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SHARE, NIL)
  }

  /**
   * Stops the [godot.Range] from sharing its member variables with any other.
   */
  public open fun unshare(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_UNSHARE, NIL)
  }

  public companion object
}
