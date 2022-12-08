// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Context to compute cryptographic hashes over multiple iterations.
 *
 * The HashingContext class provides an interface for computing cryptographic hashes over multiple iterations. This is useful for example when computing hashes of big files (so you don't have to load them all in memory), network streams, and data streams in general (so you don't have to hold buffers).
 *
 * The [enum HashType] enum shows the supported hashing algorithms.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * const CHUNK_SIZE = 102
 *
 *
 *
 * func hash_file(path):
 *
 *     var ctx = HashingContext.new()
 *
 *     var file = File.new()
 *
 *     # Start a SHA-256 context.
 *
 *     ctx.start(HashingContext.HASH_SHA256)
 *
 *     # Check that file exists.
 *
 *     if not file.file_exists(path):
 *
 *         return
 *
 *     # Open the file to hash.
 *
 *     file.open(path, File.READ)
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
 *     var ctx = new HashingContext();
 *
 *     var file = new File();
 *
 *     // Start a SHA-256 context.
 *
 *     ctx.Start(HashingContext.HashType.Sha256);
 *
 *     // Check that file exists.
 *
 *     if (!file.FileExists(path))
 *
 *     {
 *
 *         return;
 *
 *     }
 *
 *     // Open the file to hash.
 *
 *     file.Open(path, File.ModeFlags.Read);
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
 *
 *
 *     GD.PrintT(res.HexEncode(), res);
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
  public fun start(type: HashingContext.HashType): GodotError {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Updates the computation with the given [chunk] of data.
   */
  public fun update(chunk: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to chunk)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Closes the current context, and return the computed hash.
   */
  public fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_FINISH,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
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

  public companion object
}
