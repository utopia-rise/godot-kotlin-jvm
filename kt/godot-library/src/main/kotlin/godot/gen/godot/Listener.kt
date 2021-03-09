// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM
import kotlin.Boolean
import kotlin.Suppress

/**
 * Overrides the location sounds are heard from.
 *
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the location sounds are heard from. This can be used to listen from a location different from the [godot.Camera].
 *
 * **Note:** There is no 2D equivalent for this node yet.
 */
@GodotBaseType
open class Listener : Spatial() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_LISTENER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Disables the listener to use the current camera's listener instead.
   */
  open fun clearCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns the listener's global orthonormalized [godot.core.Transform].
   */
  open fun getListenerTransform(): Transform {
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
  open fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_IS_CURRENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables the listener. This will override the current camera's listener.
   */
  open fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER_MAKE_CURRENT, NIL)
  }
}
