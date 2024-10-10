// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTPANGESTURE_INDEX: Int = 299

/**
 * Stores information about pan gestures. A pan gesture is performed when the user swipes the touch
 * screen with two fingers. It's typically used for panning/scrolling.
 * **Note:** On Android, this requires the
 * [ProjectSettings.inputDevices/pointing/android/enablePanAndScaleGestures] project setting to be
 * enabled.
 */
@GodotBaseType
public open class InputEventPanGesture : InputEventGesture() {
  /**
   * Panning amount since last pan event.
   */
  @CoreTypeLocalCopy
  public final inline var delta: Vector2
    @JvmName("deltaProperty")
    get() = getDelta()
    @JvmName("deltaProperty")
    set(`value`) {
      setDelta(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTPANGESTURE_INDEX, scriptIndex)
  }

  /**
   * Panning amount since last pan event.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventpangesture.delta
   * //Your changes
   * inputeventpangesture.delta = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun deltaMutate(block: Vector2.() -> Unit): Vector2 = delta.apply{
      block(this)
      delta = this
  }


  public final fun setDelta(delta: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to delta)
    Internals.callMethod(rawPtr, MethodBindings.setDeltaPtr, NIL)
  }

  public final fun getDelta(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDeltaPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setDeltaPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventPanGesture", "set_delta", 743155724)

    public val getDeltaPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventPanGesture", "get_delta", 3341600327)
  }
}
