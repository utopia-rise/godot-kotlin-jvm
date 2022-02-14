// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays audio with random pitch shifting.
 *
 * Randomly varies pitch on each start.
 */
@GodotBaseType
public open class AudioStreamRandomPitch : AudioStream() {
  /**
   * The current [godot.AudioStream].
   */
  public open var audioStream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMPITCH_GET_AUDIO_STREAM, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMPITCH_SET_AUDIO_STREAM, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * The intensity of random pitch variation.
   */
  public open var randomPitch: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMPITCH_GET_RANDOM_PITCH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMPITCH_SET_RANDOM_PITCH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMRANDOMPITCH)
  }

  public companion object
}
