// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays back audio generated using [godot.AudioStreamGenerator].
 *
 * Tutorials:
 * [https://godotengine.org/article/godot-32-will-get-new-audio-features](https://godotengine.org/article/godot-32-will-get-new-audio-features)
 *
 * This class is meant to be used with [godot.AudioStreamGenerator] to play back the generated audio in real-time.
 */
@GodotBaseType
public open class AudioStreamGeneratorPlayback internal constructor() :
    AudioStreamPlaybackResampled() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK)
  }

  /**
   * Pushes a single audio data frame to the buffer. This is usually less efficient than [pushBuffer] in C# and compiled languages via GDExtension, but [pushFrame] may be *more* efficient in GDScript.
   */
  public fun pushFrame(frame: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to frame)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_PUSH_FRAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a buffer of the size `amount` can be pushed to the audio sample data buffer without overflowing it, `false` otherwise.
   */
  public fun canPushBuffer(amount: Long): Boolean {
    TransferContext.writeArguments(LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_CAN_PUSH_BUFFER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Pushes several audio data frames to the buffer. This is usually more efficient than [pushFrame] in C# and compiled languages via GDExtension, but [pushBuffer] may be *less* efficient in GDScript.
   */
  public fun pushBuffer(frames: PackedVector2Array): Boolean {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to frames)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_PUSH_BUFFER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the number of audio data frames left to play. If this returned number reaches `0`, the audio will stop playing until frames are added again. Therefore, make sure your script can always generate and push new audio frames fast enough to avoid audio cracking.
   */
  public fun getFramesAvailable(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_GET_FRAMES_AVAILABLE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getSkips(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_GET_SKIPS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Clears the audio sample data buffer.
   */
  public fun clearBuffer(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_CLEAR_BUFFER, NIL)
  }

  public companion object
}
