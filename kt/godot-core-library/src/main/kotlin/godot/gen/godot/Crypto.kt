// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The Crypto class provides access to advanced cryptographic functionalities.
 * Currently, this includes asymmetric key encryption/decryption, signing/verification, and
 * generating cryptographically secure random bytes, RSA keys, HMAC digests, and self-signed
 * [X509Certificate]s.
 *
 * gdscript:
 * ```gdscript
 * var crypto = Crypto.new()
 *
 * # Generate new RSA key.
 * var key = crypto.generate_rsa(4096)
 *
 * # Generate new self-signed certificate with the given key.
 * var cert = crypto.generate_self_signed_certificate(key, "CN=mydomain.com,O=My Game Company,C=IT")
 *
 * # Save key and certificate in the user folder.
 * key.save("user://generated.key")
 * cert.save("user://generated.crt")
 *
 * # Encryption
 * var data = "Some data"
 * var encrypted = crypto.encrypt(key, data.to_utf8_buffer())
 *
 * # Decryption
 * var decrypted = crypto.decrypt(key, encrypted)
 *
 * # Signing
 * var signature = crypto.sign(HashingContext.HASH_SHA256, data.sha256_buffer(), key)
 *
 * # Verifying
 * var verified = crypto.verify(HashingContext.HASH_SHA256, data.sha256_buffer(), signature, key)
 *
 * # Checks
 * assert(verified)
 * assert(data.to_utf8_buffer() == decrypted)
 * ```
 * csharp:
 * ```csharp
 * using Godot;
 * using System.Diagnostics;
 *
 * Crypto crypto = new Crypto();
 *
 * // Generate new RSA key.
 * CryptoKey key = crypto.GenerateRsa(4096);
 *
 * // Generate new self-signed certificate with the given key.
 * X509Certificate cert = crypto.GenerateSelfSignedCertificate(key, "CN=mydomain.com,O=My Game
 * Company,C=IT");
 *
 * // Save key and certificate in the user folder.
 * key.Save("user://generated.key");
 * cert.Save("user://generated.crt");
 *
 * // Encryption
 * string data = "Some data";
 * byte[] encrypted = crypto.Encrypt(key, data.ToUtf8Buffer());
 *
 * // Decryption
 * byte[] decrypted = crypto.Decrypt(key, encrypted);
 *
 * // Signing
 * byte[] signature = crypto.Sign(HashingContext.HashType.Sha256, Data.Sha256Buffer(), key);
 *
 * // Verifying
 * bool verified = crypto.Verify(HashingContext.HashType.Sha256, Data.Sha256Buffer(), signature,
 * key);
 *
 * // Checks
 * Debug.Assert(verified);
 * Debug.Assert(data.ToUtf8Buffer() == decrypted);
 * ```
 */
