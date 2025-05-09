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
import godot.core.PackedVector2Array
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Can play, loop, pause a scroll through audio. See [AudioStream] and [AudioStreamOggVorbis] for
 * usage.
 */
@GodotBaseType
public abstract class AudioStreamPlayback : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(87, scriptIndex)
  }

  /**
   * Override this method to customize what happens when the playback starts at the given position,
   * such as by calling [AudioStreamPlayer.play].
   */
  public open fun _start(fromPos: Double): Unit {
    throw NotImplementedError("AudioStreamPlayback::_start is not implemented.")
  }

  /**
   * Override this method to customize what happens when the playback is stopped, such as by calling
   * [AudioStreamPlayer.stop].
   */
  public open fun _stop(): Unit {
    throw NotImplementedError("AudioStreamPlayback::_stop is not implemented.")
  }

  /**
   * Overridable method. Should return `true` if this playback is active and playing its audio
   * stream.
   */
  public open fun _isPlaying(): Boolean {
    throw NotImplementedError("AudioStreamPlayback::_isPlaying is not implemented.")
  }

  /**
   * Overridable method. Should return how many times this audio stream has looped. Most built-in
   * playbacks always return `0`.
   */
  public open fun _getLoopCount(): Int {
    throw NotImplementedError("AudioStreamPlayback::_getLoopCount is not implemented.")
  }

  /**
   * Overridable method. Should return the current progress along the audio stream, in seconds.
   */
  public open fun _getPlaybackPosition(): Double {
    throw NotImplementedError("AudioStreamPlayback::_getPlaybackPosition is not implemented.")
  }

  /**
   * Override this method to customize what happens when seeking this audio stream at the given
   * [position], such as by calling [AudioStreamPlayer.seek].
   */
  public open fun _seek(position: Double): Unit {
    throw NotImplementedError("AudioStreamPlayback::_seek is not implemented.")
  }

  /**
   * Overridable method. Called whenever the audio stream is mixed if the playback is active and
   * [AudioServer.setEnableTaggingUsedAudioStreams] has been set to `true`. Editor plugins may use this
   * method to "tag" the current position along the audio stream and display it in a preview.
   */
  public open fun _tagUsedStreams(): Unit {
    throw NotImplementedError("AudioStreamPlayback::_tagUsedStreams is not implemented.")
  }

  /**
   * Set the current value of a playback parameter by name (see [AudioStream.GetParameterList]).
   */
  public open fun _setParameter(name: StringName, `value`: Any?): Unit {
    throw NotImplementedError("AudioStreamPlayback::_setParameter is not implemented.")
  }

  /**
   * Return the current value of a playback parameter by name (see [AudioStream.GetParameterList]).
   */
  public open fun _getParameter(name: StringName): Any? {
    throw NotImplementedError("AudioStreamPlayback::_getParameter is not implemented.")
  }

  /**
   * Associates [AudioSamplePlayback] to this [AudioStreamPlayback] for playing back the audio
   * sample of this stream.
   */
  public final fun setSamplePlayback(playbackSample: AudioSamplePlayback?): Unit {
    TransferContext.writeArguments(OBJECT to playbackSample)
    TransferContext.callMethod(ptr, MethodBindings.setSamplePlaybackPtr, NIL)
  }

  /**
   * Returns the [AudioSamplePlayback] associated with this [AudioStreamPlayback] for playing back
   * the audio sample of this stream.
   */
  public final fun getSamplePlayback(): AudioSamplePlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSamplePlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioSamplePlayback?)
  }

  /**
   * Mixes up to [frames] of audio from the stream from the current position, at a rate of
   * [rateScale], advancing the stream.
   *
   * Returns a [PackedVector2Array] where each element holds the left and right channel volume
   * levels of each frame.
   *
   * **Note:** Can return fewer frames than requested, make sure to use the size of the return
   * value.
   */
  public final fun mixAudio(rateScale: Float, frames: Int): PackedVector2Array {
    TransferContext.writeArguments(DOUBLE to rateScale.toDouble(), LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.mixAudioPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Starts the stream from the given [fromPos], in seconds.
   */
  @JvmOverloads
  public final fun start(fromPos: Double = 0.0): Unit {
    TransferContext.writeArguments(DOUBLE to fromPos)
    TransferContext.callMethod(ptr, MethodBindings.startPtr, NIL)
  }

  /**
   * Seeks the stream at the given [time], in seconds.
   */
  @JvmOverloads
  public final fun seek(time: Double = 0.0): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(ptr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops the stream.
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns the number of times the stream has looped.
   */
  public final fun getLoopCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the current position in the stream, in seconds.
   */
  public final fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns `true` if the stream is playing.
   */
  public final fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setSamplePlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "set_sample_playback", 3195455091)

    internal val getSamplePlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "get_sample_playback", 3482738536)

    internal val mixAudioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "mix_audio", 3341291446)

    internal val startPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "start", 1958160172)

    internal val seekPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "seek", 1958160172)

    internal val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "stop", 3218959716)

    internal val getLoopCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "get_loop_count", 3905245786)

    internal val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "get_playback_position", 1740695150)

    internal val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "is_playing", 36873697)
  }
}
