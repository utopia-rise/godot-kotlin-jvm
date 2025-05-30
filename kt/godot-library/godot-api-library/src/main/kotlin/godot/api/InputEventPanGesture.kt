// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Stores information about pan gestures. A pan gesture is performed when the user swipes the touch
 * screen with two fingers. It's typically used for panning/scrolling.
 *
 * **Note:** On Android, this requires the
 * [ProjectSettings.inputDevices/pointing/android/enablePanAndScaleGestures] project setting to be
 * enabled.
 */
@GodotBaseType
public open class InputEventPanGesture : InputEventGesture() {
  /**
   * Panning amount since last pan event.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(304, scriptIndex)
  }

  /**
   * This is a helper function for [delta] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventpangesture.delta
   * //Your changes
   * inputeventpangesture.delta = myCoreType
   * ``````
   *
   * Panning amount since last pan event.
   */
  @CoreTypeHelper
  public final fun deltaMutate(block: Vector2.() -> Unit): Vector2 = delta.apply {
     block(this)
     delta = this
  }

  public final fun setDelta(delta: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to delta)
    TransferContext.callMethod(ptr, MethodBindings.setDeltaPtr, NIL)
  }

  public final fun getDelta(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDeltaPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventPanGesture", "set_delta", 743155724)

    internal val getDeltaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventPanGesture", "get_delta", 3341600327)
  }
}
