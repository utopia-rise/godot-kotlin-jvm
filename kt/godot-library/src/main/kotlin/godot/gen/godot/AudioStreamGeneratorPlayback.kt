// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 *
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/tree/master/audio/generator](https://github.com/godotengine/godot-demo-projects/tree/master/audio/generator)
 */
@GodotBaseType
open class AudioStreamGeneratorPlayback : AudioStreamPlaybackResampled() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   *
   */
  open fun canPushBuffer(amount: Long): Boolean {
    TransferContext.writeArguments(LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_CAN_PUSH_BUFFER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  open fun clearBuffer() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_CLEAR_BUFFER, NIL)
  }

  /**
   *
   */
  open fun getFramesAvailable(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_GET_FRAMES_AVAILABLE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  open fun getSkips(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_GET_SKIPS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  open fun pushBuffer(frames: PoolVector2Array): Boolean {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to frames)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_PUSH_BUFFER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  open fun pushFrame(frame: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to frame)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMGENERATORPLAYBACK_PUSH_FRAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
