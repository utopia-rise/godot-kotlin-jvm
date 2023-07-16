// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Stream peer handling GZIP and deflate compression/decompresison.
 *
 * This class allows to compress or decompress data using GZIP/deflate in a streaming fashion. This is particularly useful when compressing or decompressing files that has to be sent through the network without having to allocate them all in memory.
 *
 * After starting the stream via [startCompression] (or [startDecompression]), calling [godot.StreamPeer.putPartialData] on this stream will compress (or decompress) the data, writing it to the internal buffer. Calling [godot.StreamPeer.getAvailableBytes] will return the pending bytes in the internal buffer, and [godot.StreamPeer.getPartialData] will retrieve the compressed (or decompressed) bytes from it. When the stream is over, you must call [finish] to ensure the internal buffer is properly flushed (make sure to call [godot.StreamPeer.getAvailableBytes] on last time to check if more data needs to be read after that).
 */
@GodotBaseType
public open class StreamPeerGZIP : StreamPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERGZIP, scriptIndex)
    return true
  }

  /**
   * Start the stream in compression mode with the given [bufferSize], if [useDeflate] is `true` uses deflate instead of GZIP.
   */
  public fun startCompression(useDeflate: Boolean = false, bufferSize: Int = 65535): GodotError {
    TransferContext.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERGZIP_START_COMPRESSION,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Start the stream in decompression mode with the given [bufferSize], if [useDeflate] is `true` uses deflate instead of GZIP.
   */
  public fun startDecompression(useDeflate: Boolean = false, bufferSize: Int = 65535): GodotError {
    TransferContext.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERGZIP_START_DECOMPRESSION,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Finalizes the stream, compressing or decompressing any buffered chunk left.
   */
  public fun finish(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERGZIP_FINISH, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Clears this stream, resetting the internal state.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERGZIP_CLEAR, NIL)
  }

  public companion object
}
