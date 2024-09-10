// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This is a stream that can be fitted with sub-streams, which will be played in-sync. The streams
 * being at exactly the same time when play is pressed, and will end when the last of them ends. If one
 * of the sub-streams loops, then playback will continue.
 */
@GodotBaseType
public open class AudioStreamSynchronized : AudioStream() {
  /**
   * Set the total amount of streams that will be played back synchronized.
   */
  public var streamCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamCountPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMSYNCHRONIZED, scriptIndex)
  }

  /**
   * Set one of the synchronized streams, by index.
   */
  public fun setSyncStream(streamIndex: Int, audioStream: AudioStream): Unit {
    TransferContext.writeArguments(LONG to streamIndex.toLong(), OBJECT to audioStream)
    TransferContext.callMethod(rawPtr, MethodBindings.setSyncStreamPtr, NIL)
  }

  /**
   * Get one of the synchronized streams, by index.
   */
  public fun getSyncStream(streamIndex: Int): AudioStream? {
    TransferContext.writeArguments(LONG to streamIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSyncStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
  }

  /**
   * Set the volume of one of the synchronized streams, by index.
   */
  public fun setSyncStreamVolume(streamIndex: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to streamIndex.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSyncStreamVolumePtr, NIL)
  }

  /**
   * Get the volume of one of the synchronized streams, by index.
   */
  public fun getSyncStreamVolume(streamIndex: Int): Float {
    TransferContext.writeArguments(LONG to streamIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSyncStreamVolumePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object {
    /**
     * Maximum amount of streams that can be synchronized.
     */
    public final const val MAX_STREAMS: Long = 32
  }

  internal object MethodBindings {
    public val setStreamCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "set_stream_count", 1286410249)

    public val getStreamCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "get_stream_count", 3905245786)

    public val setSyncStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "set_sync_stream", 111075094)

    public val getSyncStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "get_sync_stream", 2739380747)

    public val setSyncStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "set_sync_stream_volume", 1602489585)

    public val getSyncStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "get_sync_stream_volume", 2339986948)
  }
}
