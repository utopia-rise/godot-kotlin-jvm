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
import godot.core.Error
import godot.core.GodotEnum
import godot.core.PackedByteArray
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * The HashingContext class provides an interface for computing cryptographic hashes over multiple
 * iterations. Useful for computing hashes of big files (so you don't have to load them all in memory),
 * network streams, and data streams in general (so you don't have to hold buffers).
 *
 * The [HashType] enum shows the supported hashing algorithms.
 *
 * ```gdscript
 * //gdscript
 * const CHUNK_SIZE = 1024
 *
 * func hash_file(path):
 * 	# Check that file exists.
 * 	if not FileAccess.file_exists(path):
 * 		return
 * 	# Start an SHA-256 context.
 * 	var ctx = HashingContext.new()
 * 	ctx.start(HashingContext.HASH_SHA256)
 * 	# Open the file to hash.
 * 	var file = FileAccess.open(path, FileAccess.READ)
 * 	# Update the context after reading each chunk.
 * 	while file.get_position() < file.get_length():
 * 		var remaining = file.get_length() - file.get_position()
 * 		ctx.update(file.get_buffer(min(remaining, CHUNK_SIZE)))
 * 	# Get the computed hash.
 * 	var res = ctx.finish()
 * 	# Print the result as hex string and array.
 * 	printt(res.hex_encode(), Array(res))
 * ```
 *
 * ```csharp
 * //csharp
 * public const int ChunkSize = 1024;
 *
 * public void HashFile(string path)
 * {
 * 	// Check that file exists.
 * 	if (!FileAccess.FileExists(path))
 * 	{
 * 		return;
 * 	}
 * 	// Start an SHA-256 context.
 * 	var ctx = new HashingContext();
 * 	ctx.Start(HashingContext.HashType.Sha256);
 * 	// Open the file to hash.
 * 	using var file = FileAccess.Open(path, FileAccess.ModeFlags.Read);
 * 	// Update the context after reading each chunk.
 * 	while (file.GetPosition() < file.GetLength())
 * 	{
 * 		int remaining = (int)(file.GetLength() - file.GetPosition());
 * 		ctx.Update(file.GetBuffer(Mathf.Min(remaining, ChunkSize)));
 * 	}
 * 	// Get the computed hash.
 * 	byte[] res = ctx.Finish();
 * 	// Print the result as hex string and array.
 * 	GD.PrintT(res.HexEncode(), (Variant)res);
 * }
 * ```
 */
@GodotBaseType
public open class HashingContext : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(285, scriptIndex)
  }

  /**
   * Starts a new hash computation of the given [type] (e.g. [HASH_SHA256] to start computation of
   * an SHA-256).
   */
  public final fun start(type: HashType): Error {
    TransferContext.writeArguments(LONG to type.value)
    TransferContext.callMethod(ptr, MethodBindings.startPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Updates the computation with the given [chunk] of data.
   */
  public final fun update(chunk: PackedByteArray): Error {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to chunk)
    TransferContext.callMethod(ptr, MethodBindings.updatePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes the current context, and return the computed hash.
   */
  public final fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.finishPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public enum class HashType(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Hashing algorithm: MD5.
     */
    MD5(0),
    /**
     * Hashing algorithm: SHA-1.
     */
    SHA1(1),
    /**
     * Hashing algorithm: SHA-256.
     */
    SHA256(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): HashType = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val startPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HashingContext", "start", 3940338335)

    internal val updatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HashingContext", "update", 680677267)

    internal val finishPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HashingContext", "finish", 2115431945)
  }
}
