// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTMAGNIFYGESTURE_INDEX: Int = 321

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
  public final inline var factor: Float
    @JvmName("factorProperty")
    get() = getFactor()
    @JvmName("factorProperty")
    set(`value`) {
      setFactor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTMAGNIFYGESTURE_INDEX, scriptIndex)
  }

  public final fun setFactor(factor: Float): Unit {
    Internals.writeArguments(DOUBLE to factor.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFactorPtr, NIL)
  }

  public final fun getFactor(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFactorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMagnifyGesture", "set_factor", 373806689)

    internal val getFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventMagnifyGesture", "get_factor", 1740695150)
  }
}
