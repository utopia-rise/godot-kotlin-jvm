// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for GUI sliders.
 *
 * Base class for GUI sliders.
 *
 * **Note:** The [godot.Range.changed] and [godot.Range.valueChanged] signals are part of the [godot.Range] class which this class inherits from.
 */
@GodotBaseType
public open class Slider internal constructor() : Range() {
  /**
   * Emitted when dragging is started.
   */
  public val dragStarted: Signal0 by signal()

  /**
   * Emitted when dragging stops. If [valueChanged] is true, [godot.Range.value] is different from the value when you started the dragging.
   */
  public val dragEnded: Signal1<Boolean> by signal("valueChanged")

  /**
   * If `true`, the slider can be interacted with. If `false`, the value can be changed only by code.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_IS_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_SET_EDITABLE, NIL)
    }

  /**
   * If `true`, the value can be changed using the mouse wheel.
   */
  public var scrollable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_IS_SCROLLABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_SET_SCROLLABLE, NIL)
    }

  /**
   * Number of ticks displayed on the slider, including border ticks. Ticks are uniformly-distributed value markers.
   */
  public var tickCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_GET_TICKS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_SET_TICKS, NIL)
    }

  /**
   * If `true`, the slider will display ticks for minimum and maximum values.
   */
  public var ticksOnBorders: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_GET_TICKS_ON_BORDERS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SLIDER_SET_TICKS_ON_BORDERS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SLIDER)
  }

  public companion object
}
