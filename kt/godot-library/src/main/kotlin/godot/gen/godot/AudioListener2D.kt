// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Overrides the location sounds are heard from.
 *
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the location sounds are heard from. Only one [godot.AudioListener2D] can be current. Using [makeCurrent] will disable the previous [godot.AudioListener2D].
 *
 * If there is no active [godot.AudioListener2D] in the current [godot.Viewport], center of the screen will be used as a hearing point for the audio. [godot.AudioListener2D] needs to be inside [godot.SceneTree] to function.
 */
@GodotBaseType
public open class AudioListener2D : Node2D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOLISTENER2D, scriptIndex)
    return true
  }

  /**
   * Makes the [godot.AudioListener2D] active, setting it as the hearing point for the sounds. If there is already another active [godot.AudioListener2D], it will be disabled.
   *
   * This method will have no effect if the [godot.AudioListener2D] is not added to [godot.SceneTree].
   */
  public fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER2D_MAKE_CURRENT, NIL)
  }

  /**
   * Disables the [godot.AudioListener2D]. If it's not set as current, this method will have no effect.
   */
  public fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER2D_CLEAR_CURRENT, NIL)
  }

  /**
   * Returns `true` if this [godot.AudioListener2D] is currently active.
   */
  public fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOLISTENER2D_IS_CURRENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
