// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Access to advanced cryptographic functionalities.
 *
 * The Crypto class allows you to access some more advanced cryptographic functionalities in Godot.
 *
 * For now, this includes generating cryptographically secure random bytes, and RSA keys and self-signed X509 certificates generation. More functionalities are planned for future releases.
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
 * 		```
 *
 * **Note:** Not available in HTML5 exports.
 */
@GodotBaseType
open class Crypto : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CRYPTO)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Generates a [godot.core.PoolByteArray] of cryptographically secure random bytes with given `size`.
   */
  open fun generateRandomBytes(size: Long): PoolByteArray {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTO_GENERATE_RANDOM_BYTES,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Generates an RSA [godot.CryptoKey] that can be used for creating self-signed certificates and passed to [godot.StreamPeerSSL.acceptStream].
   */
  open fun generateRsa(size: Long): CryptoKey? {
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
  open fun generateSelfSignedCertificate(
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
}
