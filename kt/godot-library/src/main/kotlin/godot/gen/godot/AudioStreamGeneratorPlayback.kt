// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This class is meant to be used with [AudioStreamGenerator] to play back the generated audio in
 * real-time.
 */
@GodotBaseType
public open class AudioStreamGeneratorPlayback internal constructor() :
    AudioStreamPlaybackResampled() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK, scriptIndex)
  }

  /**
   * Pushes a single audio data frame to the buffer. This is usually less efficient than
   * [pushBuffer] in C# and compiled languages via GDExtension, but [pushFrame] may be *more* efficient
   * in GDScript.
   */
  public fun pushFrame(frame: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to frame)
    TransferContext.callMethod(rawPtr, MethodBindings.pushFramePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a buffer of the size [amount] can be pushed to the audio sample data buffer
   * without overflowing it, `false` otherwise.
   */
  public fun canPushBuffer(amount: Int): Boolean {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.canPushBufferPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Pushes several audio data frames to the buffer. This is usually more efficient than [pushFrame]
   * in C# and compiled languages via GDExtension, but [pushBuffer] may be *less* efficient in
   * GDScript.
   */
  public fun pushBuffer(frames: PackedVector2Array): Boolean {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to frames)
    TransferContext.callMethod(rawPtr, MethodBindings.pushBufferPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the number of frames that can be pushed to the audio sample data buffer without
   * overflowing it. If the result is `0`, the buffer is full.
   */
  public fun getFramesAvailable(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesAvailablePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of times the playback skipped due to a buffer underrun in the audio sample
   * data. This value is reset at the start of the playback.
   */
  public fun getSkips(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkipsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Clears the audio sample data buffer.
   */
  public fun clearBuffer(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBufferPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val pushFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGeneratorPlayback", "push_frame")

    public val canPushBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGeneratorPlayback", "can_push_buffer")

    public val pushBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGeneratorPlayback", "push_buffer")

    public val getFramesAvailablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGeneratorPlayback", "get_frames_available")

    public val getSkipsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGeneratorPlayback", "get_skips")

    public val clearBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGeneratorPlayback", "clear_buffer")
  }
}
