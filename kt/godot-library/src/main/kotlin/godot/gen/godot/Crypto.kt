// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Access to advanced cryptographic functionalities.
 *
 * The Crypto class allows you to access some more advanced cryptographic functionalities in Godot.
 *
 * For now, this includes generating cryptographically secure random bytes, RSA keys and self-signed X509 certificates generation, asymmetric key encryption/decryption, and signing/verification.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * extends Node
 *
 * var crypto = Crypto.new()
 *
 * var key = CryptoKey.new()
 *
 * var cert = X509Certificate.new()
 *
 * func _ready():
 *
 *     # Generate new RSA key.
 *
 *     key = crypto.generate_rsa(4096)
 *
 *     # Generate new self-signed certificate with the given key.
 *
 *     cert = crypto.generate_self_signed_certificate(key, "CN=mydomain.com,O=My Game Company,C=IT")
 *
 *     # Save key and certificate in the user folder.
 *
 *     key.save("user://generated.key")
 *
 *     cert.save("user://generated.crt")
 *
 *     # Encryption
 *
 *     var data = "Some data"
 *
 *     var encrypted = crypto.encrypt(key, data.to_utf8())
 *
 *     # Decryption
 *
 *     var decrypted = crypto.decrypt(key, encrypted)
 *
 *     # Signing
 *
 *     var signature = crypto.sign(HashingContext.HASH_SHA256, data.sha256_buffer(), key)
 *
 *     # Verifying
 *
 *     var verified = crypto.verify(HashingContext.HASH_SHA256, data.sha256_buffer(), signature, key)
 *
 *     # Checks
 *
 *     assert(verified)
 *
 *     assert(data.to_utf8() == decrypted)
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
 * public class CryptoNode : Node
 *
 * {
 *
 *     public Crypto Crypto = new Crypto();
 *
 *     public CryptoKey Key = new CryptoKey();
 *
 *     public X509Certificate Cert = new X509Certificate();
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         // Generate new RSA key.
 *
 *         Key = Crypto.GenerateRsa(4096);
 *
 *         // Generate new self-signed certificate with the given key.
 *
 *         Cert = Crypto.GenerateSelfSignedCertificate(Key, "CN=mydomain.com,O=My Game Company,C=IT");
 *
 *         // Save key and certificate in the user folder.
 *
 *         Key.Save("user://generated.key");
 *
 *         Cert.Save("user://generated.crt");
 *
 *         // Encryption
 *
 *         string data = "Some data";
 *
 *         byte[] encrypted = Crypto.Encrypt(Key, data.ToUTF8());
 *
 *         // Decryption
 *
 *         byte[] decrypted = Crypto.Decrypt(Key, encrypted);
 *
 *         // Signing
 *
 *         byte[] signature = Crypto.Sign(HashingContext.HashType.Sha256, Data.SHA256Buffer(), Key);
 *
 *         // Verifying
 *
 *         bool verified = Crypto.Verify(HashingContext.HashType.Sha256, Data.SHA256Buffer(), signature, Key);
 *
 *         // Checks
 *
 *         Debug.Assert(verified);
 *
 *         Debug.Assert(data.ToUTF8() == decrypted);
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
public open class Crypto : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CRYPTO, scriptIndex)
    return true
  }

  /**
   * Generates a [godot.PackedByteArray] of cryptographically secure random bytes with given [size].
   */
  public fun generateRandomBytes(size: Long): PackedByteArray {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RANDOM_BYTES,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Generates an RSA [godot.CryptoKey] that can be used for creating self-signed certificates and passed to [godot.StreamPeerTLS.acceptStream].
   */
  public fun generateRsa(size: Long): CryptoKey? {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RSA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CryptoKey?
  }

  /**
   * Generates a self-signed [godot.X509Certificate] from the given [godot.CryptoKey] and [issuerName]. The certificate validity will be defined by [notBefore] and [notAfter] (first valid date and last valid date). The [issuerName] must contain at least "CN=" (common name, i.e. the domain name), "O=" (organization, i.e. your company name), "C=" (country, i.e. 2 lettered ISO-3166 code of the country the organization is based in).
   *
   * A small example to generate an RSA key and a X509 self-signed certificate.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var crypto = Crypto.new()
   *
   * # Generate 4096 bits RSA key.
   *
   * var key = crypto.generate_rsa(4096)
   *
   * # Generate self-signed certificate using the given key.
   *
   * var cert = crypto.generate_self_signed_certificate(key, "CN=example.com,O=A Game Company,C=IT")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var crypto = new Crypto();
   *
   * // Generate 4096 bits RSA key.
   *
   * CryptoKey key = crypto.GenerateRsa(4096);
   *
   * // Generate self-signed certificate using the given key.
   *
   * X509Certificate cert = crypto.GenerateSelfSignedCertificate(key, "CN=mydomain.com,O=My Game Company,C=IT");
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000"
  ): X509Certificate? {
    TransferContext.writeArguments(OBJECT to key, STRING to issuerName, STRING to notBefore, STRING to notAfter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_SELF_SIGNED_CERTIFICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
  }

  /**
   * Sign a given [hash] of type [hashType] with the provided private [key].
   */
  public fun sign(
    hashType: HashingContext.HashType,
    hash: PackedByteArray,
    key: CryptoKey
  ): PackedByteArray {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to hash, OBJECT to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_SIGN, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Verify that a given [signature] for [hash] of type [hashType] against the provided public [key].
   */
  public fun verify(
    hashType: HashingContext.HashType,
    hash: PackedByteArray,
    signature: PackedByteArray,
    key: CryptoKey
  ): Boolean {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to hash, PACKED_BYTE_ARRAY to signature, OBJECT to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_VERIFY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Encrypt the given [plaintext] with the provided public [key].
   *
   * **Note:** The maximum size of accepted plaintext is limited by the key size.
   */
  public fun encrypt(key: CryptoKey, plaintext: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(OBJECT to key, PACKED_BYTE_ARRAY to plaintext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_ENCRYPT, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Decrypt the given [ciphertext] with the provided private [key].
   *
   * **Note:** The maximum size of accepted ciphertext is limited by the key size.
   */
  public fun decrypt(key: CryptoKey, ciphertext: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(OBJECT to key, PACKED_BYTE_ARRAY to ciphertext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_DECRYPT, PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Generates an [HMAC](https://en.wikipedia.org/wiki/HMAC) digest of [msg] using [key]. The [hashType] parameter is the hashing algorithm that is used for the inner and outer hashes.
   *
   * Currently, only [godot.HashingContext.HASH_SHA256] and [godot.HashingContext.HASH_SHA1] are supported.
   */
  public fun hmacDigest(
    hashType: HashingContext.HashType,
    key: PackedByteArray,
    msg: PackedByteArray
  ): PackedByteArray {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to key, PACKED_BYTE_ARRAY to msg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_HMAC_DIGEST,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Compares two [godot.PackedByteArray]s for equality without leaking timing information in order to prevent timing attacks.
   *
   * See [this blog post](https://paragonie.com/blog/2015/11/preventing-timing-attacks-on-string-comparison-with-double-hmac-strategy) for more information.
   */
  public fun constantTimeCompare(trusted: PackedByteArray, received: PackedByteArray): Boolean {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to trusted, PACKED_BYTE_ARRAY to received)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_CONSTANT_TIME_COMPARE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