@GodotBaseType
public open class Crypto : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CRYPTO, scriptIndex)
  }

  /**
   * Generates a [PackedByteArray] of cryptographically secure random bytes with given [size].
   */
  public final fun generateRandomBytes(size: Int): PackedByteArray {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.generateRandomBytesPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Generates an RSA [CryptoKey] that can be used for creating self-signed certificates and passed
   * to [StreamPeerTLS.acceptStream].
   */
  public final fun generateRsa(size: Int): CryptoKey? {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.generateRsaPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CryptoKey?)
  }

  /**
   * Generates a self-signed [X509Certificate] from the given [CryptoKey] and [issuerName]. The
   * certificate validity will be defined by [notBefore] and [notAfter] (first valid date and last
   * valid date). The [issuerName] must contain at least "CN=" (common name, i.e. the domain name),
   * "O=" (organization, i.e. your company name), "C=" (country, i.e. 2 lettered ISO-3166 code of the
   * country the organization is based in).
   * A small example to generate an RSA key and an X509 self-signed certificate.
   *
   * gdscript:
   * ```gdscript
   * var crypto = Crypto.new()
   * # Generate 4096 bits RSA key.
   * var key = crypto.generate_rsa(4096)
   * # Generate self-signed certificate using the given key.
   * var cert = crypto.generate_self_signed_certificate(key, "CN=example.com,O=A Game Company,C=IT")
   * ```
   * csharp:
   * ```csharp
   * var crypto = new Crypto();
   * // Generate 4096 bits RSA key.
   * CryptoKey key = crypto.GenerateRsa(4096);
   * // Generate self-signed certificate using the given key.
   * X509Certificate cert = crypto.GenerateSelfSignedCertificate(key, "CN=mydomain.com,O=My Game
   * Company,C=IT");
   * ```
   */
  @JvmOverloads
  public final fun generateSelfSignedCertificate(
    key: CryptoKey?,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000",
  ): X509Certificate? {
    TransferContext.writeArguments(OBJECT to key, STRING to issuerName, STRING to notBefore, STRING to notAfter)
    TransferContext.callMethod(ptr, MethodBindings.generateSelfSignedCertificatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as X509Certificate?)
  }

  /**
   * Sign a given [hash] of type [hashType] with the provided private [key].
   */
  public final fun sign(
    hashType: HashingContext.HashType,
    hash: PackedByteArray,
    key: CryptoKey?,
  ): PackedByteArray {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to hash, OBJECT to key)
    TransferContext.callMethod(ptr, MethodBindings.signPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Verify that a given [signature] for [hash] of type [hashType] against the provided public
   * [key].
   */
  public final fun verify(
    hashType: HashingContext.HashType,
    hash: PackedByteArray,
    signature: PackedByteArray,
    key: CryptoKey?,
  ): Boolean {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to hash, PACKED_BYTE_ARRAY to signature, OBJECT to key)
    TransferContext.callMethod(ptr, MethodBindings.verifyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Encrypt the given [plaintext] with the provided public [key].
   * **Note:** The maximum size of accepted plaintext is limited by the key size.
   */
  public final fun encrypt(key: CryptoKey?, plaintext: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(OBJECT to key, PACKED_BYTE_ARRAY to plaintext)
    TransferContext.callMethod(ptr, MethodBindings.encryptPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Decrypt the given [ciphertext] with the provided private [key].
   * **Note:** The maximum size of accepted ciphertext is limited by the key size.
   */
  public final fun decrypt(key: CryptoKey?, ciphertext: PackedByteArray): PackedByteArray {
    TransferContext.writeArguments(OBJECT to key, PACKED_BYTE_ARRAY to ciphertext)
    TransferContext.callMethod(ptr, MethodBindings.decryptPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Generates an [url=https://en.wikipedia.org/wiki/HMAC]HMAC[/url] digest of [msg] using [key].
   * The [hashType] parameter is the hashing algorithm that is used for the inner and outer hashes.
   * Currently, only [HashingContext.HASH_SHA256] and [HashingContext.HASH_SHA1] are supported.
   */
  public final fun hmacDigest(
    hashType: HashingContext.HashType,
    key: PackedByteArray,
    msg: PackedByteArray,
  ): PackedByteArray {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to key, PACKED_BYTE_ARRAY to msg)
    TransferContext.callMethod(ptr, MethodBindings.hmacDigestPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Compares two [PackedByteArray]s for equality without leaking timing information in order to
   * prevent timing attacks.
   * See
   * [url=https://paragonie.com/blog/2015/11/preventing-timing-attacks-on-string-comparison-with-double-hmac-strategy]this
   * blog post[/url] for more information.
   */
  public final fun constantTimeCompare(trusted: PackedByteArray, received: PackedByteArray):
      Boolean {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to trusted, PACKED_BYTE_ARRAY to received)
    TransferContext.callMethod(ptr, MethodBindings.constantTimeComparePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val generateRandomBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "generate_random_bytes", 47165747)

    public val generateRsaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "generate_rsa", 1237515462)

    public val generateSelfSignedCertificatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "generate_self_signed_certificate", 492266173)

    public val signPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "sign", 1673662703)

    public val verifyPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "verify", 2805902225)

    public val encryptPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "encrypt", 2361793670)

    public val decryptPtr: VoidPtr = TypeManager.getMethodBindPtr("Crypto", "decrypt", 2361793670)

    public val hmacDigestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "hmac_digest", 2368951203)

    public val constantTimeComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Crypto", "constant_time_compare", 1024142237)
  }
}
