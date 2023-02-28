// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Playback instance for [godot.AudioStreamPolyphonic].
 *
 * Playback instance for [godot.AudioStreamPolyphonic]. After setting the `stream` property of [godot.AudioStreamPlayer], [godot.AudioStreamPlayer2D], or [godot.AudioStreamPlayer3D], the playback instance can be obtained by calling [godot.AudioStreamPlayer.getStreamPlayback], [godot.AudioStreamPlayer2D.getStreamPlayback] or [godot.AudioStreamPlayer3D.getStreamPlayback] methods.
 */
@GodotBaseType
public open class AudioStreamPlaybackPolyphonic internal constructor() : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC, scriptIndex)
    return true
  }

  /**
   * Play an [godot.AudioStream] at a given offset, volume and pitch scale. Playback starts immediately.
   *
   * The return value is an unique integer ID that is associated to this playback stream and which can be used to control it.
   *
   * This ID becomes invalid when the stream ends (if it does not loop), when the [godot.AudioStreamPlaybackPolyphonic] is stopped, or when [stopStream] is called.
   *
   * This function returns [INVALID_ID] if the amount of streams currently playing equals [godot.AudioStreamPolyphonic.polyphony]. If you need a higher amount of maximum polyphony, raise this value.
   */
  public fun playStream(
    stream: AudioStream,
    fromOffset: Double = 0.0,
    volumeDb: Double = 0.0,
    pitchScale: Double = 1.0
  ): Long {
    TransferContext.writeArguments(OBJECT to stream, DOUBLE to fromOffset, DOUBLE to volumeDb, DOUBLE to pitchScale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_PLAY_STREAM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Change the stream volume (in db). The [stream] argument is an integer ID returned by [playStream].
   */
  public fun setStreamVolume(stream: Long, volumeDb: Double): Unit {
    TransferContext.writeArguments(LONG to stream, DOUBLE to volumeDb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_SET_STREAM_VOLUME, NIL)
  }

  /**
   * Change the stream pitch scale. The [stream] argument is an integer ID returned by [playStream].
   */
  public fun setStreamPitchScale(stream: Long, pitchScale: Double): Unit {
    TransferContext.writeArguments(LONG to stream, DOUBLE to pitchScale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_SET_STREAM_PITCH_SCALE, NIL)
  }

  /**
   * Return true whether the stream associated with an integer ID is still playing. Check [playStream] for information on when this ID becomes invalid.
   */
  public fun isStreamPlaying(stream: Long): Boolean {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_IS_STREAM_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stop a stream. The [stream] argument is an integer ID returned by [playStream], which becomes invalid after calling this function.
   */
  public fun stopStream(stream: Long): Unit {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_STOP_STREAM, NIL)
  }

  public companion object {
    /**
     * Returned by [playStream] in case it could not allocate a stream for playback.
     */
    public final const val INVALID_ID: Long = -1
  }
}
