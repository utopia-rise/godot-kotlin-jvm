// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * AudioStream that lets the user play custom streams at any time from code, simultaneously using a
 * single player.
 * Playback control is done via the [AudioStreamPlaybackPolyphonic] instance set inside the player,
 * which can be obtained via [AudioStreamPlayer.getStreamPlayback],
 * [AudioStreamPlayer2D.getStreamPlayback] or [AudioStreamPlayer3D.getStreamPlayback] methods.
 * Obtaining the playback instance is only valid after the `stream` property is set as an
 * [AudioStreamPolyphonic] in those players.
 */
@GodotBaseType
public open class AudioStreamPolyphonic : AudioStream() {
  /**
   * Maximum amount of simultaneous streams that can be played.
   */
  public var polyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPolyphonyPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPOLYPHONIC, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPolyphonic", "set_polyphony")

    public val getPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPolyphonic", "get_polyphony")
  }
}
