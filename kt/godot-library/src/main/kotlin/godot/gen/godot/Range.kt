// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * Abstract base class for range-based controls.
 *
 * Range is a base class for [godot.Control] nodes that change a floating-point *value* between a *minimum* and a *maximum*, using *step* and *page*, for example a [godot.ScrollBar].
 */
@GodotBaseType
open class Range : Control() {
  /**
   * Emitted when [minValue], [maxValue], [page], or [step] change.
   */
  val changed: Signal0 by signal()

  /**
   * Emitted when [value] changes.
   */
  val valueChanged: Signal1<Double> by signal("value")

  /**
   * If `true`, [value] may be greater than [maxValue].
   */
  open var allowGreater: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_ALLOW_GREATER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_ALLOW_GREATER, NIL)
    }

  /**
   * If `true`, [value] may be less than [minValue].
   */
  open var allowLesser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_ALLOW_LESSER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_ALLOW_LESSER, NIL)
    }

  /**
   * If `true`, and `min_value` is greater than 0, `value` will be represented exponentially rather than linearly.
   */
  open var expEdit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_EXP_EDIT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_EXP_EDIT, NIL)
    }

  /**
   * Maximum value. Range is clamped if `value` is greater than `max_value`.
   */
  open var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_MAX_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_MAX_VALUE, NIL)
    }

  /**
   * Minimum value. Range is clamped if `value` is less than `min_value`.
   */
  open var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_MIN_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_MIN_VALUE, NIL)
    }

  /**
   * Page size. Used mainly for [godot.ScrollBar]. ScrollBar's length is its size multiplied by `page` over the difference between `min_value` and `max_value`.
   */
  open var page: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_PAGE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_PAGE, NIL)
    }

  /**
   * The value mapped between 0 and 1.
   */
  open var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_RATIO, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_RATIO, NIL)
    }

  /**
   * If `true`, `value` will always be rounded to the nearest integer.
   */
  open var rounded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_ROUNDED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_ROUNDED, NIL)
    }

  /**
   * If greater than 0, `value` will always be rounded to a multiple of `step`. If `rounded` is also `true`, `value` will first be rounded to a multiple of `step` then rounded to the nearest integer.
   */
  open var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_STEP, NIL)
    }

  /**
   * Range's current value.
   */
  open var value: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_GET_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SET_VALUE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RANGE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Binds two ranges together along with any ranges previously grouped with either of them. When any of range's member variables change, it will share the new value with all other ranges in its group.
   */
  open fun share(with: Node) {
    TransferContext.writeArguments(OBJECT to with)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_SHARE, NIL)
  }

  /**
   * Stops range from sharing its member variables with any other.
   */
  open fun unshare() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANGE_UNSHARE, NIL)
  }
}
