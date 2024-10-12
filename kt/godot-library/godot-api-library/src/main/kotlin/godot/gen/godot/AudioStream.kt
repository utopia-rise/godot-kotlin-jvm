// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_AUDIOSTREAM_INDEX: Int = 114

/**
 * Base class for audio streams. Audio streams are used for sound effects and music playback, and
 * support WAV (via [AudioStreamWAV]) and Ogg (via [AudioStreamOggVorbis]) file formats.
 */
@GodotBaseType
public open class AudioStream : Resource() {
  /**
   * Signal to be emitted to notify when the parameter list changed.
   */
  public val parameterListChanged: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAM_INDEX, scriptIndex)
  }

  /**
   * Override this method to customize the returned value of [instantiatePlayback]. Should returned
   * a new [AudioStreamPlayback] created when the stream is played (such as by an
   * [AudioStreamPlayer])..
   */
  public open fun _instantiatePlayback(): AudioStreamPlayback? {
    throw NotImplementedError("_instantiate_playback is not implemented for AudioStream")
  }

  /**
   * Override this method to customize the name assigned to this audio stream. Unused by the engine.
   */
  public open fun _getStreamName(): String {
    throw NotImplementedError("_get_stream_name is not implemented for AudioStream")
  }

  /**
   * Override this method to customize the returned value of [getLength]. Should return the length
   * of this audio stream, in seconds.
   */
  public open fun _getLength(): Double {
    throw NotImplementedError("_get_length is not implemented for AudioStream")
  }

  /**
   * Override this method to customize the returned value of [isMonophonic]. Should return `true` if
   * this audio stream only supports one channel.
   */
  public open fun _isMonophonic(): Boolean {
    throw NotImplementedError("_is_monophonic is not implemented for AudioStream")
  }

  /**
   * Overridable method. Should return the tempo of this audio stream, in beats per minute (BPM).
   * Used by the engine to determine the position of every beat.
   * Ideally, the returned value should be based off the stream's sample rate
   * ([AudioStreamWAV.mixRate], for example).
   */
  public open fun _getBpm(): Double {
    throw NotImplementedError("_get_bpm is not implemented for AudioStream")
  }

  /**
   * Overridable method. Should return the total number of beats of this audio stream. Used by the
   * engine to determine the position of every beat.
   * Ideally, the returned value should be based off the stream's sample rate
   * ([AudioStreamWAV.mixRate], for example).
   */
  public open fun _getBeatCount(): Int {
    throw NotImplementedError("_get_beat_count is not implemented for AudioStream")
  }

  /**
   * Return the controllable parameters of this stream. This array contains dictionaries with a
   * property info description format (see [Object.getPropertyList]). Additionally, the default value
   * for this parameter must be added tho each dictionary in "default_value" field.
   */
  public open fun _getParameterList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_parameter_list is not implemented for AudioStream")
  }

  /**
   * Returns the length of the audio stream in seconds.
   */
  public final fun getLength(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns `true` if this audio stream only supports one channel (*monophony*), or `false` if the
   * audio stream supports two or more channels (*polyphony*).
   */
  public final fun isMonophonic(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMonophonicPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a newly created [AudioStreamPlayback] intended to play this audio stream. Useful for
   * when you want to extend [_instantiatePlayback] but call [instantiatePlayback] from an internally
   * held AudioStream subresource. An example of this can be found in the source code for
   * `AudioStreamRandomPitch::instantiate_playback`.
   */
  public final fun instantiatePlayback(): AudioStreamPlayback? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.instantiatePlaybackPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioStreamPlayback?)
  }

  /**
   * Returns if the current [AudioStream] can be used as a sample. Only static streams can be
   * sampled.
   */
  public final fun canBeSampled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.canBeSampledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Generates an [AudioSample] based on the current stream.
   */
  public final fun generateSample(): AudioSample? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.generateSamplePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioSample?)
  }

  /**
   * Returns `true` if the stream is a collection of other streams, `false` otherwise.
   */
  public final fun isMetaStream(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMetaStreamPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val getLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStream", "get_length", 1740695150)

    internal val isMonophonicPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStream", "is_monophonic", 36873697)

    internal val instantiatePlaybackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStream", "instantiate_playback", 210135309)

    internal val canBeSampledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStream", "can_be_sampled", 36873697)

    internal val generateSamplePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStream", "generate_sample", 2646048999)

    internal val isMetaStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStream", "is_meta_stream", 36873697)
  }
}
