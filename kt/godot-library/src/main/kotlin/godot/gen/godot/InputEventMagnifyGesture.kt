// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Stores the factor of a magnifying touch gesture. This is usually performed when the user pinches
 * the touch screen and used for zooming in/out.
 * **Note:** On Android, this requires the
 * [ProjectSettings.inputDevices/pointing/android/enablePanAndScaleGestures] project setting to be
 * enabled.
 */
@GodotBaseType
public open class InputEventMagnifyGesture : InputEventGesture() {
  /**
   * The amount (or delta) of the event. This value is closer to `1.0` the slower the gesture is
   * performed.
   */
  public var factor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFactorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMAGNIFYGESTURE, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMagnifyGesture", "set_factor")

    public val getFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMagnifyGesture", "get_factor")
  }
}
