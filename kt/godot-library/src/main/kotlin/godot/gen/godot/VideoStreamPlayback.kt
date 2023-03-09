// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Internal class used by [godot.VideoStream] to manage playback state when played from a [godot.VideoStreamPlayer].
 *
 * This class is intended to be overridden by video decoder extensions with custom implementations of [godot.VideoStream].
 */
@GodotBaseType
public open class VideoStreamPlayback : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIDEOSTREAMPLAYBACK, scriptIndex)
    return true
  }

  /**
   * Stops playback. May be called multiple times before [_play], or in response to [godot.VideoStreamPlayer.stop]. [_isPlaying] should return false once stopped.
   */
  public open fun _stop(): Unit {
  }

  /**
   * Called in response to [godot.VideoStreamPlayer.autoplay] or [godot.VideoStreamPlayer.play]. Note that manual playback may also invoke [_stop] multiple times before this method is called. [_isPlaying] should return true once playing.
   */
  public open fun _play(): Unit {
  }

  /**
   * Returns the playback state, as determined by calls to [_play] and [_stop].
   */
  public open fun _isPlaying(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for VideoStreamPlayback")
  }

  /**
   * Set the paused status of video playback. [_isPaused] must return `paused`. Called in response to the [godot.VideoStreamPlayer.paused] setter.
   */
  public open fun _setPaused(paused: Boolean): Unit {
  }

  /**
   * Returns the paused status, as set by [_setPaused].
   */
  public open fun _isPaused(): Boolean {
    throw NotImplementedError("_is_paused is not implemented for VideoStreamPlayback")
  }

  /**
   * Returns the video duration in seconds, if known, or 0 if unknown.
   */
  public open fun _getLength(): Double {
    throw NotImplementedError("_get_length is not implemented for VideoStreamPlayback")
  }

  /**
   * Return the current playback timestamp. Called in response to the [godot.VideoStreamPlayer.streamPosition] getter.
   */
  public open fun _getPlaybackPosition(): Double {
    throw NotImplementedError("_get_playback_position is not implemented for VideoStreamPlayback")
  }

  /**
   * Seeks to `time` seconds. Called in response to the [godot.VideoStreamPlayer.streamPosition] setter.
   */
  public open fun _seek(time: Double): Unit {
  }

  /**
   * Select the audio track `idx`. Called when playback starts, and in response to the [godot.VideoStreamPlayer.audioTrack] setter.
   */
  public open fun _setAudioTrack(idx: Long): Unit {
  }

  /**
   * Allocates a [godot.Texture2D] in which decoded video frames will be drawn.
   */
  public open fun _getTexture(): Texture2D? {
    throw NotImplementedError("_get_texture is not implemented for VideoStreamPlayback")
  }

  /**
   * Ticks video playback for `delta` seconds. Called every frame as long as [_isPaused] and [_isPlaying] return true.
   */
  public open fun _update(delta: Double): Unit {
  }

  /**
   * Returns the number of audio channels.
   */
  public open fun _getChannels(): Long {
    throw NotImplementedError("_get_channels is not implemented for VideoStreamPlayback")
  }

  /**
   * Returns the audio sample rate used for mixing.
   */
  public open fun _getMixRate(): Long {
    throw NotImplementedError("_get_mix_rate is not implemented for VideoStreamPlayback")
  }

  /**
   * Render `num_frames` audio frames (of [_getChannels] floats each) from `buffer`, starting from index `offset` in the array. Returns the number of audio frames rendered, or -1 on error.
   */
  public fun mixAudio(
    numFrames: Long,
    buffer: PackedFloat32Array = PackedFloat32Array(),
    offset: Long = 0,
  ): Long {
    TransferContext.writeArguments(LONG to numFrames, PACKED_FLOAT_32_ARRAY to buffer, LONG to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYBACK_MIX_AUDIO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
