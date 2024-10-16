// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Can play, loop, pause a scroll through audio. See [AudioStream] and [AudioStreamOggVorbis] for
 * usage.
 */
@GodotBaseType
public open class AudioStreamPlayback : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_AUDIOSTREAMPLAYBACK, this, scriptIndex)
  }

  /**
   * Override this method to customize what happens when the playback starts at the given position,
   * such as by calling [AudioStreamPlayer.play].
   */
  public open fun _start(fromPos: Double): Unit {
  }

  /**
   * Override this method to customize what happens when the playback is stopped, such as by calling
   * [AudioStreamPlayer.stop].
   */
  public open fun _stop(): Unit {
  }

  /**
   * Overridable method. Should return `true` if this playback is active and playing its audio
   * stream.
   */
  public open fun _isPlaying(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for AudioStreamPlayback")
  }

  /**
   * Overridable method. Should return how many times this audio stream has looped. Most built-in
   * playbacks always return `0`.
   */
  public open fun _getLoopCount(): Int {
    throw NotImplementedError("_get_loop_count is not implemented for AudioStreamPlayback")
  }

  /**
   * Overridable method. Should return the current progress along the audio stream, in seconds.
   */
  public open fun _getPlaybackPosition(): Double {
    throw NotImplementedError("_get_playback_position is not implemented for AudioStreamPlayback")
  }

  /**
   * Override this method to customize what happens when seeking this audio stream at the given
   * [position], such as by calling [AudioStreamPlayer.seek].
   */
  public open fun _seek(position: Double): Unit {
  }

  /**
   * Overridable method. Called whenever the audio stream is mixed if the playback is active and
   * [AudioServer.setEnableTaggingUsedAudioStreams] has been set to `true`. Editor plugins may use this
   * method to "tag" the current position along the audio stream and display it in a preview.
   */
  public open fun _tagUsedStreams(): Unit {
  }

  /**
   * Set the current value of a playback parameter by name (see [AudioStream.GetParameterList]).
   */
  public open fun _setParameter(name: StringName, `value`: Any?): Unit {
  }

  /**
   * Return the current value of a playback parameter by name (see [AudioStream.GetParameterList]).
   */
  public open fun _getParameter(name: StringName): Any? {
    throw NotImplementedError("_get_parameter is not implemented for AudioStreamPlayback")
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

  public companion object

  internal object MethodBindings {
    public val setSamplePlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "set_sample_playback", 3195455091)

    public val getSamplePlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "get_sample_playback", 3482738536)
  }
}
