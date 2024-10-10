// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_STREAMPEERGZIP_INDEX: Int = 555

/**
 * This class allows to compress or decompress data using GZIP/deflate in a streaming fashion. This
 * is particularly useful when compressing or decompressing files that have to be sent through the
 * network without needing to allocate them all in memory.
 * After starting the stream via [startCompression] (or [startDecompression]), calling
 * [StreamPeer.putPartialData] on this stream will compress (or decompress) the data, writing it to the
 * internal buffer. Calling [StreamPeer.getAvailableBytes] will return the pending bytes in the
 * internal buffer, and [StreamPeer.getPartialData] will retrieve the compressed (or decompressed)
 * bytes from it. When the stream is over, you must call [finish] to ensure the internal buffer is
 * properly flushed (make sure to call [StreamPeer.getAvailableBytes] on last time to check if more
 * data needs to be read after that).
 */
@GodotBaseType
public open class StreamPeerGZIP : StreamPeer() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_STREAMPEERGZIP_INDEX, scriptIndex)
  }

  /**
   * Start the stream in compression mode with the given [bufferSize], if [useDeflate] is `true`
   * uses deflate instead of GZIP.
   */
  @JvmOverloads
  public final fun startCompression(useDeflate: Boolean = false, bufferSize: Int = 65535): Error {
    Internals.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.startCompressionPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Start the stream in decompression mode with the given [bufferSize], if [useDeflate] is `true`
   * uses deflate instead of GZIP.
   */
  @JvmOverloads
  public final fun startDecompression(useDeflate: Boolean = false, bufferSize: Int = 65535): Error {
    Internals.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.startDecompressionPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Finalizes the stream, compressing or decompressing any buffered chunk left.
   */
  public final fun finish(): Error {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.finishPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Clears this stream, resetting the internal state.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val startCompressionPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerGZIP", "start_compression", 781582770)

    public val startDecompressionPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerGZIP", "start_decompression", 781582770)

    public val finishPtr: VoidPtr =
        Internals.getMethodBindPtr("StreamPeerGZIP", "finish", 166280745)

    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("StreamPeerGZIP", "clear", 3218959716)
  }
}
