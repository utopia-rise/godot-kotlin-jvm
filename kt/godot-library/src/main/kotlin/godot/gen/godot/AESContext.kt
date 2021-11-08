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
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Interface to low level AES encryption features.
 *
 * This class provides access to AES encryption/decryption of raw data. Both AES-ECB and AES-CBC mode are supported.
 *
 * ```
 * 		extends Node
 *
 * 		var aes = AESContext.new()
 *
 * 		func _ready():
 * 		    var key = "My secret key!!!" # Key must be either 16 or 32 bytes.
 * 		    var data = "My secret text!!" # Data size must be multiple of 16 bytes, apply padding if needed.
 * 		    # Encrypt ECB
 * 		    aes.start(AESContext.MODE_ECB_ENCRYPT, key.to_utf8())
 * 		    var encrypted = aes.update(data.to_utf8())
 * 		    aes.finish()
 * 		    # Decrypt ECB
 * 		    aes.start(AESContext.MODE_ECB_DECRYPT, key.to_utf8())
 * 		    var decrypted = aes.update(encrypted)
 * 		    aes.finish()
 * 		    # Check ECB
 * 		    assert(decrypted == data.to_utf8())
 *
 * 		    var iv = "My secret iv!!!!" # IV must be of exactly 16 bytes.
 * 		    # Encrypt CBC
 * 		    aes.start(AESContext.MODE_CBC_ENCRYPT, key.to_utf8(), iv.to_utf8())
 * 		    encrypted = aes.update(data.to_utf8())
 * 		    aes.finish()
 * 		    # Decrypt CBC
 * 		    aes.start(AESContext.MODE_CBC_DECRYPT, key.to_utf8(), iv.to_utf8())
 * 		    decrypted = aes.update(encrypted)
 * 		    aes.finish()
 * 		    # Check CBC
 * 		    assert(decrypted == data.to_utf8())
 * 		```
 */
@GodotBaseType
public open class AESContext : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AESCONTEXT)
  }

  /**
   * Close this AES context so it can be started again. See [start].
   */
  public open fun finish(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_FINISH, NIL)
  }

  /**
   * Get the current IV state for this context (IV gets updated when calling [update]). You normally don't need this function.
   *
   * **Note:** This function only makes sense when the context is started with [MODE_CBC_ENCRYPT] or [MODE_CBC_DECRYPT].
   */
  public open fun getIvState(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_GET_IV_STATE,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Start the AES context in the given `mode`. A `key` of either 16 or 32 bytes must always be provided, while an `iv` (initialization vector) of exactly 16 bytes, is only needed when `mode` is either [MODE_CBC_ENCRYPT] or [MODE_CBC_DECRYPT].
   */
  public open fun start(
    mode: Long,
    key: PoolByteArray,
    iv: PoolByteArray = PoolByteArray()
  ): GodotError {
    TransferContext.writeArguments(LONG to mode, POOL_BYTE_ARRAY to key, POOL_BYTE_ARRAY to iv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Run the desired operation for this AES context. Will return a [godot.core.PoolByteArray] containing the result of encrypting (or decrypting) the given `src`. See [start] for mode of operation.
   *
   * **Note:** The size of `src` must be a multiple of 16. Apply some padding if needed.
   */
  public open fun update(src: PoolByteArray): PoolByteArray {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to src)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AESCONTEXT_UPDATE, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
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

  public companion object {
    /**
     * AES cipher blocker chaining decryption mode.
     */
    public final const val MODE_CBC_DECRYPT: Long = 3

    /**
     * AES cipher blocker chaining encryption mode.
     */
    public final const val MODE_CBC_ENCRYPT: Long = 2

    /**
     * AES electronic codebook decryption mode.
     */
    public final const val MODE_ECB_DECRYPT: Long = 1

    /**
     * AES electronic codebook encryption mode.
     */
    public final const val MODE_ECB_ENCRYPT: Long = 0

    /**
     * Maximum value for the mode enum.
     */
    public final const val MODE_MAX: Long = 4
  }
}
