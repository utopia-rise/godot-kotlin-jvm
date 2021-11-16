// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Access to advanced cryptographic functionalities.
 *
 * The Crypto class allows you to access some more advanced cryptographic functionalities in Godot.
 *
 * For now, this includes generating cryptographically secure random bytes, RSA keys and self-signed X509 certificates generation, asymmetric key encryption/decryption, and signing/verification.
 *
 * ```
 * 		extends Node
 *
 * 		var crypto = Crypto.new()
 * 		var key = CryptoKey.new()
 * 		var cert = X509Certificate.new()
 *
 * 		func _ready():
 * 		    # Generate new RSA key.
 * 		    key = crypto.generate_rsa(4096)
 * 		    # Generate new self-signed certificate with the given key.
 * 		    cert = crypto.generate_self_signed_certificate(key, "CN=mydomain.com,O=My Game Company,C=IT")
 * 		    # Save key and certificate in the user folder.
 * 		    key.save("user://generated.key")
 * 		    cert.save("user://generated.crt")
 * 		    # Encryption
 * 		    var data = "Some data"
 * 		    var encrypted = crypto.encrypt(key, data.to_utf8())
 * 		    # Decryption
 * 		    var decrypted = crypto.decrypt(key, encrypted)
 * 		    # Signing
 * 		    var signature = crypto.sign(HashingContext.HASH_SHA256, data.sha256_buffer(), key)
 * 		    # Verifying
 * 		    var verified = crypto.verify(HashingContext.HASH_SHA256, data.sha256_buffer(), signature, key)
 * 		    # Checks
 * 		    assert(verified)
 * 		    assert(data.to_utf8() == decrypted)
 * 		```
 *
 * **Note:** Not available in HTML5 exports.
 */
@GodotBaseType
public open class Crypto : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CRYPTO)
  }

  /**
   * Compares two [godot.core.PoolByteArray]s for equality without leaking timing information in order to prevent timing attacks.
   *
   * See [this blog post](https://paragonie.com/blog/2015/11/preventing-timing-attacks-on-string-comparison-with-double-hmac-strategy) for more information.
   */
  public open fun constantTimeCompare(trusted: PoolByteArray, received: PoolByteArray): Boolean {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to trusted, POOL_BYTE_ARRAY to received)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_CONSTANT_TIME_COMPARE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Decrypt the given `ciphertext` with the provided private `key`.
   *
   * **Note:** The maximum size of accepted ciphertext is limited by the key size.
   */
  public open fun decrypt(key: CryptoKey, ciphertext: PoolByteArray): PoolByteArray {
    TransferContext.writeArguments(OBJECT to key, POOL_BYTE_ARRAY to ciphertext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_DECRYPT, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Encrypt the given `plaintext` with the provided public `key`.
   *
   * **Note:** The maximum size of accepted plaintext is limited by the key size.
   */
  public open fun encrypt(key: CryptoKey, plaintext: PoolByteArray): PoolByteArray {
    TransferContext.writeArguments(OBJECT to key, POOL_BYTE_ARRAY to plaintext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_ENCRYPT, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Generates a [godot.core.PoolByteArray] of cryptographically secure random bytes with given `size`.
   */
  public open fun generateRandomBytes(size: Long): PoolByteArray {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RANDOM_BYTES,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Generates an RSA [godot.CryptoKey] that can be used for creating self-signed certificates and passed to [godot.StreamPeerSSL.acceptStream].
   */
  public open fun generateRsa(size: Long): CryptoKey? {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RSA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CryptoKey?
  }

  /**
   * Generates a self-signed [godot.X509Certificate] from the given [godot.CryptoKey] and `issuer_name`. The certificate validity will be defined by `not_before` and `not_after` (first valid date and last valid date). The `issuer_name` must contain at least "CN=" (common name, i.e. the domain name), "O=" (organization, i.e. your company name), "C=" (country, i.e. 2 lettered ISO-3166 code of the country the organization is based in).
   *
   * A small example to generate an RSA key and a X509 self-signed certificate.
   *
   * ```
   * 				var crypto = Crypto.new()
   * 				# Generate 4096 bits RSA key.
   * 				var key = crypto.generate_rsa(4096)
   * 				# Generate self-signed certificate using the given key.
   * 				var cert = crypto.generate_self_signed_certificate(key, "CN=example.com,O=A Game Company,C=IT")
   * 				```
   */
  public open fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000"
  ): X509Certificate? {
    TransferContext.writeArguments(OBJECT to key, STRING to issuerName, STRING to notBefore, STRING
        to notAfter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_SELF_SIGNED_CERTIFICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
  }

  /**
   * Generates an [HMAC](https://en.wikipedia.org/wiki/HMAC) digest of `msg` using `key`. The `hash_type` parameter is the hashing algorithm that is used for the inner and outer hashes.
   *
   * Currently, only [godot.HashingContext.HASH_SHA256] and [godot.HashingContext.HASH_SHA1] are supported.
   */
  public open fun hmacDigest(
    hashType: Long,
    key: PoolByteArray,
    msg: PoolByteArray
  ): PoolByteArray {
    TransferContext.writeArguments(LONG to hashType, POOL_BYTE_ARRAY to key, POOL_BYTE_ARRAY to msg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_HMAC_DIGEST, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Sign a given `hash` of type `hash_type` with the provided private `key`.
   */
  public open fun sign(
    hashType: Long,
    hash: PoolByteArray,
    key: CryptoKey
  ): PoolByteArray {
    TransferContext.writeArguments(LONG to hashType, POOL_BYTE_ARRAY to hash, OBJECT to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_SIGN, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Verify that a given `signature` for `hash` of type `hash_type` against the provided public `key`.
   */
  public open fun verify(
    hashType: Long,
    hash: PoolByteArray,
    signature: PoolByteArray,
    key: CryptoKey
  ): Boolean {
    TransferContext.writeArguments(LONG to hashType, POOL_BYTE_ARRAY to hash, POOL_BYTE_ARRAY to
        signature, OBJECT to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_VERIFY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
