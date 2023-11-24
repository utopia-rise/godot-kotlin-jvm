// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Provides functionality for computing cryptographic hashes chunk by chunk.
 *
 * The HashingContext class provides an interface for computing cryptographic hashes over multiple iterations. Useful for computing hashes of big files (so you don't have to load them all in memory), network streams, and data streams in general (so you don't have to hold buffers).
 *
 * The [enum HashType] enum shows the supported hashing algorithms.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * const CHUNK_SIZE = 1024
 *
 *
 *
 * func hash_file(path):
 *
 *     # Check that file exists.
 *
 *     if not FileAccess.file_exists(path):
 *
 *         return
 *
 *     # Start a SHA-256 context.
 *
 *     var ctx = HashingContext.new()
 *
 *     ctx.start(HashingContext.HASH_SHA256)
 *
 *     # Open the file to hash.
 *
 *     var file = FileAccess.open(path, FileAccess.READ)
 *
 *     # Update the context after reading each chunk.
 *
 *     while not file.eof_reached():
 *
 *         ctx.update(file.get_buffer(CHUNK_SIZE))
 *
 *     # Get the computed hash.
 *
 *     var res = ctx.finish()
 *
 *     # Print the result as hex string and array.
 *
 *     printt(res.hex_encode(), Array(res))
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public const int ChunkSize = 1024;
 *
 *
 *
 * public void HashFile(string path)
 *
 * {
 *
 *     // Check that file exists.
 *
 *     if (!FileAccess.FileExists(path))
 *
 *     {
 *
 *         return;
 *
 *     }
 *
 *     // Start a SHA-256 context.
 *
 *     var ctx = new HashingContext();
 *
 *     ctx.Start(HashingContext.HashType.Sha256);
 *
 *     // Open the file to hash.
 *
 *     using var file = FileAccess.Open(path, FileAccess.ModeFlags.Read);
 *
 *     // Update the context after reading each chunk.
 *
 *     while (!file.EofReached())
 *
 *     {
 *
 *         ctx.Update(file.GetBuffer(ChunkSize));
 *
 *     }
 *
 *     // Get the computed hash.
 *
 *     byte[] res = ctx.Finish();
 *
 *     // Print the result as hex string and array.
 *
 *     GD.PrintT(res.HexEncode(), (Variant)res);
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class HashingContext : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HASHINGCONTEXT, scriptIndex)
    return true
  }

  /**
   * Starts a new hash computation of the given [type] (e.g. [godot.HASH_SHA256] to start computation of a SHA-256).
   */
  public fun start(type: HashType): GodotError {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Updates the computation with the given [chunk] of data.
   */
  public fun update(chunk: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to chunk)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the current context, and return the computed hash.
   */
  public fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.finishPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public enum class HashType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("HashingContext", "start")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("HashingContext", "update")

    public val finishPtr: VoidPtr = TypeManager.getMethodBindPtr("HashingContext", "finish")
  }
}
