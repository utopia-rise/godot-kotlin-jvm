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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * AudioEffectCapture is an AudioEffect which copies all audio frames from the attached audio effect
 * bus into its internal ring buffer.
 *
 * Application code should consume these audio frames from this ring buffer using [getBuffer] and
 * process it as needed, for example to capture data from an [AudioStreamMicrophone], implement
 * application-defined effects, or to transmit audio over the network. When capturing audio data from a
 * microphone, the format of the samples will be stereo 32-bit floating-point PCM.
 *
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
    createNativeObject(49, scriptIndex)
  }

  /**
   * Returns `true` if at least [frames] audio frames are available to read in the internal ring
   * buffer.
   */
  public final fun canGetBuffer(frames: Int): Boolean {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.canGetBufferPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Gets the next [frames] audio samples from the internal ring buffer.
   *
   * Returns a [PackedVector2Array] containing exactly [frames] audio samples if available, or an
   * empty [PackedVector2Array] if insufficient data was available.
   *
   * The samples are signed floating-point PCM between `-1` and `1`. You will have to scale them if
   * you want to use them as 8 or 16-bit integer samples. (`v = 0x7fff * samples[0].x`)
   */
  public final fun getBuffer(frames: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBufferPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Clears the internal ring buffer.
   *
   * **Note:** Calling this during a capture can cause the loss of samples which causes popping in
   * the playback.
   */
  public final fun clearBuffer(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBufferPtr, NIL)
  }

  public final fun setBufferLength(bufferLengthSeconds: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bufferLengthSeconds.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBufferLengthPtr, NIL)
  }

  public final fun getBufferLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the number of frames available to read using [getBuffer].
   */
  public final fun getFramesAvailable(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFramesAvailablePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of audio frames discarded from the audio bus due to full buffer.
   */
  public final fun getDiscardedFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDiscardedFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the total size of the internal ring buffer in frames.
   */
  public final fun getBufferLengthFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferLengthFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of audio frames inserted from the audio bus.
   */
  public final fun getPushedFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPushedFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val canGetBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "can_get_buffer", 1116898809)

    internal val getBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_buffer", 2649534757)

    internal val clearBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "clear_buffer", 3218959716)

    internal val setBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "set_buffer_length", 373806689)

    internal val getBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_buffer_length", 191475506)

    internal val getFramesAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_frames_available", 3905245786)

    internal val getDiscardedFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_discarded_frames", 3905245786)

    internal val getBufferLengthFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_buffer_length_frames", 3905245786)

    internal val getPushedFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCapture", "get_pushed_frames", 3905245786)
  }
}
