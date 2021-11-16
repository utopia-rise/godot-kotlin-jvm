// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Overrides the location sounds are heard from.
 *
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the location sounds are heard from. Only one [godot.Listener2D] can be current. Using [makeCurrent] will disable the previous [godot.Listener2D].
 *
 * If there is no active [godot.Listener2D] in the current [godot.Viewport], center of the screen will be used as a hearing point for the audio. [godot.Listener2D] needs to be inside [godot.SceneTree] to function.
 */
@GodotBaseType
public open class Listener2D : Node2D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LISTENER2D)
  }

  /**
   * Disables the [godot.Listener2D]. If it's not set as current, this method will have no effect.
   */
  public open fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER2D_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns `true` if this [godot.Listener2D] is currently active.
   */
  public open fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER2D_IS_CURRENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Makes the [godot.Listener2D] active, setting it as the hearing point for the sounds. If there is already another active [godot.Listener2D], it will be disabled.
   *
   * This method will have no effect if the [godot.Listener2D] is not added to [godot.SceneTree].
   */
  public open fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LISTENER2D_MAKE_CURRENT, NIL)
  }
}
