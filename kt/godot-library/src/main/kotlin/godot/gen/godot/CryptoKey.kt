// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A cryptographic key (RSA).
 *
 * The CryptoKey class represents a cryptographic key. Keys can be loaded and saved like any other [godot.Resource].
 *
 * They can be used to generate a self-signed [godot.X509Certificate] via [godot.Crypto.generateSelfSignedCertificate] and as private key in [godot.StreamPeerSSL.acceptStream] along with the appropriate certificate.
 *
 * **Note:** Not available in HTML5 exports.
 */
@GodotBaseType
public open class CryptoKey : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CRYPTOKEY)
  }

  /**
   * Loads a key from `path` ("*.key" file).
   */
  public open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves a key to the given `path` (should be a "*.key" file).
   */
  public open fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
