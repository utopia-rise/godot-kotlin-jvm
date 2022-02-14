// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Interface to low level AES encryption features.
 *
 * This class provides access to AES encryption/decryption of raw data. Both AES-ECB and AES-CBC mode are supported.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * extends Node
 *
 *
 *
 * var aes = AESContext.new()
 *
 *
 *
 * func _ready():
 *
 *     var key = "My secret key!!!" # Key must be either 16 or 32 bytes.
 *
 *     var data = "My secret text!!" # Data size must be multiple of 16 bytes, apply padding if needed.
 *
 *     # Encrypt ECB
 *
 *     aes.start(AESContext.MODE_ECB_ENCRYPT, key.to_utf8())
 *
 *     var encrypted = aes.update(data.to_utf8())
 *
 *     aes.finish()
 *
 *     # Decrypt ECB
 *
 *     aes.start(AESContext.MODE_ECB_DECRYPT, key.to_utf8())
 *
 *     var decrypted = aes.update(encrypted)
 *
 *     aes.finish()
 *
 *     # Check ECB
 *
 *     assert(decrypted == data.to_utf8())
 *
 *
 *
 *     var iv = "My secret iv!!!!" # IV must be of exactly 16 bytes.
 *
 *     # Encrypt CBC
 *
 *     aes.start(AESContext.MODE_CBC_ENCRYPT, key.to_utf8(), iv.to_utf8())
 *
 *     encrypted = aes.update(data.to_utf8())
 *
 *     aes.finish()
 *
 *     # Decrypt CBC
 *
 *     aes.start(AESContext.MODE_CBC_DECRYPT, key.to_utf8(), iv.to_utf8())
 *
 *     decrypted = aes.update(encrypted)
 *
 *     aes.finish()
 *
 *     # Check CBC
 *
 *     assert(decrypted == data.to_utf8())
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 * using System;
 *
 * using System.Diagnostics;
 *
 *
 *
 * public class Example : Node
 *
 * {
 *
 *     public AESContext Aes = new AESContext();
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         string key = "My secret key!!!"; // Key must be either 16 or 32 bytes.
 *
 *         string data = "My secret text!!"; // Data size must be multiple of 16 bytes, apply padding if needed.
 *
 *         // Encrypt ECB
 *
 *         Aes.Start(AESContext.Mode.EcbEncrypt, key.ToUTF8());
 *
 *         byte[] encrypted = Aes.Update(data.ToUTF8());
 *
 *         Aes.Finish();
 *
 *         // Decrypt ECB
 *
 *         Aes.Start(AESContext.Mode.EcbDecrypt, key.ToUTF8());
 *
 *         byte[] decrypted = Aes.Update(encrypted);
 *
 *         Aes.Finish();
 *
 *         // Check ECB
 *
 *         Debug.Assert(decrypted == data.ToUTF8());
 *
 *
 *
 *         string iv = "My secret iv!!!!"; // IV must be of exactly 16 bytes.
 *
 *         // Encrypt CBC
 *
 *         Aes.Start(AESContext.Mode.EcbEncrypt, key.ToUTF8(), iv.ToUTF8());
 *
 *         encrypted = Aes.Update(data.ToUTF8());
 *
 *         Aes.Finish();
 *
 *         // Decrypt CBC
 *
 *         Aes.Start(AESContext.Mode.EcbDecrypt, key.ToUTF8(), iv.ToUTF8());
 *
 *         decrypted = Aes.Update(encrypted);
 *
 *         Aes.Finish();
 *
 *         // Check CBC
 *
 *         Debug.Assert(decrypted == data.ToUTF8());
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AESContext : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AESCONTEXT)
  }

  /**
   * Start the AES context in the given `mode`. A `key` of either 16 or 32 bytes must always be provided, while an `iv` (initialization vector) of exactly 16 bytes, is only needed when `mode` is either [MODE_CBC_ENCRYPT] or [MODE_CBC_DECRYPT].
   */
  public open fun start(
    mode: AESContext.Mode,
    key: PackedByteArray,
    iv: PackedByteArray = PackedByteArray()
  ): GodotError {
    TransferContext.writeArguments(LONG to mode.id, PACKED_BYTE_ARRAY to key, PACKED_BYTE_ARRAY to
        iv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Run the desired operation for this AES context. Will return a [godot.PackedByteArray] containing the result of encrypting (or decrypting) the given `src`. See [start] for mode of operation.
   *
   * **Note:** The size of `src` must be a multiple of 16. Apply some padding if needed.
   */
  public open fun update(src: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_UPDATE,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Get the current IV state for this context (IV gets updated when calling [update]). You normally don't need this function.
   *
   * **Note:** This function only makes sense when the context is started with [MODE_CBC_ENCRYPT] or [MODE_CBC_DECRYPT].
   */
  public open fun getIvState(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_GET_IV_STATE,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Close this AES context so it can be started again. See [start].
   */
  public open fun finish(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_FINISH, NIL)
  }

  public enum class Mode(
    id: Long
  ) {
    /**
     * AES electronic codebook encryption mode.
     */
    MODE_ECB_ENCRYPT(0),
    /**
     * AES electronic codebook decryption mode.
     */
    MODE_ECB_DECRYPT(1),
    /**
     * AES cipher blocker chaining encryption mode.
     */
    MODE_CBC_ENCRYPT(2),
    /**
     * AES cipher blocker chaining decryption mode.
     */
    MODE_CBC_DECRYPT(3),
    /**
     * Maximum value for the mode enum.
     */
    MODE_MAX(4),
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
