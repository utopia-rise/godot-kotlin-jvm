// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
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
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(91, scriptIndex)
  }

  /**
   * Play an [AudioStream] at a given offset, volume, pitch scale, playback type, and bus. Playback
   * starts immediately.
   *
   * The return value is a unique integer ID that is associated to this playback stream and which
   * can be used to control it.
   *
   * This ID becomes invalid when the stream ends (if it does not loop), when the
   * [AudioStreamPlaybackPolyphonic] is stopped, or when [stopStream] is called.
   *
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
    playbackType: AudioServer.PlaybackType = AudioServer.PlaybackType.DEFAULT,
    bus: StringName = StringName("Master"),
  ): Long {
    TransferContext.writeArguments(OBJECT to stream, DOUBLE to fromOffset.toDouble(), DOUBLE to volumeDb.toDouble(), DOUBLE to pitchScale.toDouble(), LONG to playbackType.id, STRING_NAME to bus)
    TransferContext.callMethod(ptr, MethodBindings.playStreamPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Change the stream volume (in db). The [stream] argument is an integer ID returned by
   * [playStream].
   */
  public final fun setStreamVolume(stream: Long, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to stream, DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStreamVolumePtr, NIL)
  }

  /**
   * Change the stream pitch scale. The [stream] argument is an integer ID returned by [playStream].
   */
  public final fun setStreamPitchScale(stream: Long, pitchScale: Float): Unit {
    TransferContext.writeArguments(LONG to stream, DOUBLE to pitchScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStreamPitchScalePtr, NIL)
  }

  /**
   * Returns `true` if the stream associated with the given integer ID is still playing. Check
   * [playStream] for information on when this ID becomes invalid.
   */
  public final fun isStreamPlaying(stream: Long): Boolean {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(ptr, MethodBindings.isStreamPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Stop a stream. The [stream] argument is an integer ID returned by [playStream], which becomes
   * invalid after calling this function.
   */
  public final fun stopStream(stream: Long): Unit {
    TransferContext.writeArguments(LONG to stream)
    TransferContext.callMethod(ptr, MethodBindings.stopStreamPtr, NIL)
  }

  /**
   * Play an [AudioStream] at a given offset, volume, pitch scale, playback type, and bus. Playback
   * starts immediately.
   *
   * The return value is a unique integer ID that is associated to this playback stream and which
   * can be used to control it.
   *
   * This ID becomes invalid when the stream ends (if it does not loop), when the
   * [AudioStreamPlaybackPolyphonic] is stopped, or when [stopStream] is called.
   *
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
    playbackType: AudioServer.PlaybackType = AudioServer.PlaybackType.DEFAULT,
    bus: String,
  ): Long =
      playStream(stream, fromOffset, volumeDb, pitchScale, playbackType, bus.asCachedStringName())

  public companion object {
    /**
     * Returned by [playStream] in case it could not allocate a stream for playback.
     */
    public final const val INVALID_ID: Long = -1
  }

  public object MethodBindings {
    internal val playStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "play_stream", 1846744803)

    internal val setStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_volume", 1602489585)

    internal val setStreamPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "set_stream_pitch_scale", 1602489585)

    internal val isStreamPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "is_stream_playing", 1116898809)

    internal val stopStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaybackPolyphonic", "stop_stream", 1286410249)
  }
}
