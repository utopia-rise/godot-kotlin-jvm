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
import godot.getPositionPtr
import godot.setPositionPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_INPUTEVENTGESTURE: Int = 316

/**
 * InputEventGestures are sent when a user performs a supported gesture on a touch screen. Gestures
 * can't be emulated using mouse, because they typically require multi-touch.
 */
@GodotBaseType
public open class InputEventGesture internal constructor() : InputEventWithModifiers() {
  /**
   * The local gesture position relative to the [Viewport]. If used in [Control.GuiInput], the
   * position is relative to the current [Control] that received this gesture.
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector2
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_INPUTEVENTGESTURE, scriptIndex)
  }

  /**
   * The local gesture position relative to the [Viewport]. If used in [Control.GuiInput], the
   * position is relative to the current [Control] that received this gesture.
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
   * val myCoreType = inputeventgesture.position
   * //Your changes
   * inputeventgesture.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  public final fun setPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventGesture", "set_position", 743155724)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventGesture", "get_position", 3341600327)
  }
}
