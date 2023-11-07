// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Playback instance for [AudioStreamPolyphonic]. After setting the `stream` property of
 * [AudioStreamPlayer], [AudioStreamPlayer2D], or [AudioStreamPlayer3D], the playback instance can be
 * obtained by calling [AudioStreamPlayer.getStreamPlayback], [AudioStreamPlayer2D.getStreamPlayback]
 * or [AudioStreamPlayer3D.getStreamPlayback] methods.
 */
@GodotBaseType
public open class AudioStreamPlaybackPolyphonic internal constructor() : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC, scriptIndex)
    return true
  }

  /**
   * Play an [AudioStream] at a given offset, volume and pitch scale. Playback starts immediately.
   * The return value is a unique integer ID that is associated to this playback stream and which
   * can be used to control it.
   * This ID becomes invalid when the stream ends (if it does not loop), when the
   * [AudioStreamPlaybackPolyphonic] is stopped, or when [stopStream] is called.
   * This function returns [constant INVALID_ID] if the amount of streams currently playing equals
   * [AudioStreamPolyphonic.polyphony]. If you need a higher amount of maximum polyphony, raise this
   * value.
   */
  @JvmOverloads
  public fun playStream(
    stream: AudioStream,
    fromOffset: Float = 0.0f,
    volumeDb: Float = 0.0f,
    pitchScale: Float = 1.0f,
  ): Long {
    TransferContext.writeArguments(OBJECT to stream, DOUBLE to fromOffset.toDouble(), DOUBLE to volumeDb.toDouble(), DOUBLE to pitchScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.playStreamPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Change the stream volume (in db). The [param stream] argument is an integer ID returned by
   * [playStream].
   */
  public fun setStreamVolume(stream: Long, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to stream, DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamVolumePtr, NIL)
  }

  /**
   * Change the stream pitch scale. The [param stream] argument is an integer ID returned by
   * [playStream].
   */
  public fun setStreamPitchScale(stream: Long, pitchScale: Float): Unit {
    TransferContext.writeArguments(LONG to stream, DOUBLE to pitchScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamPitchScalePtr, NIL)
  }

  /**
   * Return true whether the stream associated with an integer ID is still playing. Check
   * [playStream] for information on when this ID becomes invalid.
   */
  public fun isStreamPlaying(stream: Long): Boolean {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.isStreamPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Stop a stream. The [param stream] argument is an integer ID returned by [playStream], which
   * becomes invalid after calling this function.
   */
  public fun stopStream(stream: Long): Unit {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.stopStreamPtr, NIL)
  }

  public companion object {
    /**
     * Returned by [playStream] in case it could not allocate a stream for playback.
     */
    public final const val INVALID_ID: Long = -1
  }

  internal object MethodBindings {
    public val playStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "play_stream")

    public val setStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_volume")

    public val setStreamPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_pitch_scale")

    public val isStreamPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "is_stream_playing")

    public val stopStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "stop_stream")
  }
}
