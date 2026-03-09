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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This is a stream that can be fitted with sub-streams, which will be played in-sync. The streams
 * begin at exactly the same time when play is pressed, and will end when the last of them ends. If one
 * of the sub-streams loops, then playback will continue.
 */
@GodotBaseType
public open class AudioStreamSynchronized : AudioStream() {
  /**
   * Set the total amount of streams that will be played back synchronized.
   */
  public final inline var streamCount: Int
    @JvmName("streamCountProperty")
    get() = getStreamCount()
    @JvmName("streamCountProperty")
    set(`value`) {
      setStreamCount(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(101, scriptPtr)
  }

  public final fun setStreamCount(streamCount: Int): Unit {
    TransferContext.writeArguments(LONG to streamCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStreamCountPtr, NIL)
  }

  public final fun getStreamCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Set one of the synchronized streams, by index.
   */
  public final fun setSyncStream(streamIndex: Int, audioStream: AudioStream?): Unit {
    TransferContext.writeArguments(LONG to streamIndex.toLong(), OBJECT to audioStream)
    TransferContext.callMethod(ptr, MethodBindings.setSyncStreamPtr, NIL)
  }

  /**
   * Get one of the synchronized streams, by index.
   */
  public final fun getSyncStream(streamIndex: Int): AudioStream? {
    TransferContext.writeArguments(LONG to streamIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSyncStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStream?)
  }

  /**
   * Set the volume of one of the synchronized streams, by index.
   */
  public final fun setSyncStreamVolume(streamIndex: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to streamIndex.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSyncStreamVolumePtr, NIL)
  }

  /**
   * Get the volume of one of the synchronized streams, by index.
   */
  public final fun getSyncStreamVolume(streamIndex: Int): Float {
    TransferContext.writeArguments(LONG to streamIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSyncStreamVolumePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object {
    /**
     * Maximum amount of streams that can be synchronized.
     */
    public final const val MAX_STREAMS: Long = 32
  }

  public object MethodBindings {
    internal val setStreamCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "set_stream_count", 1286410249)

    internal val getStreamCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "get_stream_count", 3905245786)

    internal val setSyncStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "set_sync_stream", 111075094)

    internal val getSyncStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "get_sync_stream", 2739380747)

    internal val setSyncStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "set_sync_stream_volume", 1602489585)

    internal val getSyncStreamVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamSynchronized", "get_sync_stream_volume", 2339986948)
  }
}
