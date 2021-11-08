// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Overrides the location sounds are heard from.
 *
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the location sounds are heard from. This can be used to listen from a location different from the [godot.Camera].
 */
@GodotBaseType
public open class Listener : Spatial() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LISTENER)
  }

  /**
   * Disables the listener to use the current camera's listener instead.
   */
  public open fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns the listener's global orthonormalized [godot.core.Transform].
   */
  public open fun getListenerTransform(): Transform {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_GET_LISTENER_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns `true` if the listener was made current using [makeCurrent], `false` otherwise.
   *
   * **Note:** There may be more than one Listener marked as "current" in the scene tree, but only the one that was made current last will be used.
   */
  public open fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_IS_CURRENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables the listener. This will override the current camera's listener.
   */
  public open fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_MAKE_CURRENT, NIL)
  }
}
