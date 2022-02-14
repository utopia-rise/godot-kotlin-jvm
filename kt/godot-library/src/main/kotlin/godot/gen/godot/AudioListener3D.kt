// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Overrides the location sounds are heard from.
 *
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the location sounds are heard from. This can be used to listen from a location different from the [godot.Camera3D].
 */
@GodotBaseType
public open class AudioListener3D : Node3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOLISTENER3D)
  }

  /**
   * Enables the listener. This will override the current camera's listener.
   */
  public open fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER3D_MAKE_CURRENT, NIL)
  }

  /**
   * Disables the listener to use the current camera's listener instead.
   */
  public open fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER3D_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns `true` if the listener was made current using [makeCurrent], `false` otherwise.
   *
   * **Note:** There may be more than one AudioListener3D marked as "current" in the scene tree, but only the one that was made current last will be used.
   */
  public open fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER3D_IS_CURRENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the listener's global orthonormalized [godot.Transform3D].
   */
  public open fun getListenerTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER3D_GET_LISTENER_TRANSFORM, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  public companion object
}
