// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * AudioStream that lets the user play custom streams at any time from code, simultaneously using a single player.
 *
 * AudioStream that lets the user play custom streams at any time from code, simultaneously using a single player.
 *
 * Playback control is done via the [godot.AudioStreamPlaybackPolyphonic] instance set inside the player, which can be obtained via [godot.AudioStreamPlayer.getStreamPlayback], [godot.AudioStreamPlayer2D.getStreamPlayback] or [godot.AudioStreamPlayer3D.getStreamPlayback] methods. Obtaining the playback instance is only valid after the `stream` property is set as an [godot.AudioStreamPolyphonic] in those players.
 */
@GodotBaseType
public open class AudioStreamPolyphonic : AudioStream() {
  /**
   * Maximum amount of simultaneous streams that can be played.
   */
  public var polyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPOLYPHONIC_GET_POLYPHONY, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPOLYPHONIC_SET_POLYPHONY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPOLYPHONIC, scriptIndex)
    return true
  }

  public companion object
}
