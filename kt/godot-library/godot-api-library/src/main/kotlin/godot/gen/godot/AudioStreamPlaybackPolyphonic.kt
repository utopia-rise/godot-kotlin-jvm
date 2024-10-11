// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_INDEX: Int = 125

/**
 * Playback instance for [AudioStreamPolyphonic]. After setting the `stream` property of
 * [AudioStreamPlayer], [AudioStreamPlayer2D], or [AudioStreamPlayer3D], the playback instance can be
 * obtained by calling [AudioStreamPlayer.getStreamPlayback], [AudioStreamPlayer2D.getStreamPlayback]
 * or [AudioStreamPlayer3D.getStreamPlayback] methods.
 */
@GodotBaseType
public open class AudioStreamPlaybackPolyphonic internal constructor() : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMPLAYBACKPOLYPHONIC_INDEX, scriptIndex)
  }

  /**
   * Play an [AudioStream] at a given offset, volume, pitch scale, playback type, and bus. Playback
   * starts immediately.
   * The return value is a unique integer ID that is associated to this playback stream and which
   * can be used to control it.
   * This ID becomes invalid when the stream ends (if it does not loop), when the
   * [AudioStreamPlaybackPolyphonic] is stopped, or when [stopStream] is called.
   * This function returns [INVALID_ID] if the amount of streams currently playing equals
   * [AudioStreamPolyphonic.polyphony]. If you need a higher amount of maximum polyphony, raise this
   * value.
   */
  @JvmOverloads
  public final fun playStream(
    stream: AudioStream?,
    fromOffset: Float = 0.0f,
    volumeDb: Float = 0.0f,
    pitchScale: Float = 1.0f,
    playbackType: AudioServer.PlaybackType = AudioServer.PlaybackType.PLAYBACK_TYPE_DEFAULT,
    bus: StringName = StringName("Master"),
  ): Long {
    Internals.writeArguments(OBJECT to stream, DOUBLE to fromOffset.toDouble(), DOUBLE to volumeDb.toDouble(), DOUBLE to pitchScale.toDouble(), LONG to playbackType.id, STRING_NAME to bus)
    Internals.callMethod(rawPtr, MethodBindings.playStreamPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Change the stream volume (in db). The [stream] argument is an integer ID returned by
   * [playStream].
   */
  public final fun setStreamVolume(stream: Long, volumeDb: Float): Unit {
    Internals.writeArguments(LONG to stream, DOUBLE to volumeDb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setStreamVolumePtr, NIL)
  }

  /**
   * Change the stream pitch scale. The [stream] argument is an integer ID returned by [playStream].
   */
  public final fun setStreamPitchScale(stream: Long, pitchScale: Float): Unit {
    Internals.writeArguments(LONG to stream, DOUBLE to pitchScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setStreamPitchScalePtr, NIL)
  }

  /**
   * Return true whether the stream associated with an integer ID is still playing. Check
   * [playStream] for information on when this ID becomes invalid.
   */
  public final fun isStreamPlaying(stream: Long): Boolean {
    Internals.writeArguments(LONG to stream)
    Internals.callMethod(rawPtr, MethodBindings.isStreamPlayingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Stop a stream. The [stream] argument is an integer ID returned by [playStream], which becomes
   * invalid after calling this function.
   */
  public final fun stopStream(stream: Long): Unit {
    Internals.writeArguments(LONG to stream)
    Internals.callMethod(rawPtr, MethodBindings.stopStreamPtr, NIL)
  }

  public companion object {
    /**
     * Returned by [playStream] in case it could not allocate a stream for playback.
     */
    public final const val INVALID_ID: Long = -1
  }

  public object MethodBindings {
    internal val playStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "play_stream", 1846744803)

    internal val setStreamVolumePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_volume", 1602489585)

    internal val setStreamPitchScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_pitch_scale", 1602489585)

    internal val isStreamPlayingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "is_stream_playing", 1116898809)

    internal val stopStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "stop_stream", 1286410249)
  }
}
