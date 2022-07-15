// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.POOL_BYTE_ARRAY
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Context to compute cryptographic hashes over multiple iterations.
 *
 * The HashingContext class provides an interface for computing cryptographic hashes over multiple iterations. This is useful for example when computing hashes of big files (so you don't have to load them all in memory), network streams, and data streams in general (so you don't have to hold buffers).
 *
 * The [enum HashType] enum shows the supported hashing algorithms.
 *
 * ```
 * 		const CHUNK_SIZE = 1024
 *
 * 		func hash_file(path):
 * 		    var ctx = HashingContext.new()
 * 		    var file = File.new()
 * 		    # Start a SHA-256 context.
 * 		    ctx.start(HashingContext.HASH_SHA256)
 * 		    # Check that file exists.
 * 		    if not file.file_exists(path):
 * 		        return
 * 		    # Open the file to hash.
 * 		    file.open(path, File.READ)
 * 		    # Update the context after reading each chunk.
 * 		    while not file.eof_reached():
 * 		        ctx.update(file.get_buffer(CHUNK_SIZE))
 * 		    # Get the computed hash.
 * 		    var res = ctx.finish()
 * 		    # Print the result as hex string and array.
 * 		    printt(res.hex_encode(), Array(res))
 * 		```
 */
@GodotBaseType
public open class HashingContext : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HASHINGCONTEXT)
  }

  /**
   * Closes the current context, and return the computed hash.
   */
  public open fun finish(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_FINISH,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Starts a new hash computation of the given `type` (e.g. [godot.HASH_SHA256] to start computation of a SHA-256).
   */
  public open fun start(type: Long): GodotError {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Updates the computation with the given `chunk` of data.
   */
  public open fun update(chunk: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to chunk)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class HashType(
    id: Long
  ) {
    /**
     * Hashing algorithm: MD5.
     */
    HASH_MD5(0),
    /**
     * Hashing algorithm: SHA-1.
     */
    HASH_SHA1(1),
    /**
     * Hashing algorithm: SHA-256.
     */
    HASH_SHA256(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Hashing algorithm: MD5.
     */
    public final const val HASH_MD5: Long = 0

    /**
     * Hashing algorithm: SHA-1.
     */
    public final const val HASH_SHA1: Long = 1

    /**
     * Hashing algorithm: SHA-256.
     */
    public final const val HASH_SHA256: Long = 2
  }
}
