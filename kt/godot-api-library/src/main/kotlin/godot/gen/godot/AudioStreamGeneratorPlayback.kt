// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
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
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMGENERATORPLAYBACK_INDEX, scriptIndex)
  }

  /**
   * Pushes a single audio data frame to the buffer. This is usually less efficient than
   * [pushBuffer] in C# and compiled languages via GDExtension, but [pushFrame] may be *more* efficient
   * in GDScript.
   */
  public final fun pushFrame(frame: Vector2): Boolean {
    Internals.writeArguments(VECTOR2 to frame)
    Internals.callMethod(rawPtr, MethodBindings.pushFramePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a buffer of the size [amount] can be pushed to the audio sample data buffer
   * without overflowing it, `false` otherwise.
   */
  public final fun canPushBuffer(amount: Int): Boolean {
    Internals.writeArguments(LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.canPushBufferPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Pushes several audio data frames to the buffer. This is usually more efficient than [pushFrame]
   * in C# and compiled languages via GDExtension, but [pushBuffer] may be *less* efficient in
   * GDScript.
   */
  public final fun pushBuffer(frames: PackedVector2Array): Boolean {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to frames)
    Internals.callMethod(rawPtr, MethodBindings.pushBufferPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of frames that can be pushed to the audio sample data buffer without
   * overflowing it. If the result is `0`, the buffer is full.
   */
  public final fun getFramesAvailable(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFramesAvailablePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of times the playback skipped due to a buffer underrun in the audio sample
   * data. This value is reset at the start of the playback.
   */
  public final fun getSkips(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkipsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears the audio sample data buffer.
   */
  public final fun clearBuffer(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBufferPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val pushFramePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGeneratorPlayback", "push_frame", 3975407249)

    public val canPushBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGeneratorPlayback", "can_push_buffer", 1116898809)

    public val pushBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGeneratorPlayback", "push_buffer", 1361156557)

    public val getFramesAvailablePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGeneratorPlayback", "get_frames_available", 3905245786)

    public val getSkipsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGeneratorPlayback", "get_skips", 3905245786)

    public val clearBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamGeneratorPlayback", "clear_buffer", 3218959716)
  }
}
