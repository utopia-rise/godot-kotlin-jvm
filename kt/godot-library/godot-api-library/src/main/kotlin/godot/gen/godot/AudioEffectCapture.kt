// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTCAPTURE_INDEX: Int = 84

/**
 * AudioEffectCapture is an AudioEffect which copies all audio frames from the attached audio effect
 * bus into its internal ring buffer.
 * Application code should consume these audio frames from this ring buffer using [getBuffer] and
 * process it as needed, for example to capture data from an [AudioStreamMicrophone], implement
 * application-defined effects, or to transmit audio over the network. When capturing audio data from a
 * microphone, the format of the samples will be stereo 32-bit floating-point PCM.
 * Unlike [AudioEffectRecord], this effect only returns the raw audio samples instead of encoding
 * them into an [AudioStream].
 */
@GodotBaseType
public open class AudioEffectCapture : AudioEffect() {
  /**
   * Length of the internal ring buffer, in seconds. Setting the buffer length will have no effect
   * if already initialized.
   */
  public final inline var bufferLength: Float
    @JvmName("bufferLengthProperty")
    get() = getBufferLength()
    @JvmName("bufferLengthProperty")
    set(`value`) {
      setBufferLength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTCAPTURE_INDEX, scriptIndex)
  }

  /**
   * Returns `true` if at least [frames] audio frames are available to read in the internal ring
   * buffer.
   */
  public final fun canGetBuffer(frames: Int): Boolean {
    Internals.writeArguments(LONG to frames.toLong())
    Internals.callMethod(rawPtr, MethodBindings.canGetBufferPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Gets the next [frames] audio samples from the internal ring buffer.
   * Returns a [PackedVector2Array] containing exactly [frames] audio samples if available, or an
   * empty [PackedVector2Array] if insufficient data was available.
   * The samples are signed floating-point PCM between `-1` and `1`. You will have to scale them if
   * you want to use them as 8 or 16-bit integer samples. (`v = 0x7fff * samples[0].x`)
   */
  public final fun getBuffer(frames: Int): PackedVector2Array {
    Internals.writeArguments(LONG to frames.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBufferPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Clears the internal ring buffer.
   * **Note:** Calling this during a capture can cause the loss of samples which causes popping in
   * the playback.
   */
  public final fun clearBuffer(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBufferPtr, NIL)
  }

  public final fun setBufferLength(bufferLengthSeconds: Float): Unit {
    Internals.writeArguments(DOUBLE to bufferLengthSeconds.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBufferLengthPtr, NIL)
  }

  public final fun getBufferLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBufferLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the number of frames available to read using [getBuffer].
   */
  public final fun getFramesAvailable(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFramesAvailablePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of audio frames discarded from the audio bus due to full buffer.
   */
  public final fun getDiscardedFrames(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDiscardedFramesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the total size of the internal ring buffer in frames.
   */
  public final fun getBufferLengthFrames(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBufferLengthFramesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of audio frames inserted from the audio bus.
   */
  public final fun getPushedFrames(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPushedFramesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val canGetBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "can_get_buffer", 1116898809)

    internal val getBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "get_buffer", 2649534757)

    internal val clearBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "clear_buffer", 3218959716)

    internal val setBufferLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "set_buffer_length", 373806689)

    internal val getBufferLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "get_buffer_length", 191475506)

    internal val getFramesAvailablePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "get_frames_available", 3905245786)

    internal val getDiscardedFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "get_discarded_frames", 3905245786)

    internal val getBufferLengthFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "get_buffer_length_frames", 3905245786)

    internal val getPushedFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCapture", "get_pushed_frames", 3905245786)
  }
}
